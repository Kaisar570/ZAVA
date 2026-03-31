import java.util.Scanner;

public class Task10_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Мысалы: 2+3*4 → ");
        String exp = sc.nextLine();

        double result = eval(exp);
        System.out.println("Нәтиже: " + result);
    }

    static double eval(String exp) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < exp.length()) ? exp.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                return parseExpression();
            }

            double parseExpression() {
                double x = parseTerm();
                while (true) {
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                while (true) {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int start = pos;

                while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                x = Double.parseDouble(exp.substring(start, pos));

                return x;
            }

        }.parse();
    }
}
