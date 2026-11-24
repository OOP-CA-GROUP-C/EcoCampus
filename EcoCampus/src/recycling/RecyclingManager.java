/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recycling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Shan Narayanan
 */
public class RecyclingManager implements RecyclingOperations, Serializable{
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
    
    public void writeToFile() {
       File outFile;
       FileOutputStream fStream;
       ObjectOutputStream oStream;
       
       try{
           outFile = new File("output.dat");
           fStream = new FileOutputStream(outFile);
           oStream = new ObjectOutputStream(fStream);
           
           oStream.writeObject(records);
           
           oStream.close();
       }catch(IOException e){
           System.out.println("Errror!!");
       }
    }
    
    public void readFromFile() {
        
    }
    
    public double getTotalWeight(){ 
        for(RecyclingRecord r : records){
            totalWeight += r.getWeightKg();
        }
        return totalWeight;
    }
}
