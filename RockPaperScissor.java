import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello guys lets play Rock paper Scissor game");
        while(true){
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor\n");
        int user = input.nextInt();

        Random random = new Random();
        int computer = random.nextInt(3);

        if (user == computer) {
            System.out.println("Game Tied");
        }
        else if (user == 0 && computer == 2 || user == 1 && computer == 0
                || user == 2 && computer == 1) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("You Lost");
        }
        if (computer == 0){
            System.out.println("Computer choosed Rock");
        }
        else if (computer == 1){
            System.out.println("Computer choosed Paper");
        }
        else {
            System.out.println("Computer choosed Scissors ");
        }}
    }
}