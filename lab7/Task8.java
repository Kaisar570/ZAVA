import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] A = new double[12][6];

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 6; j++)
                A[i][j] = sc.nextDouble();

        for (int j = 0; j < 6; j++) {
            double product = 1;
            boolean found = false;

            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    product *= A[i][j];
                    found = true;
                }
            }

            if (found)
                System.out.println("Бағана " + j + ": " + product);
            else
                System.out.println("Бағана " + j + ": теріс жоқ");
        }
    }
}


