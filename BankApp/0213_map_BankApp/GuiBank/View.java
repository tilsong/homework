package GuiBank;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View extends JFrame{

	 public View(HashMap bankBookMap) {
		setTitle("비트 인터넷 뱅킹");
		setBounds(700, 300, 700, 385);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(6, 2, 10, 10));
		JLabel label = new JLabel("계좌를 선택하십시오");
		label.setFont(new Font("맑은고딕", Font.BOLD | Font.ITALIC, 20));
		JButton allbtn = new JButton("모두 보기");
		JButton savingbtn = new JButton("적금 계좌 보기");
		JButton trustbtn = new JButton("신탁 계좌 보기");
		JButton loanbtn = new JButton("대출 계좌 보기");
		JButton backbtn = new JButton("뒤로가기");

//		모두 보기
		allbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AllView(bankBookMap);
				setVisible(false);
			}
		});
//		적금 계좌 보기
		savingbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//new View();
				//
				setVisible(false);
			}
		});
//		신탁 계좌 보기
		trustbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//new View();
				//
				setVisible(false);
			}
		});
//		대출 계좌 보기
		loanbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//new View();
				//
				setVisible(false);
			}
		});
//		뒤로가기
		backbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Bank(bankBookMap);
				setVisible(false);
			}
		});

		c.add(label);
		c.add(allbtn);
		c.add(savingbtn);
		c.add(trustbtn);
		c.add(loanbtn);
		c.add(backbtn);
		setVisible(true);
	}
}