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

    /**
     * Reads saved lines from the text file and reconstructs the matching
     * PreparedMeal, BakeryPack, or GroceryPack objects.
     */
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

    /**
     * Helper method that converts one line from surplus_data.txt back into
     * its corresponding SurplusItem subclass.
     */
    private SurplusItem parseLine(String line) {
        if (line == null || line.trim().isEmpty()) {
            return null;
        }

        String[] parts = line.split(";");

        try {
            String type = parts[0];

            if (type.equals("PreparedMeal") && parts.length >= 9) {
                int id = Integer.parseInt(parts[1]);
                String title = parts[2];
                double price = Double.parseDouble(parts[3]);
                String deadline = parts[4];
                String status = parts[5];
                boolean sameDay = Boolean.parseBoolean(parts[6]);
                String dietaryType = parts[7];
                int portions = Integer.parseInt(parts[8]);
                return new PreparedMeal(id, title, price, deadline, status, sameDay, dietaryType, portions);

            } else if (type.equals("BakeryPack") && parts.length >= 9) {
                int id = Integer.parseInt(parts[1]);
                String title = parts[2];
                double price = Double.parseDouble(parts[3]);
                String deadline = parts[4];
                String status = parts[5];
                boolean sameDay = Boolean.parseBoolean(parts[6]);
                int itemCount = Integer.parseInt(parts[7]);
                String allergenInfo = parts[8];
                return new BakeryPack(id, title, price, deadline, status, sameDay, itemCount, allergenInfo);

            } else if (type.equals("GroceryPack") && parts.length >= 8) {
                int id = Integer.parseInt(parts[1]);
                String title = parts[2];
                double price = Double.parseDouble(parts[3]);
                String deadline = parts[4];
                String status = parts[5];
                String bestBefore = parts[6];
                String storageType = parts[7];
                return new GroceryPack(id, title, price, deadline, status, bestBefore, storageType);
            }
        } catch (NumberFormatException e) {
            System.out.println("Skipping corrupted line in file: " + line);
        }

        return null;
    }
}
