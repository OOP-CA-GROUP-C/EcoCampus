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
public abstract class RecyclingRecord implements RecyclingOperations, Serializable{
    //declaring variables
    protected int id;
    protected String date;
    protected double weightKg;

    //overloaded constructor
    public RecyclingRecord(int id, String date, double weightKg) {
        this.id = id;
        this.date = date;
        this.weightKg = weightKg;
        this.date = java.time.LocalDate.now().toString();
    }

    //default constructor
    public RecyclingRecord() {
        this.date = java.time.LocalDate.now().toString();
    }

    //set methods
    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWeightKg(double weightKg) {
        if(weightKg < 0){
            System.out.println("Please enter the weight above 0");
        }else if(weightKg == 0){
            System.out.println("Please enter the weight you have entered 0");
        }
        this.weightKg = weightKg;
    }

    //get methods
    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getWeightKg() {
        return weightKg;
    }
    
    //abstract methods
    public abstract double computePoints();
    
    public abstract String getMaterial();
    
    public String printDetails(){
        return "Id: " + id + " | Date: " + date + " | Weight: " + weightKg + "kg";
    }
    
}
