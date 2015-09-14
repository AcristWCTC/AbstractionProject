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
public class Creature extends CreatureProperites {
        private static String cardType = "Creature";
        private static String speed = "Sorcery";
        
        public static String getCardType() {
        return cardType;
        
    }

    public static String getSpeed() {
        return speed;
    }
}
