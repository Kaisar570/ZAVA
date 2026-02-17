import java.util.Scanner;

public class FunctionsExample {

    // ===== 1-мысал =====
    // Квадрат қайтаратын әдіс
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сан енгізіңіз: ");
        int num = sc.nextInt();

        System.out.println("Квадраты: " + square(num));

        // ===== 2-мысал =====
        // Кесінді функция
        double x = num;
        double y;

        if (x < 0)
            y = x * x;
        else
            y = 2 * x + 1;

        System.out.println("f(x) = " + y);

        sc.close();
    }
}
