package GuiBank;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class OpenBank extends JFrame {
	
	
	public OpenBank(HashMap bankBookMap) {
		setTitle("비트 인터넷 뱅킹");
		setBounds(700, 300, 700, 385);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(5, 2, 10, 10));

		JLabel label = new JLabel("개설할 계좌를 선택하십시오");
		label.setFont(new Font("맑은고딕", Font.BOLD | Font.ITALIC, 20));
		JButton savingbtn = new JButton("적금 통장");
		JButton trustbtn = new JButton("신탁 통장");
		JButton loanbtn = new JButton("대출 통장");
		JButton backbtn = new JButton("뒤로 가기");

//		적금 계좌 개설 이벤트처리
		savingbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			//	Client client=clientInfoInput("적금");

				new OpenBankInput(bankBookMap,"적금");

				setVisible(false);
			}
		});
		
//		뒤로 가기
		backbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Bank(bankBookMap);
				setVisible(false);
			}
		});
		
		c.add(label);
		c.add(savingbtn);
		c.add(trustbtn);
		c.add(loanbtn);
		c.add(backbtn);
		setVisible(true);
		
	}
	


}
