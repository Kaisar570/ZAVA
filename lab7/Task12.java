import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] B = new int[25];

        for (int i = 0; i < 25; i++)
            B[i] = sc.nextInt();

        Arrays.sort(B);

        for (int x : B)
            System.out.print(x + " ");
    }
}


