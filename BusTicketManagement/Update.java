/**
 The Update program implements an application that
 simply update the information of buses. 

 @author  Rezwan
 @version 1.0
*/

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.awt.Color;
class Update extends JFrame implements ActionListener{
	JComboBox cb = new JComboBox();
	JComboBox cb1 = new JComboBox();
	JLabel updateBus = new JLabel("Update Buses");
	JLabel releaseBuses = new JLabel("Release Buses");
	JLabel selectBid = new JLabel("Select Bid");
	JLabel selectBid1 = new JLabel("Select Bid");
	JLabel selectDate = new JLabel("Select Date");
	JLabel selectDate1 = new JLabel("Select Date");
	JTextField dateField = new JTextField();
	JTextField dateField1 = new JTextField();
	JButton dB = new JButton();
	JButton dB1 = new JButton();
	JButton uB = new JButton("Update");
	JButton rB = new JButton("Release");
	JButton uA = new JButton("Update All");
	
	JButton prev =new JButton("prev");
	Manager maneger;
	
	public Update(Manager maneger){
		this.maneger=maneger;
		
		setSize(600,700);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		try
			{	
			String sq = "select Bid from bus;";
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
			Statement stmt=con.createStatement();
			ResultSet rp = stmt.executeQuery(sq);
			//this while block retriving data from database and store it to combobox.
			while(rp.next())
			{
				cb.setSelectedIndex(-1);
				String name = rp.getString(1);
				cb.addItem(name);
				cb1.setSelectedIndex(-1);
				String name1 = rp.getString(1);
				cb1.addItem(name1);
			}
			}
			catch(SQLException s)
			{
				
			}
			catch(Exception ee)
			{
				
			}
		
		updateBus.setBounds(30,40,100,30);
		add(updateBus);
		selectBid.setBounds(30,100,100,30);
		add(selectBid);
		cb.setBounds(150,100,200,30);
		add(cb);
		selectDate.setBounds(30,200,100,30);
		add(selectDate);
		dateField.setBounds(150,200,150,30);
		add(dateField);
		dB.setBounds(300,200,50,30);
		add(dB);
		dB.addActionListener(this);
		uB.setBounds(250,300,100,30);
		add(uB);
		uB.addActionListener(this);
		releaseBuses.setBounds(30,350,100,30);
		add(releaseBuses);
		selectBid1.setBounds(30,410,100,30);
		add(selectBid1);
		cb1.setBounds(150,410,200,30);
		add(cb1);
		selectDate1.setBounds(30,500,100,30);
		add(selectDate1);
		dateField1.setBounds(150,500,150,30);
		add(dateField1);
		dB1.setBounds(300,500,50,30);
		add(dB1);
		dB1.addActionListener(this);
		rB.setBounds(250,550,100,30);
		add(rB);
		rB.addActionListener(this);
		uA.setBounds(450,600,100,30);
		add(uA);
		uA.addActionListener(this);
		
		add(prev);
		prev.setBounds(50,600,60,40);
		prev.setBackground(Color.GRAY);
		prev.addActionListener(this);
		
	}
	public String getSelectedItem() {
       return (String)cb.getSelectedItem();
    }
	public String getSelectedItem1() {
       return (String)cb1.getSelectedItem();
    }
	public void actionPerformed(ActionEvent e)
	{   
	   if(e.getSource()==prev)
	   {
		 this.setVisible(false);
          maneger.setVisible(true);		 
	   }
		 else if(e.getSource()== dB )
		{
			dateField.setText(new DatePicker(this).setPickedDate()); 
		}
		else if(e.getSource()== dB1 )
		{
			dateField1.setText(new DatePicker(this).setPickedDate()); 
		}
		//this else if portion make the buses not available.
		else if(e.getSource()== uB)
		{
			try
			{
			String up = " ";
			String s = getSelectedItem();
			String s1 = dateField.getText();
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
			Statement stmt=con.createStatement();
			String s2 = "select * from chooseseat;";
			ResultSet rs = stmt.executeQuery(s2);
			up= "UPDATE bus SET position='Not Available(today)'WHERE Bid='"+s+"' ;";
			
			stmt.executeUpdate(up);
			JOptionPane.showMessageDialog(this,"Update Confirm.");

			
			}
		
			catch(SQLException s)
			{
				System.out.println(s);
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}
		//this else if portion  release the Buses and make it available.
		else if(e.getSource()== rB)
		{
			try
			{
			
			String up = " ";
			String s = getSelectedItem1();
			String s1 = dateField1.getText();
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
			Statement stmt=con.createStatement();
			String s2 = "select * from chooseseat;";
			ResultSet rs = stmt.executeQuery(s2);
			up= "UPDATE bus SET position='Available(today)'WHERE Bid='"+s+"' ;";
			String ud ="DELETE FROM chooseseat WHERE Bid='"+s+"' AND DATE='"+s1+"' ";
			stmt.executeUpdate(up);
			stmt.executeUpdate(ud);
			JOptionPane.showMessageDialog(this,"Release Confirm.");
			
			}
		
			catch(SQLException s)
			{
				System.out.println(s);
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}
		//this portion make all the buses available and release all the seats.
		else if(e.getSource()== uA)
		{
			try
			{
			String ud=" ";
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
			Statement stmt=con.createStatement();
			String s2 = "select Bid from bus;";
			ResultSet rs = stmt.executeQuery(s2);
			String up= "UPDATE bus SET position='Available' ;";
			stmt.executeUpdate(up);
			ud ="delete from chooseseat;";
			stmt.executeUpdate(ud);	
			JOptionPane.showMessageDialog(this,"Updated All.");
			}
		
			catch(SQLException s)
			{
				System.out.println(s);
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}
	}
}
	
