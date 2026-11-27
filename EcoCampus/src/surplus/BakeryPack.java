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
    
    
}
