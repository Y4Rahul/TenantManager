import javax.swing.*;
public class OwnerDashboard {
	public void dashboard()
	{
		JFrame f = new JFrame("Owners Page");
		JButton add_room = new JButton("ADD ROOM");
		JButton new_tenant = new JButton("ADD NEW TENANT");
		JButton modify = new JButton("MODIFY");
		JButton Details = new JButton("DETAILS");
		add_room.setBounds(50,20,200,50);
		new_tenant.setBounds(50,90,200,50);
		modify.setBounds(50,160,200,50);
		Details.setBounds(50,230,200,50);
		f.add(add_room);
		f.add(new_tenant);
		f.add(modify);
		f.add(Details);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
	}
}
