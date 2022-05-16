package PC;

import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Singup1 extends JFrame implements ActionListener, ItemListener {
	

	private Container c;
	private JCheckBox jcb1;
	private JLabel jl1;
	private JTextField jtf1;
	private JCheckBox jcb2;
	private JTextField jtf2;
	private JLabel jl2;
	private JButton jbtn1;
	private JButton jbtn2;

	public Singup1() {
		setTitle("약관 동의");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(560,130);
		setSize(800, 850);
		setLayout(null);
		setResizable(false);
		
        Font myFont1 = new Font("굴림체", Font.BOLD, 24);
		
		c = this.getContentPane();
		
		jl1 = new JLabel("서비스 약관 동의");
		jl1.setBounds(150, 130, 200, 50);
		jl1.setFont(myFont1);
		
		
		jcb1 = new JCheckBox();
		jcb1.setBounds(130, 140, 25, 25);
		
		jtf1 = new JTextField();
		jtf1.setBounds(130, 170, 500, 200);
		
		jl2 = new JLabel("개인정보 수집 및 이용 동의");
		jl2.setBounds(150, 430, 400, 50);
		jl2.setFont(myFont1);
		
		
		jcb2 = new JCheckBox();
		jcb2.setBounds(130, 440, 25, 25);
		
		jtf2 = new JTextField();
		jtf2.setBounds(130, 470, 500, 200);
		
		jbtn1 = new JButton("계속하기");
		jbtn1.setBounds(330, 710, 100, 50);
		

		jbtn2 = new JButton("닫기");
		jbtn2.setBounds(700, 760, 59, 40);

		jbtn2.addActionListener(this);
		
		c.add(jl1);
		c.add(jcb1);
		c.add(jtf1);
		c.add(jl2);
		c.add(jcb2);
		c.add(jtf2);
		c.add(jbtn1);
		c.add(jbtn2);
		
		jcb2.addItemListener(this);
		c.setFocusable(true);
		c.requestFocus();
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtn2) {
			dispose();
		} 
		
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}
}