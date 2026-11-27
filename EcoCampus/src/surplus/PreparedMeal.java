/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surplus;

/**
 *
 * @author HP
 */
public class PreparedMeal extends FreshFoodItem{
    
    private String dietaryType;
    private int portions;
    
    // Default constructor
    public PreparedMeal() {
        super();
        this.category = "Prepared Meal";
        this.dietaryType = "Standard";
        this.portions = 1;
    }

    // overloaded constuctor
    public PreparedMeal(String title, double discountedPrice, String pickupDeadline, String dietaryType, int portions) {
        super(title, "Prepared Meal", discountedPrice, pickupDeadline);
        this.dietaryType = dietaryType;
        this.portions = portions;
    }

    // Full constructor 
    public PreparedMeal(int id, String title, double discountedPrice, String pickupDeadline,String status, boolean sameDayPickup, String dietaryType, int portions) {
        super(id, title, "Prepared Meal", discountedPrice, pickupDeadline, status, sameDayPickup);
        this.dietaryType = dietaryType;
        this.portions = portions;
    }

    public String getDietaryType() {
        return dietaryType;
    }

    public void setDietaryType(String dietaryType) {
        this.dietaryType = dietaryType;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }
    
    //override menthods
    @Override
    public double calculateMoneySaved() {
        double estimatedFullPrice = portions * 8.00;
        return Math.max(0.0, estimatedFullPrice - discountedPrice);
    }
    
    @Override
    public double calculateWastePreventedKg() {
        return portions * 0.45; //just assuming one avg portion is 0.45 kg
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Dietary: " + dietaryType+ " | Portions: " + portions;
    }

    @Override
    public String toFileString() {
        return "PreparedMeal;" + id + ";" + title + ";" + discountedPrice + ";" + pickupDeadline + ";" + status + ";" + sameDayPickup + ";"+ dietaryType + ";" + portions;
    }
    
}

