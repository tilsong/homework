package _0210;

import java.util.HashMap;
import java.util.Scanner;


class Bank {
	
	static void mainView(HashMap bankBookMap) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.신규|2.계좌보기|3.종료");
		String choose = sc.next();
		
		switch (choose) {
		case "1":
			OpenBank open= new OpenBank();
			open.addBank(bankBookMap);
			break;
			
		case "2":
			View view = new View();
			view.chooseBankList(bankBookMap);
			break;

		case "3":
			System.out.println("은행 프로그램이 종료되었습니다.");
			System.exit(0);
		}

	}
	public static void main(String[] args) {
		HashMap bankBookMap = new HashMap();
		mainView(bankBookMap);
	}
	
} // class
