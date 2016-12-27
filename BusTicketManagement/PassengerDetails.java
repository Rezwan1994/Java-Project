/**
 The PassengerDetails program implements an application that
 simply take the information of a passenger. 

 @author  Rezwan
 @version 1.0
*/
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;
class PassengerDetails extends JFrame implements ActionListener{
	JLabel pDetails = new JLabel("Passenger Details");
	JLabel name = new JLabel("Name");
	JLabel contactInfo = new JLabel("Contact Information");
	JLabel mobile = new JLabel("Mobile");
	JLabel email = new JLabel("Email");
	JLabel journeyDetails = new JLabel("Journey Details");
	JTextField nameField = new JTextField();
	JTextField mobileField = new JTextField();
	JTextField emailField = new JTextField();
	JButton next = new JButton("Continue");
	
	JButton prev =new JButton("prev");
	ImageIcon icon = new ImageIcon(getClass().getResource("info.jpg"));
	JLabel lebel = new JLabel(icon);
	
	ChooseSeat ch;
	
	public PassengerDetails(ChooseSeat ch)
	{
		this.ch = ch;
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		pDetails.setBounds(30,20,150,30);
		add(pDetails);
		name.setBounds(30,60,100,30);
		add(name);
		nameField.setBounds(30,100,200,30);
		add(nameField);
		contactInfo.setBounds(30,140,200,30);
		add(contactInfo);
		mobile.setBounds(30,180,100,30);
		add(mobile);
		mobileField.setBounds(30,220,200,30);
		add(mobileField);
		email.setBounds(30,260,100,30);
		add(email);
		emailField.setBounds(30,300,200,30);
		add(emailField);
		journeyDetails.setBounds(300,20,150,30);
		add(journeyDetails);
		next.setBounds(300,400,100,30);
		next.setBackground(Color.BLUE);
		add(next);
		next.addActionListener(this);
		
		add(prev);
		prev.setBounds(50,400,60,40);
		prev.setBackground(Color.GRAY);
		prev.addActionListener(this);
		lebel.setBounds(0,-100,600,600);
		add(lebel);
		
	}
	public void actionPerformed(ActionEvent e)
	{   
	   if (e.getSource()==prev)
	   {
		   this.setVisible(false);
		   ch.setVisible(true);
	   }
	   
		else if(e.getSource()== next)
		{
			String s1;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
				Statement stmt=con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT MAX(Pid) FROM passenger;");
				//this block store all the information of passenger to the database.
				while(rs.next())
				{
					s1=rs.getString(1);
				
				int x = Integer.parseInt(s1);
				++x;
				String z = Integer.toString(x);
				String s = ch.bl.f.journeyField.getText();
				String s2= ch.bl.f.fromField.getText();
				String s3 = ch.bl.f.toField.getText();
				String s4 =ch.bl.getSelectedItem();
				String s5 = nameField.getText();
				String s6 = emailField.getText();
				String s7 = mobileField.getText();
				String s10 = ch.seatValue.getText();
				String s11 = ch.amountValue.getText();
				int am = Integer.parseInt(s11);
				String s8="INSERT INTO passenger (Pid, Bid, Name, Mobile, Email, FromWhere, ToWhere, JourneyDate,seatno,price) VALUES ('"+z+"', '"+s4+"','"+s5+"','"+s7+"','"+s6+"','"+s2+"','"+s3+"','"+s+"','"+s10+"','"+am+"')";
				stmt.executeUpdate(s8); 
				}
				
				
			}
			catch(SQLException g)
			{
				
			}
			catch(Exception eq){
				
			}
		
			
			
			Ticket p = new Ticket(this);
			setVisible(false);
		}
			
		
	}
	
}