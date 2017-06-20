//for inserting TenantInformation
import javax.swing.*;
public class TenantInfo {  
	          public static void creategui(String username,String room){  
	          JFrame f= new JFrame("Tenant Information");  
	          JMenuBar mb=new JMenuBar();  
	          JButton[] Room = new JButton[Integer.parseInt(room)];
	          for(int i=0;i<Integer.parseInt(room);i++)
	          {
	        	 Room[i] = new JButton("Room"+i);
	        	 Room[i].setBounds(20+100*i, 20, 100, 50);
	          }
	          for(int i=0;i<Integer.parseInt(room);i++)
	          {
	        	  f.add(Room[i]);
	          }
	       
	          JLabel TenantName = new JLabel("TenantName");
	          JTextField tenantname = new JTextField();
	          JLabel RoomRent = new JLabel("RoomRent");
	          JTextField roomrent = new JTextField();
	          JFileChooser file = new JFileChooser();
	          
	          TenantName.setBounds(50, 70, 100, 20);
	          tenantname.setBounds(120, 70, 100, 20);
	          RoomRent.setBounds(50, 90, 100, 20);
	          roomrent.setBounds(120, 90, 100, 20);
	          file.setBounds(50,130,100,50);
	          
	          f.add(TenantName);
	          f.add(tenantname);
	          f.add(RoomRent);
	          f.add(roomrent);
	          f.add(file);
	         f.setSize(400,400);//400 width and 500 height  
	  		f.setLayout(null);//using no layout managers  
	  		f.setVisible(true);//making the frame visible  
	}  
	public static void main(String args[])  
	{  
		creategui("rahul","2");
	}
}  
