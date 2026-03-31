import java.util.ArrayList;
import java.util.Scanner;

public class Task5_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-Қосу 2-Азайту 3-Көбейту 4-Бөлу");
        int choice = sc.nextInt();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println(a * b); break;
            case 4: System.out.println(a / b); break;
        }
    }
}

