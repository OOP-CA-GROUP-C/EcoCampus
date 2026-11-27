/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reuse;

/**
 *
 * @author malavikaumamagash
 */
public class NovelItem extends BookItem implements Reuse{
    
    //variable
    
    private boolean hardback;
    
    
    
    //constructor:
    
    //default constructor:

    public NovelItem() {
    }
    
    //overloaded constructor:

    public NovelItem(String author, String genre, int id, String title, String condition, String contact, boolean available) {
        super(author, genre, id, title, condition, contact, available);
    }

    public NovelItem(String genre,boolean hardback, String author, int id, String title, String condition, String contact, boolean available) {
        super(author, genre, id, title, condition, contact, available);
        this.hardback = hardback;
        
    }
    
    

    //setter

    public void setHardback(boolean hardback) {
        this.hardback = hardback;
    }

    //getter

    public boolean isHardback() {
        return hardback;
    }

    
    //own mehtods implemented from Reuse interface
    
    @Override
    public String getCategory(){
       return "Novels";
    }
    
    @Override
    public String getDetails(){
        return "[ Author: " + getAuthor() + " | Genre: " + getGenre() +" | Contact: " + getContact()+" ]";
    }
    
}
