/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surplus;

/**
 *
 * @author UtkarshMishra
 */
public class BakeryPack extends FreshFoodItem {
    
    private int itemCount;
    private String allergenInfo;
    
    //default constructor
    public BakeryPack() {
        super();
        this.category ="Bakery Pack";
        this.itemCount =1;
        this.allergenInfo="none";
    }
    
    //overloaded
    public BakeryPack(String title, double discountedPrice, String pickupDeadline,int itemCount, String allergenInfo) {
        super(title, "Bakery Pack", discountedPrice, pickupDeadline);
        this.itemCount = itemCount;
        this.allergenInfo = allergenInfo;
    }
    
    //full constructor
    public BakeryPack( int id, String title, double discountedPrice, String pickupDeadline, String status, Boolean sameDayPickup,int itemCount, String allergenInfo) {
        super(id, title, "Bakery Pack", discountedPrice, pickupDeadline, status, sameDayPickup);
        this.itemCount = itemCount;
        this.allergenInfo = allergenInfo;
    }
    
    //setters and getters
    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getAllergenInfo() {
        return allergenInfo;
    }

    public void setAllergenInfo(String allergenInfo) {
        this.allergenInfo = allergenInfo;
    }
    
    //overriding methods    
    @Override
    public double calculateMoneySaved() {
        double estimatedFullPrice = itemCount * 2.50;
        return Math.max(0.0, estimatedFullPrice - discountedPrice);
    }
    
    @Override
    public double calculateWastePreventedKg() {
        return itemCount * 0.15;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+ " | Items: " + itemCount + " | Allergens: " + allergenInfo;
    }

    @Override
    public String toFileString() {
        return "BakeryPack;" + id + ";" + title + ";" + discountedPrice + ";" + pickupDeadline + ";" + status + ";" + sameDayPickup + ";" + itemCount + ";" + allergenInfo;
    }
    
    
}
