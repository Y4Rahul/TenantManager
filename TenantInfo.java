//for inserting TenantInformation
import java.awt.Color;

import javax.swing.*;
public class TenantInfo {  
	          	public static void main(String args[])  
	{  
	          	String room="3";
	          	JFrame f= new JFrame("Tenant Information");
	          	JPanel panel=new JPanel();  
	            panel.setBounds(0,0,400,50); 
	            panel.setBackground(Color.gray);
	          	JButton[] Room = new JButton[Integer.parseInt(room)];
	          	for(int i=0;i<Integer.parseInt(room);i++)
	            {
	          	 Room[i] = new JButton("Room"+i);
	          	 Room[i].setBounds(20+100*i, 20, 100, 50);
	            }
	            for(int i=0;i<Integer.parseInt(room);i++)
	            {
	          	  panel.add(Room[i]);
	            }
	            JPanel P = TenantGui.creategui("rahul","3");
	            f.add(P);
	            f.add(panel);
	            f.setSize(400,400);//400 width and 500 height  
	    		f.setLayout(null);//using no layout managers  
	    		f.setVisible(true);//making the frame visible  
	}
}  
