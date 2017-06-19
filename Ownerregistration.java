import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Ownerregistration {
	private JFrame register;
	private int width = 400;
	private int height = 400;
	private JTextField name;
	private JTextField username;
	private JPasswordField password;
	private JPasswordField confirmpassword;
	private JTextField rooms;
	private JTextArea address;
	private JTextField rent1;
	private JTextField rent2;
	private JTextField rent3;
	private JTextField rent4;
	private JTextField roomwidth;
	private JTextField roomheight;
	private JButton submit;
	int test = 5;
	public void create(){
		register = new JFrame();
		
		JLabel Name = new JLabel("Name");
		name = new JTextField();
		JLabel UserName = new JLabel("UserName");
		username = new JTextField();
		JLabel Password = new JLabel("Password");
		password = new JPasswordField();
		JLabel ConfirmPassword = new JLabel("Confirm Password");
		confirmpassword = new JPasswordField();
		JLabel Rooms = new JLabel("No. of Rooms");
		rooms = new JTextField();
		JLabel Address = new JLabel("Address");
		address = new JTextArea();
		JLabel Rent1 = new JLabel("RentofRoom1");
		rent1 = new JTextField();
		JLabel Rent2 = new JLabel("RentofRoom1");
		rent2 = new JTextField();
		JLabel Rent3 = new JLabel("RentofRoom1");
		rent3 = new JTextField();
		JLabel Rent4 = new JLabel("RentofRoom1");
		rent4 = new JTextField();
		JLabel room_width = new JLabel("RoomWidth");
		roomwidth = new JTextField();
		JLabel room_height = new JLabel("RoomHeight");
		roomheight = new JTextField();
		submit = new JButton("SUBMIT");
		
		UserName.setBounds(50,30,70,10);
		username.setBounds(140, 30, 150, 15);
		Name.setBounds(50,50,70,10);
		name.setBounds(140, 50, 150, 15);
		Password.setBounds(50,70,70,10);
		password.setBounds(140,70,150,15);
		ConfirmPassword.setBounds(50,90,70,10);
		confirmpassword.setBounds(140,90,150,15);
		Rooms.setBounds(50,110,70,10);
		rooms.setBounds(140,110,150,15);
		Address.setBounds(50,130,70,10);
		address.setBounds(140,130,150,15);
		Rent1.setBounds(50,150,70,10);
		rent1.setBounds(140,150,150,15);
		Rent2.setBounds(50,170,70,10);
		rent2.setBounds(140,170,150,15);
		Rent3.setBounds(50,190,70,10);
		rent3.setBounds(140,190,150,15);
		Rent4.setBounds(50,210,70,10);
		rent4.setBounds(140,210,150,15);
		room_width.setBounds(50, 230, 70, 10);
		roomwidth.setBounds(140, 230, 150, 15);
		room_height.setBounds(50, 250, 70, 10);
		roomheight.setBounds(140, 250, 150, 15);
		submit.setBounds(200,270, 100, 30);
		
		register.add(Name);
		register.add(name);
		register.add(UserName);
		register.add(username);
		register.add(Password);
		register.add(password);
		register.add(ConfirmPassword);
		register.add(confirmpassword);
		register.add(Rooms);
		register.add(rooms);
		register.add(Address);
		register.add(address);
		register.add(Rent1);
		register.add(rent1);
		register.add(Rent2);
		register.add(rent2);
		register.add(Rent3);
		register.add(rent3);
		register.add(Rent4);
		register.add(rent4);
		register.add(room_width);
		register.add(roomwidth);
		register.add(room_height);
		register.add(roomheight);
		register.add(submit);
		register.setSize(width,height);//400 width and 500 height  
		register.setLayout(null);//using no layout managers  
		register.setVisible(true);//making the frame visible  
	
		submit.addMouseListener(new MouseAdapter()  
		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	RegisterOwners detail = new RegisterOwners();
		    	if(detail.status(username.getText()))
		    	{
		    		System.out.println("Welcome");
		    	}
		    	else
		    	{
		    		System.out.println("ERROR");
		    	}
		    }  
		});
	
	
	}
	
	public String getUname() {  
		return username.getText();  
	} 
	
 
	    
}
