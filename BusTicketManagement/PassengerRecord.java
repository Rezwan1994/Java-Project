/**
 The PassengerRecord program implements an application that
 simply display the passenger record to a jtable. 

 @author  Rezwan
 @version 1.0
*/

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.sql.*;
class PassengerRecord extends JFrame implements ActionListener{ 
         String s1,s2,s3,s4,s5,s6,s7,s8,s9;

         Seller seller;
          JButton prev =new JButton("prev");		 
 
	public PassengerRecord(Seller seller){  
	      
		  this.seller=seller;
		  add(prev);
		  prev.setBounds(50,500,60,40);
		  prev.addActionListener(this);
	try
		{	
		
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
			Statement stmt=con.createStatement();
			String s = "select * from passenger";
			String s10 = "select count(Pid) from passenger";			
			ResultSet rp = stmt.executeQuery(s10);
			String value = "";
			int vvalue = 0;
			if(rp.next()){
				value = rp.getString(1);
				vvalue = Integer.parseInt(value);
			}
			ResultSet rs=stmt.executeQuery(s);
			String [][] data = new String [vvalue][10];	
			int count =0, count1=0;

			while(rs.next()){
			s1 = rs.getString(2);
			data[count][count1] = s1;
			count1++;				
			s2 = rs.getString(3);
			data[count][count1] = s2;
			count1++;
			s3 = rs.getString(4);
			data[count][count1] = s3;
			count1++;
			s4 = rs.getString(5);
			data[count][count1] = s4;
			count1++;
			s5 = rs.getString(6);
			data[count][count1] = s5;
			count1++;
			s6 = rs.getString(7);
			data[count][count1] = s6;
			count1++;
			s7 = rs.getString(8);
			data[count][count1] = s7;
			count1++;
			s8 = rs.getString(9);
			data[count][count1] = s8;
			count1++;
			s9 = rs.getString(10);
			data[count][count1] = s9;
			count1=0;
			count++;

				
			} 

	
	
    
    String column[]={"Bid","Name","MobileNo","email","FromWhere","ToWhere","Date","SeatNo","Price"};  
	
	
  
      
   	JTable jt=new JTable(data,column); 	
    jt.setBounds(30,50,400,200);  
      
	JScrollPane sp=new JScrollPane(jt); 

	//sp.setBounds(40,50,200,200);
	add(sp); 

	
      
    setSize(1000,600);  
	//f.setLayout(null);  
    setVisible(true);
	setLocationRelativeTo(null);	
	}
	catch(SQLException eq)
	{
		System.out.println(eq);
	}
	catch(Exception ee)
	{
		System.out.println(ee);
	}
  }
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==prev)
		{
			this.setVisible(false);
			seller.setVisible(true);
		}
	}

}