package casestudy;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
                                                                  
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class casestudy12 {
public casestudy12() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		JFrame jf=new JFrame("vegetables");
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(1500,1500);
		int i,k=0,ij;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mySql://localhost:3306/project","root","Kavitha@2003");
	    Statement st= conn.createStatement();
		ResultSet rs=st.executeQuery("select*from prod ");
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		p1.setBackground(new Color(0xCC9900));
		p1.setBounds(0, 0, 1500, 100);
		p2.setBackground(new Color(0x2d3c50));
		p2.setBounds(0, 100, 1500,1400);
		JButton b1=new JButton("WANT TO MAKE ANY CHANGES???");
		b1.setBounds(450,700,550,30);
        b1.setBackground(new Color(0x2d3c50));
		b1.setBorderPainted(false);
		                                            
                        b1.setFocusable(false);
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Arial Black",Font.BOLD,20));
		String[] s1= new String[30];
	       String[] s2= new String[30];
	       String[] s3= new String[30];
	       for(  ij = 0;ij<30;ij++) {
	    	   s1[ij]="0";
	    	   s2[ij]="0";
	    	   s3[ij]="0";
	       }
		JLabel[] l1,l2,l3 ;
		 l1=new JLabel[s1.length];
	     l2=new JLabel[s1.length];
	     l3=new JLabel[s1.length];
			i=0;
	        while(rs.next())
	        {           	
	        	s1[i]=rs.getString(2);    	
	        	s2[i]=rs.getString(3);
	        	s3[i]=rs.getString(5);
	        	i++;
	        }
	        JLabel l4=new JLabel("PRODUCTS");
	         l4.setFont(new Font("Arial Black",Font.BOLD,25));
	         l4.setForeground(Color.white);
	 		l4.setBounds(150, -50, 600, 500);	
	 		JLabel l5=new JLabel("QNT");
	        l5.setFont(new Font("Arial Black",Font.BOLD,25));
	                                                               
                                   l5.setForeground(Color.white);
			l5.setBounds(460, -50, 600, 500);
			JLabel l6=new JLabel("COST");
	        l6.setFont(new Font("Arial Black",Font.BOLD,25));
	        l6.setForeground(Color.white);
			l6.setBounds(555, -50, 600, 500);
             k=0;        
             JLabel l7=new JLabel("PRODUCTS");
	         l7.setFont(new Font("Arial Black",Font.BOLD,25));
	         l7.setForeground(Color.white);
	 		l7.setBounds(820, -50, 600, 500);
	 		l7.setVisible(false);
	 		JLabel l8=new JLabel("QNT");
	        l8.setFont(new Font("Arial Black",Font.BOLD,25));
	        l8.setForeground(Color.white);
			l8.setBounds(1150, -50, 600, 500);
			l8.setVisible(false);
			JLabel l9=new JLabel("COST");
	        l9.setFont(new Font("Arial Black",Font.BOLD,25));
	        l9.setForeground(Color.white);
			l9.setBounds(1250, -50, 600, 500);
			l9.setVisible(false);
             k=0;     
             JLabel l10=new JLabel("MENU");
 	        l10.setFont(new Font("Arial Black",Font.BOLD,35));
 	        l10.setForeground(Color.white);
 	       p1.add(l10);
	     for (i=0;i<s1.length;i++) {
	         l1[i]=new JLabel(s1[i]);
	                                                    
                    l1[i].setFont(new Font("Comic Sans MS",Font.BOLD,14));
	         l1[i].setForeground(new Color(0xCC9900));
			 l1[i].setBounds(170, 30*i, 600, 500);
			 l2[i]=new JLabel(s2[i]);
	         l2[i].setFont(new Font("Comic Sans MS",Font.BOLD,14));
	         l2[i].setForeground(new Color(0xCC9900));
	   		 l2[i].setBounds(570, (30*i)+2, 600, 500);
	   		 l3[i]=new JLabel(s3[i]);
	         l3[i].setFont(new Font("Comic Sans MS",Font.BOLD,14));
	         l3[i].setForeground(new Color(0xCC9900));
	   		 l3[i].setBounds(470, (30*i)+2, 600, 500);	 
	   		 if (i>=10) {		 
	   			l1[i].setBounds(870, 30*k, 600, 500);
	   			l2[i].setBounds(1270, (30*k)+2, 600, 500);
	   			l3[i].setBounds(1170, (30*k)+2, 600, 500);
                k++;
                l8.setVisible(true);
                l7.setVisible(true);
                l9.setVisible(true);
	   		 }		 
	       }
		b1.addActionListener(new ActionListener() {	 			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					new casestudy9();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					     
                                                                  e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}		
		});
		 for (i=0;i<s1.length;i++) {
	        	if(s1[i].equals("0")) {}
	        	else{ 
			        jf.add(l1[i]);
			        jf.add(l2[i]);
			        jf.add(l3[i]);
	        	}
		 }
		 ImageIcon i4=new ImageIcon("kkk.png");
	 		JButton b5 = new JButton(); 
	  		b5.setIcon(i4);
	  		b5.setBounds(0,10,70,70);
	  		b5.setBackground(new Color(0xCC9900));
	  		b5.setFocusable(false);
	  		b5.setFocusPainted(false);
	  		b5.setBorderPainted(false);	   
	  		b5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						new casestudy13();
					           
                                                                 } catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}			
	  		});
	  	  jf.add(b5);
		jf.add(b1);
                       jf.add(l5);
		jf.add(l4);
                       jf.add(l6);
                      jf.add(l7);
		jf.add(l8);
                       jf.add(l9);
		jf.add(p1);
		jf.add(p2);
		jf.setVisible(true);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     new casestudy12();
	}
}
