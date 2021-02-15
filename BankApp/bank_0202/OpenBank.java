package bank;

import java.util.List;
import java.util.Scanner;

public class OpenBank extends BankGo {
	Scanner sc = new Scanner(System.in);
	
	public void openBank(Client client) {
		System.out.println("어떤 계좌를 개설하시겠습니까?");
		System.out.println("1. 예금 계좌");
		System.out.println("2. 뒤로가기");
		
		String select = sc.next();
		
		if(select.equals("1")) {
			//예금 통장 생성
			OpenDeposit deposit = new OpenDeposit();
			deposit.openDeposit(client);
		} else {
			//bankGo로 가기
			new BankGo().go(client);
		}
	}
	

}
