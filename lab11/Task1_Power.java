import java.util.Scanner;

public class Task1_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        double x = sc.nextDouble();

        System.out.print("y = ");
        double y = sc.nextDouble();

        double result = Math.pow(x, y);

        System.out.println("Нәтиже: " + result);
    }
}

