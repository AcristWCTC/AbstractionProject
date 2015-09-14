/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionproject;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Adam
 */
public class StartUp {
    public static void main(String[] args) {
        
        
        
        Random num = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        
        Card Ace = new CardConstructor("Ace","Red","Heart",11);
        Card King = new CardConstructor("King","Red","Heart",10);
        Card Queen = new CardConstructor("Queen","Red","Heart",10);
        Card Jack = new CardConstructor("Jack","Red","Heart",10);
        Card Ten = new CardConstructor("Ten","Red","Heart",10);
        Card Nine = new CardConstructor("Nine","Red","Heart",9);
        Card Eight = new CardConstructor("Eight","Red","Heart",8);
        Card Seven = new CardConstructor("Seven","Red","Heart",7);
        Card Six = new CardConstructor("Six","Red","Heart",6);
        Card Five = new CardConstructor("Five","Red","Heart",5);
        Card Four = new CardConstructor("Four","Red","Heart",4);
        Card Three = new CardConstructor("Three","Red","Heart",3);
        Card Two = new CardConstructor("Two","Red","Heart",2);
        
        
        
        
        
        

        

        
        
        
    }
}
