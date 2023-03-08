import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("What is your age?");
         int answer = sc.nextInt();
         System.out.printf("Your age is ", answer);
         sc.close();
    }
}
