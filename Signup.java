package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,M1,M2,M3;
    JButton next;
    JTextField textName,textFName,textEmail,textAdd ,textcity ,textpin ,textstate ;
    JDateChooser dateChooser;



    //Random FRom number Generate
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L ) + 1000L ;
    String first = " "+Math.abs(first4);
    Signup (){
        super("APPLICATION FROM");

        //Iconable(Bank)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

       // Hedaing Application From + Num
        JLabel label1 = new JLabel("APPLICATION FROM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);


        //PAGE NUM
        JLabel label2 =  new JLabel("Page 1 :");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        //Personal Information
        JLabel label3 =  new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        //NAME
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        //TextName
        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);


        //NAME
        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        //Text_Father's_Name
        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,240,400,30);
        add(textFName);


        //DOB
        JLabel DOB= new JLabel("Date of Birth");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        //Calendar
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        //Gender
        JLabel labelGender = new JLabel("Gender");
        labelGender.setFont(new Font("Raleway",Font.BOLD,20));
        labelGender.setBounds(100,290,200,30);
        add(labelGender);

        //Male
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(224,255,255));
        r1.setBounds(300,290,60,30);
        add(r1);

        //Female
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(224,255,255));
        r2.setBounds(400,290,90,30);
        add(r2);

        //Transgender
        r3 = new JRadioButton("Transgender");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(224,255,255));
        r3.setBounds(530,290,120,30);
        add(r3);

        //ButtonGroup
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        //Mail
        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        //TextEmail
        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);


        //Marital Status
        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        //Maiied Button
        M1 = new JRadioButton("Married");
        M1.setBounds (300,440,100,30);
        M1.setBackground(new Color(224,255,255));
        M1.setFont(new Font("Raleway",Font.BOLD,14));
        add(M1);

        M2 = new JRadioButton("Unmarried");
        M2.setBounds (450,440,100,30);
        M2.setBackground(new Color(224,255,255));
        M2.setFont(new Font("Raleway",Font.BOLD,14));
        add(M2);

        M3 = new JRadioButton("Other");
        M3.setBounds (635,440,100,30);
        M3.setBackground(new Color(224,255,255));
        M3.setFont(new Font("Raleway",Font.BOLD,14));
        add(M3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(M1);
        buttonGroup1.add(M2);
        buttonGroup1.add(M3);



        //Adress
        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        //textAddresses
        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);



        //City
        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        //textcity
        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        //PIN
        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        //textpin
        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);


        //State
        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        //textstate
        textstate = new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        //Next Button
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(224,255,255));
        setLayout(null);
        setSize(850, 800);
        setLocation(360 ,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String fromn0 = first;
        String name = textName .getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()) {
            gender ="Male";
        }else if (r2.isSelected()){
            gender ="Female";
        }else if (r3.isSelected()){
            gender ="Transgender";
        }
        String emil = textEmail.getText();
        String marital = null;
        if (M1.isSelected()){
            marital ="Married";
        }else if (M2.isSelected()){
            marital = "Unmarried";
        } else if (M3.isSelected()){
            marital ="Other";
        }

        String address = textAdd.getText();
        String city = textcity.getText();
        String pin = textpin.getText();
        String state = textstate.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con con1 = new Con();
                String q = "insert into singup values('"+fromn0+"', '"+name+"', '"+fname+"','"+dob+"','"+gender+"','"+emil+"','"+marital+"', '"+address+"' ,'"+city+"' ,'"+pin+"','"+state+"' )";
                con1.statement.executeUpdate(q);
                new Signup2(fromn0);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();

    }
}
