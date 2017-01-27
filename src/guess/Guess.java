package guess;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joshua Tennies
 */
public class Guess {

    /**
     * Have user guess a number between 1 and 10. Loop until their guess is right
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(10) + 1;
        System.out.print("Guess a number between 1 and 10: ");
        while (true) {
            if (sc.nextInt() == answer) {
                break;
            } else {
                System.out.print("\nIncorrect. Guess again: ");
            }
        }
        System.out.println("Good job! You guessed the answer!");

    }

}
