import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] A = new double[12];
        double product = 1;
        boolean found = false;

        for (int i = 0; i < 12; i++) {
            A[i] = sc.nextDouble();
            if (A[i] < 0) {
                product *= A[i];
                found = true;
            }
        }

        if (found)
            System.out.println("Көбейтінді: " + product);
        else
            System.out.println("Теріс элемент жоқ");
    }
}

