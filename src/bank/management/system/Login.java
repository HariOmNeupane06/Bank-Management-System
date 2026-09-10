package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Jframe is used as UI to display the info with the help of swing.
// implements ActionListener is  used to  function or clickevent .
public class Login extends JFrame  implements ActionListener {

    JLabel label1, label2, label3;   //globally decalred (aslo write in downside so when we use to text we can easily can)

    JTextField textField2;
    JPasswordField passwordField3;

    JButton button1, button2, button3;


    Login() {
        super("Bank Management System");    //Set the window title of the frame

         // ----------- FOR 1st Image ..... --------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));  //  Used for  set the image and  url of image
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); // scaling the image(resize the image)
        ImageIcon i3 = new ImageIcon(i2);   // used for visible the image in frame (but directly cannot able to display image, so we using Jlabel after this.)
        JLabel image = new JLabel(i3);  // this helps in making the image upto frame.
        image.setBounds(350,10,100, 100);  // where to visible in frame (height width)
        add(image);  // Jlabel we used

        // ----------- For 2nd Image ... ----------------
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));  //  Used for  set the image and  url of image
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT); // scaling the image(resize the image)
        ImageIcon ii3 = new ImageIcon(ii2);   // used for visible the image in frame (but directly not able to display image, so we using Jlabel after this.)
        JLabel iimage = new JLabel(ii3);  // this helps in making the image upto frame.
        iimage.setBounds(630,350,100, 100);  // where to visible in frame (height width)
        add(iimage);  // Jlabel we used

        label1 = new JLabel("WELCOME TO ATM"); //  text show on the frame
        label1.setForeground(Color.WHITE); // colouring the text
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 365,30);
        add(label2);

        textField2 =  new JTextField(15);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);



        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375,30);
        add(label3);


        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);



        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);     // we add this , to function/reponse with buttons

        add(button1);


        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);     // we add this , to function/reponse with buttons

        add(button2);


        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        add(button3);

        // ----------- For 3rd Image ... ---------------- (Background Image)
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));  //  Used for  set the image and  url of image
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT); // scaling the image(resize the image)
        ImageIcon iii3 = new ImageIcon(iii2);   // used for visible the image in frame (but directly not able to display image, so we using Jlabel after this.)
        JLabel iiimage = new JLabel(iii3);  // this helps in making the image upto frame.
        iiimage.setBounds(0,0,850, 480);  // where to visible in frame (height width)
        add(iiimage);  // Jlabel we used



        setLayout(null); // border layout null
        setSize(850, 480);
        setLocation(450,200);
        setVisible(true);  // write in last ,otherwise it get error.
    }

// write action performed & enter will auto generate this function
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == button1){  // it tells like , Hey! e  tell me which button you have [i.e -->  e.getSource() ==button1 ] , & then i will do whatever you want to make.
                textField2.setText("Loading .-.-.");
            }else if (e.getSource() == button2){
                textField2.setText("");   // when we touch the button  the text will  empty
                passwordField3.setText("");  // when we touch the button the  password will erase /empty
            }else if(e.getSource() == button3){

            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Login();


        }
    }

