import java.util.Scanner;

public class percentCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets see how much percentage is secured by you in class 10");
        System.out.println("enter your subject1 marks:");
        int a = sc.nextInt();
        System.out.println("enter your subject2 marks:");
        int b = sc.nextInt();
        System.out.println("enter your subject3 marks:");
        int c = sc.nextInt();
        System.out.println("enter your subject4 marks:");
        int d = sc.nextInt();
        System.out.println("enter your subject5 marks:");
        int e = sc.nextInt();
        int sum = (a+b+c+d+e)/5;
        System.out.print("you secured: "+ sum+"%");
    }
}