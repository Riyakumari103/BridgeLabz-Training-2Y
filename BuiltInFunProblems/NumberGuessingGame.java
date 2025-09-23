import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int low = 1, high = 100;
        System.out.println("Think of a number between 1 and 100!");

        while (true) {
            int guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Computer guesses: " + guess);
            System.out.print("Is it High (H), Low (L), or Correct (C)? ");
            char feedback = sc.next().toUpperCase().charAt(0);

            if (feedback == 'C') {
                System.out.println("Yay! Computer guessed it!");
                break;
            } else if (feedback == 'H') {
                high = guess - 1;
            } else if (feedback == 'L') {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        sc.close();
    }
}
