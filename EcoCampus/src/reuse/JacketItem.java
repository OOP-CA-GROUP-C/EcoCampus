/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reuse;

/**
 *
 * @author malavikaumamagash
 */
public class JacketItem extends ClothingItem implements Reuse{
    
    //variable
    private boolean hooded;
    private boolean waterproof;
    
    //constructor:
    
    //default constructor:

    public JacketItem() {
    }
    
    //overloaded constructor:

    public JacketItem(String size, int id, String title, String condition, String contact, boolean available) {
        super(size, id, title, condition, contact, available);
    }

    public JacketItem(boolean hooded, boolean waterproof, String size, int id, String title, String condition, String contact, boolean available) {
        super(size, id, title, condition, contact, available);
        this.hooded = hooded;
        this.waterproof = waterproof;
    }
    
    //setter 

    public void setHooded(boolean hooded) {
        this.hooded = hooded;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }
    
    //getter

    public boolean isHooded() {
        return hooded;
    }

    public boolean isWaterproof() {
        return waterproof;
    }
    
    //own mehtods implemented from Reuse interface
    
    @Override
    public String getCategory(){
        return "Jacket";
    }
    
    @Override
    public String getDetails(){
        return "[ Size: "+getSize()+" | Contact: "+getContact()+" ]";
    }
    
    
}
