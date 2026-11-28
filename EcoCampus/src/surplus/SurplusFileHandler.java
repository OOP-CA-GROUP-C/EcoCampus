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
}
