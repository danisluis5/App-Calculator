package app.calculator.version1;

import app.calculator.version1.utils.RadioOperator;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainClass extends JFrame implements ActionListener{
    
    private JTextField inputa,inputb,inputkq;
    private JButton btnSolve,btnDelete,btnExit;
    private ButtonGroup operator;
            
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
        this.getContentPane().add(title);
        
        JLabel tacvu = new JLabel("Tác vụ");
        tacvu.setFont(new Font("Tahoma",Font.BOLD,13));
        tacvu.setBounds(18, new UtilsClass().getY(60, 16, 13), 50, 16);
        this.getContentPane().add(tacvu);
        
        JLabel nhapso = new JLabel("Nhập số");
        nhapso.setFont(new Font("Tahoma",Font.BOLD,13));
        nhapso.setBounds(251, new UtilsClass().getY(60, 16, 13), 60, 16);
        this.getContentPane().add(nhapso);
        
        btnSolve = new JButton("Giải");
        btnSolve.setFont(new Font("Tahoma",Font.PLAIN,13));
        btnSolve.setBounds(10 , new UtilsClass().getY(86, 0, 0), 58 , 25);
        btnSolve.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),0));
        this.getContentPane().add(btnSolve);
        btnSolve.addActionListener(this);
        
        btnDelete = new JButton("Xóa");
        btnDelete.setFont(new Font("Tahoma",Font.PLAIN,13));
        btnDelete.setBounds(10 , 123, 58 , 25);
        btnDelete.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),0));
        this.getContentPane().add(btnDelete);
        btnDelete.addActionListener(this);
        
        btnExit = new JButton("Thoát");
        btnExit.setFont(new Font("Tahoma",Font.PLAIN,13));
        btnExit.setBounds(10 , 160, 58 , 25);
        btnExit.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),0));
        btnExit.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        this.getContentPane().add(btnExit);
        btnExit.addActionListener(this);
        
        JLabel lbla = new JLabel("Nhập a:");
        lbla.setFont(new Font("Tahoma",Font.PLAIN,13));
        lbla.setBounds(146, new UtilsClass().getY(106,15,13), 50, 15);
        this.getContentPane().add(lbla);
        
        JLabel lblb= new JLabel("Nhập b:");
        lblb.setFont(new Font("Tahoma",Font.PLAIN,13));
        lblb.setBounds(146, new UtilsClass().getY(146, 15, 13), 50, 15);
        this.getContentPane().add(lblb);
        
        inputa = new JTextField("");
        inputa.setBounds(208, new UtilsClass().getY(98, 0, 0), 207, 23);
        this.getContentPane().add(inputa);
        
        inputb = new JTextField("");
        inputb.setBounds(208 , new UtilsClass().getY(138, 0, 0), 207, 23);
        this.getContentPane().add(inputb);
        
        JLabel pheptoan = new JLabel("Chọn phép toán");
        pheptoan.setFont(new Font("Tahoma",Font.PLAIN,13));
        pheptoan.setBounds(208, 186, 100, 15);
        this.getContentPane().add(pheptoan);
        
        JRadioButton cong = new JRadioButton("Cộng");
        cong.setFont(new Font("Tahoma",Font.PLAIN,13));
        cong.setBounds(207, new UtilsClass().getY(206, 0, 0), 80, 20);
        this.getContentPane().add(cong);
        
        JRadioButton tru = new JRadioButton("Trừ");
        tru.setFont(new Font("Tahoma",Font.PLAIN,13));
        tru.setBounds(315, new UtilsClass().getY(206, 0, 0), 80, 20);
        this.getContentPane().add(tru);
        
        JRadioButton nhan = new JRadioButton("Nhân");
        nhan.setFont(new Font("Tahoma",Font.PLAIN,13));
        nhan.setBounds(207, new UtilsClass().getY(236, 0, 0), 80, 20);
        this.getContentPane().add(nhan);
        
        JRadioButton chia = new JRadioButton("Chia");
        chia.setFont(new Font("Tahoma",Font.PLAIN,13));
        chia.setBounds(315, new UtilsClass().getY(236, 0, 0), 80, 20);
        this.getContentPane().add(chia);
        
        JLabel ketqua = new JLabel("Kết quả:");
        ketqua.setFont(new Font("Tahoma",Font.PLAIN,13));
        ketqua.setBounds(143, 274, 80, 15);
        this.getContentPane().add(ketqua);
        
        inputkq = new JTextField("");
        inputkq.setFont(new Font("Tahoma",Font.PLAIN,13));
        inputkq.setBounds(208, new UtilsClass().getY(267, 0, 0), 207, 23);
        this.getContentPane().add(inputkq);
        
        JLabel linetop = new JLabel("---------------------------------------------------------------------------");
        linetop.setFont(new Font("Tahoma",Font.PLAIN,13));
        linetop.setBounds(30, new UtilsClass().getY(44, 15, 13), 376, 15);
        this.getContentPane().add(linetop);
        
        JLabel linebottom = new JLabel("---------------------------------------------------------------------------");
        linebottom.setBounds(30, new UtilsClass().getY(316, 0, 0), 376, 15);
        linebottom.setFont(new Font("Tahoma",Font.PLAIN,13));
        this.getContentPane().add(linebottom);
        
        JLabel titlex = new JLabel("Copyright © VinaENTER EDU");
        titlex.setFont(new Font("Tahoma",Font.PLAIN,13));
        titlex.setBounds(132, new UtilsClass().getY(334, 15, 13), 200, 15);
        this.getContentPane().add(titlex);
        
        operator = new ButtonGroup();
        operator.add(cong);
        operator.add(tru);
        operator.add(nhan);
        operator.add(chia);
    }
    public static void main(String[] args) {
        new MainClass().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {            
            if(e.getSource() == btnSolve){
                try{
                    
                    int num1 = Integer.parseInt(inputa.getText());
                    int num2 = Integer.parseInt(inputb.getText());
                    if(new RadioOperator().getText(operator).isEmpty()){
                        JOptionPane.showMessageDialog(new MainClass(), "Bạn chưa chọn phép toán để thao tác !",null,JOptionPane.WARNING_MESSAGE);
                    }else{
                        if("Cộng".equals(new RadioOperator().getText(operator))){
                            inputkq.setText(String.valueOf((num1+0.0)+(num2+0.0)));
                        }else if("Trừ".equals(new RadioOperator().getText(operator))){
                            inputkq.setText(String.valueOf((num1+0.0)-(num2+0.0)));
                        }else if("Nhân".equals(new RadioOperator().getText(operator))){
                            inputkq.setText(String.valueOf((num1+0.0)*(num2+0.0)));
                        }else if("Chia".equals(new RadioOperator().getText(operator))){
                            inputkq.setText(String.valueOf(((num1+0.0)/(num2+0.0))));
                        }
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(new MainClass(), "Vui lòng nhập chữ số vào nhé !",null,JOptionPane.WARNING_MESSAGE);
                }
            }else if(e.getSource() == btnDelete){
                inputa.setText("");
                inputb.setText("");
                inputkq.setText("");    
            }else if(e.getSource() == btnExit){
                System.exit(0);
            }
    }
}
