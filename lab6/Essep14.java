import java.util.Scanner;

public class Essep14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x >= -1 && x <= 1) {
            f = Math.cbrt(Math.abs(x) + Math.pow(x, 4));
        } else if (x > 1 && x <= 4) {
            f = Math.pow(Math.tan(x), 2) * x + Math.log(5 * x);
        } else {
            System.out.println("Аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}

