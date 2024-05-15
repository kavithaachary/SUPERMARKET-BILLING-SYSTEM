package casestudy;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class casehome {
  public casehome() {
		// TODO Auto-generated constructor stub
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(1500,1000);
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();	
		p1.setBackground(new Color(0xCC9900));
		p1.setBounds(0, 0, 1500, 200);
		p2.setBackground(new Color(0x2d3c50));
		p2.setBounds(0, 200, 1500,1300);
	 JLabel l1=new JLabel("WELCOME");
     	l1.setFont(new Font("Arial Black",Font.BOLD,65));	
       l1.setForeground(Color.darkGray);	
      l1.setBounds(400, 50, 600, 200);
       JLabel l2=new JLabel("Login to our online store and start shopping your favourite products ");
		l2.setFont(new Font("Arial Black",Font.BOLD,25));	
		l2.setForeground(Color.darkGray);
		l2.setBounds(260, 50, 1200, 200);
		ImageIcon i1=new ImageIcon("supp1.png");
		JLabel label1 = new JLabel(); 
 		label1.setIcon(i1);
 		label1.setBounds(40, 30, 100,100);
 		ImageIcon i2=new ImageIcon("cus1.jpg");
		JLabel label2 = new JLabel(); 
 		label2.setIcon(i2);
 		label2.setBounds(400, 300, 80, 75);	
 		ImageIcon i3=new ImageIcon("DDD1.jpg");
		JLabel label3 = new JLabel(); 
 		label3.setIcon(i3);
 		label3.setBounds(400, 505, 80, 67);
	
		JButton b1=new JButton("Login as customer");
		b1.setFont(new Font("Arial Black",Font.BOLD,20));	
		b1.setBounds(500,300, 500,75);	
		JButton b2=new JButton("Login as Admin");
		b2.setFont(new Font("Arial Black",Font.BOLD,20));	
		b2.setBounds(500,500, 500,75);	
		                                          
                       JButton b3=new JButton("EXIT");
		b3.setBackground(Color.red);
		b3.setFont(new Font("Arial Black",Font.BOLD,20));	
		b3.setBounds(600,650, 300,50);
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
		               		jf.dispose();
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
		b2.addActionListener(new ActionListener() {
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
		jf.add(label2);
		jf.add(label3);
		jf.add(b5);
		jf.add(b2);
		jf.add(b1);
		jf.add(b3);
		p1.add(label1);
		jf.add(l2);
		p1.add(l1);
		jf.add(p1);
		jf.add(p2);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		                                               
                 // TODO Auto-generated method stub
        new casehome();
	}
}
