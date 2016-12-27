/**
 The Buslist program implements an application that
 simply show the list of buses in a jtable.

 @author  Rezwan
 @version 1.0
*/


import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.sql.*;
public class BusList extends JFrame implements ActionListener{  

	JButton next = new JButton("Continue");
	JButton prev = new JButton("prev");
	JComboBox cb = new JComboBox(); 
	JLabel selectLabel = new JLabel("Select Bus");	
	String s1,s2,s3,s4,s5,s6,s7;


	Form f;

	public BusList(Form f){
		this.f = f;
		try
		{	
			String to = f.toField.getText();
			String from = f.fromField.getText();
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
			Statement stmt=con.createStatement();
			String s9 = "select * from bus where ToWhere = '"+to+"'";
			String s10 = "select count(Bid) from bus";
			
			
			
			
			
			
			ResultSet rp = stmt.executeQuery(s10);
			
			String value = "";
			int vvalue = 0;
			if(rp.next()){
				value = rp.getString(1);
				vvalue = Integer.parseInt(value);
			}
			ResultSet rs=stmt.executeQuery(s9);
			String [][] data = new String [vvalue][7];	
			int count =0, count1=0;
			//this while block retrive data from data base and store it to a two dimentional array for table row.
			while(rs.next()){
			s1 = rs.getString(1);
			data[count][count1] = s1;
			count1++;				
			s2 = rs.getString(2);
			data[count][count1] = s2;
			count1++;
			s3 = rs.getString(5);
			data[count][count1] = s3;
			count1++;
			s4 = rs.getString(6);
			data[count][count1] = s4;
			count1++;
			s5 = rs.getString(7);
			data[count][count1] = s5;
			count1++;
			s6 = rs.getString(9);
			data[count][count1] = s6;
			count1++;
			s7 = rs.getString(10);
			data[count][count1] = s7;
			count1=0;
			count++;
			//storing data to combobox
				cb.setSelectedIndex(-1);
				String name = rs.getString(1);
				cb.addItem(name);
				
			} 
			String column[]={"Bid","Bus Type","Dep.Time","Arr Time","Seat Available","Amount","Position"};//this is for table column 

			cb.setBounds(550,450,100,25);
			add(cb);
			selectLabel.setBounds(450,460,100,25);
			add(selectLabel); 
		  
			  
			JTable jt=new JTable(data,column); 	
			jt.setBounds(30,50,400,200);  
		  
			JScrollPane sp=new JScrollPane(jt); 
			next.setBounds(550,500,100,30);
			add(next);
			next.addActionListener(this);
			next.setBackground(Color.BLUE);
			prev.setBounds(50,450,100,30);
			add(prev);
			prev.setBackground(Color.GRAY);
			prev.addActionListener(this);
			//sp.setBounds(40,50,200,200);
			add(sp); 

			
		 
			setSize(700,600);  
				
			setVisible(true); 
			setLocationRelativeTo(null);
					
		}
		catch(SQLException g)
		{
			System.out.println(g);//f.setText("Error");
		}
		catch(Exception eq){
			System.out.println(eq);
		}	 
	}
	
	 public String getSelectedItem() {
       return (String)cb.getSelectedItem();
    }



	public void actionPerformed(ActionEvent e)
	{
	 if(e.getSource()== next)
		{
		
			//System.out.println(d);
			ChooseSeat ch = new ChooseSeat(this);
			setVisible(false);
		}
		else if (e.getSource()==prev)
		{
			f.setVisible(true);
			this.setVisible(false);
		}
		
			
		
	}
		
		
}