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
import javax.swing.JTextField;


public class AllView extends JFrame {
	private JTextField textField = new JTextField();
	private String k = null;

	public AllView(HashMap bankBookMap) {
		setTitle("비트 인터넷 뱅킹");
		setBounds(700, 300, 700, 385);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(6, 2, 10, 10));
		JLabel label = new JLabel("모든 계좌");
		label.setFont(new Font("맑은고딕", Font.BOLD | Font.ITALIC, 20));

		JButton backbtn = new JButton("뒤로가기");

//		뒤로가기
		backbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Bank(bankBookMap);
				setVisible(false);
			}
		});

		Set set = bankBookMap.entrySet(); // 전체단위
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next(); // e = 적금, 신탁, 대출
			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator(); //
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

			while (subIt.hasNext()) {

				Map.Entry subE = (Map.Entry) subIt.next(); // subE = (client.name, client)
				String telNo = (String) subE.getKey();
				Client client = (Client) subE.getValue();

				k += client.toString();// 각 통장별로 바꿀 수 있나?현재 잔액: \"+client.getMoney()

			}

			System.out.println();
		}

		textField.setText(k);
		c.add(label);
		c.add(textField);
		c.add(backbtn);
		setVisible(true);
	}

}
