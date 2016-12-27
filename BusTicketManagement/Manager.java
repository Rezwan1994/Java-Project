/**
 The ManagerRecord program implements an application that
 simply display the manager veiw of our software. 

 @author  Rezwan
 @version 1.0
*/

import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

class Manager extends JFrame implements ActionListener
{   
	JButton prev =new JButton("prev");
	
	JButton selling =new JButton("Check selling Records");
	JButton update =new JButton("Update Buses");
	JButton passengerRecord = new JButton(" Check Passenger Records "); 
	ImageIcon icon = new ImageIcon(getClass().getResource("manager.jpg"));
	JLabel lebel = new JLabel(icon);
     Login login;	
	public Manager(Login login)
	{
		this.login=login;
		
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		
		update.setBounds(200,70,175,50);
		add(update);
		update.addActionListener(this);
		selling.setBounds(200,195,175,50);
		add(selling);
		selling.addActionListener(this);
		passengerRecord.setBounds(200,350,175,50);
		add(passengerRecord);
		passengerRecord.addActionListener(this);
		
		add(prev);
		prev.setBounds(50,500,60,40);
		prev.setBackground(Color.GRAY);
		prev.addActionListener(this);
		lebel.setBounds(0,0,600,600);
		add(lebel);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==selling)
		{
			new SellingRecord(this);
			this.setVisible(false);
		}
		else if(e.getSource()== update)
		{
			new Update(this);
			this.setVisible(false);
		}
		else if (e.getSource()==passengerRecord )
		{
			CheakRecord ckr =new CheakRecord(this);
			this.setVisible(false);
		}
		
		else if (e.getSource()==prev)
		{
			this.setVisible(false);
			login.setVisible(true);
		}			
	}
	
}