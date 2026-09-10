package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textName , textFname, textEmail, textMS, textAdd, textCity,textPin,textState  ;
    JDateChooser dateChoser;
    JRadioButton r1, r2 ,   m1,m2,m3;
 JButton next; //  for using Button as Next

    Random ran = new Random();
    long first4 =  (ran.nextLong()%9000L)+1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        // ----------- FOR 1st Image ..... --------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));  //  Used for  set the image and  url of image
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); // scaling the image(resize the image)
        ImageIcon i3 = new ImageIcon(i2);   // used for visible the image in frame (but directly cannot able to display image, so we using Jlabel after this.)
        JLabel image = new JLabel(i3);  // this helps in making the image upto frame.
        image.setBounds(25,10,100, 100);  // where to visible in frame (height width)
        add(image);  // Jlabel we used

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);;
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name: ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        // ------------ Father Name --------------
        JLabel labelfName = new JLabel("Father Name: ");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,240,400,30);
        add(textName);

        // -------------  DOB -----------------------

        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChoser =  new JDateChooser();
        dateChoser.setForeground(new Color(105,105,105));
        dateChoser.setBounds(300,340,400,30);
        add(dateChoser);

        JLabel labelG = new JLabel("Gender: "); // visible in frame as  Gender :
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        // ---------------- Radio Button ---------------------
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(300,290,60,30);
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,290,90,30);
        r2.setBackground(new Color(222,255,228));
        add(r2);

    
        // Radio button for single choose
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email: ");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);


        JLabel labelMs = new JLabel("Marital Status: ");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(450,440,100,30);
        m2.setBackground(new Color(222,255,228));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(635,440,100,30);
        m3.setBackground(new Color(222,255,228));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labelAdd = new JLabel("Address: ");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);


        JLabel labelCity = new JLabel("City: ");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,200,30);
        add(textCity);



        JLabel labelPin = new JLabel("Pin Code: ");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,200,30);
        add(textPin);



        JLabel labelState = new JLabel("State: ");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,640,200,30);
        add(textState);



        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));  // in login we use  here for Frame image but now  its  used for Frame coloring.
        setLayout(null);
      setSize(850,800);
      setLocation(360,40);
      setVisible(true);
    }

    @Override
    public  void actionPerformed(ActionEvent e){

    }


    public static void main(String[] args) {
        new Signup();
    }
}
