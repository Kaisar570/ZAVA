import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] B = new double[5][5];
        double[] A = new double[5];

        for (int i = 0; i < 5; i++) {
            A[i] = 0;
            for (int j = 0; j < 5; j++) {
                B[i][j] = sc.nextDouble();
                if (B[i][j] > 0)
                    A[i] += B[i][j];
            }
        }

        for (int i = 0; i < 5; i++)
            System.out.println("A[" + i + "] = " + A[i]);
    }
}


