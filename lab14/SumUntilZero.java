import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;

        do {
            System.out.print("Сан енгізіңіз (0 - тоқтату): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Қосынды: " + sum);
    }
}

