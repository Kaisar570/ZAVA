import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            B[i] = 0;
            for (int j = 0; j < 10; j++) {
                A[i][j] = sc.nextInt();
                if (A[i][j] < 0)
                    B[i] += A[i][j];
            }
        }

        for (int i = 0; i < 10; i++)
            System.out.println("B[" + i + "] = " + B[i]);
    }
}

