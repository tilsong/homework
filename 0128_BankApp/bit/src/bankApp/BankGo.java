package bankApp;

import java.util.ArrayList;
import java.util.Scanner;

public class BankGo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean key=false;

		Bank bank = new Bank();
		
		
		Outter : while(true) {
			System.out.println("==================");
			System.out.println("�ȳ��ϼ��� ��Ʈ�����Դϴ�.");
			System.out.println("==================");
			System.out.println("1. �ű� ���� ���� ����");
			System.out.println("2. �ű� ���� ���� ����");
			System.out.println("3. �α���");
			System.out.println("4. �α׾ƿ�");
			System.out.println("5. ���� ���� ���� ����");
			System.out.println("6. ���� ���� ���� ����");
			System.out.println("7. �����ϱ�");
			System.out.println("��ȣ�� �Է��ϼ���.(1~6)");
			String select = sc.next();
			
			switch(select) {
				//�ű� ����  ���� ����
				case "1": bank.openBank();
				break;
				
				//�ű� ���� ���� ����
				case "2": bank.openLoanBank();
				break;
				
				//�α���
				case "3": 
					if(key==true) {
						System.out.println("�̹� �α��� �����Դϴ�.");
					} else {
				
						key=bank.login();
				
						if(key==true) {
							System.out.println("�α����� �����߽��ϴ�.");
						} else {
							System.out.println("�α����� �����߽��ϴ�.");
						}
					}
					break;
	
				case "4": 
					if(key==false) {
						System.out.println("�α��� ���°� �ƴմϴ�.");
					} else {
						key=bank.logOut();
					}	
					
				
					break;
	
						
				case "5": 
					
					if(key==true) {
						bank.bankBookView();
					} else {
						System.out.println("���� �α����Ͻʽÿ�.");
					}
					break;
				case "6": 
				
					if(key==true) {
						bank.loanBankBookView();
					} else {
						System.out.println("���� �α����Ͻʽÿ�.");
					}
					break;
					
				case "7" :
					break Outter;
					
				default : 
				
			}
		}
		System.out.println("���� ���α׷��� �����մϴ�.");
		
	}

}


