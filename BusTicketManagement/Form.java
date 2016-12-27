/**
 The form program implements an application that
 simply need to select from and destination and other info of passenger .

 @author  Rezwan
 @version 1.0
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.awt.Color;

class Form extends JFrame implements ActionListener{
	JLabel labelFrom = new JLabel("From");
	JTextField fromField = new JTextField();
	JLabel labelTo = new JLabel("TO");
	JTextField toField = new JTextField();
	JLabel journeyLabel = new JLabel("Date of journey");
	JTextField journeyField = new JTextField();
	JTextField returnField = new JTextField();
	JButton searchButton = new JButton("SearchBus");	

	JButton dateButton1 = new JButton();
    JButton prev =new JButton("prev");
	ImageIcon icon = new ImageIcon(getClass().getResource("form.jpg"));
	ImageIcon bIcon = new ImageIcon(getClass().getResource("cbutton.jpg"));
	JButton dateButton = new JButton(bIcon);
	JLabel lebel = new JLabel(icon);

      BookTicket bookTicket;	
	public Form(BookTicket bookTicket){
		
		this.bookTicket=bookTicket;
		
		setSize(500,450);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);		
		labelFrom.setBounds(60,40,40,30);
		add(labelFrom);
		fromField.setBounds(60,75,300,30);
		add(fromField);
		labelTo.setBounds(60,115,40,30);
		add(labelTo);
		toField.setBounds(60,150,300,30);
		add(toField);
		journeyLabel.setBounds(250,210,100,30);
		add(journeyLabel);
		journeyField.setBounds(220,250,145,30);
		add(journeyField);
		searchButton.setBounds(135,340,145,30);
		add(searchButton);
		searchButton.addActionListener(this);
		searchButton.setBackground(Color.YELLOW);
		dateButton.setBounds(220,280,30,30);
		add(dateButton);
		dateButton.addActionListener(this);
		
		add(prev);
		prev.setBounds(30,350,60,30);
		prev.addActionListener(this);
		prev.setBackground(Color.GRAY);
		lebel.setBounds(-20,-100,600,600);
		add(lebel);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==dateButton)
		{
			journeyField.setText(new DatePicker(this).setPickedDate()); 			
		}
		
		else if(e.getSource()==searchButton)
		{
			try
			{
				String s4= journeyField.getText();
				String m;
				String sa=" ";
				int x,seat,j=0;
				String bq = "SELECT Bid FROM bus;";
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
				Statement stmt=con.createStatement();
				ResultSet rp1 = stmt.executeQuery(bq);
				ArrayList<String> list = new ArrayList<>();//diclear an arrylist for store bus id
				while(rp1.next())
				{
					list.add(rp1.getString(1));
				}
				
			    for(int i=0;i<list.size();i++)
				{
					String co = "SELECT COUNT(Bid) FROM chooseseat WHERE Bid = '"+list.get(i)+"' and DATE = '"+s4+"' ";
					ResultSet rs1 = stmt.executeQuery(co);
					//this while blook subtruct the booked seat of bus;
					while(rs1.next())
					{
						m= rs1.getString(1);
						x = Integer.parseInt(m);
						seat = 38-x;
						sa = seat+"";	
					}
					String up = "UPDATE bus SET SeatAvailable='"+sa+"'WHERE Bid='"+list.get(i)+"';";//update the available seat
					
					stmt.executeUpdate(up);
					
				}
				BusList bus = new BusList(this);
				setVisible(false);
				
			}
			catch(SQLException ee)
			{
				//System.out.println(ee);
			}
			catch(Exception eq){
				System.out.println(eq);
			}
		
		
		}
		else if (e.getSource()==prev)
		{
			this.setVisible(false);
			bookTicket.setVisible(true);
		}
		
	}
}