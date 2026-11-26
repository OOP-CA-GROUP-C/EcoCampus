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
    private boolean capOn;
    private String material;

    public BottleRecord(boolean capON, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.capOn = capOn;
        material = "Bottle";
    }

    public BottleRecord() {
       material = "Bottle";
    }

    public boolean getCap() {
        return capOn;
    }

    public void setCap(boolean capOn) {
        this.capOn = capOn;
    }

    @Override
    public String printDetails() {
        return super.printDetails() + " | Type: " + material + " | CapOn: " + capOn ;
    }
}
