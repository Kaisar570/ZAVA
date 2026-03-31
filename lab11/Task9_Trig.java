import java.util.Scanner;

public class Task9_Trig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double deg = sc.nextDouble();
        double rad = Math.toRadians(deg);

        System.out.println("sin: " + Math.sin(rad));
        System.out.println("cos: " + Math.cos(rad));
        System.out.println("tan: " + Math.tan(rad));
    }
}


