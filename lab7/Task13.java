import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] C = new int[20];
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            C[i] = sc.nextInt();
            sum += C[i];
        }

        System.out.println("Орта мән: " + (sum / 20));
    }
}


