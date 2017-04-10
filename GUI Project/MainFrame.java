import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by antran on 11/29/16.
 */
public class MainFrame extends JFrame {

    // Field of Glass Object
    private static ArrayList<Glass> glass = new ArrayList<Glass>();
    private static int currentPosition=-1;
    private static String manufacturer="";
    private static Color colorRGB;
    private static  double amount =0;
    private static String[] mfcode = new String[2];
    private static Glass.type cType = Glass.type.ROD ;
    private static boolean[] chrt = new boolean[4];


    // Components in GUI
    private JPanel mainPanel;
    private JTextField code;
    private JComboBox<String> mfChooser;
    private JColorChooser cChooser;
    private JTextField colorName;
    private JTextField qlbs;
    private JTextField qoz;
    private JRadioButton rod,frit,tubing;
    private JCheckBox wysiwig,reactive,striking,chrome;
    private JTextArea notes;
    private JButton first;
    private JButton next;
    private JButton last;
    private JButton save;
    private JButton open;
    private JButton exit;


    public MainFrame()
    {

        final int FRAME_WIDTH=1200;
        final int FRAME_HEIGHT= 900;
        //Instantiate all GUI containers and widgets
        mainPanel = new JPanel();
        code = new JTextField("Your product code goes here");
        // create manufacturer chooser
        String[] mfName= {"NorthStar-NS", "Glass Alchemy-GA", "Trautmann-TAG", "Momka-MK"};
        mfChooser= new JComboBox<>(mfName);
        // create colorChooser
        cChooser = new JColorChooser();
        // remove all of unnecessary tabs except RGB
        cChooser.setPreviewPanel(new JPanel());
        AbstractColorChooserPanel[] panels = cChooser.getChooserPanels();
        cChooser.removeChooserPanel(panels[0]);
        cChooser.removeChooserPanel(panels[1]);
        cChooser.removeChooserPanel(panels[2]);
        cChooser.removeChooserPanel(panels[4]);
        cChooser.setSize(new Dimension(200,300 ));
        // color name text field
        colorName = new JTextField("Enter Color Name");
        colorName.setPreferredSize(new Dimension(60,15));

        // amount input
        qlbs= new JTextField("",2);
        qoz = new JTextField("",2);

        // Group of radio button for glass chrt
        rod = new JRadioButton("Rod",true);
        rod.setSelected(true);
        frit = new JRadioButton("Frit",true);
        tubing = new JRadioButton("Tubing",true);
        ButtonGroup glassType = new ButtonGroup();
        glassType.add(rod);
        glassType.add(frit);
        glassType.add(tubing);

        //Check box for glass chrt
        wysiwig = new JCheckBox("Wysiwig");
        reactive = new JCheckBox("Reactive");
        striking = new JCheckBox("Striking");
        chrome = new JCheckBox("Chrome");

        //text area for notes
        notes = new JTextArea("Enter any notes here");
        notes.setPreferredSize(new Dimension(140,200));

        //buttons
        first = new JButton("First");
        next = new JButton("Next");
        last = new JButton("Last");
        save = new JButton("Save");
        open = new JButton("Open");
        exit = new JButton("Exit");

        //Label
        JLabel mfLabel = new JLabel("Manufacturer");
        JLabel amountLabel = new JLabel("Amount");
        JLabel codeLabel = new JLabel("Code");
        JLabel colorNameLabel = new JLabel("Color Name");
        JLabel typeLabel = new JLabel("Type");
        JLabel chrLabel = new JLabel("Characteristics");
        JLabel colorChooser = new JLabel("Choose your Color");
        JLabel noteLabel = new JLabel("Notes");
        JLabel lbsunit = new JLabel("lbs");
        JLabel ozunit = new JLabel("oz");

        // top panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2,3,10,1));
        topPanel.add(mfLabel);
        topPanel.add(amountLabel);
        topPanel.add(codeLabel);
        JPanel amountLayout = new JPanel();

        // amount panel inside top panel
        amountLayout.setLayout(new BoxLayout(amountLayout,BoxLayout.X_AXIS));
        amountLayout.add(qlbs);
        amountLayout.add(lbsunit);
        amountLayout.add(qoz);
        amountLayout.add(ozunit);
        topPanel.add(mfChooser);
        topPanel.add(amountLayout);
        topPanel.add(code);


        // bot panel
        JPanel botPanel = new JPanel();
        botPanel.setLayout(new BoxLayout(botPanel,BoxLayout.X_AXIS));
        //add button to bot panel
        botPanel.add(first);
        botPanel.add(next);
        botPanel.add(last);
        botPanel.add(save);
        botPanel.add(open);
        botPanel.add(exit);


        // LeftPanel
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel,BoxLayout.Y_AXIS));
        leftPanel.add(colorNameLabel);
        leftPanel.add(colorName);
        leftPanel.add(chrLabel);
        leftPanel.add(wysiwig);
        leftPanel.add(reactive);
        leftPanel.add(striking);
        leftPanel.add(chrome);
        leftPanel.add(typeLabel);
        leftPanel.add(rod);
        leftPanel.add(frit);
        leftPanel.add(tubing);

        //right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel,BoxLayout.Y_AXIS));
        rightPanel.add(noteLabel);
        rightPanel.add(notes);
        noteLabel.setAlignmentX(Component.CENTER_ALIGNMENT);



        //center Panel
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel,BoxLayout.Y_AXIS));
        centerPanel.add(colorChooser);
        centerPanel.add(cChooser);


        //adding component to mainPanel
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel,BorderLayout.NORTH);
        mainPanel.add(leftPanel,BorderLayout.WEST);
        mainPanel.add(botPanel,BorderLayout.SOUTH);
        mainPanel.add(centerPanel,BorderLayout.CENTER);
        mainPanel.add(rightPanel,BorderLayout.EAST);



        //set up data for the window
        setTitle("Glass Management Program");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mainPanel);
        setVisible(true);
        pack();

        //add all the listeners
        qlbs.addActionListener(new amountListener());
        mfChooser.addActionListener(new comboListener());
        cChooser.getSelectionModel().addChangeListener(new colorListener());
        rod.addActionListener(new typeListener());
        frit.addActionListener(new typeListener());
        tubing.addActionListener(new typeListener());
        wysiwig.addItemListener(new characListener());
        reactive.addItemListener(new characListener());
        striking.addItemListener(new characListener());
        chrome.addItemListener(new characListener());
        first.addActionListener(new firstButtonListener());
        last.addActionListener(new lastButtonListener());
        next.addActionListener(new nextButtonListener());
        save.addActionListener(new saveButtonListener());
        open.addActionListener(new openButtonListener());
        exit.addActionListener(new exitButtonListener());


    }

    // listener to convert lbs to oz
    private class amountListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String text = qlbs.getText();
            double lbs = Double.parseDouble(text);
            double oz = lbs*16;
            qoz.setText(Double.toString(oz));
            amount = oz;
        }
    }

    // listener to get the code of manufacturer
    private class comboListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(mfChooser.getSelectedIndex()==0)
            {
                mfcode[0] = "NS";
                manufacturer = "NorthStar";
            }
            if(mfChooser.getSelectedIndex()==1)
            {
                mfcode[0] = "GA";
                manufacturer = "Glass Alchemy";
            }
            if(mfChooser.getSelectedIndex()==2)
            {
                mfcode[0] = "TAG";
                manufacturer =  "Trautmann";
            }
            if(mfChooser.getSelectedIndex()==3)
            {
                mfcode[0] = "MK";
                manufacturer = "Momka";
            }
            mfcode[1] =  Integer.toHexString(cChooser.getColor().getRGB() & 0x00ffffff);
            code.setText(mfcode[0] + mfcode[1]);;
        }

    }

    // listener to change the value of code when the color is changed
    private class colorListener implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent e) {
            colorRGB = cChooser.getColor();
            mfcode[1] =  Integer.toHexString(cChooser.getColor().getRGB() & 0x00ffffff);
            if(mfcode[0] ==null)
            {
                mfcode[0] = "NS";
            }
            code.setText(mfcode[0] + mfcode[1]);
        }

        }

        // listener to set the value of characteristic to to an enum type in Glass
    private class typeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if(source ==rod)
            {
                cType = Glass.type.ROD;
            }
            if(source == frit)
            {
                cType = Glass.type.FRIT;
            }
            if(source == tubing){
                cType = Glass.type.TUBING;
            }
        }
    }
    // listener to get the value of the chrt and store it into the boolean array
    private class characListener implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(wysiwig.isSelected())
            {
                chrt[0]= true;
            }
            if(reactive.isSelected())
            {
                chrt[1] = true;
            }
            if(striking.isSelected())
            {
                chrt[2]= true;
            }
            if(chrome.isSelected())
            {
                chrt[3]  = true;
            }
        }
    }


    // listener for first button, display the first object in array list, show message if the list is empty
    private class firstButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(glass.size()==0 )
            {
                JOptionPane.showMessageDialog(null,"You do not have any item in your list.");
              return;

            }
            if(currentPosition == -1)
            {
                return;
            }
            else
            {
                currentPosition=0;
                displayGlass(currentPosition);

            }

        }
    }

    //listener for last button, get to the last element of the array list
    private class lastButtonListener implements  ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
             if(glass.size()==0 && code.getText().equals("Your product code goes here"))
            {
                    JOptionPane.showMessageDialog(null,"You do not have any item in your list.");
                    return;
                }
            currentPosition=glass.size()-1;
                displayGlass(currentPosition);


        }
    }

    //listener for NEXT button, go to the next object, show message when the list is empty or there is no next element
    private class nextButtonListener implements  ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(glass.size()==0)
            {
                if(code.getText().equals("Your product code goes here"))
                {
                    JOptionPane.showMessageDialog(null,"You do not have any item in your list.");
                    return;
                }
                glass.add(new Glass());
                currentPosition++;
                storeGlass(currentPosition);
                displayBlank();

            }
            else if(currentPosition == glass.size()-1)
            {
                if(code.getText().equals("Your product code goes here") || code.getText().equals(glass.get(glass.size()-1).getCode()))
                {
                    JOptionPane.showMessageDialog(null,"No more item to show.");
                    displayBlank();
                    return;
                }
                glass.add(new Glass());
                currentPosition++;
                storeGlass(currentPosition);
                displayBlank();
            }
          else
            {
                currentPosition++;
                displayGlass(currentPosition);
            }

        }
    }

    // listener for save button which ask the user for the output file name and serialize the array list
    private class saveButtonListener implements  ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!code.getText().equals("Your product code goes here"))
            {
                glass.add(new Glass());
                storeGlass(glass.size()-1);
            }
            writeObject();
        }
    }
    // exit the progran when pressing the exit button
    private class exitButtonListener implements  ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    

    // lisnter for import button which reads from file , store and display it on the screen.
    private class openButtonListener implements  ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {

            readObject();
            currentPosition=0;
            displayGlass(currentPosition);

        }
    }

    // Restore the default value of each field
    private void displayBlank()
    {

        cChooser.setColor(255,255,255);
        colorName.setText("Enter Color Name");
        mfChooser.setSelectedIndex(0);
        qlbs.setText("");
        qoz.setText("");
        rod.setSelected(true);
        wysiwig.setSelected(false);
        reactive.setSelected(false);
        striking.setSelected(false);
        chrome.setSelected(false);
        notes.setText("Enter any notes here");
        code.setText("Your product code goes here");
    }

    // display a specific glass in the glass array list
    private void displayGlass(int g)
    {
        cChooser.setColor(glass.get(g).getColorRGB());
        colorName.setText(glass.get(g).getColorName());
        if(glass.get(g).getManufacturer().equals("NorthStar")) {
            mfChooser.setSelectedIndex(0);
        }
        if(glass.get(g).getManufacturer().equals("Glass Alchemy"))
        {
            mfChooser.setSelectedIndex(1);
        }
        if(glass.get(g).getManufacturer().equals("Trautmann"))
        {
            mfChooser.setSelectedIndex(2);
        }
        if(glass.get(g).getManufacturer().equals("Momka"))
        {
            mfChooser.setSelectedIndex(3);
        }

        if(glass.get(g).getcType().equals(Glass.type.TUBING))
        {
            tubing.setSelected(true);
        }
        else if(glass.get(g).getcType().equals(Glass.type.FRIT))
        {
            frit.setSelected(true);
        }
        else {
            rod.setSelected(true);
        }
        qlbs.setText(Double.toString(glass.get(g).getQuantity()/16));
        qoz.setText(Integer.toString(glass.get(g).getQuantity()));
        wysiwig.setSelected(glass.get(g).getCharacteristics()[0]);
        reactive.setSelected(glass.get(g).getCharacteristics()[1]);
        striking.setSelected(glass.get(g).getCharacteristics()[2]);
        chrome.setSelected(glass.get(g).getCharacteristics()[3]);
        notes.setText(glass.get(g).getNotes());
        code.setText(glass.get(g).getCode());
    }


    // store a glass object from the program to a position in the array list
    private void storeGlass(int g)
    {
        glass.get(g).setCode(mfcode[0] +mfcode[1]);
        glass.get(g).setManufacturer(manufacturer);
        glass.get(g).setColorRGB(colorRGB);
        glass.get(g).setColorName(colorName.getText());
        glass.get(g).setQuantity((int)amount);
        glass.get(g).setcType(cType);
        glass.get(g).setNotes(notes.getText());
        glass.get(g).setCharacteristics(chrt);
    }


    //Extra credit

    // write object to a txt file 
    public void writeObject() {
        try {

            String fileName  = JOptionPane.showInputDialog(null,"Please Enter File Name:" , "Save",1);
            FileOutputStream file = new FileOutputStream(fileName + ".txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(glass);

            out.close();
            file.close();
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }

    // read object from a txt file
    public void readObject()
    {
        try
        {

            String fileName  = JOptionPane.showInputDialog(null,"Please Enter File Name:" , "Open",1);
            FileInputStream file = new FileInputStream(fileName+".txt");
            ObjectInputStream  in = new ObjectInputStream(file);
            glass = (ArrayList<Glass>) in.readObject();
            file.close();
            in.close();
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
        catch(ClassNotFoundException c)
        {
            c.printStackTrace();
        }
    }



}



