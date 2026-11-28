/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reuse;

import java.io.Serializable;

/**
 *
 * @author malavikaumamagash
 */
public class TextbookItem extends BookItem implements Serializable {
    
    //variable
    
    private String subject;
    private int edition;
    
    //constructor:
    
    //default constructor:

    public TextbookItem() {
    }
    
    
    //overloaded constructor:

    public TextbookItem(String author, String genre, int id, String title, String condition, String contact, boolean available) {
        super(author, genre, id, title, condition, contact, available);
    }

    public TextbookItem(String subject, int edition, String author, String genre, int id, String title, String condition, String contact, boolean available) {
        super(author, genre, id, title, condition, contact, available);
        this.subject = subject;
        this.edition = edition;
    }
    
    

    
    
    //setter

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
    
    //getter

    public String getSubject() {
        return subject;
    }

    public int getEdition() {
        return edition;
    }
    
    //own mehtods implemented from Reuse interface 
    
    @Override
    public String getCategory(){
        return "Textbooks";
    }
    
    
    
    @Override
    public String getDetails(){
        return "[ Author: " + getAuthor() + " | Genre: " + getGenre() +" | Contact: " + getContact()+" | Subject: "+subject+" | Edition: "+edition+" ]";
    }
    
    
    
    
}
