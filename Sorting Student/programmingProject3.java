import java.io.*;
import java.util.*;

public class programmingProject3 {
    public static BufferedWriter fw ;
    public static Scanner scanner = new Scanner(System.in);
    public static List<Student> studentList = new ArrayList<Student>();
    public static String file ="studentList.txt";


    public static void main(String[] args) throws IOException {
        readandStore();
        boolean quit = false;
        do {
            printInstruction();
            int choice = scanner.nextInt(); //get Command from the users
            scanner.nextLine();
            switch(choice)
            {
                case 0:
                    break;
                case 1:
                    storeStudentInfo();

                    break;
                case 2:
                    sortedbyFirstName();

                    break;
                case 3:
                    sortedbyLastName();

                    break;
                case 4:
                    sortedbyPercentageGrade();

                    break;
                case 5:
                    sortedbyletterGrade();

                    break;
                case 6:
                    printList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        } while(!quit);
    }
    // write student information in the text file
    public static void studentRecorder() throws  IOException
    {
        System.out.print("Enter student last name: ");
        fw.write(scanner.nextLine()+"\t");
        System.out.print("Enter student first name: ");
        fw.write(scanner.nextLine()+"\t");
        System.out.print("Enter student ID number: ");
        fw.write(scanner.nextLine()+"\t");
        System.out.print("Enter student percentage grade: ");
        fw.write(scanner.nextDouble()+"\t");
        scanner.nextLine();
        System.out.print("Enter student letter grade: ");
        fw.write(scanner.nextLine()+"\n");
    }
    // take a line of information of student and store in a new student object
    public static Student convertStringtoStudent(String s)
    {
        String[] st = s.split("\\s+");

        Student student = new Student(st[0],st[1],st[2],Double.parseDouble(st[3]),st[4].charAt(0));
        return student;
    }
    // read from the text file and store the information in a array list studentList
    public static void readandStore()
    {
        String line;
        try {
            BufferedReader fr = new BufferedReader(new FileReader(file));
            while( (line =fr.readLine()) != null)
            {
                studentList.add(convertStringtoStudent(line));
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public static void storeStudentInfo() throws IOException
    {
        fw = new BufferedWriter(new FileWriter(file,true));

        System.out.println("How many students would you like to add?");
        {
            int n= scanner.nextInt();
            scanner.nextLine();
            for(int i=0;i<n;i++)
            {
                studentRecorder();
            }
        }
        readandStore();
        sortedbyID();
        fw.close();

    }

    // sort the list by ID
    public static void sortedbyID()
    {
        Collections.sort(studentList);
    }
     // sort the list by first name
    public static void sortedbyFirstName()
    {
        Collections.sort(studentList,new firstNameComparator());
    }
     // sort the list by last name
    public static void sortedbyLastName()
    {
        Collections.sort(studentList,new lastNameComparator());
    }
     // sort the list by percentage grade , if the students have the same grade, sort them by last name
    public static void sortedbyPercentageGrade()
    {
        Collections.sort(studentList,new percentageGradeComparator());
    }
     // sort the list by letter grade
    public static void sortedbyletterGrade()
    {
        Collections.sort(studentList,new letterGradeComparator());
    }
     // print out the student list
    public static void printList()
    {
        System.out.printf("%-13s %-13s %-13s %-13s %-13s \n","First Name","Last Name",
                "ID Number" ,"Percent Grade" ,"Letter Grade");
        for(Student s: studentList)
        {

            s.printStudent();
        }
    }
    // print instruction
    public static void printInstruction()
    {
        System.out.println("\t 0 - To print the instruction.");
        System.out.println("\t 1 - To add more student.");
        System.out.println("\t 2 - To sort by first name.");
        System.out.println("\t 3 - To sort by last name.");
        System.out.println("\t 4 - To sort by percentage grade.");
        System.out.println("\t 5 - To sort by letter grade.");
        System.out.println("\t 6 - To print the list.");
        System.out.println("\t 7 - To quit.");
        System.out.print("Please enter your choice: ");
    }
}
