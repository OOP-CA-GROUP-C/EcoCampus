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
public class NewsPaperRecord extends PaperRecord implements Serializable{
    private boolean bundled;
    private String material;

    public NewsPaperRecord(boolean bundled, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.bundled = bundled;
        material = "NewsPaper";
    }

    public NewsPaperRecord() {
        material = "NewsPaper";
    }

    public boolean getBundled() {
        return bundled;
    }

    public void setBundled(boolean bundled) {
        this.bundled = bundled;
    }
    
    @Override
    public String printDetails() {
        return super.printDetails() +  " | Type: " + material + " | bundled: " + bundled;
    }
    
    
}
