/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recycling;

/**
 *
 * @author Shan Narayanan
 */
public class PlasticRecord extends RecyclingRecord{
    private double pointsPerKg, points;
    private String material;

    public PlasticRecord(int id, String date, double weightKg) {
        super(id, date, weightKg);
        pointsPerKg = 10.0;
        material = "";
        points = 0;
    }

    public PlasticRecord() {
    }

    @Override
    public String getMaterial() {
        return material = "Plastic"; 
    }
    
    @Override
    public double computePoints(){
        return points = pointsPerKg * weightKg;
    }

    @Override
    public String printDetails() {
        return super.printDetails() + " Material: " + material + " Points: " + points; 
    }
    
    
    
    
}
