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
    //decalre variables
    private boolean bundled;
    private String material;

    //overloaded constructor
    public NewsPaperRecord(boolean bundled, int id, String date, double weightKg) {
        super(id, date, weightKg);
        this.bundled = bundled;
        material = "NewsPaper";
    }

    //defualt constructor
    public NewsPaperRecord() {
        material = "NewsPaper";
    }

    //set method
    public void setBundled(boolean bundled) {
        this.bundled = bundled;
    }
    
    //get method
    public boolean getBundled() {
        return bundled;
    }
    
    //override method
    @Override
    public String printDetails() {
        return super.printDetails() +  " | Type: " + material + " | bundled: " + bundled;
    }
    
    
}
