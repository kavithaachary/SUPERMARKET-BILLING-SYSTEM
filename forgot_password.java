package casestudy;
import java.awt.Color;
import java.sql.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.sql.Statement;
public class casestudy5{
	boolean f=false;
	boolean g=false;
	public casestudy5() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mySql://localhost:3306/project","root","Kavitha@2003");
		String ins="select email from signup1 where email=? ";
		PreparedStatement st = conn.prepareStatement(ins);	
		                                  
                       JFrame jf =new JFrame();
		jf.setTitle("forget password frame");
		jf.setResizable(true);
		jf.setSize(1500,1500);	
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		p1.setBackground(new Color(0xCC9900));
		p1.setBounds(0, 0, 1500, 200);
		p2.setBackground(new Color(0x2d3c50));
		p2.setBounds(0, 200, 1500,1300);	
		ImageIcon i3=new ImageIcon("fr.png");
		JLabel label3 = new JLabel(); 
 		label3.setIcon(i3);
 		label3.setBounds(900, 405, 600,600);	
		jf.setLayout(null);
	    JLabel l1=new JLabel("EmaiID:");
	    l1.setBounds(450,300,350,30);
	    l1.setFont(new Font("Arial Black",Font.BOLD,23));
	    l1.setForeground(Color.WHITE);
	    JTextField t1=new JTextField();
	    t1.setBounds(750,300,150,30);    
		JLabel l2=new JLabel("Create Password:");
		l2.setBounds(450,350,350,30);
		l2.setFont(new Font("Arial Black",Font.BOLD,23));
	    l2.setForeground(Color.WHITE);
		JTextField t2=new JTextField();
		t2.setBounds(750,350,150,30);		
		JLabel l3=new JLabel("Confirm Password:");
		l3.setBounds(450,400,350,30);
		                                      
                l3.setFont(new Font("Arial Black",Font.BOLD,23));
	    l3.setForeground(Color.WHITE);
		JPasswordField t3=new JPasswordField();
		t3.setBounds(750,400,150, 30);		
		JButton b1=new JButton("RESET");
		b1.setBounds(580,550,150,30);		
		JLabel l4=new JLabel("RESET PASSWORD");
		l4.setFont(new Font("Arial Black",Font.BOLD,45));	
		l4.setForeground(Color.darkGray);
		l4.setBounds(400, 50, 600, 200);
                        p1.add(l4);	
		  b1.addActionListener(new ActionListener() {
            	@Override
            	public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					st.setString(1,t1.getText());
					ResultSet rs= st. executeQuery();			
					if(rs.next()) {
//					if((rs.getString(1)).equals(t1.getText())) {
							f=true;
//					   }
					}
					if (t2.getText().equals(t3.getText())) {
						g=true;				
					}		
					if (f==true && g==true&&!(t1.getText().isEmpty()||
t2.getText().isEmpty()) ) {
				String ins1= "update login set psw=? where email=?";
						
                                                      PreparedStatement st1 = conn.prepareStatemennt;						st1.setString(1,t3.getText());
						st1.setString(2,t1.getText());
						st1.executeUpdate();
			                String ins2= "update signup1 set psd=? where email=?";
				  PreparedStatement st2 = conn.prepareStatement(ins2);
				        	st2.setString(1,t3.getText());
                                                                       st2.setString(2,t1.getText());
						st2.executeUpdate();						JOptionPane.showInternalMessageDialog(null,"PASSWORD CHANGED SUCCESSFULLY😊😊😊", "message", JOptionPane.INFORMATION_MESSAGE);
                       					new casestudy7();
					}
					else if(f==false && g==false || t1.getText().isEmpty()) {
						JOptionPane.showInternalMessageDialog(null,"invalid email and enter same password on two feilds", "message", JOptionPane.INFORMATION_MESSAGE);
					}
					else if(f==false && g==true&&t1.getText().isEmpty()) {
						JOptionPane.showInternalMessageDialog(null,"invalid email", "message", JOptionPane.INFORMATION_MESSAGE);	
					}
					else if(f==true && g==false|| t1.getText().isEmpty()) {
						JOptionPane.showInternalMessageDialog(null,"enter same password on two feilds", "message", JOptionPane.INFORMATION_MESSAGE);
					}
		// TODO Auto-generated catch block
					e1.printStackTrace();
			            }			    	
	    });		  
		  ImageIcon i2=new ImageIcon("kkk.png");
	 		JButton b2 = new JButton(); 
	  		b2.setIcon(i2);
	  		b2.setBounds(0,15,70,70);
	  		b2.setBackground(new Color(0xCC9900));
	  		b2.setFocusable(false);
	  		b2.setFocusPainted(false);
	  		b2.setBorderPainted(false);		
	  		b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						new casestudy7();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}			
			});		
	       jf.add(label3);
                   jf.add(b2);
	      jf.add(b1);
	                                                      
                 jf.add(l1);
	      jf.add(l2);
	      jf.add(l3);
	      jf.add(p1);
	      jf.add(p2);
	      jf.add(t1);
		jf.add(t2);
		jf.add(t3);	
		jf.setVisible(true);	
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new casestudy5();
		// TODO Auto-generated method stub
	}
}

