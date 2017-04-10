
import java.io.Serializable;
import java.util.*;
import java.awt.*;
/**
 * Created by antran on 11/28/16.
 */


public class Glass implements Serializable {
    public static final int ROD=0;
    public static final int FRIT=0;
    public static final int TUBING=0;
    public enum type {ROD,FRIT,TUBING};
    private String code;
    private String Manufacturer;
    private Color colorRGB;
    private String colorName;
    private int quantity;
    private type cType;
    private boolean[] characteristics;
    private String notes;




    public Glass() {
        this.code = "";
        this.Manufacturer = "";
        this.colorRGB = null;
        this.colorName = "";
        this.quantity = 0;
        this.cType = type.ROD ;
        this.characteristics = new boolean[4];
        Arrays.fill(characteristics,false);
        this.notes = "";
    }

    public Glass(String code, String manufacturer, Color colorRGB, String colorName, int quantity, type cType, boolean[] characteristics, String notes) {
        this.code = code;
        this.Manufacturer = manufacturer;
        this.colorRGB = colorRGB;
        this.colorName = colorName;
        this.quantity = quantity;
        this.cType = cType;
        this.characteristics = characteristics;
        this.notes = notes;
    }

    public String getCode() {
        return code;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public Color getColorRGB() {
        return colorRGB;
    }

    public String getColorName() {
        return colorName;
    }

    public int getQuantity() {
        return quantity;
    }

    public type getcType() {
        return cType;
    }

    public boolean[] getCharacteristics() {
        return characteristics;
    }

    public String getNotes() {
        return notes;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public void setColorRGB(Color colorRGB) {
        this.colorRGB = colorRGB;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setcType(type cType) {
        this.cType = cType;
    }

    public void setCharacteristics(boolean[] characteristics) {
        this.characteristics = characteristics;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Glass)) return false;

        Glass glass = (Glass) o;

        if (quantity != glass.quantity) return false;
        if (code != null ? !code.equals(glass.code) : glass.code != null) return false;
        if (Manufacturer != null ? !Manufacturer.equals(glass.Manufacturer) : glass.Manufacturer != null) return false;
        if (colorRGB != null ? !colorRGB.equals(glass.colorRGB) : glass.colorRGB != null) return false;
        if (colorName != null ? !colorName.equals(glass.colorName) : glass.colorName != null) return false;
        if (cType != glass.cType) return false;
        if (!Arrays.equals(characteristics, glass.characteristics)) return false;
        return notes != null ? notes.equals(glass.notes) : glass.notes == null;

    }


}
