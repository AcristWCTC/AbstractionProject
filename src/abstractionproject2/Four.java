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
public class Four implements Card {

    private String face;
    private int value;

    public void face() {
        face = "Four";
    }

    public void value() {
        value = 4;
    }
           public void printOut(){
           System.out.println(face +  " " + value);
       }
}
