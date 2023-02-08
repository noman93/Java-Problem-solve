import java.util.Scanner;

// Find out sum of digits of a number
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num= num/ 10;
        }
        System.out.println("Sum of digits: " + sum);

    }
}
