//for inserting TenantInformation
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TenantInfo {  
	          	public void TenantPage(String username,String room)  
	{  
	          	JFrame f= new JFrame("Tenant Information");
	          	JPanel panel=new JPanel();
	            panel.setBounds(0,0,400,50); 
	            panel.setBackground(Color.gray);
	            panel.setLayout(null);
	          	JButton[] Room = new JButton[Integer.parseInt(room)];
	          	for(int i=0;i<Integer.parseInt(room);i++)
	            {
	          	 Room[i] = new JButton("Room"+i);
	          	 Room[i].setBounds(20+100*i, 20, 70, 50);
	          	Room[i].addActionListener(new ActionListener() {
	          	    public void actionPerformed(ActionEvent e) {
	          	    	JButton pressedButton = (JButton)e.getSource();
	          	    	pressedButton.setBackground(Color.blue);
	          	    	System.out.println("room");
	          	    	
	          	    }          
	          	 });
	            }
	            for(int i=0;i<Integer.parseInt(room);i++)
	            {
	          	  panel.add(Room[i]);
	            }
	            JButton submit = new JButton("SUBMIT");
	            submit.setBounds(150,150,100,50);
	            JPanel P = TenantGui.creategui("rahul","3");
	            P.add(submit);
	            f.add(P);
	            f.add(panel);
	            f.setSize(400,400);//400 width and 500 height  
	    		f.setLayout(null);//using no layout managers  
	    		f.setVisible(true);//making the frame visible  
	}
}  
