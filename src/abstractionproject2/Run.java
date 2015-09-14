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
import java.util.Random;

public class Run {

    public static void main(String[] args) {

        Card[] cards = {
            new Ace(),
            new King(),
            new Queen(),
            new Jack(),
            new Ten(),
            new Nine(),
            new Eight(),
            new Seven(),
            new Six(),
            new Five(),
            new Four(),
            new Three(),
            new Two()
        };
        
            for(Card c : cards) {
            c.printOut();
            }

    }
}
