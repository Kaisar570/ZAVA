import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] D = new double[17];
        double sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = sc.nextDouble();
            sum += D[i];
        }

        System.out.println("Орта мән: " + (sum / 17));
    }
}


