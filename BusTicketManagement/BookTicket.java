/**
 The BookTicket program implements an application that
 simply display the interface of booking journey teket of our software .

 @author  Rezwan
 @version 1.0
*/
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
class BookTicket extends JFrame implements ActionListener{
	JButton prev =new JButton("prev");
	Seller seller;
	JButton bookJourneyTicket = new JButton("Book Journey Ticket");
	ImageIcon icon = new ImageIcon(getClass().getResource("journey.jpg"));
	JLabel lebel = new JLabel(icon);
	public BookTicket(Seller seller){
		this.seller=seller;
		setSize(600,400);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		bookJourneyTicket.setBounds(200,150,200,50);
		add(bookJourneyTicket);
		bookJourneyTicket.addActionListener(this);
		bookJourneyTicket.setBackground(Color.YELLOW);
		
		add(prev);
		prev.setBounds(50,300,60,40);
		prev.setBackground(Color.GRAY);
		prev.addActionListener(this);
		lebel.setBounds(0,-100,600,600);
		add(lebel);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bookJourneyTicket)
		{
			Form fo = new Form(this);
			setVisible(false);
		}
		
		else if (e.getSource()==prev)
		{
			this.setVisible(false);
			seller.setVisible(true);
		}
	}
}