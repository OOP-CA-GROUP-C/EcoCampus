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
public class BottleRecord extends PlasticRecord implements Serializable{
    //declaring var
    private boolean capOn;
    private String material;

    //overloaded constructor
    public BottleRecord(boolean capON, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.capOn = capOn;
        material = "Bottle";
    }
    
    //default constructor
    public BottleRecord() {
       material = "Bottle";
    }
    
    //set methods()
    public void setCap(boolean capOn) {
        this.capOn = capOn;
    }
    
    //get methods
    public boolean getCap() {
        return capOn;
    }

    @Override
    public String printDetails() {
        return super.printDetails() + " | Type: " + material + " | CapOn: " + capOn ;
    }
}
