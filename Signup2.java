package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox ,comboBox2 ,comboBox3, comboBox4,comboBox5;
    JTextField textpan ,textaadhaar ;
    JButton next;
    JRadioButton r1,r2 ,e1,e2;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");


        //Icon (Bank)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;
        //Page 2
        JLabel l1 = new JLabel("Page 2 : ");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        //Additional Details
        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        //Religion
        JLabel l3 = new JLabel("Religian :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);
        //For religion drop-down manu
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox (religion);
        comboBox.setBackground (new Color(245,255,250 ));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);


        //Category
        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);
        //For Category drop-down manu
        String Category [] = {"General","ST","SC","OBC-A","OBC-B"};
        comboBox2 = new JComboBox (Category);
        comboBox2.setBackground (new Color(245,255,250 ));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        //Income
        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);
        //For income drop-down manu
        String income [] = {"Null","50,000 - 1,00,000 ","1,50,000 - 3,00,000 ","3,50,000  - 6,00,000" ,"Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox (income);
        comboBox3.setBackground (new Color(245,255,250 ));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        //Education
        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);
        //For Education drop-down manu
        String education [] = {"8th Pass ","10th Pass" , "12 Pass","Graduate","Post-Graduate","Other"};
        comboBox4 = new JComboBox (education);
        comboBox4.setBackground (new Color(245,255,250 ));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        //Occupation
        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);
        //For occupation drop-down manu
        String occupation [] = {"Self - employ ","Business" , "Govt - Job","Pvt - Job","Other","Student","None"};
        comboBox5 = new JComboBox (occupation);
        comboBox5.setBackground (new Color(245,255,250 ));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        //PAN Number
        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,18));
        textpan.setBounds(350,390,320,30);
        add(textpan);

        //Aadhaar number
        JLabel l9 = new JLabel("Aadhaar number :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,180,30);
        add(l9);

        textaadhaar = new JTextField();
        textaadhaar.setFont(new Font("Raleway",Font.BOLD,18));
        textaadhaar.setBounds(350,440,320,30);
        add(textaadhaar);

        //Senior Citizen
        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(255,239,213));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(255,239,213));
        r2.setBounds(460,490,100,30);
        add(r2);

        //Grouping
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);


        //Existing Account
        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        e1 = new JRadioButton("YES");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(255,239,213));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("NO");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(255,239,213));
        e2.setBounds(460,540,100,30);
        add(e2);

        //Grouping
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        //From no
        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);


        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        //Next
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.black);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(255,239,213));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel =(String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String incom =(String) comboBox3.getSelectedItem();
        String edu =  (String) comboBox4.getSelectedItem();
        String occu = (String) comboBox5.getSelectedItem();

        String pan = textpan.getText();
        String aahar = textaadhaar.getText();

        String scitizen =" ";
        if((r1.isSelected())){
            scitizen ="Yes";
        } else if (r2.isSelected()){
            scitizen ="No";
        }

        String e_Acoount =" ";
        if((r1.isSelected())){
            e_Acoount ="Yes";
        } else if (r2.isSelected()){
            e_Acoount ="No";
        }

        try {
            if (textpan.getText().equals("") || textaadhaar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else  {
                Con c = new Con();
                String q = "insert into Singuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+incom+"', '"+edu+"','"+occu+"', '"+pan+"', '"+aahar+"', '"+scitizen+"', '"+e_Acoount+"')";
                c.statement.executeUpdate(q);
                new  Singup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
