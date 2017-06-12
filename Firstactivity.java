import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
public class Firstactivity {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("click");//creating instance of JButton  
b.setBounds(130,100,100, 40);//x axis, y axis, width, height  

JLabel l = new JLabel("WELCOME");
l.setBounds(80, 100, 60, 40);
f.add(l);
f.add(b);//adding button in JFrame  
b.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    	f.setVisible(false);
       Secondactivity page = new Secondactivity();
       page.setVisible(true);
       JLabel label = new JLabel("Welcome");
       page.add(label);
    }          
 });          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}
}  
