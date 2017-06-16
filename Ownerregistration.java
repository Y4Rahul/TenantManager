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
	private JTextField rent;
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
		JLabel Rent = new JLabel("Rent");
		rent = new JTextField();
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
		Rent.setBounds(50,150,70,10);
		rent.setBounds(140,150,150,15);
		submit.setBounds(200,250, 100, 30);
		
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
		register.add(Rent);
		register.add(rent);
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
