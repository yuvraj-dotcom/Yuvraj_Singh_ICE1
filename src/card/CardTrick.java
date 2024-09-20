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
 * @modifier yuvraj
 * @sheridanId 991756372
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
       
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        for (Card card : magicHand){
            if (card.getSuit().equals(luckyCard.getSuit()) && card.getValue() == luckyCard.getValue()){
                found = true;
                break;
            }
        }

         if(found){
            System.out.println("You won!! The lucky card " + luckyCard.getValue + ", " + luckyCard.getSuit + " is in the magic hand.");
        }else{
            System.out.println("You Lost!! Sorry, the lucky card " + luckyCard.getValue + ", " + luckyCard.getSuit + " is not in the magic hand.");
        }
    }
    
}
