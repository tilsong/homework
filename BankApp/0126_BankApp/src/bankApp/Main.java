package bankApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberInfo open = new MemberInfo();


		// ���� ȭ��
		Outter: while (true) {
			System.out.println("==================");
			System.out.println("�ȳ��ϼ��� ��Ʈ�����Դϴ�.");
			System.out.println("==================");
			System.out.println("1. �α���");
			System.out.println("2. �ű� ���� ����");
			System.out.println("3. ����");
			System.out.println("��ȣ�� �Է��ϼ���.(1/2/3)");
			int number = sc.nextInt();
			
			//1,2,3 ���� ��ȣ �Է��ϸ� �ٽ� �Է�

			if (!(number == 1 || number == 2 || number == 3)) {
				continue;
			}
			switch (number) {
			
			//1. �α���	
			case 1:
				//�α��� �޼��� -> ����
				System.out.println("�α����մϴ�.");
				System.out.println("���ͳ� ��ŷ id�� �Է��ϼ���");
				String id = sc.next();
				System.out.println("��й�ȣ�� �Է��ϼ���");
				String password = sc.next();
				//�α��� �޼ҵ� ȣ��, key�� ��ȯ
				int key = open.logIn(id, password);

				if (key != -1) {

					Outter1: while (true) {
						InfoView info = new InfoView();
						System.out.println("ȯ���մϴ� " + open.getName(key) + "��");
						System.out.println("1. �� ���� ����");
						System.out.println("2. ���� ���� ����");
						System.out.println("3. ���� ���� ����");
						System.out.println("0. ���� �޴��� ����");
						System.out.println("��ȣ�� �Է��ϼ���.(1/2/3/0)");
						
						int go = sc.nextInt();

						switch (go) {
							
						case 1:
							info.memberInfoView(key);
							break;

						case 2:
							info.bankBookView(key);
							break;

						case 3:
							info.loanPassBookView(key);
							break;
						case 0:
							break Outter1;
						}
					}
				}
				break;
			//�ű� ���� ����
			case 2:

				while (true) {
					System.out.println("1.���� ���� ����");
					System.out.println("2.���� ���� ����");
					System.out.println("��ȣ�� �Է��ϼ���(1/2)");
					int whichBook = sc.nextInt();

					if (whichBook == 1) {
						OpenView join = new OpenView();
						join.openView();
						break;
					} else if (whichBook == 2) {
						OpenView join1 = new OpenView();
						join1.openLoanView();
						break;
					} else {
						continue;
					}

				}
				break;
			
			//3. ����
			case 3:
				break Outter;
			}

		}
		System.out.println("���� ���α׷� ����");
	}

}
