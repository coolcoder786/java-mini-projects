import java.util.Random;
import java.util.Scanner;

class game {
    private int guessed_number;
    int computer_number;
    int guessTaken;
    Scanner sc = new Scanner(System.in);

    public game() {
        System.out.println("Computer IS Guessing The Number ......");
        Random rand = new Random();
        computer_number = rand.nextInt(50);
        // System.out.println(computer_number);
        System.out.println("Guessed");
    }

    public void getNoOfGuesses() {
        guessTaken--;
        System.out.println("-------------------------------------------");
        System.out.println("The Number Of Guesses left Are :" + guessTaken);
        if (guessTaken <= 0) {
            System.out.println("-------------------------------------------");
            System.out.println("Sorry ! You Have Reached Guess Limit....");
            System.out.println("The Number Was :" + computer_number);
            System.out.println("-------------------------------------------");
            System.exit(0);
        }

    }
    public void setNoOfGuesses(int g) {
        guessTaken = g;
    }
    public void takeUserInput() {
        System.out.print("Enter The Number :");
        guessed_number = sc.nextInt();
        isCorrectNumber(guessed_number);

    }

    public void isCorrectNumber(int n) {
        if (guessed_number < computer_number) {
            System.out.println("Number is small");
            getNoOfGuesses();
            takeUserInput();
        } else if (guessed_number > computer_number) {
            System.out.println("Number is large");
            getNoOfGuesses();
            takeUserInput();

        } else if (guessed_number == computer_number) {
            System.out.println("You Win");
        }
        return;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        game think = new game();
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of gusses you want buddy :");
        int guesses = sc.nextInt();
        think.setNoOfGuesses(guesses);
        think.takeUserInput();
        sc.close();
    }
}