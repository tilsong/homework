package _0201;

import java.util.List;
import java.util.Scanner;

public class Log {
	Scanner sc = new Scanner(System.in);
	
	//�α��� �޼ҵ�
	public int logIn(int index, List<Bank> list) {
		if(index==-1) {
			System.out.println("���ͳ� ��ŷ ID :"); 
			String id = sc.next();
			System.out.println("��й�ȣ :"); 
			String password = sc.next();
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getId().equals(id)) {
					if(list.get(i).getPassword().equals(password)) {
						 System.out.println("�α��� ����");
						 return i;
					}
					System.out.println("��й�ȣ ����ġ");
					return -1;
				}
			}
			if(index==-1) {
				System.out.println("�α��� ����");
				return -1;
			}
		} else {
			System.out.println("�̹� �α��� �����Դϴ�.");
			return index;
		}
		return index;
	}
	
	//�α׾ƿ� �޼ҵ�
	public int logOut(int index) {
		if(index!=-1) {
		System.out.println("�α׾ƿ��Ͻðڽ��ϱ�?(Y/N)");
		char check = sc.next().charAt(0);
		
		if(check=='Y'||check=='y') {
			System.out.println("�α׾ƿ��Ǿ����ϴ�.");
			return -1;
		} else {
			System.out.println("�α׾ƿ� ���");
			return index;
		}
		} else {
			System.out.println("�α��� ���°� �ƴմϴ�.");
			return -1;
		}
	}
}







