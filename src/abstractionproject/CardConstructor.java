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
public class CardConstructor implements Card {


        private String name;
        private String color;
        private String suit;
        private int value;

    public CardConstructor(String name, String color, String suit, int value) {
        this.name = name;
        this.color = color;
        this.suit = suit;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    }



        

        
        
        
        