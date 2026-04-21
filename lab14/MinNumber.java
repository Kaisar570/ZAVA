import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, min;

        System.out.print("Сан енгізіңіз (0 - тоқтату): ");
        number = scanner.nextInt();
        min = number;

        do {
            if (number < min) {
                min = number;
            }
            System.out.print("Сан енгізіңіз (0 - тоқтату): ");
            number = scanner.nextInt();
        } while (number != 0);

        System.out.println("Ең кіші сан: " + min);
    }
}


