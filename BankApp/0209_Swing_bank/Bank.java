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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Bank extends JFrame{

	public Bank(Client client) {
		setTitle("비트 인터넷 뱅킹");
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(4, 2, 10, 10));
		JLabel label = new JLabel("비트 인터넷 뱅킹");
		label.setFont(new Font("맑은고딕", Font.BOLD | Font.ITALIC, 20));
		JButton openbtn = new JButton("신규 계좌 개설");
		JButton exitbtn = new JButton("종      료");

//		신규 계좌 개설 이벤트처리
		openbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new OpenBank(client);
				setVisible(false);
			}
		});
		
//		종료 버튼
		exitbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		c.add(label);
		c.add(openbtn);
		c.add(exitbtn);
		setVisible(true);
				
	}
	public static void main(String[] args) {
		
		new Bank(new Client());
	}
}