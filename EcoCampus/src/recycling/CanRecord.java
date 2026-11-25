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
public class CanRecord extends RecyclingRecord implements Serializable{
    private double pointsPerKg, points;
    private String material;
    private boolean crushed;

    public CanRecord(boolean crushed, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.crushed = crushed;
        pointsPerKg = 5.0;
        points = 0.0;
        material = "";
    }

    public CanRecord() {
       pointsPerKg = 5.0;
    }

    public boolean getCrushed() {
        return crushed;
    }

    public void setCrushed(boolean crushed) {
        this.crushed = crushed;
    }
    
    @Override
    public String getMaterial() {
        return material = "Can";
    }

    @Override
    public double computePoints() {
        if(crushed){
            points = (pointsPerKg * weightKg) - 2;
        }else{
            points = pointsPerKg * weightKg;
        }
        return points;
    }

    @Override
    public String printDetails() {
        return super.printDetails() + " Material: " + material + " Points: " + points;
    }
    
}
