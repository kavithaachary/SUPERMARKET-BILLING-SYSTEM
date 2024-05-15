package casestudy;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class casestudy2 {
	public casestudy2() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub		
		JFrame jf2=new JFrame("Signup");
		String Gender[]= {"Male" ,"Female","Others"};	
		jf2.setLayout(null);
		                                     
                        jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setSize(1500,1500);		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		p1.setBackground(new Color(0xCC9900));
		p1.setBounds(0, 0, 1500, 100);
		p2.setBackground(new Color(0x2d3c50));
		p2.setBounds(0, 100, 1500,1400);		
		JLabel la1=new JLabel("SIGNUP");
		la1.setBounds(300,150,150,30);
		la1.setForeground(Color.white);
		la1.setFont(new Font("Arial Black",Font.BOLD,40));
	          p1.add(la1);		
		JLabel l1=new JLabel("First Name:");
		l1.setBounds(300,150,150,30);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Arial Black",Font.BOLD,20));
		JTextField t3=new JTextField();
		t3.setBounds(520,150,150 ,30);
		JLabel l2=new JLabel("Last Name:");
		l2.setBounds(300,220,150,30);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Arial Black",Font.BOLD,20));
		JTextField t4=new JTextField();
		t4.setBounds(520,220,150 ,30);		
		JLabel l3=new JLabel("Email:");
		l3.setBounds(300,290,150,30);
		l3.setForeground(Color.white);
		l3.setFont(new Font("Arial Black",Font.BOLD,20));
		                                                 
                        JTextField t5=new JTextField();
		t5.setBounds(520,290,150 ,30);		
		JLabel l4=new JLabel("Phone No:");
		l4.setBounds(300,360,150,30);
		l4.setForeground(Color.white);
		l4.setFont(new Font("Arial Black",Font.BOLD,20));
		JLabel l5=new JLabel("+91");
		l5.setBounds(495,360,150,30);
		l5.setForeground(Color.white);
        JTextField t6=new JTextField();
		t6.setBounds(520,360,150 ,30);		
		JLabel l6=new JLabel("Gender:");
		l6.setBounds(300,430,150,30);
		l6.setForeground(Color.white);
		l6.setFont(new Font("Arial Black",Font.BOLD,20));
		JComboBox c1=new JComboBox(Gender);
	          c1.setBounds(520,430,80, 30);		
		JLabel l7=new JLabel("Adress:");
		l7.setBounds(300,500,150,30);
		l7.setForeground(Color.white);
		l7.setFont(new Font("Arial Black",Font.BOLD,20));
		JTextField t7=new JTextField();
		t7.setBounds(520,500,150 ,30);		
		JLabel l8=new JLabel("Confirm Password:");
		l8.setBounds(300,640,250,30);
		l8.setForeground(Color.white);
		l8.setFont(new Font("Arial Black",Font.BOLD,20));
		JPasswordField t8=new JPasswordField();
		t8.setBounds(520,640,150 ,30);
                                                               
		JLabel l9=new JLabel("Create Password:");
		l9.setBounds(300,570,250,30);
		l9.setForeground(Color.white);
		l9.setFont(new Font("Arial Black",Font.BOLD,20));
		JTextField t9=new JTextField();
		t9.setBounds(520,570,150 ,30);		
		JCheckBox c2=new JCheckBox();
		c2.setText("Accept Terms And Conditions");
		c2.setForeground(Color.white);
		c2.setFont(new Font("Arial Black",Font.BOLD,20));
		c2.setBackground(new Color(0x2d3c50));
		c2.setBounds(310,710, 450, 30);		
		JButton b2=new JButton("Submit");
		b2.setBounds(400,780,140,40); 		
		ImageIcon i1=new ImageIcon("shop.png");
 		JLabel b3 = new JLabel(); 
  		b3.setIcon(i1);
  		b3.setBounds(800,300,500,400);
  		b3.setBackground(new Color(0x2d3c50));
  		b3.setFocusable(false);		
  		ImageIcon i2=new ImageIcon("kkk.png");
 		JButton b1 = new JButton(); 
  		b1.setIcon(i2);
  		b1.setBounds(0,15,70,70);
  		b1.setBackground(new Color(0xCC9900));
  		b1.setFocusable(false);
  		b1.setFocusPainted(false);
  		b1.setBorderPainted(false);	
		jf2.add(b1);
		                                               
                        jf2.add(b3);
		jf2.add(t3);
		jf2.add(l1);
		jf2.add(l2);
		jf2.add(t4);
		jf2.add(l3);
		jf2.add(t5);
		jf2.add(l4);
		jf2.add(t6);
		jf2.add(l5);
		jf2.add(l6);
		jf2.add(c1);
		jf2.add(t7);
		jf2.add(l7);
		jf2.add(t8);
		jf2.add(l8);
		jf2.add(l9);
		jf2.add(t9);
		jf2.add(c2);
		jf2.add(b2);
		jf2.add(p1);
		jf2.add(p2);	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mySql://localhost:3306/project","root","Kavitha@2003");
	String ins="insert into signup1(f_name,l_name,email,phno,gen,addr,psd)values(?,?,?,?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(ins);		
		b2.addActionListener(new ActionListener() {
			                                  
                                    @Override
			public void actionPerformed(ActionEvent e){
				String name;
				// TODO Auto-generated method stub
				boolean b =(t8.getText()).equals(t9.getText());
				if((c2.isSelected())&&((t8.getText()).equals(t9.getText()))) {
						try {
							System.out.println(t3.getText());				
						String s5=(String) c1.getSelectedItem();
				                        	st.setString(1,t3.getText());
							st.setString(2,t4.getText());
							st.setString(3,t5.getText());
							st.setString(4,t6.getText());
							st.setString(5,s5);
							st.setString(6,t7.getText());
							st.setString(7,t8.getText());
							st.executeUpdate();
//							 JOptionPane.showMessageDialog(null,"account created successfully your username is firstname_lastname*2003 ");
						 String ins1="insert into login values(?,?)";   	   PreparedStatement st1=conn.prepareStatement(ins1);
							 st1.setString(1,t5.getText());
							 st1.setString(2,t8.getText());
							 st1.executeUpdate();		 
							new casestudy7();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				                 
                                                     }
					else if(b==false) {
					 JOptionPane.showMessageDialog(null,"please enter the same password in two password feilds","message",JOptionPane.INFORMATION_MESSAGE);
				}				
				else {
				   name = "please accept terms and conditions";				    JOptionPane.showMessageDialog(null,name,"message",JOptionPane.WARNING_MESSAGE);				
		}
				}			
		});		
		b1.addActionListener(new ActionListener() {
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
		jf2.setVisible(true);		
			}
      public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	  new casestudy2();}
}
