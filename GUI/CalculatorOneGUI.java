import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JTextField txt1, txt2, txt3;
    private JButton bn1, bn2, bn3, bn4;
    private JPanel p1;

    public CalculatorOneGUI() {
        fr = new JFrame("Calculator");
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        p1 = new JPanel();
        bn1 = new JButton("+");
        bn2 = new JButton("-");
        bn3 = new JButton("x");
        bn4 = new JButton("/");

        fr.setLayout(new GridLayout(4, 0));

        fr.add(txt1);
        fr.add(txt2);

        p1.setLayout(new FlowLayout());
        p1.add(bn1);
        p1.add(bn2);
        p1.add(bn3);
        p1.add(bn4);

        fr.add(p1);
        fr.add(txt3);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
