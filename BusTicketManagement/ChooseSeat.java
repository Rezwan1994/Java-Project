/**
 The ChooseSeat program implements an application that
 simply need for chooseing seat and it also display the choosed seat and calculate amount. 

 @author  Rezwan
 @version 1.0
*/

import java.awt.*;  
import javax.swing.*;
import java.awt.event.*; 
import java.sql.*;
import java.awt.Color;
  
public class ChooseSeat extends JFrame implements ActionListener{
	
	 JButton prev =new JButton("prev");
	
	 JButton d=new JButton();
	 JButton b1=new JButton();  
	JButton b2=new JButton();  
	JButton b3=new JButton();  
	JButton b4=new JButton();  
	JButton b5=new JButton();  
	JButton b6=new JButton();  
	JButton b7=new JButton();  
	JButton b8=new JButton();  
	JButton b9=new JButton();
	JButton b10=new JButton();  
	JButton b11=new JButton();  
	JButton b12=new JButton();  
	JButton b13=new JButton();  
	JButton b14=new JButton();  
	JButton b15=new JButton();  
	JButton b16=new JButton();  
	JButton b17=new JButton();  
	JButton b18=new JButton();
	JButton a1=new JButton();  
	JButton a2=new JButton();  
	JButton a3=new JButton();  
	JButton a4=new JButton();  
	JButton a5=new JButton();  
	JButton a6=new JButton();  
	JButton a7=new JButton();  
	JButton a8=new JButton();  
	JButton a9=new JButton();
	JButton a10=new JButton();  
	JButton a11=new JButton();  
	JButton a12=new JButton();  
	JButton a13=new JButton();  
	JButton a14=new JButton();  
	JButton a15=new JButton();  
	JButton a16=new JButton();  
	JButton a17=new JButton();  
	JButton a18=new JButton();
	JButton next = new JButton("Continue");
	
	JLabel lb1 = new JLabel("B1");
	JLabel lb2 = new JLabel("B2");
	JLabel lb3 = new JLabel("B3");
	JLabel lb4 = new JLabel("B4");
	JLabel lb5 = new JLabel("B5");
	JLabel lb6 = new JLabel("B6");
	JLabel lb7 = new JLabel("B7");
	JLabel lb8 = new JLabel("B8");
	JLabel lb9 = new JLabel("B9");
	JLabel lb10 = new JLabel("B10");
	JLabel lb11 = new JLabel("B11");
	JLabel lb12 = new JLabel("B12");
	JLabel lb13 = new JLabel("B13");
	JLabel lb14 = new JLabel("B14");
	JLabel lb15 = new JLabel("B15");
	JLabel lb16 = new JLabel("B16");
	JLabel lb17 = new JLabel("B17");
	JLabel lb18 = new JLabel("B18");
	
	JLabel la1 = new JLabel("A1");
	JLabel la2 = new JLabel("A2");
	JLabel la3 = new JLabel("A3");
	JLabel la4 = new JLabel("A4");
	JLabel la5 = new JLabel("A5");
	JLabel la6 = new JLabel("A6");
	JLabel la7 = new JLabel("A7");
	JLabel la8 = new JLabel("A8");
	JLabel la9 = new JLabel("A9");
	JLabel la10 = new JLabel("A10");
	JLabel la11 = new JLabel("A11");
	JLabel la12 = new JLabel("A12");
	JLabel la13 = new JLabel("A13");
	JLabel la14 = new JLabel("A14");
	JLabel la15 = new JLabel("A15");
	JLabel la16 = new JLabel("A16");
	JLabel la17 = new JLabel("A17");
	JLabel la18 = new JLabel("A18");
	
	
	
	JLabel seat = new JLabel("Seat");
	JLabel amount = new JLabel("Amount");
	JLabel Cl = new JLabel("Class");
	JLabel Total = new JLabel("Total");
	JLabel seatValue = new JLabel(" ");
	JLabel amountValue = new JLabel ("0");
	JLabel classValue = new JLabel();
	
	
	JTextField totalField = new JTextField();
	JTextField boardingField = new JTextField();	
	ImageIcon icon = new ImageIcon(getClass().getResource("chooseseat.jpg"));
	JLabel lebel = new JLabel(icon);
	String price,initialPrice,busType;
	int pr,x,ip;
	BusList bl;
	
	
public ChooseSeat(BusList bl){
	this.bl = bl;

	setSize(600,575);
	setVisible(true);
	setLayout(null);
	setLocationRelativeTo(null);
	
	
	d.setBounds(120,35,20,20);
	add(d);
	
	
	lb1.setBounds(20,60,20,10);
	lb1.setForeground(Color.PINK);
	b1.setBounds(20,75,20,20);
	add(b1);
	add(lb1);
	b1.addActionListener(this);
	
	
	lb2.setBounds(20,110,20,10);
	lb2.setForeground(Color.PINK);
	b2.setBounds(20,125,20,20);
	add(b2);
	add(lb2);
	b2.addActionListener(this);
	
	lb3.setBounds(20,160,20,10);
	lb3.setForeground(Color.PINK);
	b3.setBounds(20,175,20,20);
	add(b3);
	add(lb3);
	b3.addActionListener(this);
	
	lb4.setBounds(20,210,20,10);
	lb4.setForeground(Color.PINK);
	b4.setBounds(20,225,20,20);
	add(b4);
	add(lb4);
	b4.addActionListener(this);
	
	lb5.setBounds(20,260,20,10);
	lb5.setForeground(Color.PINK);
	b5.setBounds(20,275,20,20);
	add(b5);
	add(lb5);
	b5.addActionListener(this);
	
	lb6.setBounds(20,310,20,10);
	lb6.setForeground(Color.PINK);
	b6.setBounds(20,325,20,20);
	add(b6);
	add(lb6);
	b6.addActionListener(this);
	
	lb7.setBounds(20,360,20,10);
	lb7.setForeground(Color.PINK);
	b7.setBounds(20,375,20,20);
	add(b7);
	add(lb7);
	b7.addActionListener(this);
	
	
	lb8.setBounds(20,410,20,10);
	lb8.setForeground(Color.PINK);
	b8.setBounds(20,425,20,20);
	add(b8);
	add(lb8);
	b8.addActionListener(this);
	
	lb9.setBounds(20,460,20,10);
	lb9.setForeground(Color.PINK);
	b9.setBounds(20,475,20,20);
	add(b9);
	add(lb9);
	b9.addActionListener(this);
	
	
	lb10.setBounds(50,60,30,10);
	lb10.setForeground(Color.PINK);
	b10.setBounds(50,75,20,20);
	add(b10);
	add(lb10);
	b10.addActionListener(this);
	
	lb11.setBounds(50,110,30,10);
	lb11.setForeground(Color.PINK);
	b11.setBounds(50,125,20,20);
	add(b11);
	add(lb11);
	b11.addActionListener(this);
	
	lb12.setBounds(50,160,30,10);
	lb12.setForeground(Color.PINK);
	b12.setBounds(50,175,20,20);
	add(b12);
	add(lb12);
	b12.addActionListener(this);
	
	
	lb13.setBounds(50,210,30,10);
	lb13.setForeground(Color.PINK);
	b13.setBounds(50,225,20,20);
	add(b13);
	add(lb13);
	b13.addActionListener(this);
	
	
	lb14.setBounds(50,260,30,10);
	lb14.setForeground(Color.PINK);
	b14.setBounds(50,275,20,20);
	add(b14);
	add(lb14);
	b14.addActionListener(this);
	
	
	lb15.setBounds(50,310,30,10);
	lb15.setForeground(Color.PINK);
	b15.setBounds(50,325,20,20);
	add(b15);
	add(lb15);
	b15.addActionListener(this);
	
	
	lb16.setBounds(50,360,30,10);
	lb16.setForeground(Color.PINK);
	b16.setBounds(50,375,20,20);
	add(b16);
	add(lb16);
	b16.addActionListener(this);
	
	
	lb17.setBounds(50,410,30,10);
	lb17.setForeground(Color.PINK);
	b17.setBounds(50,425,20,20);
	add(b17);
	add(lb17);
	b17.addActionListener(this);


    lb18.setBounds(50,460,30,10);
	lb18.setForeground(Color.PINK);
	b18.setBounds(50,475,20,20);
	add(b18);
	add(lb18);
	b18.addActionListener(this);
	
	
	la1.setBounds(90,60,20,10);
	la1.setForeground(Color.PINK);
	a1.setBounds(90,75,20,20);
	add(a1);
	add(la1);
	a1.addActionListener(this);
	
	
	la2.setBounds(90,110,20,10);
	la2.setForeground(Color.PINK);
	a2.setBounds(90,125,20,20);
	add(a2);
	add(la2);
	a2.addActionListener(this);
	
	
	la3.setBounds(90,160,20,10);
	la3.setForeground(Color.PINK);
	a3.setBounds(90,175,20,20);
	add(a3);
	add(la3);
	a3.addActionListener(this);
	
	
	la4.setBounds(90,210,20,10);
	la4.setForeground(Color.PINK);
	a4.setBounds(90,225,20,20);
	add(a4);
	add(la4);
	a4.addActionListener(this);
	
	
	la5.setBounds(90,260,20,10);
	la5.setForeground(Color.PINK);
	a5.setBounds(90,275,20,20);
	add(a5);
	add(la5);
	a5.addActionListener(this);
	
	
	la6.setBounds(90,310,20,10);
	la6.setForeground(Color.PINK);
	a6.setBounds(90,325,20,20);
	add(a6);
	add(la6);
	a6.addActionListener(this);
	
	
	la7.setBounds(90,360,20,10);
	la7.setForeground(Color.PINK);
	a7.setBounds(90,375,20,20);
	add(a7);
	add(la7);
	a7.addActionListener(this);
	
	
	la8.setBounds(90,410,20,10);
	la8.setForeground(Color.PINK);
	a8.setBounds(90,425,20,20);
	add(a8);
	add(la8);
	a8.addActionListener(this);
	
	
	la9.setBounds(90,460,20,10);
	la9.setForeground(Color.PINK);
	a9.setBounds(90,475,20,20);
	add(a9);
	add(la9);
	a9.addActionListener(this);
	
	
	la10.setBounds(120,60,30,10);
	la10.setForeground(Color.PINK);
	a10.setBounds(120,75,20,20);
	add(a10);
	add(la10);
	a10.addActionListener(this);
	
	
	la11.setBounds(120,110,30,10);
	la11.setForeground(Color.PINK);
	a11.setBounds(120,125,20,20);
	add(a11);
	add(la11);
	a11.addActionListener(this);
	
	
	la12.setBounds(120,160,30,10);
	la12.setForeground(Color.PINK);
	a12.setBounds(120,175,20,20);
	add(a12);
	add(la12);
	a12.addActionListener(this);
	
	
	la13.setBounds(120,210,30,10);
	la13.setForeground(Color.PINK);
	a13.setBounds(120,225,20,20);
	add(a13);
	add(la13);
	a13.addActionListener(this);
	
	
	la14.setBounds(120,260,30,10);
	la14.setForeground(Color.PINK);
	a14.setBounds(120,275,20,20);
	add(a14);
	add(la14);
	a14.addActionListener(this);
	
	
	la15.setBounds(120,310,30,10);
	la15.setForeground(Color.PINK);
	a15.setBounds(120,325,20,20);
	add(a15);
    add(la15);
	a15.addActionListener(this);
	
	
	la16.setBounds(120,360,30,10);
	la16.setForeground(Color.PINK);
	a16.setBounds(120,375,20,20);
	add(a16);
	add(la16);
	a16.addActionListener(this);
	
	
	la17.setBounds(120,410,30,10);
	la17.setForeground(Color.PINK);
	a17.setBounds(120,425,20,20);
	add(a17);
    add(la17);	
	a17.addActionListener(this);
	
	
	la18.setBounds(120,460,30,10);
	la18.setForeground(Color.PINK);
	a18.setBounds(120,475,20,20);
	add(a18);
	add(la18);
	a18.addActionListener(this);
	prev.setBounds(300,474,60,30);
	
	prev.setBackground(Color.GRAY);
	add(prev);
	prev.addActionListener(this);
	prev.setBackground(Color.GRAY);
	
	
	next.setBounds(400,475,100,30);
	next.setBackground(Color.BLUE);
	add(next);
	next.addActionListener(this);
	seat.setBounds(250,75,30,30);
	seat.setForeground(Color.PINK);
	add(seat);
	amount.setBounds(350,75,50,30);
	amount.setForeground(Color.PINK);
	add(amount);
	Cl.setBounds(450,75,50,30);
	Cl.setForeground(Color.PINK);
	add(Cl);
	seatValue.setBounds(250,120,100,30);
	add(seatValue);
	amountValue.setBounds(350,120,30,30);
	add(amountValue);
	classValue.setBounds(450,120,100,30);
	add(classValue);
	
	Total.setBounds(250,275,50,30);
	add(Total);
	Total.setForeground(Color.PINK);
	
	totalField.setBounds(250,300,250,30);
	add(totalField);

	
	try
		{
			
			String g,m;
			String sa= " ";
			int x,seat;
			String b = bl.getSelectedItem();
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
			Statement stmt=con.createStatement();
			String s4= bl.f.journeyField.getText();
			ResultSet rs = stmt.executeQuery("SELECT * FROM chooseseat where Bid = '"+b+"'and  DATE='"+s4+"' ");
			String co = "SELECT COUNT(Bid) FROM chooseseat WHERE Bid = '"+b+"' and DATE = '"+s4+"' ";
			
			//this while blook actualy cheak the booked seat from database and make the seat colored.
			while(rs.next())
			{
				g = rs.getString(3);
				if(g.equals("B1"))
				{
					b1.setBackground(Color.RED);
				
				}
				else if(g.equals("B2"))
				{
					b2.setBackground(Color.RED);
				}
				else if(g.equals("B3"))
				{
					b3.setBackground(Color.RED);
				}
				else if(g.equals("B4"))
				{
					b4.setBackground(Color.RED);
				}
				else if(g.equals("B5"))
				{
					b5.setBackground(Color.RED);
				}
				else if(g.equals("B6"))
				{
					b6.setBackground(Color.RED);
				}
				else if(g.equals("B7"))
				{
					b7.setBackground(Color.RED);
				}
				else if(g.equals("B8"))
				{
					b8.setBackground(Color.RED);
				}
				else if(g.equals("B9"))
				{
					b9.setBackground(Color.RED);
				}
				else if(g.equals("B10"))
				{
					b10.setBackground(Color.RED);
				}
				else if(g.equals("B11"))
				{
					b11.setBackground(Color.RED);
				}
				else if(g.equals("B12"))
				{
					b12.setBackground(Color.RED);
				}
				else if(g.equals("B13"))
				{
					b13.setBackground(Color.RED);
				}
				else if(g.equals("B14"))
				{
					b14.setBackground(Color.RED);
				}
				else if(g.equals("B15"))
				{
					b15.setBackground(Color.RED);
				}
				else if(g.equals("B16"))
				{
					b16.setBackground(Color.RED);
				}
				else if(g.equals("B17"))
				{
					b17.setBackground(Color.RED);
				}
				else if(g.equals("B18"))
				{
					b18.setBackground(Color.RED);
				}
				else if(g.equals("A1"))
				{
					a1.setBackground(Color.RED);
				}
				else if(g.equals("A2"))
				{
					a2.setBackground(Color.RED);
				}
				else if(g.equals("A3"))
				{
					a3.setBackground(Color.RED);
				}
				else if(g.equals("A4"))
				{
					a4.setBackground(Color.RED);
				}
				else if(g.equals("A5"))
				{
					a5.setBackground(Color.RED);
				}
				else if(g.equals("A6"))
				{
					a6.setBackground(Color.RED);
				}
				else if(g.equals("A7"))
				{
					a7.setBackground(Color.RED);
				}
				else if(g.equals("A8"))
				{
					a8.setBackground(Color.RED);
				}
				else if(g.equals("A9"))
				{
					a9.setBackground(Color.RED);
				}
				else if(g.equals("A10"))
				{
					a10.setBackground(Color.RED);
				}
				else if(g.equals("A11"))
				{
					a11.setBackground(Color.RED);
				}
				else if(g.equals("A12"))
				{
					a12.setBackground(Color.RED);
				}
				else if(g.equals("A13"))
				{
					a13.setBackground(Color.RED);
				}
				else if(g.equals("A14"))
				{
					a14.setBackground(Color.RED);
				}
				else if(g.equals("A15"))
				{
					a15.setBackground(Color.RED);
				}
				else if(g.equals("A16"))
				{
					a16.setBackground(Color.RED);
				}
				else if(g.equals("A17"))
				{
					a17.setBackground(Color.RED);
				}
				else if(g.equals("A18"))
				{
					a18.setBackground(Color.RED);
				}					
			}
			
	
			
		}
		catch(SQLException s)
		{
			System.out.println(s);
		}
		catch(Exception e)
		{
			System.out.println();
		}
	lebel.setBounds(0,-50,600,600);
	add(lebel);

}
public void actionPerformed(ActionEvent e)
   {    
       if(e.getSource()==prev)
	   {
		   this.setVisible(false);
		   bl.setVisible(true);
	   }
   
					
			try
			{
			int c=0,r;
			
			String bid = bl.getSelectedItem();
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_ticket_management","root","");
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from bus where bid= '"+bid+"'");
			while(rs.next())
			{
				price=rs.getString(9);
				busType=rs.getString(2);
			}
			classValue.setText(busType);
			classValue.setForeground(Color.PINK);
			String s = bl.f.journeyField.getText();
			if(e.getSource()== next)
				{
					PassengerDetails p = new PassengerDetails(this);
					setVisible(false);
				}
				//this portion worked for colored the selected seat calculate pricce and insert all the info to databese
				else if(e.getSource()==b1)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B1"));
					b1.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B1'); ");
				
				}
				else if(e.getSource()==b2)
				{
					initialPrice = amountValue.getText();
					 pr = Integer.parseInt(initialPrice);
					 ip = Integer.parseInt(price);
					 x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B2"));
					seatValue.setForeground(Color.PINK);
					b2.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B2'); ");
				
				}
					else if(e.getSource()==b3)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B3"));
					seatValue.setForeground(Color.PINK);
					b3.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B3'); ");
				
				}
				else if(e.getSource()==b4)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B4"));
					seatValue.setForeground(Color.PINK);

					b4.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B4'); ");
					
				}
					else if(e.getSource()==b5)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B5"));
					seatValue.setForeground(Color.PINK);
					b5.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B5'); ");
				}
				else if(e.getSource()==b6)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B6"));
					seatValue.setForeground(Color.PINK);
					b6.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`)VALUES ('"+bid+"','"+s+"', 'B6'); ");
				}
					else if(e.getSource()==b7)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B7"));
					seatValue.setForeground(Color.PINK);
					b7.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B7'); ");
				}
				else if(e.getSource()==b8)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B8"));
					seatValue.setForeground(Color.PINK);
					b8.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`)VALUES ('"+bid+"','"+s+"', 'B8'); ");
				}
					else if(e.getSource()==b9)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B9"));
					seatValue.setForeground(Color.PINK);
					b9.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B9'); ");
				}
				else if(e.getSource()==b10)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B10"));
					seatValue.setForeground(Color.PINK);
					b10.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`)VALUES ('"+bid+"','"+s+"', 'B10'); ");
				}
					else if(e.getSource()==b11)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B11"));
					seatValue.setForeground(Color.PINK);
					b11.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B11'); ");
				}
				else if(e.getSource()==b12)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B12"));
					seatValue.setForeground(Color.PINK);
					b12.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B12'); ");
				}
					else if(e.getSource()==b13)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B13"));
					seatValue.setForeground(Color.PINK);
					b13.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B13'); ");
				}
				else if(e.getSource()==b14)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B14"));
					seatValue.setForeground(Color.PINK);
					b14.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B14'); ");
				}
					else if(e.getSource()==b15)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B15"));
					seatValue.setForeground(Color.PINK);
					b15.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B15'); ");
				}
				else if(e.getSource()==b16)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B16"));
					seatValue.setForeground(Color.PINK);
					b16.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B16'); ");
				}
					else if(e.getSource()==b17)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B17"));
					seatValue.setForeground(Color.PINK);
					b17.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B17'); ");
				}
				else if(e.getSource()==b18)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("B18"));
					seatValue.setForeground(Color.PINK);
					b18.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'B18'); ");
				}
					else if(e.getSource()==a1)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A1"));
					seatValue.setForeground(Color.PINK);
					a1.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A1'); ");
				}
				else if(e.getSource()==a2)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A2"));
					seatValue.setForeground(Color.PINK);
					a2.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A2'); ");
				}
					else if(e.getSource()==a3)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A3"));
					seatValue.setForeground(Color.PINK);
					a3.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`)VALUES ('"+bid+"','"+s+"', 'A3'); ");
				}
				else if(e.getSource()==a4)
				{	initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A4"));
					seatValue.setForeground(Color.PINK);
					a4.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A4'); ");
				}
					else if(e.getSource()==a5)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A5"));
					seatValue.setForeground(Color.PINK);
					a5.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A5'); ");
				}
				else if(e.getSource()==a6)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A6"));
					seatValue.setForeground(Color.PINK);
					a6.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`)VALUES ('"+bid+"','"+s+"', 'A6'); ");
				}
					else if(e.getSource()==a7)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A7"));
					seatValue.setForeground(Color.PINK);
					a7.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A7'); ");
				}
				else if(e.getSource()==a8)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A8"));
					seatValue.setForeground(Color.PINK);
					a8.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A8'); ");
				}
					else if(e.getSource()==a9)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A9"));
					seatValue.setForeground(Color.PINK);
					a9.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A9'); ");
				}
				else if(e.getSource()==a10)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A10"));
					seatValue.setForeground(Color.PINK);
					a10.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A10'); ");
				}
					else if(e.getSource()==a11)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A11"));
					seatValue.setForeground(Color.PINK);
					a11.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A11'); ");
				}
				else if(e.getSource()==a12)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A12"));
					seatValue.setForeground(Color.PINK);
					a12.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A12'); ");
				}
					else if(e.getSource()==a13)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A13"));
					seatValue.setForeground(Color.PINK);
					a13.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`)VALUES ('"+bid+"','"+s+"', 'A13'); ");
				}
				else if(e.getSource()==a14)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A14"));
					seatValue.setForeground(Color.PINK);
					a14.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`)VALUES ('"+bid+"','"+s+"', 'A14'); ");
				}
					else if(e.getSource()==a15)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A15"));
					seatValue.setForeground(Color.PINK);
					a15.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A15'); ");
				}
				else if(e.getSource()==a16)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A16"));
					seatValue.setForeground(Color.PINK);
					a16.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A16'); ");
				}
					else if(e.getSource()==a17)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A17"));
					seatValue.setForeground(Color.PINK);
					a17.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`) VALUES ('"+bid+"','"+s+"', 'A17'); ");
				}
				else if(e.getSource()==a18)
				{
					initialPrice = amountValue.getText();
					pr = Integer.parseInt(initialPrice);
					ip = Integer.parseInt(price);
					x = pr+ip;
					amountValue.setText(x+"");
					amountValue.setForeground(Color.PINK);
					totalField.setText(x+"");
					seatValue.setText(seatValue.getText().concat("A18"));
					seatValue.setForeground(Color.PINK);
					a18.setBackground(Color.RED);
					stmt.executeUpdate("INSERT INTO `chooseseat` (Bid,`DATE`, `selectedseat`)VALUES ('"+bid+"','"+s+"', 'A18'); ");
				}
				
			}
			catch(SQLException km)
			{
				System.out.println(km);
			}
			catch(Exception k)
			{
				System.out.println(k);
			}
			
				
	}
	
 
	
} 