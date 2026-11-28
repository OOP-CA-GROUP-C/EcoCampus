/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package surplus;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author UtkarshMishra
 */
public class SurplusManager implements SurplusOperations {
    
    private static SurplusManager instance;

    private ArrayList<SurplusItem> listings;
    private SurplusFileHandler fileHandler;
    private int nextId;
    
    // Private constructor 
    private SurplusManager() {
        listings = new ArrayList<>();
        fileHandler = new SurplusFileHandler();
        nextId = 1;
        loadFromFile();
    }
}
