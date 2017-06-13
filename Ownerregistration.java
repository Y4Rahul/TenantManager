import javax.swing.*;

public class Ownerregistration {
	private JFrame register;
	private int width = 400;
	private int height = 400;
	public void create(){
		register = new JFrame();
		
		JLabel Name = new JLabel("Name");
		JTextField name = new JTextField();
		JLabel UserName = new JLabel("UserName");
		JTextField username = new JTextField();
		JLabel Password = new JLabel("Password");
		JPasswordField password = new JPasswordField();
		JLabel ConfirmPassword = new JLabel("Confirm Password");
		JPasswordField confirmpassword = new JPasswordField();
		JLabel Rooms = new JLabel("No. of Rooms");
		JTextField rooms = new JTextField();
		JLabel Address = new JLabel("Address");
		JTextArea address = new JTextArea();
		JLabel Rent = new JLabel("Rent");
		JTextField rent = new JTextField();
		JButton submit = new JButton("SUBMIT");
		
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
	}
}
