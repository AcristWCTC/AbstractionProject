/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionproject2;

/**
 *
 * @author acrist
 */
public class Ace implements Card {
    
    private String face;
    private int value;
    
       public void face(){   
           face = "Ace";  
           System.out.println("hi");
    }
       public void value(){
           value = 11;
       }
       public void printOut(){
           System.out.println(face +  "  " + value);
       }
    
    
}
