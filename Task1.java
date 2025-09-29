import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        int maxAttempts = 7;
        int score = 0;
        boolean correct = false;
        
        System.out.println("Think of a number between " + low + " and " + high);
        System.out.println("I will try to guess it within " + maxAttempts + " attempts!");
        
        int attempts = 0;
        while (!correct && low <= high && attempts < maxAttempts) {
            int guess = (low + high) / 2; // binary search guess
            attempts++;
            System.out.println("\nAttempt " + attempts + " of " + maxAttempts);
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'correct', 'low', or 'high': ");
            String feedback = sc.next().toLowerCase();
            
            if (feedback.equals("correct")) {
                correct = true;
                System.out.println("Yay! I guessed your number in " + attempts + " attempts!");
                score = 1; // You can adjust the score as needed
            } else if (feedback.equals("low")) {
                high = guess - 1; // number is lower
            } else if (feedback.equals("high")) {
                low = guess + 1; // number is higher
            } else {
                System.out.println("Invalid input! Please type 'correct', 'low', or 'high'.");
                attempts--; // decrement attempts for invalid input
            }
            
            // show attempts left
            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }
        
        if (!correct) {
            System.out.println("\nOh no! I couldn't guess your number!");
        }
        
        System.out.println("Final Score: " + score);
        sc.close();
    }
}