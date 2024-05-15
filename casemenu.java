package casestudy;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class casemenu {
	float cos;
	int ij=0,i;
	String[] i12;
	int[] i13;
     float i22;
     String s22;
     int count=0;
     String[] s;
     JLabel[] l1,l2,l3 ;
	public casemenu() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated constructor stub
		JFrame jf=new JFrame("vegetables");		
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                                                 
		jf.setSize(1500,1500);
		int k=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mySql://localhost:3306/project","root","Kavitha@2003");
	    Statement st= conn.createStatement();
		ResultSet rs=st.executeQuery("select*from prod ");
	    
		Statement st1= conn.createStatement();
		ResultSet rs1=st1.executeQuery("select cost from prod ");
//		while(rs1.next()) {
//			System.out.println(rs1.getString(1));//}
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		p1.setBackground(new Color(0xCC9900));
		p1.setBounds(0, 0, 1500, 100);
		p2.setBackground(new Color(0x2d3c50));
		p2.setBounds(0, 100, 1500,1400);
		JPanel p3=new JPanel();
            	p3.setBackground(new Color(0x2d3c50));
		p3.setBounds(0, 0, 1500, 1500);
		p3.setVisible(false); 		
 		JLabel l12 = new JLabel("INVOICE"); 
  		l12.setBounds(290,150,100,100);
  		l12.setFont(new Font("Comic Sans MS",Font.BOLD,20));
 		l12.setVisible(false);		
//		JPanel p4=new JPanel();
//	    p4.setBackground(new Color(0x2d3c50));
//	   p4.setBounds(0, 0, 1500, 1500);
                                                              
 //	    p4.setVisible(false);		
  		ImageIcon i1=new ImageIcon("kkk.png");
 		JButton b2 = new JButton(); 
  		b2.setIcon(i1);
  		b2.setBounds(0,10,70,70);
  		b2.setBackground(new Color(0xCC9900));
  		b2.setFocusable(false);
  		b2.setFocusPainted(false);
  		b2.setBorderPainted(false);	
		JButton b1=new JButton("PLACEORDER");
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
	    	   s3[ij]="0"; }		
			i=0;
	        while(rs.next())
	        {           	
	        	s1[i]=rs.getString(2);               	
	        	s2[i]=rs.getString(3);
	        	s3[i]=rs.getString(5);
	        	                                   
                          i++;
	        	count++;
	        }        
			 l1=new JLabel[s1.length];
		     l2=new JLabel[s1.length];
		     l3=new JLabel[s1.length];	        
	        JTextField[] c1; 
          c1=new JTextField[30];
          String[] s= {"0","1","2","3"};
          k=0;
	        for ( ij = 0;ij<s1.length;ij++) {
				if((s1[ij].equals("0"))) {}
				else {
						c1[ij]=new JTextField();
						c1[ij].setBounds(640, 241+ij*30,80,60);

						c1[ij].setSize(80, 20);
                    if (ij>=6) {
                   	  c1[ij].setBounds(1300,(30*k)+60,80,60);
                   	  c1[ij].setSize(80, 20);
                    }
					k++;
				}
			}
	        JLabel l4=new JLabel("PRODUCTS");
	         l4.setFont(new Font("Arial Black",Font.BOLD,25));
	         l4.setForeground(Color.white);
	 		l4.setBounds(120, -50, 600, 500); 		
	 		JLabel l5=new JLabel("QNT");
	                                                        
         l5.setFont(new Font("Arial Black",Font.BOLD,25));
	        l5.setForeground(Color.white);
			l5.setBounds(430, -50, 600, 500);
			JLabel l6=new JLabel("COST");
	        l6.setFont(new Font("Arial Black",Font.BOLD,25));
	        l6.setForeground(Color.white);
			l6.setBounds(525, -50, 600, 500);
             k=0;             
             JLabel l7=new JLabel("PRODUCTS");
	         l7.setFont(new Font("Arial Black",Font.BOLD,25));
	         l7.setForeground(Color.white);
	 		l7.setBounds(770, -50, 600, 500);
	 		l7.setVisible(false);
	 		JLabel l8=new JLabel("QNT");
	        l8.setFont(new Font("Arial Black",Font.BOLD,25));
	        l8.setForeground(Color.white);
			l8.setBounds(1080, -50, 600, 500);
			l8.setVisible(false);
			JLabel l9=new JLabel("COST");
	        l9.setFont(new Font("Arial Black",Font.BOLD,25));
	        l9.setForeground(Color.white);
			l9.setBounds(1190, -50, 600, 500);
			l9.setVisible(false);
             k=0;           
             JLabel l10=new JLabel("MENU");
    	     l10.setFont(new Font("Arial Black",Font.BOLD,44));
    	     l10.setForeground(Color.white);
    	     p1.add(l10);    	     
     		ImageIcon i6=new ImageIcon("kk2.png");
      		                                
                    JButton b4 = new JButton(); 
       		b4.setIcon(i6);
       		b4.setBounds(0,20,70,70);
       		b4.setBackground(new Color(0x2d3c50));
       		b4.setFocusable(false);
       		b4.setFocusPainted(false);
       		b4.setBorderPainted(false);
            b4.setVisible(false);           
	     for (i=0;i<s1.length;i++) {
	         l1[i]=new JLabel(s1[i]);
	         l1[i].setFont(new Font("Comic Sans MS",Font.BOLD,14));
	         l1[i].setForeground(new Color(0xCC9900));
			 l1[i].setBounds(140, 30*i, 600, 500);
			 l2[i]=new JLabel(s2[i]);
	         l2[i].setFont(new Font("Comic Sans MS",Font.BOLD,14));
	         l2[i].setForeground(new Color(0xCC9900));
	   		 l2[i].setBounds(540, (30*i)+2, 600, 500);
	   		 l3[i]=new JLabel(s3[i]);
	         l3[i].setFont(new Font("Comic Sans MS",Font.BOLD,14));
	         l3[i].setForeground(new Color(0xCC9900));
	   		 l3[i].setBounds(440, (30*i)+2, 600, 500);	   		 
	   		 if (i>=6) {	   			 
	   			l1[i].setBounds(800, 30*k, 600, 500);
	   			l2[i].setBounds(1200, (30*k)+2, 600, 500);
	   			l3[i].setBounds(1100, (30*k)+2, 600, 500);
                k++;
                l8.setVisible(true);
                l7.setVisible(true);
                l9.setVisible(true);           
	   		                          
                          }	   		 
	       }	     
//	    for (i=0;i<count;i++) {
//	    	i12[i]=c1[i].getText();
//	    	i13[i]=Integer.parseInt(i12[i]);
//	    }	          
	     ImageIcon i2=new ImageIcon("bill.png");
	 		JLabel l11 = new JLabel(); 
	 		l11.setIcon(i2);
	  		l11.setBounds(100,100,700,700);
	  		l11.setVisible(false);  		
	     JLabel l15=new JLabel();
	     JLabel l16=new JLabel();
	        ImageIcon i3=new ImageIcon("girl.png");
	 		JLabel l17 = new JLabel(); 
	 		l17.setIcon(i3);
	  		l17.setBounds(1050,400,400,400);
	  		l17.setVisible(false);	  		
	  		ImageIcon i4=new ImageIcon("qr1.png");
	 		JLabel l18 = new JLabel(); 
	 		l18.setIcon(i4);
	  		l18.setBounds(700,200,500,500);
	  		l18.setVisible(false);  		
	 		JButton b3 =new JButton(); 		 
	 		JLabel l19= new JLabel("REFFERENCE ID:"); 
	  		l19.setBounds(770,630,300,50);
	  		l19.setFont(new Font("Comic Sans MS",Font.BOLD,20));
	        l19.setForeground(Color.white);
	  		l19.setVisible(false);		
	  		                     
                                 JTextField t1=new JTextField();
	  		t1.setBounds(755,680,200,30);
	  		t1.setVisible(false);	
	  		JButton b5 = new JButton("SUBMIT"); 
       		b5.setBounds(810,750,100,30);		
            b5.setVisible(false);
		b1.addActionListener(new ActionListener() {			 			
            		@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub			
				ij=0;
				i=0;
				 try {
					 cos=0;
					while(ij<count ){					    
					     if((c1[ij].getText()).equals("1")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
							  cos=cos+(i22);			   
						  }
						  else if(c1[ij].getText().equals("2")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
							  cos=cos+(i22*2);
						  }
						  else if(c1[ij].getText().equals("3")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
							  cos=cos+(i22*3);		
				                   		  
                                                                                      }
						  else if(c1[ij].getText().equals("4")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
							  cos=cos+(i22*4);			  
						  }
						  else if(c1[ij].getText().equals("5")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
							  cos=cos+(i22*5);			  
						  }
						  else if(c1[ij].getText().equals("6")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
							  cos=cos+(i22*6);			  
						  }
						  else if(c1[ij].getText().equals("7")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
							  cos=cos+(i22*7);		
					  }
						  else if(c1[ij].getText().equals("8")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
							  cos=cos+(i22*8);			
						  }
						  else if(c1[ij].getText().equals("9")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
					      37		  
                                                                           cos=cos+(i22*9);		
						  }
						  else if(c1[ij].getText().equals("10")){
							  s22= s2[ij];
							   i22=Float.parseFloat(s22);
							  cos=cos+(i22*10);			  
						  }			     
					     if(!(c1[ij].getText().isEmpty()))
					     {
					    	 System.out.println("bdgdh"+l1[ij].getText());
					    	 s[i]=l1[ij].getText();
					    	 System.out.println(s[i]);
					    	 i++;
					     }
					 ij++;
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				 
			   if(cos==0) {
				   JOptionPane.showInternalMessageDialog(null,"ADD ATLEAST ONE ITEM TO PLACE PODER", "message", JOptionPane.ERROR_MESSAGE);
			   }
			   else {				   
				System.out.println("sum is "+cos);
				l12.setVisible(true);
				p3.setVisible(true);
				b1.setVisible(false);
				            
                                                l17.setVisible(true);
				l18.setVisible(true);
				l19.setVisible(true);
				b2.setVisible(false);
				b4.setVisible(true);
		 		l11.setVisible(true);
				for (ij=0;ij<count;ij++) {
					l1[ij].setVisible(false);
				    l2[ij].setVisible(false);
				    l3[ij].setVisible(false);
				    c1[ij].setVisible(false);
				}			
				 l15.setText("  Total MRP  ");
	    	     l15.setFont(new Font("Comic Sans MS",Font.BOLD,40));
	    	     l15.setForeground(Color.black);
	    	     l15.setBounds(200,300,300, 50);
	    	     l15.setVisible(true);     
	    	     l16.setText(cos+"/-");
	    	     l16.setFont(new Font("Comic Sans MS",Font.BOLD,40));
	    	     l16.setForeground(Color.black);
	    	     l16.setBounds(265,400,200, 50);
	    	     l16.setVisible(true);
	    	     t1.setVisible(true);
	    	     b5.setVisible(true);    	 
			   }	
//			    p4.setVisible(true);
			}
		});		 
		b5.addActionListener(new ActionListener() {
			                           
                                           @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(t1.getText().isEmpty()) {
	    	    	  JOptionPane.showInternalMessageDialog(null,"ENTER VALID REFERRENCE ID", "message", JOptionPane.ERROR_MESSAGE);
	    	     }
	    	     else {
	    	    	 JOptionPane.showInternalMessageDialog(null,"PAYMENT SUCCESSFULL", "message", JOptionPane.INFORMATION_MESSAGE);	    	     
	    	     }
			}		
		});
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
//  		 for(ij=0;ij<i;ij++){
//			 if(s[ij].equals("")) {
//   	         l14[ij].setText(s[ij]);
//   	         jf.add(l14[ij]);
//   	         l14[ij].setVisible(true);
                                                                 
//			 }
//		 }	
		 for (i=0;i<count;i++) {
	        	if(s1[i].equals("0")) {}
	        	else{	        		
	                jf.add(c1[i]);
			        jf.add(l1[i]);
			        jf.add(l2[i]);
			        jf.add(l3[i]);		 
	        	}
		 }
		 jf.add(b5);
		 jf.add(t1);
		 jf.add(b4);
		 jf.add(l17);
		 jf.add(l15);
		 jf.add(l16);
		 jf.add(l12);
		 jf.add(l11);
		 jf.add(l18);
		 jf.add(l19);
		 jf.add(p3);
		 jf.add(l7);
	            jf.add(l8);
	            jf.add(l9);
		jf.add(b1);
		jf.add(l5);
		jf.add(l4);
                       jf.add(l6);
                                                                
                        jf.add(b2);
		jf.add(p1);
		jf.add(p2);
		jf.setSize(1500,1500);
		jf.setVisible(true);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     new casemenu();
	}
}
