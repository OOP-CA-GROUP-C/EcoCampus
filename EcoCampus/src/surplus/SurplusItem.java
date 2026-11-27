/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surplus;

/**
 *
 * @author UtkarshMishra
 */
public abstract class SurplusItem {
    protected int id;
    protected String title;
    protected String category;
    protected double discountedPrice;
    protected String pickupDeadline;
    protected String status; 
    
    // Default constructor
    public SurplusItem() {
        this(0, "Untitled", "General", 0.0, "18:00", "Available");
    }

    // Overloaded constructor 
    public SurplusItem(String title, String category, double discountedPrice, String pickupDeadline) {
        this(0, title, category, discountedPrice, pickupDeadline, "Available");
    }

    // Full constructor
    public SurplusItem(int id, String title, String category, double discountedPrice,String pickupDeadline, String status) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.discountedPrice = discountedPrice;
        this.pickupDeadline = pickupDeadline;
        this.status = status;
    }
    
    //abstract methods
    public abstract double calculateMoneySaved();

    public abstract double calculateWastePreventedKg();

    public abstract String toFileString();
    
    @Override
    public String toString() {
        return getDetails();
    }
    
    // setter and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getPickupDeadline() {
        return pickupDeadline;
    }

    public void setPickupDeadline(String pickupDeadline) {
        this.pickupDeadline = pickupDeadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getDetails() {
        return "ID: " + id+ " | Title: " + title+ " | Category: " + category+ " | Price: €" + String.format("%.2f", discountedPrice)+ " | Deadline: " + pickupDeadline+ " | Status: " + status;
    }
    
}
