/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(3)]);
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine();
        if (userValue < 1 || userValue > 13){
            System.out.println("Invalid input!! Please enter a value between 1 and 13");
            return;
        }
        
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        int userSuit = scanner.nextInt();
        scanner.nextLine();
        
        if (userSuit < 0 || userSuit > 3){
            System.out.println("Invalid input!! Please enter a value between 0 and 3");
            return;
        }
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
