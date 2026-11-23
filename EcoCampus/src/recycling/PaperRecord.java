/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recycling;

/**
 *
 * @author Shan Narayanan
 */
public class PaperRecord extends RecyclingRecord{
    private double pointsPerKg, points;
    private String material;

    public PaperRecord(int id, String date, double weightKg) {
        super(id, date, weightKg);
        pointsPerKg = 7.0;
        points = 0.0;
        material = "";
    }

    public PaperRecord() {
        pointsPerKg = 7.0;
    }

    @Override
    public String getMaterial() {
        return material = "Paper";
    }

    @Override
    public double computePoints() {
        return points = pointsPerKg * weightKg;
    }

    @Override
    public String printDetails() {
        return super.printDetails() + " Material: " + material + " Points: " + points;
    }
    
}
