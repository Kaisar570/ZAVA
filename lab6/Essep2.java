import java.util.Scanner;

public class Essep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();
        double f;

        if (x >= 0) {
            f = Math.sqrt(Math.pow(x, 3) + 5);
        } else if (x > -3 && x < 0) {
            f = 3 * Math.pow(x, 4) + 9;
        } else {
            System.out.println("Аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}


