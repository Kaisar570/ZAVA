import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[25];

        for (int i = 0; i < 25; i++)
            A[i] = sc.nextInt();

        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < 25; i++) {
            if (A[i] > A[maxIndex]) maxIndex = i;
            if (A[i] < A[minIndex]) minIndex = i;
        }

        int temp = A[maxIndex];
        A[maxIndex] = A[minIndex];
        A[minIndex] = temp;

        for (int x : A)
            System.out.print(x + " ");
    }
}


