// program to check whether a person is elgible to vote or not
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }

    }
}
