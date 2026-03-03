import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] C = new double[25];
        double product = 1;
        boolean found = false;

        for (int i = 0; i < 25; i++) {
            C[i] = sc.nextDouble();
            if (C[i] > 0) {
                product *= C[i];
                found = true;
            }
        }

        if (found)
            System.out.println("Көбейтінді: " + product);
        else
            System.out.println("Оң элемент жоқ");
    }
}


