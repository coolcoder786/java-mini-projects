import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("JAVA PROGRAMME TO CHECK WHETHER A LETTER IS VOWEL OR NOT\nEnter A letter");
        char letter = sc.next().charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("The Letter is a Vowel");
        }
        else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            System.out.println("The Letter is a Vowel");
        }
        else {
            System.out.println("The letter is not a Vowel");
        }
    }
}
