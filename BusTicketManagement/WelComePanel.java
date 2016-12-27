/**
 The WelComePanel program implements an application that
 simply displays our software welcome veiw .

 @author  Rezwan
 @version 1.0
*/

import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Font;
import java.awt.BorderLayout;

class WelComePanel extends JFrame implements ActionListener
{   
    JLabel labelwelcome=new JLabel("Welcome To R-Cube Travels ");
	JButton go =new JButton("GO..");
	JButton checkpassengerrecords = new JButton(" Check Passenger Records ");
	JButton checksellingrecords = new JButton( "Check Selling Records");
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon(getClass().getResource("welcome.jpg"));
	JLabel lebel = new JLabel(icon);		
		
	

    
	public WelComePanel()
	{

		
		setSize(600,600);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
	

		labelwelcome.setBounds(125,100,325,50);
		add(labelwelcome);
		labelwelcome.setPreferredSize(new Dimension(150, 100));
		labelwelcome.setFont(new Font("Courier New", Font.BOLD, 20));
		labelwelcome.setForeground(Color.WHITE);
		
		
		go.setBounds(200,350,175,50);
		add(go);
		go.setBackground(Color.YELLOW);
		lebel.setBounds(0,0,600,600);
		add(lebel);
		go.addActionListener(this);

		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==go)
		{
			
			Login l = new Login(this);
			this.setVisible(false);
		}
			
		
		
	}
	
	
}