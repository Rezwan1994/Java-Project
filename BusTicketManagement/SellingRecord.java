/**
 The SellingRecord program implements an application that
 simply display the SellingRecord record to a jtable. 

 @author  Rezwan
 @version 1.0
*/
import javax.swing.*; 
import java.awt.Color; 
import java.awt.event.*;
import java.sql.*;
import java.util.*;
class SellingRecord extends JFrame implements ActionListener{ 
String s1,s2; 
        Manager manager;
		
		JButton prev =new JButton("prev");

		public SellingRecord(Manager manager){  

		this.manager=manager;

		add(prev);
		prev.setBounds(50,500,60,40);
		prev.setBackground(Color.GRAY);
		prev.addActionListener(this);
	 
	try
		{	
		
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
			Statement stmt=con.createStatement();
			String s = "select Bid from bus";
			String s10 = "select count(bid) from bus";
		
			ArrayList<String> list = new ArrayList<>();
			ResultSet rp1 = stmt.executeQuery(s);
				while(rp1.next())
				{
					list.add(rp1.getString(1));
				}
			
			ResultSet rp = stmt.executeQuery(s10);
			String value = "";
			int vvalue = 0;
			if(rp.next()){
				value = rp.getString(1);
				vvalue = Integer.parseInt(value);
			}
			String [][] data = new String [vvalue][10];
			int count=0,count1=0;
			//this for loop sum the individual amount of price of individual bus id.
			for (int i=0;i<list.size();i++)
			{
				String ss = "SELECT Bid,SUM(price) FROM passenger where Bid='"+list.get(i)+"'";
				ResultSet rs=stmt.executeQuery(ss);

				while(rs.next()){
				s1 = rs.getString(1);
				data[count][count1] = s1;
				count1++;				
				s2 = rs.getString(2);
				data[count][count1] = s2;
				
				}
				count1=0;
				count++;
				
			}
			

	
	
    
    String column[]={"Bid","selling Price"};  
	
	
  
      
   	JTable jt=new JTable(data,column); 	
    jt.setBounds(30,50,400,200); 

   	 
      
	JScrollPane sp=new JScrollPane(jt); 

	//sp.setBounds(40,50,200,200);
	add(sp); 

	
      
    setSize(1000,600);  
	//f.setLayout(null);  
    setVisible(true);  
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
			manager.setVisible(true);	
			}
		
		}
}