import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.*;

public class CalculatorTwoGUI {
    
    private JFrame fr;
    private TextField tx1;
    private JPanel pa1;
    private JButton btn1 ,btn2, btn3, btn4, btn5, btn6 ;
    private JButton btn7 ,btn8, btn9, btn10, btn11, btn12;
    private JButton btn13, btn14, btn15, btn16;

    
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        tx1 = new TextField();
        pa1 = new JPanel();
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("0");
        btn11 = new JButton("+");
        btn12 = new JButton("-");
        btn13 = new JButton("x");
        btn14 = new JButton("/");
        btn15 = new JButton("c");
        btn16 = new JButton("=");
        
        fr.setLayout(new BorderLayout());
        
        fr.add(tx1, BorderLayout.NORTH);
        
        pa1.setLayout(new GridLayout(4, 4));
        
        pa1.add(btn7);
        pa1.add(btn8);
        pa1.add(btn9);
        pa1.add(btn11);
        pa1.add(btn4);
        pa1.add(btn5);
        pa1.add(btn6);
        pa1.add(btn12);  
        pa1.add(btn1);
        pa1.add(btn2);
        pa1.add(btn3);
        pa1.add(btn13);
        pa1.add(btn10);
        pa1.add(btn15);
        pa1.add(btn16);
        pa1.add(btn14);
        
        fr.add(pa1);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500, 500);
        fr.setVisible(true);
        
    }
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}