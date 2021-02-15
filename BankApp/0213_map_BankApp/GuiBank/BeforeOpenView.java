package GuiBank;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BeforeOpenView extends JFrame {
	public BeforeOpenView(HashMap bankBookMap, Client client, String bankKind) {
		//group.put(client.getBankBookNumber(), client);
		setTitle("비트 인터넷 뱅킹");
		setBounds(700, 300, 700, 385);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(9, 2, 10, 10));

		JButton openbtn = new JButton("YES");
		JButton	backbtn = new JButton("NO");

//	통장 개설
		openbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String bankBookNumber = makeBankBookNumber();
				client.setBankBookNumber(bankBookNumber);
				
				bankBookMap.put(bankKind, new HashMap());
				HashMap group = (HashMap) bankBookMap.get(bankKind);
				group.put(client.getBankBookNumber(), client);
				JOptionPane.showMessageDialog(null, client.getId() + "님의 회원가입이 완료되었습니다.");
				new Bank(bankBookMap);
				setVisible(false);
			}
		});

//	뒤로 가기
		backbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new OpenBankInput(bankBookMap, bankKind);
			}
		});

		JLabel join = new JLabel("입력하신 정보로 통장을 개설하시겠습니까?");
		JLabel nmlb = new JLabel("이름" + client.getName());
		JLabel idlb = new JLabel("ID:" + client.getId());
		JLabel pwlb = new JLabel("PW:" + client.getPassword());
		JLabel pnlb = new JLabel("전화번호:" + client.getPhoneNumber());
		JLabel addrlb = new JLabel("주소:" + client.getAddress());
		JLabel mnlb = new JLabel("금액:" + client.getMoney());

		join.setHorizontalAlignment(JLabel.CENTER);
		nmlb.setHorizontalAlignment(JLabel.CENTER);
		idlb.setHorizontalAlignment(JLabel.CENTER);
		pwlb.setHorizontalAlignment(JLabel.CENTER);
		pnlb.setHorizontalAlignment(JLabel.CENTER);
		addrlb.setHorizontalAlignment(JLabel.CENTER);
		mnlb.setHorizontalAlignment(JLabel.CENTER);

		c.add(join);
		c.add(nmlb);
		c.add(idlb);
		c.add(pwlb);
		c.add(pnlb);
		c.add(addrlb);
		c.add(mnlb);
		c.add(openbtn);
		c.add(backbtn);
		setVisible(true);
	}
	
	public String makeBankBookNumber() {
		String k = "";
		for (int j = 0; j < 2; j++) {
			int a = (int) (1000000 * Math.random());
			k += Integer.toString(a);
			if (j == 0) {
				k += "-";
			}
		}
		return k;
	}
}