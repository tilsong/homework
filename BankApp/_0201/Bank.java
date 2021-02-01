package _0201;



import java.util.Scanner;

public class Bank {
		Scanner sc = new Scanner(System.in);
		
		//�� �ʿ��� ������
		private String name; //�̸�
		//		private int number; //����ȣ
		private String id; //���̵�
		private String password; //��й�ȣ


		private String phoneNumber; //��ȭ��ȣ
		private String address; //�ּ�
		private String bankBookNumber; //���� ���� ��ȣ
		private double money; // ���� ���� �ܾ�
		private String loanBankBookNumber;//���� ���� ��ȣ
		

		private double loanMoney; //���� ���� �ܾ�
		private boolean key; // �α��� ����

		//getter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public String getPassword() {
			return password;
		}
		public String getLoanBankBookNumber() {
			return loanBankBookNumber;
		}
		public String getBankBookNumber() {
			return bankBookNumber;
		}
		
		//���� ���� ����
		public Bank openBank() {
			//�̹� ���� ���°� �ִ��� Ȯ��
//			if(this.bankBookNumber!=null) {
//				System.out.println("�̹� ���� ���°� �ֽ��ϴ�.");
//				return null;
//			}
			
			//���� ���°� �ְ� �α����� �����̸� �Է� ���� 
//			if(this.loanBankBookNumber==null&&key==false) {
				System.out.println("�̸� :"); this. name = sc.next();
				System.out.println("���ͳ� ��ŷ id :"); this.id = sc.next();
				System.out.println("��й�ȣ :"); this.password = sc.next();
				System.out.println("��ȭ��ȣ :"); this.phoneNumber = sc.next();
				System.out.println("�ּ� :"); this.address = sc.next();
//			}
			
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
			System.out.println("���� ������ �����Ǿ����ϴ�.");
			return this;
		}
		
		//���� ���� ����
		public void openLoanBank() {
//			//�̹� ���� ���°� �ִ��� Ȯ��
//			if(loanBankBookNumber!=null) {
//				System.out.println("�̹� ���� ���°� �ֽ��ϴ�.");
//				return;
//			}
//			//���� ���°� ���� �α��� ���°� �ƴϸ� ���� �Է� 
//			if(bankBookNumber==null&&key==false) {
				System.out.println("�̸� :"); this.name = sc.next();
				System.out.println("���ͳ� ��ŷ id :"); this.id = sc.next();
				System.out.println("��й�ȣ :"); this.password = sc.next();
				System.out.println("��ȭ��ȣ :"); this.phoneNumber = sc.next();
				System.out.println("�ּ� :"); this.address = sc.next();
//			}
			
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
		

		
		//���� ���� ���� ����
		public void bankBookView() {
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
		}
		
		//���� ���� ���� ����
		public void loanBankBookView() {

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
		}
		
}