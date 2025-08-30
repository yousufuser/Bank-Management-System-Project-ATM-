package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Singup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;

    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s1 ,c;
    String formno;
    Singup3( String formno){
        this.formno = formno;
        //Icon (Bank)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        //Page 3
        JLabel l1 = new JLabel("Page 3 :");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        //Account Details
        JLabel l2= new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        //Account Type
        JLabel l3= new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        //Saving Button
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(253,245,230));
        r1.setBounds(100,180,150,30);
        add(r1);

        //Fixed Deposit Account
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(253,245,230));
        r2.setBounds(350,180,300,30);
        add(r2);

        //Current Account
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(253,245,230));
        r3.setBounds(100,220,250,30);
        add(r3);


        //Recurring Deposit Account
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(253,245,230));
        r4.setBounds(350,220,250,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        //Card Number
        JLabel l4 = new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        //Your 16-digit Card Number
        JLabel l5 = new JLabel("( Your 16-digit Card Number )");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        //XXXX-XXXX-XXXX-4841
        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);

        //It would appear on atm card/cheque Book and Statement
        JLabel l7 = new JLabel("( It would appear on ATM Card / Cheque Book and Statement )");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        //Pin NUM
        JLabel l8 = new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        //Hidden pin XXXXX Pin NUM
        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);


        //Your 16-digit Card Number
        JLabel l10 = new JLabel("( 4 -digit Password )");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        //Services Required
        JLabel l11 = new JLabel("Services Required");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        //Check -BOX ATM
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(253,245,230));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        //Check -BOX ATM
        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(new Color(253,245,230));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        //Check -BOX Mobile Banking
        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(new Color(253,245,230));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        //Check -BOX Email Alerts
        c4 = new JCheckBox("EMAIL ALERTS");
        c4.setBackground(new Color(253,245,230));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        //Check -BOX Email Alerts
        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(new Color(253,245,230));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        //Check -BOX E- Alerts
        c6 = new JCheckBox("E -STATEMENT");
        c6.setBackground(new Color(253,245,230));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        // Declaration
        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(253,245,230));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,20);
        add(c7);

        //From no
        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);


        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);


     //Submit
        s1 = new JButton("SUBMIT");
        s1.setFont(new Font("Raleway",Font.BOLD,14));
        s1.setBackground(Color.BLACK);
        s1.setForeground(Color.white);
        s1.setBounds(250,720,100,30);
        s1.addActionListener(this);
        add(s1);

        //Cancel
        c = new JButton("CANCEL");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.white);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);



        getContentPane().setBackground(new Color(253,245,230));
        setSize(850,800);
        setLocation(400,20);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        }else if (r2.isSelected()){
            atype ="Fixed Deposit Account";
        } else if (r3.isSelected()){
            atype ="Current Account";
        } else if (r4.isSelected()){
            atype ="Recurring Deposit Account";
        }
        Random ran = new Random();
        long first7 =(ran.nextLong() % 90000000L) +1409963000000000L ;
        String cardno =""+Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+1000L;
        String pin =""+Math.abs(first3);

        String faculty = "";

        if (c1.isSelected()){
            faculty = faculty +"ATM CARD,  ";

        } if (c2.isSelected()){
            faculty = faculty + "INTERNET BANKING,  " ;

        }   if (c3.isSelected()){
            faculty = faculty + "MOBILE BANKING,  ";

        }if (c4.isSelected()){
            faculty = faculty + "EMAIL ALERTS,  ";

        }  if (c5.isSelected()){
            faculty = faculty + "CHEQUE BOOK,  ";

        }if (c6.isSelected()){
            faculty = faculty + "E -STATEMENT,  ";
        }
        if (!faculty.isEmpty()){
            faculty = faculty.substring(0,faculty.length() - 2);
        }
        try {
            if (e.getSource() == s1){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Con c = new Con();
                    String q1 = "insert into  singupthree values ('"+formno+"',  '"+atype+"', '"+cardno+"', '"+pin+"', '"+faculty+"' )";
                    String q2 = "insert into login values ('"+formno+"', '"+cardno+"','"+pin+"')";
                    c.statement.executeUpdate(q1);
                    c.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card number : "+cardno+"\n Pin : "+pin);
                    new Deposite(pin);
                    setVisible(false);
                }
            }else if (e.getSource() ==c){
                System.exit(0);
            }


        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Singup3("");

    }
}
