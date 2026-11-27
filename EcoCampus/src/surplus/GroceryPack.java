/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surplus;

/**
 *
 * @author HP
 */
public class GroceryPack extends SurplusItem {
    
    private String bestBeforeDate; 
    private String storageType;    

    // Default 
    public GroceryPack() {
        super();
        this.category = "Grocery Pack";
        this.bestBeforeDate = "N/A";
        this.storageType = "Ambient";
    }

    // Constructor 
    public GroceryPack(String title, double discountedPrice, String pickupDeadline,String bestBeforeDate, String storageType) {
        super(title, "Grocery Pack", discountedPrice, pickupDeadline);
        this.bestBeforeDate = bestBeforeDate;
        this.storageType = storageType;
    }

    // Full constructor 
    public GroceryPack(int id, String title, double discountedPrice, String pickupDeadline, String status, String bestBeforeDate, String storageType) {
        super(id, title, "Grocery Pack", discountedPrice, pickupDeadline, status);
        this.bestBeforeDate = bestBeforeDate;
        this.storageType = storageType;
    }

    // Overriding Methods 

    @Override
    public double calculateMoneySaved() {
        return discountedPrice;
    }

    @Override
    public double calculateWastePreventedKg() {
        if (storageType != null && (storageType.equalsIgnoreCase("Chilled")|| storageType.equalsIgnoreCase("Frozen"))) {
            return 1.5;
        }
        return 1.0;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Best Before: " + bestBeforeDate+ " | Storage: " + storageType;
    }

    @Override
    public String toFileString() {
        return "GroceryPack;" + id + ";" + title + ";" + discountedPrice + ";"+ pickupDeadline + ";" + status + ";"+ bestBeforeDate + ";" + storageType;
    }
}
