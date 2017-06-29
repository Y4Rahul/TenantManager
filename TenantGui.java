import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TenantGui {
	public static JPanel creategui(String username,String room){  
        JPanel f= new JPanel();
        f.setBounds(0,50,400,400);
        f.setLayout(null);
        /*JButton[] Room = new JButton[Integer.parseInt(room)];
        for(int i=0;i<Integer.parseInt(room);i++)
        {
      	 Room[i] = new JButton("Room"+i);
      	 Room[i].setBounds(20+100*i, 20, 100, 50);
        }
        for(int i=0;i<Integer.parseInt(room);i++)
        {
      	  f.add(Room[i]);
        }
     */
        JLabel TenantName = new JLabel("TenantName");
        JTextField tenantname = new JTextField();
        JLabel RoomRent = new JLabel("RoomRent");
        JTextField roomrent = new JTextField();
        JLabel Roomid = new JLabel("RoomId");
        JTextField roomid = new JTextField();
        JLabel Contactno = new JLabel("ContactNo");
        JTextField contactno = new JTextField();
        //JFileChooser file = new JFileChooser();
        
        TenantName.setBounds(50, 70, 100, 20);
        tenantname.setBounds(120, 70, 100, 20);
       RoomRent.setBounds(50, 90, 100, 20);
        roomrent.setBounds(120, 90, 100, 20);
        Roomid.setBounds(50,110,100,20);
        roomid.setBounds(120,110,100,20);
        Contactno.setBounds(50,130,100,20);
        contactno.setBounds(120,130,100,20);
        //file.setBounds(50,130,100,50);
        
        f.add(TenantName);
        f.add(tenantname);
        f.add(RoomRent);
        f.add(roomrent);
        f.add(Roomid);
        f.add(roomid);
       
        //f.add(file);
       /*f.setSize(400,400);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible*/
        return f;
}  

}
