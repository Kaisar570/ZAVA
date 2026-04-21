import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, count = 0;

        System.out.print("Сан енгізіңіз: ");
        number = scanner.nextInt();

        do {
            number /= 10;
            count++;
        } while (number != 0);

        System.out.println("Цифрлар саны: " + count);
    }
}

