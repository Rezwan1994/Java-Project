/**
 The Seller program implements an application that
 simply display the seller interface of  our software .

 @author  Rezwan
 @version 1.0
*/

import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

class Seller extends JFrame implements ActionListener{   
	JButton bookticket =new JButton("Book Tickets");
	JButton checkpassengerrecords = new JButton(" Check Passenger Records "); 
    JButton prev =new JButton("prev");
	ImageIcon icon = new ImageIcon(getClass().getResource("seller.jpg"));
	JLabel lebel = new JLabel(icon);
	Login login;
    	
	public Seller(Login login){
		this.login=login;
		setSize(600,430);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		
		bookticket.setBounds(50, 170,175,50);
		add(bookticket);
		bookticket.addActionListener(this);
		checkpassengerrecords.setBounds(350,170,175,50);
		add(checkpassengerrecords);
		checkpassengerrecords.addActionListener(this);
		
		add(prev);
		prev.setBounds(50,330,60,40);
		prev.addActionListener(this);
		prev.setBackground(Color.GRAY);
		lebel.setBounds(0,-100,600,600);
		add(lebel);
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bookticket){
			
			BookTicket bo = new BookTicket(this);
			this.setVisible(false);
		}
			
		else if(e.getSource() == checkpassengerrecords){
			PassengerRecord l = new PassengerRecord(this);
			this.setVisible(false);
		}
		else if (e.getSource()==prev){
			this.setVisible(false);
			login.setVisible(true);
		}
				
	}
	
	
}