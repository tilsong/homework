package bankApp;

import java.util.Scanner;
//정보 보기
public class InfoView {
	Scanner sc = new Scanner(System.in);
	MemberInfo open = new MemberInfo();

	// 멤버 정보 보기
	public void memberInfoView(int key) {

		System.out.println("내 정보 보기");
		System.out.println("이름: " + open.getName(key));
		System.out.println("전화번호: " + open.getPhoneNumber(key));
		if (open.getBankBookNumber(key) == null) {
			System.out.print("");
		} else {
			System.out.println("예금 통장 번호 :" + open.getBankBookNumber(key));
		}
		if (open.getLoanPassbookNumber(key) == null) {
			System.out.print("");
		} else {
			System.out.println("대출 통장 번호 :" + open.getLoanPassbookNumber(key));
		}
		System.out.println("잔액 :" + open.getLoanMoney(key));
		System.out.println("뒤로가기(아무 키나 누르세요)");
		String back = sc.next();
		;
		return;
	}

	//예금 계좌 보기
	public void bankBookView(int key) {
		System.out.println(open.getName(key) + "님의 예금 계좌 보기");
		System.out.println("================");
		System.out.println("이름: " + open.getName(key));
		System.out.println("예금 통장 번호 :" + open.getBankBookNumber(key));
		System.out.println("잔액" + (int) open.getCreditMoney(key) + "원");
		System.out.println("월 받는 금액" + (int) (open.getCreditMoney(key) * 102 / 100 / 12) + "원");
		System.out.println("최종적으로 받는 금액" + (int) (open.getCreditMoney(key) * 102 / 100) + "원");
		System.out.println("================");
		System.out.println("뒤로가기(아무 키나 누르세요)");
		String back = sc.next();
		return;
	}

	// 대출 계좌 보기
	public void loanPassBookView(int key) {
		System.out.println(open.getName(key) + "님의 예금 계좌 보기");
		System.out.println("================");
		System.out.println("이름: " + open.getName(key));
		System.out.println("예금 통장 번호 :" + open.getLoanPassbookNumber(key));
		System.out.println("대출금" + (int) open.getLoanMoney(key) + "원");
		System.out.println("최종적으로 값아야 하는 금액" + (int) (open.getLoanMoney(key) * 102 / 100) + "원");
		System.out.println("월마다 갚아야 하는 금액" + (int) (open.getLoanMoney(key) * 102 / 100 / 12) + "원");
		System.out.println("================");
		System.out.println("뒤로가기(아무 키나 누르세요)");
		String back = sc.next();
		return;
	}
}