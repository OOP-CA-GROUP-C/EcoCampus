/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surplus;

/**
 *
 * @author HP
 */
public abstract class FreshFoodItem extends SurplusItem {
    
    protected boolean sameDayPickup;
    
    public FreshFoodItem(){
        super();
        this.sameDayPickup= true;
    }
    
    public FreshFoodItem(String title, String category, double discountedPrice, String pickupDeadline){
        super(title,category,discountedPrice,pickupDeadline);
        this.sameDayPickup= true;
    }
    
    public FreshFoodItem(int id,String title, String category, double discountedPrice, String pickupDeadline, String status , Boolean sameDayPickup){
        super(id,title,category,discountedPrice,pickupDeadline,status);
        this.sameDayPickup= sameDayPickup;
    }

    public boolean isSameDayPickup() {
        return sameDayPickup;
    }

    public void setSameDayPickup(boolean sameDayPickup) {
        this.sameDayPickup = sameDayPickup;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails() + " | Same-Day Pickup: " + (sameDayPickup ? "Yes" : "No");
    }
    
}
