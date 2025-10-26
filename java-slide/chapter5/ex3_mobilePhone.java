import java.awt.Color;

public class ex3_mobilePhone {
    
    private String ownerName;
    private Color color;
    private String PhoneNumber;
    private String PhoneModel;

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneModel(String PhoneModel) {
        this.PhoneModel = PhoneModel;
    }

    public String getPhoneModel() {
        return PhoneModel;
    }

    @Override
    public String toString() {
        
        return "MobilePhone [" + "ownerName= " + ownerName + ", " + "color= " + color + ", " + "PhoneNumber= " + PhoneNumber + ", " + "PhoneModel= " + PhoneModel + "]";
    } 
    
    public static void main(String[] args) {
 
    }
}