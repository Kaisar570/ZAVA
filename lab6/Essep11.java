import java.util.Scanner;

public class Essep11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x <= 4) {
            f = Math.sin(Math.PI * x) + Math.pow(x * x + 6, 1.0/5.0);
        } else if (x > 4) {
            f = Math.log(x) + Math.sqrt(3 * x + 7);
        } else {
            System.out.println("Аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}

