/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reuse;

/**
 *
 * @author malavikaumamagash
 */
public class FootwearItem extends ClothingItem implements Reuse {
    
    //variable
    
    private double shoeSize;
    private String fType;
    
    //constructor:
    
    //default constructor:

    public FootwearItem() {
    }
    
    //overloaded constructor:

    public FootwearItem(String size, int id, String title, String condition, String contact, boolean available) {
        super(size, id, title, condition, contact, available);
    }

    public FootwearItem(double shoeSize, String fType, String size, int id, String title, String condition, String contact, boolean available) {
        super(size, id, title, condition, contact, available);
        this.shoeSize = shoeSize;
        this.fType = fType;
    }
    
    //setter

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void setFType(String type) {
        this.fType = fType;
    }
    
    //getter

    public double getShoeSize() {
        return shoeSize;
    }

    public String getFType() {
        return fType;
    }
    
    
        
    //own mehtods implemented from Reuse interface
    
    @Override
    public String getCategory(){
        return "Footwear";
    }
    
    @Override
    public String getDetails(){
        return "Author: \" + this.author + \" | Contact: \" + getContactInfo();";
    }
    
    
}
