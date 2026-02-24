import java.util.Scanner;

public class Essep8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > -5 && x < 0) {
            f = Math.sqrt(x * x + Math.abs(x));
        } else if (x >= 0 && x < 2) {
            f = 5 * Math.pow(x, 3) + Math.cos(x);
        } else {
            System.out.println("Аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}
