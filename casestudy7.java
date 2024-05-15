package casestudy;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.Border;
public class casestudy7 {
      boolean f= false;
	public casestudy7() throws Exception {
		// TODO Auto-generated constructor stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mySql://localhost:3306/project","root","Kavitha@2003");
		String ins="select email,psw from login where email=? and psw=?";
		PreparedStatement st = conn.prepareStatement(ins);
		JFrame jf=new JFrame();  
	    ImageIcon i1=new ImageIcon("kavi1.jpg");
	                                                       11
               JLabel jl1=new JLabel();
	    jl1.setIcon(i1);
	    jl1.setBounds(0, -400, 1500, 1800);    
	    JPanel p1=new JPanel();
	    p1.setBounds(0, 0, 1500, 150);
	    p1.setBackground(new Color(0x2d3c50));
               JLabel l1=new JLabel("LOGIN");
	    jf.add(l1);
	    l1.setFont(new Font("Arial Black",Font.BOLD,45));
	    l1.setForeground(Color.WHITE);
	    l1.setBounds(660,40, 200, 45);    
	    JPanel p5=new JPanel();
	    p5.setBounds(850,260, 480, 480);
	    p5.setBackground(new Color(0x2d3c50));
                p5.setVisible(true);	    
        JPanel p6=new JPanel();
	    p6.setBounds(855,265, 470, 470);
	    p6.setBackground(new Color(0xFfd529));
        p6.setVisible(true);	    
	    JLabel label1=new JLabel();
	    label1.setText("EMAIL :");
	    label1.setBounds(900,340,150,50);
	    label1.setForeground(Color.black);
	    label1.setFont(new Font("Arial Black",Font.BOLD,20));    
	   JTextField t1=new JTextField();
	    t1.setBounds(1070,350,200,30);
	    t1.setBackground(new Color(0x2d3c50));
	    t1.setForeground(Color.WHITE);    
	    JLabel label2=new JLabel("PASSWORD :");
	                                                              12
               label2.setBounds(900,450,200,30);
	    label2.setForeground(Color.black);
	    label2.setFont(new Font("Arial Black",Font.BOLD,20));
	    JTextField t2=new JTextField();
	    t2.setBounds(1070,450,200,30);
	    t2.setBackground(new Color(0x2d3c50));
	    t2.setForeground(Color.WHITE); 
	   JButton b1=new JButton("SUBMIT");
	    b1.setBounds(1050,550,150,30);
	    b1.setBackground(new Color(0x2d3c50));
	    b1.setForeground(Color.WHITE);   
	    JButton b2=new JButton("Create A New Account");
	    b2.setBounds(980,620,300,20);
	    b2.setBackground(new Color(0xFfd529));
	    b2.setBorderPainted(false);
        b2.setForeground(Color.black);
        b2.setFont(new Font("Arial Black",Font.BOLD,15));
	    JButton b3=new JButton("Forgot Password?");
	    b3.setBounds(886,500,140,30); 
	    b3.setBackground(new Color(0xFfd529));
        b3.setBorderPainted(false);
        b3.setForeground(Color.black);    
        ImageIcon i2=new ImageIcon("ut.png");
		JLabel l2 = new JLabel(); 
 		l2.setIcon(i2);
 		l2.setBounds(1010,170,150,150);	
 		 ImageIcon i3=new ImageIcon("kk2.png");
 		JButton l3 = new JButton(); 
  		l3.setIcon(i3);
  		                                            13
                        l3.setBounds(0,20,70,70);
  		l3.setBackground(new Color(0x2d3c50));
  		l3.setFocusable(false);
  		l3.setFocusPainted(false);
  		l3.setBorderPainted(false);
                 b1.addActionListener(new ActionListener() {
            	@Override
		public void actionPerformed(ActionEvent e) {
                           // TODO Auto-generated method stub
				try {
					st.setString(1, t1.getText());
					st.setString(2, t2.getText());
					ResultSet rs = st.executeQuery();
					if(rs.next()) {
//						if(rs.getString(1).equals(t1.getText())&&rs.getString(2).equals(t2.getText()))
					       f=true;
					}
					if(f) {
					JOptionPane.showInternalMessageDialog(null,"login successfull", "message", JOptionPane.INFORMATION_MESSAGE);
					new casemenu();
					}
					else							JOptionPane.showInternalMessageDialog(null,"enter valid number", "error!", JOptionPane.ERROR_MESSAGE);					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					          14
                                                       e1.printStackTrace();
				}				
			}	    	
	    });

	    b2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
                             try {
                                      new casestudy2();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}	   
	   });    
	    b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					new casestudy5();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				                           15
                                               }
			}    	
	    });	    
	    l3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new casehome();
			}
	    });
	    jf.setLayout(null);
	    jf.add(b1);
	    jf.add(b2);
	    jf.add( b3);
	    jf.add(label1);
	    jf.add(label2);
	    jf.add(l3);
	    jf.add(l2);
	    jf.add(p6);
	    jf.add(p5);
	    jf.add(p1);
	    jf.add(jl1);
	    jf.add(t1);
	    jf.add(t2);
                jf.setTitle("Login");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setSize(1500,1500);      
	}
                                                              16
                     public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new casestudy7();
	}
}
