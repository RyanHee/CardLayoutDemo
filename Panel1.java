import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Panel1 extends JPanel implements ActionListener{
	private CardLayout cl;
	private JButton b1;
	private JButton b2;
	
	public Panel1(CardLayout c) {
		cl=c;
		b1=new JButton("button1");
		b2=new JButton("button2");
		setLayout(null);
		b1.addActionListener(this);

		b2.addActionListener(this);
		setBackground(Color.black);
		//currPanel=p;
		add(b1);
		add(b2);
		b1.setBounds(200,100,200,100);
		b2.setBounds(200,500,200,100);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==b1) {
			System.out.println(1);
			cl.show(Constants.PANEL, "p1");
		}
		if (e.getSource()==b2) {
			System.out.println(2);
			cl.show(Constants.PANEL, "p2");
		}
	}
	

	
	
}
