package bankApp;

import java.util.Scanner;

public class Bank {
		Scanner sc = new Scanner(System.in);
		
		//�� �ʿ��� ������
		private String name; //�̸�
		private int number; //����ȣ
		private String id; //���̵�
		private String password; //��й�ȣ
		private String phoneNumber; //��ȭ��ȣ
		private String address; //�ּ�
		private String bankBookNumber; //���� ���� ��ȣ
		private String loanBankBookNumber; //���� ���� ��ȣ
		private double money; // ���� �ܾ�
		private double loanMoney;//���� ���� �ܾ�
		private boolean key; // �α��� ����
		
		//getter

		//���� ���� ����
		public void openBank() {
			//�̹� ���� ���°� �ִ��� Ȯ��
			if(this.bankBookNumber!=null) {
				System.out.println("�̹� ���� ���°� �ֽ��ϴ�.");
				return;
			}
			
			//���� ���°� �ְ� �α����� �����̸� �Է� ���� 
			if(this.loanBankBookNumber==null&&key==false) {
				System.out.println("�̸� :"); this. name = sc.next();
				System.out.println("���ͳ� ��ŷ id :"); this.id = sc.next();
				System.out.println("��й�ȣ :"); this.password = sc.next();
				System.out.println("��ȭ��ȣ :"); this.phoneNumber = sc.next();
				System.out.println("�ּ� :"); this.address = sc.next();
			}
			
			//���ݾ� �Է�
			System.out.println("���ݾ� :"); this.money = sc.nextDouble();
			
			//���� ��ȣ �����
			String k = "";
			for (int j = 0; j < 2; j++) {
				int a = (int) (1000000 * Math.random());
				k += Integer.toString(a);
				if (j == 0) {
					k += "-";
				}
			}
			this.bankBookNumber = k;
		}
		
		//���� ���� ����
		public void openLoanBank() {
			//�̹� ���� ���°� �ִ��� Ȯ��
			if(loanBankBookNumber!=null) {
				System.out.println("�̹� ���� ���°� �ֽ��ϴ�.");
				return;
			}
			//���� ���°� ���� �α��� ���°� �ƴϸ� ���� �Է� 
			if(bankBookNumber==null&&key==false) {
				System.out.println("�̸� :"); this.name = sc.next();
				System.out.println("���ͳ� ��ŷ id :"); this.id = sc.next();
				System.out.println("��й�ȣ :"); this.password = sc.next();
				System.out.println("��ȭ��ȣ :"); this.phoneNumber = sc.next();
				System.out.println("�ּ� :"); this.address = sc.next();
			}
			
			//����� �Է�
			System.out.println("����� :"); this.loanMoney = sc.nextDouble();
					
			//���� ��ȣ �����
			String k = "";
			for (int j = 0; j < 2; j++) {
			int a = (int) (1000000 * Math.random());
			k += Integer.toString(a);
				if (j == 0) {
					k += "-";
				}
			}		
			this.loanBankBookNumber = k;
		}		
		
		//�α��� �ϱ�
		public Boolean login() {
			System.out.println("���ͳ� ��ŷ ID :"); String id = sc.next();
			if(!(id.equals(this.id))) {
				return this.key;
			}
			System.out.println("��й�ȣ :"); String password = sc.next();
			if(!(password.equals(this.password))) {
				return this.key;
			}
			return this.key = true;
			
		}
		//�α׾ƿ� �ϱ�
		public Boolean logOut() {
			System.out.println("�α׾ƿ��Ͻðڽ��ϱ�?(Y/N)");
			String log = sc.nextLine();
			
			if(log=="Y"||log=="y") {
				System.out.println("�α׾ƿ��Ǿ����ϴ�.");
				this.key=false;
				return false;
			}
			
			return false;
			
		}
		
		//���� ���� ���� ����
		public void bankBookView() {
			if(this.key==true) {
				System.out.println(this.name + "���� ���� ���� ����");
				System.out.println("================");
				System.out.println("�̸�: " + this.name);
				System.out.println("���� ���� ��ȣ :" + this.bankBookNumber);
				System.out.println("�ܾ�" + this.money + "��");
				System.out.println("�� ���� �޴� �ݾ�" + (int) (this.money * 2 / 100 / 12)+ "��"); //�� 2% ���ڸ� 12������ ����
				System.out.println("���������� �޴� �ݾ�" + (int) (this.money * 2 / 100) + "��");//�� 2% ����
				System.out.println("================");
				System.out.println("�ڷΰ���(�ƹ� Ű�� ��������)");
				String back = sc.next();
			} else {
				System.out.println("���� �α����Ͻʽÿ�");
			}
		}
		
		//���� ���� ���� ����
		public void loanBankBookView() {
			if(this.key==true) {
				System.out.println(this.name + "���� ���� ���� ����");
				System.out.println("================");
				System.out.println("�̸�: " + this.name);
				System.out.println("���� ���� ��ȣ :" + this.loanBankBookNumber);
				System.out.println("�ܾ�" + this.loanMoney + "��");
				System.out.println("�� ���� ���ƾ� �ϴ� �ݾ�" + (int) (this.loanMoney * 102 / 100 / 12)+ "��"); //�� 2% ���ڸ� 12������ ����
				System.out.println("���������� ���ƾ� �ϴ� �ݾ�" + (int) (this.loanMoney * 102 / 100) + "��");//�� 2% ����
				System.out.println("================");
				System.out.println("�ڷΰ���(�ƹ� Ű�� ��������)");
				String back = sc.next();
			} else {
				System.out.println("���� �α����Ͻʽÿ�");
			}
		}
		
}
















