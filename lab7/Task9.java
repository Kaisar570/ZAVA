import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] C = new int[5][5];
        int product = 1;
        boolean found = false;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                C[i][j] = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
                found = true;
            }
        }

        if (found)
            System.out.println("Көбейтінді: " + product);
        else
            System.out.println("Оң элемент жоқ");
    }
}

