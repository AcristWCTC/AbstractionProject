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
public abstract class Card implements Value{
    
    private String name;
    private String color;
    private String suit;
    
    
    public abstract void setName(String name);
    public abstract void setColor(String color);
    public abstract void setSuit (String set);

    public final String getName() {
        return name;
    }
    public final String getColor(){
        return color;
    }
    public final String getSuit(){
        return suit;
    }

    
    
}
