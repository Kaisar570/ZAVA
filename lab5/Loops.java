import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== 1-мысал =====
        // 1-ден 100-ге дейінгі жұп сандар
        System.out.println("Жұп сандар:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        // ===== 2-мысал =====
        // N санының факториалы (while)
        System.out.print("\nN енгізіңіз: ");
        int n = sc.nextInt();

        int fact = 1;
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Факториал: " + fact);

        sc.close();
    }
}
