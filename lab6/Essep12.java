import java.util.Scanner;

public class Essep12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x <= 2) {
            f = Math.cbrt(1.7 * x + Math.sin(x));
        } else if (x > 2 && x <= 6) {
            f = Math.cos(Math.PI * x) + Math.tan(x);
        } else {
            System.out.println("Аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}


