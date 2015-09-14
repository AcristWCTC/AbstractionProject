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
    
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }
    
       public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public void setCovertedManaCost(int cmc) {
        this.cmc = cmc;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSet() {
        return set;
    }

    public String getEffect() {
        return effect;
    }

    public int getCovertedManaCost() {
        return cmc;
    }

    

    
}
