/**
 The Ticket program implements an application that
 simply printin the ticket of a passenger. 

 @author  Rezwan
 @version 1.0
*/
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
class Ticket extends JFrame implements ActionListener{

	JLabel ticket = new JLabel("Ticket");
	
	JButton home =new JButton("Home");
		
	JButton printButton = new JButton("Print Out");
	JLabel name = new JLabel("Name");
	JLabel mobile = new JLabel("Mobile");
	JLabel from = new JLabel("From");
	JLabel to = new JLabel ("to");
	JLabel seat = new JLabel("seat no");
	JLabel price = new JLabel("price");
	JLabel date = new JLabel("Date");
	JLabel com = new JLabel("R-CUBE TRAVELS");
	ImageIcon icon = new ImageIcon(getClass().getResource("Ticket.jpg"));
	JLabel lebel = new JLabel(icon);
	PassengerDetails pa;

	public Ticket(PassengerDetails pa){
	this.pa = pa;

	setSize(800,450);
	setVisible(true);
	setLayout(null);
	setLocationRelativeTo(null);
	ticket.setPreferredSize(new Dimension(150, 100));
	ticket.setFont(new Font("Courier New", Font.BOLD, 20));
	
	ticket.setBounds(330,20,100,30);
	add(ticket);
	
	add(home);
	home.setBounds(50,320,100,40);
	home.addActionListener(this);
	
	
	name.setBounds(550,70,100,30);
	add(name);
	name.setText(pa.nameField.getText());
	
	from.setBounds(550,100,100,30);
	add(from);
	from.setText(pa.ch.bl.f.fromField.getText());
	to.setBounds(550,130,100,30);
	add(to);
	to.setText(pa.ch.bl.f.toField.getText());
	seat.setBounds(550,160,100,30);
	add(seat);
	seat.setText(pa.ch.seatValue.getText());
	price.setBounds(550,190,100,30);
	add(price);
	price.setText(pa.ch.totalField.getText());
	mobile.setBounds(550,210,100,30);
	add(mobile);
	mobile.setText(pa.mobileField.getText());
	date.setBounds(550,240,100,30);
	add(date);
	date.setText(pa.ch.bl.f.journeyField.getText());
	
	com.setBounds(20,50,300,30);
	add(com);
	com.setFont(new Font("Courier New", Font.BOLD, 20));
	com.setForeground(Color.BLUE);

	
	ticket.setForeground(Color.BLUE);
	printButton.setBounds(650,370,50,30);
	add(printButton);
	lebel.setBounds(0,-80,600,600);
	add(lebel);
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==home)
		{
			WelComePanel wcp =new WelComePanel();
			setVisible(false);
		}
	}
	
	
}