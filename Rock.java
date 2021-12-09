/*
* The "Rock paper and scissors" program.
*
* @author  Ahmad El-khawladeh
* @version 1.0
* @since   2021-12-02
*/

import java.util.Random;
import java.util.Scanner;

/**
* This is the calculating heating time program.
*/
final class Rock {

    /**
    * Constante.
    */
    public static final String ROCK = "rock";
    /**
    * Constant.
    */
    public static final String SCISSORS = "scissors";
    /**
    * Constant.
    */
    public static final String PAPER = "paper";
    /**
    * Constant.
    */
    public static final String WIN = "\nYOU WON!!!!";
    /**
    * Constant.
    */
    public static final String LOST = "\nYou lost...";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    *
    */
    private Rock() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final String[] plays = {ROCK, PAPER, SCISSORS};
        final Random rand = new Random();

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Rock, Paper, or Scissors!?");
        final String input = scanner.nextLine();

        final int playNum = rand.nextInt(3);
        final String play = plays[playNum];
        final String playerPlay = input.toLowerCase();

        System.out.println("\nThe computer picked: " + play);

        if (playerPlay.equals(play)) {
            System.out.println("\nIt is a tie...");
        } else if (ROCK.equals(playerPlay)) {
            if (SCISSORS.equals(play)) {
                System.out.println(WIN);
            } else {
                System.out.println(LOST);
            }
        } else if (PAPER.equals(playerPlay)) {
            if (ROCK.equals(play)) {
                System.out.println(WIN);
            } else {
                System.out.println(LOST);
            }
        } else if (SCISSORS.equals(playerPlay)) {
            if (PAPER.equals(play)) {
                System.out.println(WIN);
            } else {
                System.out.println(LOST);
            }
        } else {
            System.out.println("\nError invalid input");
        }

        System.out.println("\nDone.");
    }
}
