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
public abstract class CreatureProperites implements Card {
    

    private int power;
    private int toughness;
    private String name;
    private String color;
    private String effect;
    private String set;
    private int cmc;
    
    public abstract void power (int power);
    public abstract void toughness (int toughness);
    
}
    