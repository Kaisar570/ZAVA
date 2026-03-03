import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] D = new int[30];
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < 30; i++) {
            D[i] = sc.nextInt();
            if (D[i] % 2 == 0)
                evenSum += D[i];
            else
                oddSum += D[i];
        }

        System.out.println("Жұп қосындысы: " + evenSum);
        System.out.println("Тақ қосындысы: " + oddSum);
    }
}
import java.util.Random;

