package PC;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class login extends JFrame implements ActionListener {
	
	private JLabel jid;
	private JLabel jpw;
	private TextField tid;
	private TextField tpw;
	private Container c;
	private JPanel p1;
	private JPanel p2;
	private JButton b_login;
	private JButton e_login;
	private JButton signup;
	private JButton find;
	private JButton restart;
	private Singup1 Singup;

	public login() {
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(260,130);
		setSize(1300, 800);
		setLayout(null);
		setResizable(false);
		
		c = this.getContentPane();
		
		ObjectAdd();
		
		c.setFocusable(true);
		c.requestFocus();
		setVisible(true);
	}
	
	public void ObjectAdd() {
		jid = new JLabel("아이디 : ");
		jid.setBounds(500, 635, 50, 50);
		c.add(jid);
		
		
		tid = new TextField();
		tid.setBounds(550, 640, 150, 40);
		c.add(tid);
		
		jpw = new JLabel("패스워드 : ");
		jpw.setBounds(487, 690, 60, 50);
		c.add(jpw);
		
		tpw = new TextField();
		tpw.setBounds(550, 695, 150, 40);
		c.add(tpw);
		
		
		b_login = new JButton("로그인");
		b_login.setBounds(710, 640, 80, 90);
		
		signup = new JButton("회원가입");
		signup.setBounds(800, 640, 90, 40);
		
		find = new JButton("ID찾기");
		find.setBounds(800, 690, 90, 40);
		
		restart = new JButton("새로고침");
		restart.setBounds(1170, 660, 84, 30);
		
		
		e_login = new JButton("종료");
		e_login.setBounds(1170, 700, 70, 30);
		
		b_login.addActionListener(this);
		e_login.addActionListener(this);
		signup.addActionListener(this);
		
		
		c.add(b_login);
		c.add(e_login);
		c.add(find);
		c.add(signup);
		c.add(restart);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == b_login) {

		} else if(obj == e_login) {
			System.exit(0);
		}else if(obj == signup) {
			Singup = new Singup1();
		}
	}
}

