import java.util.Random;
import java.util.Scanner;

public class Task16 {

    public static int maxX(int[][] a) {
        int max = a[0][0];
        for (int[] row : a)
            for (int x : row)
                if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] a = new int[3][5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                a[i][j] = rand.nextInt(10);

        System.out.println("Max: " + maxX(a));
    }
}import java.util.Scanner;

