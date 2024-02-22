import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel panel1, panel2, panel3;
    private JButton bn1, bn2, bn3;
    private JTextField txt1, txt2;
    private JLabel label1, label2;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");        
                
        panel1 = new JPanel();
        txt1 = new JTextField("6000",10);
        //boolean False = false;
        //txt1.setEditable(False);
        label1 = new JLabel("Balance");
        
        
        panel1.add(label1);
        panel1.add(txt1);
        
        
        panel2 = new JPanel();
        txt2 = new JTextField(10);
        label2 = new JLabel("Amount");
       
        panel2.add(label2);
        panel2.add(txt2);
        
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        
        panel3 = new JPanel();
        panel3.add(bn1);
        panel3.add(bn2);
        panel3.add(bn3);
        
        
      //  fr.setLayout(new GridLayout(2, 1));
        fr.add(panel1);
        fr.setLayout(new FlowLayout());
        fr.add(panel2);
        fr.add(panel3);
        
        fr.setSize(300, 200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        
    
    }
    public static void main(String[] args) {
            new TellerGUI();
        }
    }
