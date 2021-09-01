/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.firstsummativeassessments;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kavin
 */
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean tryAgain = false; //Flag for marking if player wants to play again or not.
        String[] nameOfRockPaperScissors = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Welcome to the amazing world of Rock, Paper, and Scissors! You can play against us, the computer, up to 10 rounds in a single game.");
        
        do {
            System.out.println("How many rounds do you want to play?");
            int rounds;
            
            // Sanity check. Making sure that the input is valid.;
            try {
                rounds = Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("I'm so sorry. Our staff member is unable to understand what you were saying. I must request that you leave our show immediately.");
                return;
            }
            if (rounds < 1 || rounds > 10){
                System.out.println("I'm so sorry, but we only offer a game of Rock, Paper, and Scissors for 1 to 10 rounds. No more, no less. I must request that you leave our show immediately.");
                return;
            }
            System.out.println("Excellent! " + rounds + " " + (rounds == 1 ? "round" : "rounds") + " it is!" );
            int currentRound = 0;
            Random rnd = new Random();
            int ties = 0;
            int playerWins = 0;
            int computerWins = 0;
            
            // Loop that runs a single game of Rock, Paper, and Scissors
            
            System.out.println("It is time for round 1!");
            do
            {
                System.out.println("Player! Please make your decision. 1 is Rock. 2 is Paper. 3 is Scissors.");
                int playerDecision;
                
                // Make sure that player uses a valid move, otherwise continue to the beginning of
                // this loop without incrementing the round.
                
                try {
                    playerDecision = Integer.parseInt(sc.nextLine());
                } 
                catch (NumberFormatException e){
                    System.out.println("Sorry our good friend player, that's not a valid decision! Please try again!");
                    continue;
                }
                if (playerDecision < 1 || playerDecision > 3){
                    System.out.println("Sorry our good friend player, that's not a valid decision! Please try again!");
                    continue;
                }
                
                System.out.println("The player has chosen! How will they fare against the computer?");
                
                // Computer choosing a random number between 1 and 3
                
                int computerDecision = rnd.nextInt(3) + 1;
                
                System.out.println("The computer has chosen! It is time for the battle of Rock, Paper, and Scissors.");
                System.out.println("Everyone! Say with me! Rock, Paper, Scissors!");
                
                System.out.println("The player has chosen " + nameOfRockPaperScissors[playerDecision - 1] + " and the computer has chosen " + nameOfRockPaperScissors[computerDecision - 1] + ".");
                
                
                if (playerDecision == computerDecision){
                    System.out.println("It is a tie!");
                    ties++;
                }
                // Check if a player wins by making sure that the decision of player is higher
                // than computer's by 1 in mod 3.
                else if ((playerDecision - computerDecision + 3) % 3 == 1){
                    System.out.println("It is a win for the player!");
                    playerWins++;
                }
                else {
                    System.out.println("It is a win for the computer!");
                    computerWins++;
                }
                currentRound++;
                
                // We do not want to print round 11 when there is only 10 rounds, would we?
                
                if (currentRound < rounds)
                    System.out.println("It is time for round " + (currentRound + 1) + "!");
            } while(currentRound < rounds);
            
            System.out.println("And that's it folk! Our match of Rock, Paper, and Scissors is over! The result is ...");
            System.out.printf("Player wins %d round%s, computer wins %d round%s, and there were %d tie%s.\n", playerWins, playerWins == 1 ? "" : "s", computerWins, computerWins == 1 ? "" : "s", ties, ties == 1 ? "" : "s");
            
            if (playerWins == computerWins){
                System.out.println("Woah! Will you look at that, it is a tie! What an extraodinary performance from both sides!");
            }
            else if (playerWins > computerWins){
                System.out.println("Haha! Player wins! Congratulations!");
            }
            else {
                System.out.println("Computer wins! I'm sorry for you player, but there is always next time.");
            }
            boolean receiveProperAnswer; // Flag for marking if player's respond is valid.
            String decision;
            // Making sure that the player is answering the question properly.
            // We ask the question at least once and keep trying until the player
            // gives the answer "yes" or "no".
            do {
                System.out.println("Do you want to play another round? Please say yes or no.");
                decision = sc.nextLine();
                if ("yes".equalsIgnoreCase(decision)){
                    receiveProperAnswer = true;
                    tryAgain = true;
                    System.out.println("Excellent! Let us begin a new session of Rock, Paper, and Scissors!");
                }
                else if ("no".equalsIgnoreCase(decision)){
                    receiveProperAnswer = true;
                    tryAgain = false;
                    System.out.println("Thank you for participating in our show! Please come back later.");
                }
                else {
                    receiveProperAnswer = false;
                    System.out.println("Player, that's not valid respond. Please try again!");
                }
            } while(!receiveProperAnswer);
        } while (tryAgain);
        
    }
}
