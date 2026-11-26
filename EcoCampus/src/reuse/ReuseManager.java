/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reuse;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author malavikaumamagash
 */
public class ReuseManager {
    
  
    
    //declaring ArrayList
    
    private static ArrayList<ReuseItem> items;
    private static int id = 1;
    

    // creating a arraylist
    public ReuseManager() {
        items = new ArrayList<>();
    }
    
    
    //add item:
    //ReuseItem item is a runtime polymorphism as ResueItem is the parent class and remaining classes are inheriting from them
    public static void addItem(ReuseItem item){
        //setting id because every item can be easily deleted or displayed by refering to that id
        item.setId(id);
        id++;
        items.add(item);//item can be book tb(textbook) novel,clothes,jacket or even fw which is being added to the arraylist
        
        
    }
    
    
    //search item:
    public static ArrayList<ReuseItem> searchItem(String category) {

        ArrayList<ReuseItem> search = new ArrayList<>();

        if (category.equals("None selected")) {
            JOptionPane.showMessageDialog(null, "Please select a category for searching");
            return search;
        }

        for (ReuseItem reuse : items) {

            if (category.equals("Books")&& reuse instanceof BookItem) {
                search.add(reuse);

            } else if (category.equals("Textbooks")&& reuse instanceof TextbookItem) {
                search.add(reuse);

            } else if (category.equals("Novels")&& reuse instanceof NovelItem) {
                search.add(reuse);

            } else if (category.equals("Clothes")&& reuse instanceof ClothingItem) {
                search.add(reuse);

            } else if (category.equals("Jackets")&& reuse instanceof JacketItem) {
                search.add(reuse);

            } else if (category.equals("Footwears")&& reuse instanceof FootwearItem) {
                search.add(reuse);

            }

        }

        return search;
    }
    
    
    
    
    //delete item:
    
    
    
    
    //display item:
    public static String displayItems(){
        
        String display = "";
        
        for(ReuseItem item:items){
            display = display+"ID: "+item.getId()+" | Title: "+ item.getTitle()+" | Condition: "+ item.getCondition()+" |Details: "+item.getDetails()+"/n";
        }
        
        return display;
        
    }
    
    
    
}
