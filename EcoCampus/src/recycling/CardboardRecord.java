/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recycling;

import java.io.Serializable;

/**
 *
 * @author Shan Narayanan
 */
public class CardboardRecord extends PaperRecord implements Serializable{
    //declare variables
    private boolean flattened;
    private String material;

    //overloaded constructor
    public CardboardRecord(boolean flattened, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.flattened = flattened;
        material = "Cardboard";
    }

    //defalut constructor
    public CardboardRecord() {
        material = "Cardboard";
    }
    
    //set method
    public void setFlattened(boolean flattened) {
        this.flattened = flattened;
    }
    
    //get method
    public boolean getFlattened() {
        return flattened;
    }

    //override method
    @Override
    public String getMaterial(){
        return material;
    }
    
    @Override
    public String printDetails() {
        return super.printDetails() + " | Type: " + material + " | flattened: " + flattened;
    }
    
    
}
