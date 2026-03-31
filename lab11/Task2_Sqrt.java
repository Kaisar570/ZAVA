import java.util.Scanner;

public class Task2_Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сан: ");
        double a = sc.nextDouble();

        if (a < 0) {
            System.out.println("Теріс сан!");
        } else {
            System.out.println("Нәтиже: " + Math.sqrt(a));
        }
    }
}


