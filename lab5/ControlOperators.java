import java.util.Scanner;

public class ControlOperators {
    public static void main(String[] args) {

        // ===== 1-мысал (break) =====
        // 13-ке бөлінгенде тоқтау
        System.out.println("13-ке дейінгі сандар:");
        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0)
                break;
            System.out.print(i + " ");
        }

        // ===== 2-мысал (continue) =====
        // 4-ке бөлінетіндерді өткізу
        System.out.println("\n4-ке бөлінбейтін сандар:");
        for (int i = 1; i <= 50; i++) {
            if (i % 4 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}

