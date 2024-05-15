package casestudy;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
                                                                52
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class casestudy9
{
	casestudy9() throws ClassNotFoundException, SQLException
	  {
              Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mySql://localhost:3306/project","root","Kavitha@2003");
	    String ins1="insert into prod values(?,?,?,?,?)";
	    String ins2="delete from prod where pid=? and pname=?";
		String ins3="update prod set cost=? where pid=?";
		  JFrame f=new JFrame();
		  JPanel p4=new JPanel();
			JPanel p5=new JPanel();
			p4.setBackground(new Color(0xCC9900));
			p4.setBounds(0, 0, 1500, 100);
			p5.setBackground(new Color(0x2d3c50));
			p5.setBounds(0, 151, 1500,1349);	  
		  JPanel p1=new JPanel();
		  JPanel p2=new JPanel();
		  JPanel p3=new JPanel();
		  JButton b1=new JButton("ADD ITEM");
		  b1.setBounds(0,100,500,50);
		  b1.setBorder(BorderFactory.createLineBorder(Color.white,5));
		  b1.setFont(new Font("Arial Black",Font.BOLD,25));
		  b1.setBackground(new Color(0x2d3c50));
		                                         
                         b1.setForeground(Color.white);
		  b1.setFocusable(false);
		 JButton b2=new JButton("DELETE ITEM");
		  b2.setBounds(500,100,500,50);
		  b2.setBorder(BorderFactory.createLineBorder(Color.white,5));
		  b2.setFont(new Font("Arial Black",Font.BOLD,25));
		  b2.setBackground(new Color(0x2d3c50));
		  b2.setForeground(Color.white);
		  b2.setFocusable(false);
		  JButton b3=new JButton("MODIFY ITEM");
		  b3.setBounds(1000,100,500,50);
		  b3.setBorder(BorderFactory.createLineBorder(Color.white,5));
		  b3.setFont(new Font("Arial Black",Font.BOLD,25));
		  b3.setBackground(new Color(0x2d3c50));
		  b3.setForeground(Color.white);
		  b3.setFocusable(false);		  
		  JLabel l1=new JLabel("PRODUCT ID:");
	         l1.setFont(new Font("Arial Black",Font.BOLD,25));
	         l1.setForeground(Color.white);
	 		l1.setBounds(400, 250, 600, 50);		
	 		JLabel l2=new JLabel("PRODUCT NAME:");
	        l2.setFont(new Font("Arial Black",Font.BOLD,25));
	        l2.setForeground(Color.white);
			l2.setBounds(400, 300, 600, 50);
			JLabel l3=new JLabel("QUANTITY:");
	        l3.setFont(new Font("Arial Black",Font.BOLD,25));
	        l3.setForeground(Color.white);
			l3.setBounds(400, 350, 600, 50);			
			JLabel l4=new JLabel("COST:");
                                                                    
	         l4.setFont(new Font("Arial Black",Font.BOLD,25));
	         l4.setForeground(Color.white);
	 		l4.setBounds(400, 400, 600, 50);	 		
	 		JLabel l5=new JLabel("TYPE:");
	        l5.setFont(new Font("Arial Black",Font.BOLD,25));
	        l5.setForeground(Color.white);
			l5.setBounds(400, 450, 600, 50);
			JLabel l6=new JLabel("PRODUCT ID:");
	         l6.setFont(new Font("Arial Black",Font.BOLD,25));
	         l6.setForeground(Color.white);
	 		l6.setBounds(500, 300, 600, 50);
	 		l6.setVisible(false);	 		
	 		JLabel l7=new JLabel("PRODUCT NAME:");
	        l7.setFont(new Font("Arial Black",Font.BOLD,25));
	        l7.setForeground(Color.white);
			l7.setBounds(500, 400, 600, 50);
			l7.setVisible(false);			
			JLabel l8=new JLabel("PRODUCT ID:");
	         l8.setFont(new Font("Arial Black",Font.BOLD,25));
	         l8.setForeground(Color.white);
	 		l8.setBounds(500, 300, 600, 50);
	 		l8.setVisible(false);	 		
	 		JLabel l10=new JLabel("ADMIN SHELL");
	         l10.setFont(new Font("Arial Black",Font.BOLD,45));
	         l10.setForeground(Color.white);
	         p4.add(l10);
	 		JLabel l9=new JLabel("PRODUCT COST:");
	        l9.setFont(new Font("Arial Black",Font.BOLD,25));
	        l9.setForeground(Color.white);
			                            
                                   l9.setBounds(500, 400, 600, 50);
			l9.setVisible(false);		
			JTextField t1=new JTextField();
			t1.setBounds(800,270,150 ,30);
			JTextField t2=new JTextField();
			t2.setBounds(800,320,150 ,30);
			JTextField t3=new JTextField();
			t3.setBounds(800,370,150 ,30);
			JTextField t4=new JTextField();
			t4.setBounds(800,420,150 ,30);
			JTextField t5=new JTextField();
			t5.setBounds(800,470,150 ,30);		
			JTextField t6=new JTextField();
			t6.setBounds(800,310,150 ,30);
			t6.setVisible(false);
			JTextField t7=new JTextField();
			t7.setBounds(800,410,150 ,30);
			t7.setVisible(false);		
			JTextField t8=new JTextField();
			t8.setBounds(800,310,150 ,30);
			t8.setVisible(false);
			JTextField t9=new JTextField();
			t9.setBounds(800,410,150 ,30);
			t9.setVisible(false);			
			JButton b4=new JButton("ADD");
			  b4.setBounds(600,750,300,50);
			  b4.setFont(new Font("Arial Black",Font.BOLD,20));
	          b4.setBackground(new Color(0xCC9900));
	          b4.setForeground(Color.WHITE);
                                                                      
	          b4.setFocusPainted(false);	          
	          b1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						  l1.setVisible(true);
						  l2.setVisible(true);
						  l3.setVisible(true);
						  l4.setVisible(true);
						  l5.setVisible(true);	  
						  l6.setVisible(false);
						  l7.setVisible(false);	  
						  l8.setVisible(false);
						  l9.setVisible(false);  
						  t1.setVisible(true);
						  t2.setVisible(true);
						  t3.setVisible(true);
						  t4.setVisible(true);
						  t5.setVisible(true);  
						  t6.setVisible(false);
						  t7.setVisible(false); 
						  t8.setVisible(false);
						  t9.setVisible(false);	  
						  b4.setText("ADD");	  
					}
		          }); 
	          b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					     
                                                  // TODO Auto-generated method stub
					  l1.setVisible(false);
					  l2.setVisible(false);
					  l3.setVisible(false);
					  l4.setVisible(false);
					  l5.setVisible(false);  
					  l6.setVisible(true);
					  l7.setVisible(true);				  
					  l8.setVisible(false);
					  l9.setVisible(false);
					  t1.setVisible(false);
					  t2.setVisible(false);
					  t3.setVisible(false);
					  t4.setVisible(false);
					  t5.setVisible(false);					  
					  t6.setVisible(true);
					  t7.setVisible(true);					  
					  t8.setVisible(false);
					  t9.setVisible(false);					  
					  b4.setText("DELETE");
				}        	  
	          });	          
	          b3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						  l1.setVisible(false);
						  l2.setVisible(false);
						  l3.setVisible(false);
	                                                
             					  l4.setVisible(false);
						  l5.setVisible(false);
						  l6.setVisible(false);
						  l7.setVisible(false);
						  l8.setVisible(true);
						  l9.setVisible(true);
						  t1.setVisible(false);
						  t2.setVisible(false);
						  t3.setVisible(false);
						  t4.setVisible(false);
						  t5.setVisible(false);
						  t6.setVisible(false);
						  t7.setVisible(false);	  
						  t8.setVisible(true);
						  t9.setVisible(true);
						  b4.setText("MODIFY");
					}	        	  
		          });
		       b4.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(b4.getText().equals("ADD")) {
						try {
					PreparedStatement st1 = conn.prepareStatement(ins1);
							st1.setString(1, t1.getText());
							st1.setString(2, t2.getText());
							st1.setString(3, t4.getText());
							st1.setString(4, t5.getText());
							
                                                                                   st1.setString(5, t3.getText());
							st1.executeUpdate();
							JOptionPane.showMessageDialog(null,"INSERTED SUCCESSFULLY!!","message",JOptionPane.INFORMATION_MESSAGE);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                                                }
					else if(b4.getText().equals("DELETE")) {
						try {
					PreparedStatement st = conn.prepareStatement(ins2);
							st2.setString(1,t6.getText());
							st2.setString(2,t7.getText()); 
							st2.executeUpdate();
							JOptionPane.showMessageDialog(null,"DELETED SUCCESSFULLY","message",JOptionPane.INFORMATION_MESSAGE);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					else if(b4.getText().equals("MODIFY")){
						try {
							PreparedStatement st3 = conn.prepareStatement(ins3);
							st3.setString(2, t8.getText());
							st3.setString(1, t9.getText());
	                                                    
						st3.executeUpdate();							JOptionPane.showMessageDialog(null,"UPDATED SUCCESSFULLY","message",JOptionPane.INFORMATION_MESSAGE);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}    	   
		       });		       
		       ImageIcon i2=new ImageIcon("kkk.png");
		 		JButton b5 = new JButton(); 
		  		b5.setIcon(i2);
		  		b5.setBounds(0,15,70,70);
		  		b5.setBackground(new Color(0xCC9900));
		  		b5.setFocusable(false);
		  		b5.setFocusPainted(false);
		  		b5.setBorderPainted(false);	       
		  		b5.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						 try {
							new casestudy12();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						
                                                                       }
					}	  			
		  		});  
	      f.add(l1);
	      f.add(l2);
	      f.add(l3);
	      f.add(l4);
	      f.add(l5);
	      f.add(l6);
	      f.add(l7);
	      f.add(l8);
	      f.add(l9);
	      f.add(t1);
	      f.add(t2);
	      f.add(t3);
	      f.add(t4);
	      f.add(t5);
	      f.add(t6);
	      f.add(t7);
	      f.add(t8);
	      f.add(t9);
	      f.add(b4);
		  f.add(b1);
		  f.add(b2);
		  f.add(b3);
		  f.add(b5);
          f.add(p4);
          f.add(p5);
//          f.add(p6);
                                                                                 
		  ImageIcon image = new ImageIcon("airline2.png");
	      f.setIconImage(image.getImage());
	      f.setSize(1500,1500);
		  f.setVisible(true);
	  }
	   public static void main(String args[]) throws ClassNotFoundException, SQLException
	   {
		   new casestudy9();	  }
	}
                       
