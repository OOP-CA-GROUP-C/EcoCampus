/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recycling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Shan Narayanan
 */
public class RecyclingManager implements RecyclingOperations{
    private ArrayList<RecyclingRecord> records;
    private double totalWeight;

    public RecyclingManager() {
        records = new ArrayList<>();
    }
    //
    public void addRecord(RecyclingRecord record){
        if(record != null){
            records.add(record);
        }else{
            System.out.println("Error!! you have'nt entered anything");
        }
    }
    
    public ArrayList<RecyclingRecord> getRecords(){
        return records;
    }
    
    public ArrayList<RecyclingRecord> searchByMaterial(String material){
        ArrayList<RecyclingRecord> temp = new ArrayList<>();
        for (RecyclingRecord r : records) {
            if (r.getMaterial() != null && r.getMaterial().equalsIgnoreCase(material)) {
                temp.add(r);
            }else{
                System.out.println("Error!! You haven't entered anything");
            }
        }
        return temp;
    }
    
    public double getTotalPoints(){
        double total = 0;
        for(RecyclingRecord r : records){
            total += r.computePoints();
        }
        return total;
    }
    
    public int getCount(){
        return records.size();
    }
    
    public ArrayList<RecyclingRecord> showAll(){
        return records;
    }
    
    public void deleteRecord(int index){
        if (index >= 0 && index < records.size()) {
            records.remove(index);
        }else{
            System.out.println("The record does not exist");
        }
    }
    
    public void writeToFile(String filename) {
       try{
           File f = new File("RecycleRecord.txt");
           FileWriter fw = new FileWriter(f);
           BufferedWriter bw = new BufferedWriter(fw);
           
           bw.write("Writing to file");
           bw.close();
       }catch(IOException e){
           System.out.println("Error!!");
       }
    }
    
    public void readFromFile(String filename) {
        try{
           File f = new File("RecycleRecord.txt");
           FileReader fr = new FileReader(f);
           BufferedReader br = new BufferedReader(fr);
           
           String line = br.readLine();
            while (line != null) {
                line = br.readLine();
            }

           br.close();
       }catch(IOException e){
           System.out.println("Error!!");
       }
    }
    
    public double getTotalWeight(){ 
        for(RecyclingRecord r : records){
            totalWeight += r.getWeightKg();
        }
        return totalWeight;
    }
}
