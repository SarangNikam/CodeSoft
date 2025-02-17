import java.util.*;

class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int number = random.nextInt(100) + 1; 
            int maxAttempt = 5;
            int attempt = 0;
            int score = 0;

            System.out.println("\nGuess the generated number. You have " + maxAttempt + " attempts.");

            while (attempt < maxAttempt) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempt++;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number in " + attempt + " attempts.");
                    
                   
                    if (attempt == 1) {
                        score = 100;
                    } else if (attempt == 2) {
                        score = 80;
                    } else if (attempt == 3) {
                        score = 60;
                    } else if (attempt == 4) {
                        score = 40;
                    } else {
                        score = 20;
                    }

                    System.out.println("Your score is " + score + "%");
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }

                if (attempt == maxAttempt) {
                    System.out.println("Sorry! You've used all " + maxAttempt + " attempts. The correct number was: " + number);
                    System.out.println("Your score is 0%");
                }
            }

            
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = sc.next().toLowerCase();
            playAgain = response.equals("yes");

        } while (playAgain);

        System.out.println("Thank you for playing!");
        sc.close(); 
    }
}
