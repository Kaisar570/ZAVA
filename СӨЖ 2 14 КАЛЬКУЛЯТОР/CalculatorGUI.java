import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    JTextField textField;
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    CalculatorGUI() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Егер сан басылса
        if (command.matches("\\d")) {
            textField.setText(textField.getText() + command);
        }

        // Егер оператор болса
        else if (command.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(textField.getText());
            operator = command.charAt(0);
            textField.setText("");
        }

        // Теңдік
        else if (command.equals("=")) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
            }

            textField.setText(String.valueOf(result));
        }

        // Тазалау
        else if (command.equals("C")) {
            textField.setText("");
            num1 = num2 = result = 0;
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}