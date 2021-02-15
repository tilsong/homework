package GuiBank;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class OpenBank extends JFrame {
	private static Client client;

	public OpenBank(Client client) {
		setTitle("비트 인터넷 뱅킹");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(4, 2, 10, 10));


		JLabel label = new JLabel("개설할 계좌를 선택하십시오");
		JButton openbtn = new JButton("예금 통장");
		JButton exitbtn = new JButton("뒤로 가기");

//		신규 계좌 개설 이벤트처리
		openbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new OpenBankInput(client);
				setVisible(false);
			}
		});
		
//		종료 버튼
		exitbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Bank(client);
				setVisible(false);
			}
		});
		c.add(label);
		c.add(openbtn);
		c.add(exitbtn);
		setVisible(true);
		
	}

}
