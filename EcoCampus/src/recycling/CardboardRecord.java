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
    private boolean flattened;
    private String material;

    public CardboardRecord(boolean flattened, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.flattened = flattened;
    }

    public CardboardRecord() {
    }

    public boolean getFlattened() {
        return flattened;
    }

    public void setFlattened(boolean flattened) {
        this.flattened = flattened;
    }
    
    @Override
    public String getMaterial() {
        return material = "Cardboard"; 
    }

    @Override
    public double computePoints() {
        if(flattened){
            return super.computePoints() + 2;
        }else{
            return super.computePoints();
        }
    }
    
    @Override
    public String printDetails() {
        return super.printDetails() + " flattened: " + flattened;
    }
    
    
}
