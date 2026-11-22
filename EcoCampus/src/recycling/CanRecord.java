/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recycling;

/**
 *
 * @author Shan Narayanan
 */
public class CanRecord extends RecyclingRecord{
    private double pointsPerKg, points;
    private String material;
    private boolean crushed;

    public CanRecord(boolean crushed, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.crushed = crushed;
    }

    public CanRecord() {
       
    }

    public boolean getCrushed() {
        return crushed;
    }

    public void setCrushed(boolean crushed) {
        this.crushed = crushed;
    }
    
    
    
}
