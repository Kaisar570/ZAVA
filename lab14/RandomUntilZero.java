import java.util.Scanner;

public class RandomUntilZero {
    public static void main(String[] args) {
        int number;

        do {
            number = (int)(Math.random() * 10); // 0-9
            System.out.println(number);
        } while (number != 0);

        System.out.println("0 шықты, тоқтады.");
    }
}
