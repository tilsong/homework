package bank_0202;

import java.util.List;
import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	
	public void mainView() {
		System.out.println("1. 신규 예금 계좌 개설");
		System.out.println("2. 신규 대출 계좌 개설");
		System.out.println("3. 로그인");
		System.out.println("4. 로그아웃");
		System.out.println("5. 나의 예금 계좌 보기");
		System.out.println("6. 나의 대출 계좌 보기");
		System.out.println("7. 종료하기");
	}
	//나의 예금 계좌 보기
	public void bankBookView(int index, List<Client> list) {
		if(index!=-1) {
			if(list.get(index).getBankBookNumber()==null) {
				System.out.println("예금 계좌가 없습니다."); return;
			}
			System.out.println(list.get(index).getName() + "님의 예금 계좌 보기");
			System.out.println("================");
			System.out.println("이름: " + list.get(index).getName());
			System.out.println("예금 통장 번호 :" + list.get(index).getBankBookNumber());
			System.out.println("잔액" + (int)list.get(index).getMoney() + "원");
			System.out.println("월 마다 받는 금액" + (int) (list.get(index).getMoney() * 2 / 100 / 12)+ "원"); //연 2% 이자를 12개월로 나눔
			System.out.println("최종적으로 받는 금액" + (int) (list.get(index).getMoney() * 2 / 100) + "원");//연 2% 이자
			System.out.println("================");
			System.out.println("뒤로가기(아무 키나 누르세요)");
			String back = sc.next();
		} else {
			System.out.println("먼저 로그인하십시오.");
		} 
	}
	
	//나의 대출 계좌 보기
	public void loanBankBookView(int index, List<Client> list) {
		if(index!=-1) {
			if(list.get(index).getLoanBankBookNumber()==null) {
				System.out.println("대출 계좌가 없습니다."); return;
			}
			System.out.println(list.get(index).getName() + "님의 대출 계좌 보기");
			System.out.println("================");
			System.out.println("이름: " + list.get(index).getName());
			System.out.println("대출 통장 번호 :" + list.get(index).getLoanBankBookNumber());
			System.out.println("잔액" + (int)list.get(index).getLoanMoney() + "원");
			System.out.println("월 마다 갚아야 하는 금액" + ((int) (list.get(index).getLoanMoney() * 102 / 100 / 12))+ "원"); //연 2% 이자를 12개월로 나눔
			System.out.println("최종적으로 갚아야 하는 금액" + (int) (list.get(index).getLoanMoney() * 102 / 100) + "원");//연 2% 이자
			System.out.println("================");
			System.out.println("뒤로가기(아무 키나 누르세요)");
			String back = sc.next();
		} else {
			System.out.println("먼저 로그인하십시오.");
		} 
	}
}
