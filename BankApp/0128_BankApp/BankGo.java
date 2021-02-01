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
			System.out.println("안녕하세요 비트은행입니다.");
			System.out.println("==================");
			System.out.println("1. 신규 예금 계좌 개설");
			System.out.println("2. 신규 대출 계좌 개설");
			System.out.println("3. 로그인");
			System.out.println("4. 로그아웃");
			System.out.println("5. 나의 예금 계좌 보기");
			System.out.println("6. 나의 대출 계좌 보기");
			System.out.println("7. 종료하기");
			System.out.println("번호를 입력하세요.(1~6)");
			String select = sc.next();
			
			switch(select) {
				//신규 예금  계좌 개설
				case "1": bank.openBank();
				break;
				
				//신규 대출 계좌 개설
				case "2": bank.openLoanBank();
				break;
				
				//로그인
				case "3": 
					if(key==true) {
						System.out.println("이미 로그인 상태입니다.");
					} else {
				
						key=bank.login();
				
						if(key==true) {
							System.out.println("로그인이 성공했습니다.");
						} else {
							System.out.println("로그인이 실패했습니다.");
						}
					}
					break;
	
				case "4": 
					if(key==false) {
						System.out.println("로그인 상태가 아닙니다.");
					} else {
						key=bank.logOut();
					}	
					
				
					break;
	
						
				case "5": 
					
					if(key==true) {
						bank.bankBookView();
					} else {
						System.out.println("먼저 로그인하십시오.");
					}
					break;
				case "6": 
				
					if(key==true) {
						bank.loanBankBookView();
					} else {
						System.out.println("먼저 로그인하십시오.");
					}
					break;
					
				case "7" :
					break Outter;
					
				default : 
				
			}
		}
		System.out.println("은행 프로그램을 종료합니다.");
		
	}

}


