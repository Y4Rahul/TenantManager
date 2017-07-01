import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;  
public class Firstactivity {  
	private static int height = 400;
	private static int width = 400;
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  

JLabel l = new JLabel("WELCOME Users");
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

JLabel new_registration = new JLabel("New Registration");
new_registration.setBounds(120,270,100,30);

f.add(username);
f.add(user_name);
f.add(password_display);
f.add(password);
f.add(l);
f.add(b);//adding button in JFrame 
f.add(new_registration);
b.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       Secondactivity page = new Secondactivity();
       boolean result = page.checklogin(user_name.getText(), String.valueOf((password.getPassword())));
       if(result==true)
       {
    	   OwnerDashboard dashboard = new OwnerDashboard();
    	   dashboard.dashboard();
       }
       System.out.println(result);
    }          
 });

new_registration.addMouseListener(new MouseAdapter()  
{  
    public void mouseClicked(MouseEvent e)  
    {  
       // you can open a new frame here as
       // i have assumed you have declared "frame" as instance variable
       System.out.println("clicked");
       f.setVisible(false);
       Ownerregistration page = new Ownerregistration();
       page.create();
    }  
}); 



f.setSize(width,height);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}
}  
