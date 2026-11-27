/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surplus;

/**
 *
 * @author UtkarshMishra
 */
public class SurplusStats {
    
    private int activeListings;
    private int totalClaimed;
    private double moneySaved;
    private double wastePreventedKg;
    
    //default 
    public SurplusStats() {
    }
    
    //full constructor
    public SurplusStats(int activeListings, int totalClaimed, double moneySaved, double wastePreventedKg) {
        this.activeListings = activeListings;
        this.totalClaimed = totalClaimed;
        this.moneySaved = moneySaved;
        this.wastePreventedKg = wastePreventedKg;
    }
    
    //setters and getters
    public int getActiveListings() {
        return activeListings;
    }

    public void setActiveListings(int activeListings) {
        this.activeListings = activeListings;
    }

    public int getTotalClaimed() {
        return totalClaimed;
    }

    public void setTotalClaimed(int totalClaimed) {
        this.totalClaimed = totalClaimed;
    }

    public double getMoneySaved() {
        return moneySaved;
    }

    public void setMoneySaved(double moneySaved) {
        this.moneySaved = moneySaved;
    }

    public double getWastePreventedKg() {
        return wastePreventedKg;
    }

    public void setWastePreventedKg(double wastePreventedKg) {
        this.wastePreventedKg = wastePreventedKg;
    }
    
    //display headers    
    public String getFormattedMoneySaved() {
        return "€" + String.format("%.2f", moneySaved);
    }

    public String getFormattedWastePrevented() {
        return String.format("%.1f kg", wastePreventedKg);
    }
    
    
    
}
