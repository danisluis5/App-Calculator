package app.calculator.version1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass extends JFrame{
    public MainClass(){
        
        this.setLocation(300, 200);
        this.setSize(436,389);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        new UtilsClass().setCenterJFrame(this, "VinaENTER - Calculator");
        this.setBackground(new Color(100, 217, 225));
        this.setLayout(null);
        
        JLabel title = new JLabel("VinaENTER - Calculator App");
        title.setFont(new Font("Tahoma",Font.BOLD,18));
        title.setBounds(93, 4, 250, 25);
        /** 11 - (25 - 18) = 3 **/
        this.getContentPane().add(title);
        
        JLabel tacvu = new JLabel("Tác vụ");
        tacvu.setFont(new Font("Tahoma",Font.BOLD,13));
        tacvu.setBounds(18, 59, 50, 16);
        /** 62 - (16-13) */
        this.getContentPane().add(tacvu);
    }
    public static void main(String[] args) {
        new MainClass().setVisible(true);
    }
}
