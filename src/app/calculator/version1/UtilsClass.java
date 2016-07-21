package app.calculator.version1;

import java.awt.Font;
import java.awt.FontMetrics;
import javax.swing.JFrame;

public class UtilsClass {
    public void setCenterJFrame(JFrame frame,String title){
        frame.setFont(new Font("Arial",Font.PLAIN,13));
        FontMetrics fm = frame.getFontMetrics(frame.getFont());
        int x = fm.stringWidth("VinaENTER - Calculator");
        int z = frame.getWidth()/2 - x/2;
        int y = fm.stringWidth(" ");
        frame.setTitle(String.format("%"+z/y+"s","")+title);
    }
    public int getY(int x,int y,int z){
        return x-(y-z);
    }
}
