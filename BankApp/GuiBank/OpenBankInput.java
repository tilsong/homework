package GuiBank;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class OpenBankInput extends JFrame {
	private static Client client;

	public OpenBankInput(Client client) {
		setTitle("비트 인터넷 뱅킹");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new GridLayout(8, 2, 10, 10));
		JTextField name = new JTextField();
		JTextField id = new JTextField();
		JPasswordField pw = new JPasswordField();
		JTextField phoneNumber = new JTextField();
		JTextField address = new JTextField();
		JTextField money = new JTextField();
		
		JButton openbtn = new JButton("뒤로 가기");
		JButton exitbtn = new JButton("입력 완료");

//		뒤로 가기
		openbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new OpenBank(client);
				setVisible(false);
			}
		});
		
//		입력 완료
		exitbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				client.setName(name.getText());
				client.setId(id.getText());
				client.setPassword(pw.getText());
				client.setPhoneNumber(name.getText());
				client.setAddress(address.getText());
				client.setMoney(money.getText());

				
				new BeforeOpenView(client);
				setVisible(false);
			}
		});
		JLabel nmlb= new JLabel("이름:");
		JLabel idlb= new JLabel("ID:");
		JLabel pwlb=new JLabel("PW:"); 
		JLabel pnlb= new JLabel("전화번호:");
		JLabel addrlb=new JLabel("주소:");
		JLabel mnlb= new JLabel("예금액:");
		nmlb.setHorizontalAlignment(JLabel.CENTER);
		idlb.setHorizontalAlignment(JLabel.CENTER);
		pwlb.setHorizontalAlignment(JLabel.CENTER);
		pnlb.setHorizontalAlignment(JLabel.CENTER);
		addrlb.setHorizontalAlignment(JLabel.CENTER);
		mnlb.setHorizontalAlignment(JLabel.CENTER);
		c.add(nmlb);
		c.add(name);
		c.add(idlb);
		c.add(id);
		c.add(pwlb);
		c.add(pw);
		c.add(pnlb);
		c.add(phoneNumber);
		c.add(addrlb);
		c.add(address);
		c.add(mnlb);
		c.add(money);
		c.add(openbtn);
		c.add(exitbtn);
		setVisible(true);
		
	}

}
