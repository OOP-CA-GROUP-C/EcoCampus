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
public class PlasticRecord extends RecyclingRecord implements Serializable, RecyclingOperations{
    //declare variables
    private double pointsPerKg, points;
    private String material;

    //overloaded constructor
    public PlasticRecord(int id, String date, double weightKg) {
        super(id, date, weightKg);
        pointsPerKg = 10.0;
        points = 0.0;
        material = "Plastic";
    }

    //defalut constructor
    public PlasticRecord() {
        pointsPerKg = 10.0;
        material = "Plastic";
    }

    //override methods
    @Override
    public String getMaterial() {
        return material; 
    }
    
    @Override
    public double computePoints(){
        return points = pointsPerKg * weightKg;
    }
    
    @Override
    public String printDetails() {
        return super.printDetails() + " | Material: " + material + " | Points: " + points; 
    }
    
    
    
    
}
