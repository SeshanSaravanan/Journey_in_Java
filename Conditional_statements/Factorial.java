import java.util.*;

public class Factorial {
    public static void main(String[] args) {

        int num, fact = 1; //factorial of that number
        int i;

        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of the number " + (i-1) + " is " + fact);
    }
}