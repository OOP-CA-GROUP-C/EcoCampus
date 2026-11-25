/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reuse;

/**
 *
 * @author malavikaumamagash
 */
public class ClothingItem extends ReuseItem {
    
    //declaring variable
    private String size;
    
    //constructor:
    
    //default constructor:

    public ClothingItem() {
    }
    
    //overloaded constructor:

    public ClothingItem(int id, String title, String condition, String contact, boolean available) {
        super(id, title, condition, contact, available);
    }

    public ClothingItem(String size, int id, String title, String condition, String contact, boolean available) {
        super(id, title, condition, contact, available);
        this.size = size;
    }
    
    //setter 

    public void setSize(String size) {
        this.size = size;
    }
    
    //getter

    public String getSize() {
        return size;
    }
    
    
    
    
}
