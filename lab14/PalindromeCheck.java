import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, original, reversed = 0;

        System.out.print("Сан енгізіңіз: ");
        number = scanner.nextInt();
        original = number;

        do {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        } while (number != 0);

        if (original == reversed) {
            System.out.println("Палиндром сан");
        } else {
            System.out.println("Палиндром емес");
        }
    }
}




