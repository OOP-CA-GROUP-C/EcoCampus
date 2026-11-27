/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package surplus;

import java.util.ArrayList;

/**
 *
 * @author UtkarshMishra
 */
public interface SurplusOperations {
    
    public void addListing(SurplusItem item);

    public ArrayList<SurplusItem> getAllListings();

    public ArrayList<SurplusItem> getAvailableListings();

    public ArrayList<SurplusItem> searchByCategory(String category);

    public boolean claimListing(int id);

    public int deleteExpiredListings();

    public boolean deleteListingById(int id);

    public void saveToFile();

    public void loadFromFile();
}
