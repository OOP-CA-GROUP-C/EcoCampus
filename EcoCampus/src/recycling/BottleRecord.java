/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recycling;

/**
 *
 * @author Shan Narayanan
 */
public class BottleRecord extends PlasticRecord{
    private boolean capOn;

    public BottleRecord(boolean capON, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.capOn = capOn;
    }

    public BottleRecord() {
       
    }

    public boolean getCap() {
        return capOn;
    }

    public void setCap(boolean capOn) {
        this.capOn = capOn;
    }

    @Override
    public double computePoints() {
        if(capOn){
            return super.computePoints() + 1;
        }else{
            return super.computePoints();
        }
    }

    @Override
    public String printDetails() {
        return super.printDetails() + " CapOn: " + capOn;
    }
}
