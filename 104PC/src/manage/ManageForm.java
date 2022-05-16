package manage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ManageForm extends JFrame{
	
	private Container cp;
	private JButton[] btn;
	private Image image;
	private Image changeimage;
	private ImageIcon changeIcon;
	
	public ManageForm() {
		//폼 세팅
		setTitle("관리자");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setLocation(this.getX() - 900,this.getY() - 520);
		setSize(1800, 1000);
		setLayout(null);
		setResizable(false);
		
		
		//컨텐트 팬 추가
		cp = this.getContentPane();
		cp.setBackground(Color.gray);
		cp.setLayout(null);
		
		AddButton();
		
		cp.setFocusable(true);
		cp.requestFocus();
		setVisible(true);
	}
	
	private void AddButton() { // 버튼 추가 메소드
		//이미지 아이콘 세팅
		ImageIcon[] imgIcon = {
				new ImageIcon("button_image/회원관리.png"),
				new ImageIcon("button_image/주문목록.png"),
				new ImageIcon("button_image/매출관리.png"),
				new ImageIcon("button_image/재고관리.png")};
		
		//버튼 배열 생성
		btn = new JButton[4];
		//버튼 추가
		for (int i = 0; i < btn.length; i++) {
			//이미지 아이콘 크기 변환
			image = imgIcon[i].getImage();
			changeimage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
			changeIcon = new ImageIcon(changeimage);
			
			//이미지 아이콘 추가
			btn[i] = new JButton(changeIcon);
			btn[i].setIcon(changeIcon);
			//btn[i].setBorderPainted(false);
			btn[i].setContentAreaFilled(false);
			btn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
			
			//각 버튼 위치 설정
			btn[i].setBounds(200 + (400 * i), 800, 150, 150);
			cp.add(btn[i]);
		}		
	}
}
