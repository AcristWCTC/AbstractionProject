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
public interface Card {
    public abstract void setName(String name);
    public abstract void setColor(String color);
    public abstract void setSet (String set);
    public abstract void setEffect (String effect);
    public abstract void setCovertedManaCost(int cmc);
    
    public abstract String getName();
    public abstract String getColor();
    public abstract String getSet();
    public abstract String getEffect();
    public abstract int getCovertedManaCost();
    
    
}
