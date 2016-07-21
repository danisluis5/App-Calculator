package app.calculator.version1.utils;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class RadioOperator {
    public String getText(ButtonGroup btOperator){
        String outpuString = "";
        Enumeration<AbstractButton> el = btOperator.getElements();
        while(el.hasMoreElements()){
            AbstractButton operator = el.nextElement();
            if(operator.isSelected()){
                outpuString = operator.getText();
            }
        }
        return outpuString;
    }
}
