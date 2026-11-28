/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surplus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author UtkarshMishra
 */
public class SurplusFileHandler {
    
    private final String fileName;
    
    public SurplusFileHandler() {
        this("surplus_data.txt");
    }
    
    public SurplusFileHandler(String fileName) {
        this.fileName = fileName;
    }
    
    //writes SurplusItem objects in ArrayList to text file
    
    public void saveItems(ArrayList<SurplusItem> items) {
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file); // Overwrites with latest state
            BufferedWriter bw = new BufferedWriter(fw);

            for (SurplusItem item : items) {
                bw.write(item.toFileString());
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            System.out.println("Error saving surplus listings to file: " + e.getMessage());
        }
    }
    
    //read saved files from text files 
    
    public ArrayList<SurplusItem> loadItems() {
        ArrayList<SurplusItem> loadedItems = new ArrayList<>();
        File file = new File(fileName);

        // If this is the first time running the app, no file exists yet
        if (!file.exists()) {
            return loadedItems;
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                SurplusItem item = parseLine(line);
                if (item != null) {
                    loadedItems.add(item);
                }
                line = br.readLine();
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error loading surplus listings from file: " + e.getMessage());
        }

        return loadedItems;
    }
    
    //method that converts one line from txt file back to SurplusItem subclass
    
    
}
