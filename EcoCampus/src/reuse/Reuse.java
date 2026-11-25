/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reuse;

/**
 *
 * @author malavikaumamagash
 */
public interface Reuse {
    
    //i am using interface here so i dont need to force these methods in the other class i can implement in the class where these methods are needed.
    
    //to get all the details about the entered item 
    public String getDetails();
    
    //to get the category of the entered product
    public String getCategory();
    
    
}
