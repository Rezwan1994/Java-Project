/**
 The login program implements an application that
 simply need to login our software .

 @author  Rezwan
 @version 1.0
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;
import java.util.*;
class Login extends JFrame implements ActionListener{
	
	JButton b  = new JButton("Prev");
	JButton b1 = new JButton("Login");
	JTextField f = new JTextField();
	JPasswordField f1 = new JPasswordField();
	JLabel l = new JLabel("User Name");
	JLabel l1 = new JLabel("Password");
	
	ImageIcon icon = new ImageIcon(getClass().getResource("login.jpg"));
	JLabel lebel = new JLabel(icon);
	
	WelComePanel welcomePanel;
	
	public Login(WelComePanel welcomePanel){
	    
		
		this.welcomePanel=welcomePanel;
		
		setSize(600,450);
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		
		
		l.setBounds(30,65,75,50);
		l.setForeground(Color.WHITE);
		add(l);
		l1.setBounds(30,140,75,50);
		l1.setForeground(Color.WHITE);
		add(l1);
		f.setBounds(125,75,257, 32);
		add(f);
		f1.setBounds(125,150,257, 32);
		add(f1);
		b1.setBounds(300,250,75, 30);
		add(b1);
		b1.setBackground(Color.CYAN);
		b1.addActionListener(this);
	    b.setBounds(100,250,90, 30);
		b.setBackground(Color.GRAY);
		b.addActionListener(this);
		add(b);
		lebel.setBounds(0,-100,600,600);
		add(lebel);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()== b1)
		{
			Employee emp = new Employee();
			ArrayList<Employee> list = new ArrayList<>();//declare a employee class type arraylist
			try
			{
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from employee"); 
				//This while block initialize employee data from database and store the employee object to an arrylist
				while(rs.next()){
					String id = rs.getString("EmpId");
					String userName = rs.getString("UserName");
					String mobile = rs.getString("Mobile");
					String emtype = rs.getString("EmpType");
					String password = rs.getString("Password");
	
					Employee em = new Employee(id, userName, password,emtype,mobile);
					list.add(em);
				}
				String a = f.getText();
				String b = f1.getText();
				//this for loop machine username,password,acctype of an employee
				for(int i=0; i<list.size(); i++){
					String user = list.get(i).getUserName();
					String pass = list.get(i).getPassword();
					String acc = list.get(i).getAccountType();

					if( a.equals(user) && b.equals(pass) && acc.equals("Manager")){
						Manager j = new Manager(this);
						setVisible(false);
						break;
					}
					
					else if(a.equals(user) && b.equals(pass)){
						
						Seller s = new Seller(this);
						setVisible(false);
						break;
					}
                    				
				}				
			}
			catch(SQLException g)
			{
				JOptionPane.showMessageDialog(this,"Wrong password");
			}
			catch(Exception eq){
				JOptionPane.showMessageDialog(this,"Wrong password");
			}
			
		}
		
		if(e.getSource()==b)
		{
			this.setVisible(false);
			welcomePanel.setVisible(true);
		}
		
			
		
	}
}