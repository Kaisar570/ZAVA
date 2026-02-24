import java.util.Scanner;

public class Essep15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > 1 && x <= 3) {
            f = Math.pow(x * x * x + Math.sin(Math.PI * x) + Math.log(x), 1.0/4.0);
        } else if (x > 3 && x <= 7) {
            f = Math.cbrt(1.5 * x * x - Math.exp(2 * x) + Math.pow(Math.log(x), 3));
        } else {
            System.out.println("Аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}

