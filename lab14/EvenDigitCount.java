import java.util.Scanner;

public class EvenDigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, count = 0;

        System.out.print("Сан енгізіңіз: ");
        number = scanner.nextInt();

        do {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        } while (number != 0);

        System.out.println("Жұп цифрлар саны: " + count);
    }
}

