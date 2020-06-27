package TwentyPlusOne;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to 21!");
        System.out.println("Would you like to play? y/n");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            game(true);
        }

        System.out.println("Thank you for playing!");
    }

    public static void game(boolean play) {
        while (play) {
            Scanner input = new Scanner(System.in);
            Deck deck1 = new Deck();
            deck1.newDeck();
            deck1.shuffleDeck();
            int playerScore = 0;

            Card playerCard1 = deck1.pullFirst();
            Card playerCard2 = deck1.pullFirst();
            playerScore += playerCard1.rank.getNumVal();
            playerScore += playerCard2.rank.getNumVal();
            System.out.println("Your cards are " + playerCard1 + " and " + playerCard2);
            System.out.println("Your total is: " + playerScore);

            while (true) {
                System.out.println("Would you like to draw another card? y/n");
                String draw = input.nextLine();
                if (draw.equalsIgnoreCase("n")) {
                    break;
                }
                Card nextCard = deck1.pullFirst();
                playerScore += nextCard.rank.getNumVal();
                System.out.println("You drew " + nextCard);
                if (playerScore > 21) {
                    break;
                }
                System.out.println("Your total is: " + playerScore);

            }
            int opponentScore = opponentScore();

            System.out.println("Your Score: " + playerScore);
            System.out.println("Computer Score: " + opponentScore);
            if (playerScore > 21){
                System.out.println("Bust! You lose");
            } else if (opponentScore > playerScore) {
                System.out.println("Sorry You lose!");
            } else if (playerScore > opponentScore) {
                System.out.println("Congratulations You Win!");
            } else {
                System.out.println("It's a Tie!");
            }

            System.out.println();


            System.out.println("Would you like to play again? y/n");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                play = false;
            }
            System.out.println("");
        }
    }





    public static int opponentScore(){
        return (int) (Math.random() * 7) + 15 ;
    }
    public static void dealCard(){

    }
}
