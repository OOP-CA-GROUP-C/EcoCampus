/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reuse;

/**
 *
 * @author malavikaumamagash
 */
public abstract class ReuseItem implements Reuse{
    //declare and creating variables
    protected int id;
    protected String title;
    protected String condition;
    protected String contact;
    protected boolean available;
    
    //constructors:
    
    //default constructor:

    public ReuseItem() {
    }
    
    //overloaded constructor:

    public ReuseItem(int id, String title, String condition, String contact, boolean available) {
        this.id = id;
        this.title = title;
        this.condition = condition;
        this.contact = contact;
        this.available = available;
    }

    
    
    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
    //getters

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCondition() {
        return condition;
    }

    public String getContact() {
        return contact;
    }
    

    public boolean isAvailable() {
        return available;
    }
    
    
    @Override
    public abstract String getCategory();
    
    @Override
    public abstract String getDetails();

        
        
        
    
    
}
