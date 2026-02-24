import java.util.Scanner;

public class Essep7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x < 1) {
            f = Math.sqrt(3 * Math.pow(x, 3) + 4 + Math.cos(x));
        } else if (x >= 1) {
            f = 5 - Math.pow(Math.sin(x), 2);
        } else {
            System.out.println("Аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}

