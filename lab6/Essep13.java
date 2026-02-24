import java.util.Scanner;

public class Essep13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > 1 && x <= 3) {
            f = Math.sin(5 * x) * Math.sqrt(1 + x * x + Math.pow(Math.log(x), 2));
        } else if (x > 3 && x <= 5) {
            f = Math.exp(x) * Math.cbrt(x + Math.exp(2 * x));
        } else {
            System.out.println("Аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}


