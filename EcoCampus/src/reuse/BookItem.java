/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reuse;

/**
 *
 * @author malavikaumamagash
 */
public class BookItem extends ReuseItem implements Reuse{
    
    //declare and create variable
    
    private String author;
    private String genre;
    
    //constructors:
    
    //default constructor:

    public BookItem() {
    }
    
    //overloaded constructor:

    public BookItem(int id, String title, String condition, String contact, boolean available) {
        super(id, title, condition, contact, available);
    }

    public BookItem(String author, String genre, int id, String title, String condition, String contact, boolean available) {
        super(id, title, condition, contact, available);
        this.author = author;
        this.genre = genre;
    }
    
    
    
    //setters:

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    
    //getter:

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
    
    @Override
    public String getCategory(){
        return "Books";
    }
    
    @Override
    public String getDetails(){
        return "Author: \" + this.author + \" | Contact: \" + getContactInfo();";
    }

  
    
   
    
    
    
    
}
