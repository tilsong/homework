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

public class BeforeOpenView extends JFrame {
public BeforeOpenView(Client client) {
	
	setTitle("비트 인터넷 뱅킹");
	setSize(500,300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c= getContentPane();
	c.setLayout(new GridLayout(9, 2, 10, 10));

	
	JButton openbtn = new JButton("YES");
	JButton exitbtn = new JButton("NO");

//	통장 개설
	openbtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(null, client.getId() + "님의 회원가입이 완료되었습니다.");
			new Bank(client);
			setVisible(false);
		}
	});
	
//	뒤로 가기
	exitbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			new OpenBankInput(client);
			setVisible(false);
		}
	});
	
	JLabel join= new JLabel("입력하신 정보로 통장을 개설하시겠습니까?");
	JLabel nmlb= new JLabel("이름" + client.getName());
	JLabel idlb= new JLabel("ID:" + client.getId());
	JLabel pwlb=new JLabel("PW:" + client.getPassword()); 
	JLabel pnlb= new JLabel("전화번호:" + client.getPhoneNumber());
	JLabel addrlb=new JLabel("주소:" + client.getAddress());
	JLabel mnlb= new JLabel("예금액:" + client.getMoney());
	
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
	c.add(exitbtn);
	setVisible(true);
}
}