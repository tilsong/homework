package bankApp;
import java.util.Scanner;
//���� ����
public class OpenView {
	MemberInfo open = new MemberInfo();
	
	//���� ���� ����
	public void openView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���¸� �����մϴ�.");
		System.out.println("==========");
		System.out.println("���� ���� �Է�");
		System.out.println("==========");
		System.out.println("�̸� :");
		String name = sc.next();
		System.out.println("���ͳ� ��ŷ id :");
		String id = sc.next();
		System.out.println("��й�ȣ :");
		String password = sc.next();
		System.out.println("��ȭ��ȣ :");
		String phoneNumber = sc.next();
		System.out.println("�ּ� :");
		String address = sc.next();
		System.out.println("���ݾ� :");
		double credit = sc.nextDouble();
		
		//���� ����
		open.signUpOpenBankBook(name, id, password, phoneNumber, address, credit);
	}
	//���� ���� ����
	public void openLoanView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���¸� �����մϴ�.");
		System.out.println("==========");
		System.out.println("���� ���� �Է�");
		System.out.println("==========");
		System.out.println("�̸� :");
		String name = sc.next();
		System.out.println("���ͳ� ��ŷ id :");
		String id = sc.next();
		System.out.println("��й�ȣ :");
		String password = sc.next();
		System.out.println("��ȭ��ȣ :");
		String phoneNumber = sc.next();
		System.out.println("�ּ� :");
		String address = sc.next();
		System.out.println("���� �ݾ� :");
		double loanMoney = sc.nextDouble();
		
		//���� ����	
		open.signUpOpenLoanPassBook(name, id, password, phoneNumber, address, loanMoney);
	}
}
