import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class calculator {
    private JFrame f;
    private JPanel p1, p2;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
    private JTextField tf1;
    
    public void calculator(){
        f = new JFrame("My Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btn10 = new JButton();
        btn11 = new JButton();
        btn12 = new JButton();
        tf1 = new JTextField();
    
        p1.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(4, 4));
        p1.add(tf1, BorderLayout.NORTH);
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btn4);
        p2.add(btn5);
        p2.add(btn6);
        p2.add(btn7);
        p2.add(btn8);
        p2.add(btn9);
        p2.add(btn10);
        p2.add(btn11);
        p2.add(btn12);
        p1.add(p2, BorderLayout.CENTER);
        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new calculator();
    }
}
    


