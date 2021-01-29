package bankApp;

import java.util.Scanner;
//���� ����
public class InfoView {
	Scanner sc = new Scanner(System.in);
	MemberInfo open = new MemberInfo();

	// ��� ���� ����
	public void memberInfoView(int key) {

		System.out.println("�� ���� ����");
		System.out.println("�̸�: " + open.getName(key));
		System.out.println("��ȭ��ȣ: " + open.getPhoneNumber(key));
		if (open.getBankBookNumber(key) == null) {
			System.out.print("");
		} else {
			System.out.println("���� ���� ��ȣ :" + open.getBankBookNumber(key));
		}
		if (open.getLoanPassbookNumber(key) == null) {
			System.out.print("");
		} else {
			System.out.println("���� ���� ��ȣ :" + open.getLoanPassbookNumber(key));
		}
		System.out.println("�ܾ� :" + open.getLoanMoney(key));
		System.out.println("�ڷΰ���(�ƹ� Ű�� ��������)");
		String back = sc.next();
		;
		return;
	}

	//���� ���� ����
	public void bankBookView(int key) {
		System.out.println(open.getName(key) + "���� ���� ���� ����");
		System.out.println("================");
		System.out.println("�̸�: " + open.getName(key));
		System.out.println("���� ���� ��ȣ :" + open.getBankBookNumber(key));
		System.out.println("�ܾ�" + (int) open.getCreditMoney(key) + "��");
		System.out.println("�� �޴� �ݾ�" + (int) (open.getCreditMoney(key) * 102 / 100 / 12) + "��");
		System.out.println("���������� �޴� �ݾ�" + (int) (open.getCreditMoney(key) * 102 / 100) + "��");
		System.out.println("================");
		System.out.println("�ڷΰ���(�ƹ� Ű�� ��������)");
		String back = sc.next();
		return;
	}

	// ���� ���� ����
	public void loanPassBookView(int key) {
		System.out.println(open.getName(key) + "���� ���� ���� ����");
		System.out.println("================");
		System.out.println("�̸�: " + open.getName(key));
		System.out.println("���� ���� ��ȣ :" + open.getLoanPassbookNumber(key));
		System.out.println("�����" + (int) open.getLoanMoney(key) + "��");
		System.out.println("���������� ���ƾ� �ϴ� �ݾ�" + (int) (open.getLoanMoney(key) * 102 / 100) + "��");
		System.out.println("������ ���ƾ� �ϴ� �ݾ�" + (int) (open.getLoanMoney(key) * 102 / 100 / 12) + "��");
		System.out.println("================");
		System.out.println("�ڷΰ���(�ƹ� Ű�� ��������)");
		String back = sc.next();
		return;
	}
}