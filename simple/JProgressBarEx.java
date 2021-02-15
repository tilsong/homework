package thread;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

class JProgressBarEx extends JFrame {
	JProgressBar progress1 = new JProgressBar();
	JProgressBar progress2 = new JProgressBar();
	JButton startbtn = new JButton("시작");
	int value = 0;
	

	//생성자 및 레이아웃
	public JProgressBarEx() {
		setLayout(new FlowLayout());
		progress1.setStringPainted(true);
		progress2.setStringPainted(true);
		// 배치
		add(startbtn);
		add(progress1);
		add(progress2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(900, 500, 400, 100);
		setVisible(true);
		eventHandle();
	
	}
	
	//게이지 보이게 하는 쓰레드 생성
	Thread thread = new Thread(new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i <= 100; i++) {
				value++;
				try {
					Thread.sleep(10);
					progress1.setValue(i);
					progress2.setValue(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	});
	
	//버튼 누르면 시작
	private void eventHandle() {
		startbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread.start();
			}
		});
	}
	
	//실행
	public static void main(String[] args) {
		new JProgressBarEx();// 생성자를 호출
	}

}


