package bank;

import java.util.List;
import java.util.Scanner;

public class View {

	//나의 예금 계좌 보기
	public char beforeOpenBankBookView(Client client) {
			Scanner sc = new Scanner(System.in);
			System.out.println(client.getName() + "님의 예금 계좌 보기");
			System.out.println("================");
			System.out.println("이름: " + client.getName());
			System.out.println("ID: " + client.getId());
			System.out.println("password: " + client.getPassword());
			System.out.println("전화번호 : " + client.getPhoneNumber());
			System.out.println("주소 : " + client.getAddress());
			System.out.println("예금액 : " + (int)client.getMoney() + "원");
			System.out.println("================");
			System.out.println("입력하신 정보로 개설하시겠습니까? (Y/N)");
			return sc.next().charAt(0);
	} 
}

