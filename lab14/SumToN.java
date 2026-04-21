import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0, i = 1;

        System.out.print("N енгізіңіз: ");
        n = scanner.nextInt();

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Қосынды: " + sum);
    }
}
