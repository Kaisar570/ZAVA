import java.util.ArrayList;

public class Task6_History {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();

        history.add("2+2=4");
        history.add("3*3=9");

        for (String h : history) {
            System.out.println(h);
        }
    }
}

