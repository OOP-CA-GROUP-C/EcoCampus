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
    private static ArrayList<ReuseItem> items = new ArrayList<>();
    private static int id = 0;

    // creating a arraylist
    public ReuseManager() {

    }

    //add item:
    //ReuseItem item is a runtime polymorphism as ResueItem is the parent class and remaining classes are inheriting from them
    public static void addItem(ReuseItem item) {
        //setting id because every item can be easily deleted or displayed by refering to that id
        item.setId(id);
        id++;
        items.add(item);//item can be book tb(textbook) novel,clothes,jacket or even fw which is being added to the arraylist
        
        System.out.println("Added: " + item.getTitle() + " | total = " + items.size());

    }

    //search item:
    public static ArrayList<ReuseItem> searchItem(String category) {

        ArrayList<ReuseItem> search = new ArrayList<>();

        if (category.equals("None selected")) {
            JOptionPane.showMessageDialog(null, "Please select a category for searching");
            return search;
        }

        for (ReuseItem reuse : items) {

            if (category.equals("Books") && reuse instanceof BookItem) {
                search.add(reuse);

            } else if (category.equals("Textbooks") && reuse instanceof TextbookItem) {
                search.add(reuse);

            } else if (category.equals("Novels") && reuse instanceof NovelItem) {
                search.add(reuse);

            } else if (category.equals("Clothes") && reuse instanceof ClothingItem) {
                search.add(reuse);

            } else if (category.equals("Jackets") && reuse instanceof JacketItem) {
                search.add(reuse);

            } else if (category.equals("Footwears") && reuse instanceof FootwearItem) {
                search.add(reuse);

            }

        }

        return search;
    }

    //delete item:
    public static void deleteItems(int delete) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == delete) {
                items.remove(i);
                JOptionPane.showMessageDialog(null, "Deleted the item at index " + i);
                return;

            }

        }
        
        JOptionPane.showMessageDialog(null,"Sorry the item could not be found, please try again");
    }

    //display item:
    public static String displayItems() {
        
        if(items.isEmpty()){
            return "no item found";
        }

        String display = "";

        for (ReuseItem item : items) {
            display = display + "ID: " + item.getId() + " | Title: " + item.getTitle() + " | Condition: " + item.getCondition() + " |Details: " + item.getDetails() + "\n";
        }

        return display;

    }

}
