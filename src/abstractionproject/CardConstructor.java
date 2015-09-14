/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionproject;


/**
 *
 * @author acrist
 */
public class CardConstructor extends Card {


       private String name;
       private String color;
       private String suit;
       private int value;
       private int cardNum;
       

    public CardConstructor(String name, String color, String suit, int value) {
        this.name = name;
        this.color = color;
        this.suit = suit;
        this.value = value;
    }

       @Override
    public void setName(String name) {
        this.name = name;
    }

       @Override
    public void setColor(String color) {
        this.color = color;
    }
    
       @Override
    public void setSuit(String suit) {
        this.suit = suit;
    }

       @Override
    public int getValue() {
        return value;
    }

       @Override
    public void setValue(int value) {
        this.value = value;
    }


    }



        

        
        
        
        