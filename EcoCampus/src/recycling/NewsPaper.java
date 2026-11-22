/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recycling;

/**
 *
 * @author Shan Narayanan
 */
public class NewsPaper extends PaperRecord{
    private boolean bundled;

    public NewsPaper(boolean bundled, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.bundled = bundled;
    }

    public NewsPaper() {
    
    }

    public boolean getBundled() {
        return bundled;
    }

    public void setBundled(boolean bundled) {
        this.bundled = bundled;
    }
    
    @Override
    public double computePoints() {
        if(bundled){
            return super.computePoints() + 2;
        }else{
            return super.computePoints();
        }
    }
    
    @Override
    public String printDetails() {
        return super.printDetails() + " bundled: " + bundled;
    }
    
    
}
