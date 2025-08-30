package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class main_class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin ;
    main_class (String pin){
        this.pin = pin;
        //Imamge
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        //Masgge Trsnaction
        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,28));
        l3.add(label);

        //Button_Deposite
        b1 =new JButton("DEPOSIT");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(410,274,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        //Button_Deposite
        b2 =new JButton("CASH WITHDRAWAL");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,274,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        //Button_FAST CASH
        b3 =new JButton("FAST CASH");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(410,318,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        //Button_MINI STATEMENT
        b4 =new JButton("MINI STATEMENT");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,318,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        //Button_PIN CHANGE
        b5 =new JButton("PIN CHANGE");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(410,362,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        //Button_BLANCE ENQUIRY
        b6 =new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,362,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        //Button_EXIT
        b7 =new JButton("EXIT");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(700,406,150,35);
        b7.addActionListener(this);
        l3.add(b7);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1 ){
            new Deposite(pin);
            setVisible(false);
        } else if (e.getSource() == b7){
            System.exit(0);
        } else if (e.getSource() == b2){
            new withdrawl(pin);
            setVisible(false);

        } else if (e.getSource() == b6) {
            new  BalanceEnquriy(pin);
            setVisible(false);

        }else if (e.getSource() == b3){
            new  FastCash(pin);
            setVisible(false);
        }else if (e.getSource()==b5){
            new pin(pin);
            setVisible(false);
        }else if (e.getSource() == b4){
            new mini(pin);
        }

    }

    public static void main(String[] args) {
        new main_class("");

    }
}
