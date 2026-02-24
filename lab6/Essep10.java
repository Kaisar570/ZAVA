import java.util.Scanner;

public class Essep10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x > 0 && x <= 2) {
            f = x * x * Math.sin(x) + Math.sqrt(x * x + 1.2);
        } else if (x > 2 && x <= 6) {
            f = Math.pow(Math.tan(x), 2) + Math.cos(x) + 3.5;
        } else {
            System.out.println("Аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}


