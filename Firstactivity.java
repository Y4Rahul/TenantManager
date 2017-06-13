import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
public class Firstactivity {  
	private static int height = 400;
	private static int width = 400;
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  

JLabel l = new JLabel("WELCOME");
l.setBounds(width/2-30, 20, 60, 30);

JLabel username = new JLabel("UserName :");
username.setBounds(50,150,70,10);

JTextField user_name = new JTextField();
user_name.setBounds(140, 150, 150, 15);

JLabel password_display = new JLabel("Password :");
password_display.setBounds(50,180,70,10);

JPasswordField password = new JPasswordField();
password.setBounds(140,180,150,15);

JButton b=new JButton("Login");//creating instance of JButton  
b.setBounds(100,250,80,30);//x axis, y axis, width, height  

f.add(username);
f.add(user_name);
f.add(password_display);
f.add(password);
f.add(l);
f.add(b);//adding button in JFrame  
b.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       Secondactivity page = new Secondactivity();
       boolean result = page.checklogin(user_name.getText(), String.valueOf((password.getPassword())));
       System.out.println(result);
    }          
 });          
f.setSize(width,height);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}
}  
