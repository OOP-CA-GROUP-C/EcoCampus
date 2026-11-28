/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reuse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author malavikaumamagash
 */
public class ReuseManager implements Serializable {

    //declaring ArrayList
    private static ArrayList<ReuseItem> items = new ArrayList<>();
    private static int id = 1;

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
        writeFile();

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
            
            if(reuse.getCategory().equals(category)){
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
                writeFile();
                JOptionPane.showMessageDialog(null, "Deleted the item at index " + i);
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null,"Item Not found");
        
    }

    //display item:
    public static String displayItems(){

        if (items.isEmpty()){
            return "no item found";
        }

        String display = "";

        for(ReuseItem item : items){
            display = display + "ID: " + item.getId() + " | Title: " + item.getTitle() + " | Condition: " + item.getCondition() + " |Details: " + item.getDetails() + "\n";
        }
        return display;
    }
    
    
    
    //file handling
    public static void writeFile() {
        
        File outFile;
        FileOutputStream outStream;
        ObjectOutputStream outObj;

        try{
            outFile = new File("reuse.dat");
            outStream = new FileOutputStream(outFile);
            outObj = new ObjectOutputStream(outStream);

            outObj.writeObject(items);
            outObj.close();

        }catch (IOException e) {            
            JOptionPane.showMessageDialog(null, e);

        }
        

    }
    
    
    public static void readFile(){
        
        File inputFile;
        FileInputStream inputStream;
        ObjectInputStream inputObj;
        
        inputFile = new File("reuse.dat");
        if(!inputFile.exists()){
            return;
        }
        
        try{
            
            inputStream = new FileInputStream(inputFile);
            inputObj = new ObjectInputStream(inputStream);
            
            items = (ArrayList<ReuseItem>) inputObj.readObject();
            inputObj.close();
            
            // continue the ids after the highest saved one, so no id is used twice
            for (ReuseItem item : items) {
                if (item.getId() >= id) {
                    id = item.getId() + 1;
                }
            }
            
        }catch (IOException  e){
            JOptionPane.showMessageDialog(null,e);
            
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
                
        
        
        
    }
        
        

}
