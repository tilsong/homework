package bank.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankGo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int index=-1;//로그인하기 전 인덱스는 -1
//		ArrayList로 만드는 것이 적당함

		List <Bank> list = new ArrayList<Bank>(); //Bank리스트 생성
		
		Outter : while(true) {

			System.out.println("1. 신규 예금 계좌 개설");
			System.out.println("2. 신규 대출 계좌 개설");
			System.out.println("3. 로그인");
			System.out.println("4. 로그아웃");
			System.out.println("5. 나의 예금 계좌 보기");
			System.out.println("6. 나의 대출 계좌 보기");
			System.out.println("7. 종료하기");

			String select = sc.next();
			
			switch(select) {
				//신규 예금 계좌 개설
				case "1": //로그아웃 상태이거나 대출 계좌가 없을 때 생성 가능
					if(index==-1) {
						list.add(new Bank());//리스트에 새로운 Bank인스턴스가 생성됨
						list.get(list.size()-1).openBank();
						System.out.println("현재 고객 수: "+ list.size()); //리스트에 추가된 고객 수 확인
					} //대출 통장은 있는데 예금 통장은 없을 때
					else if(list.get(index).getBankBookNumber()==null){ //NullPointException 방지
						list.add(new Bank());
						list.get(list.size()-1).openBank();
						System.out.println("현재 고객 수: "+ list.size()); 
					} else{
						System.out.println("이미 예금 통장이 개설되어있습니다.");
					}
					break;
				
				//신규 대출 계좌 생성
				case "2"://로그아웃 상태이거나 대출 계좌가 없을 때 생성 가능
					if(index==-1) {
						list.add(new Bank());//리스트에 새로운 Bank인스턴스가 생성됨
						list.get(list.size()-1).openBank();
						System.out.println("현재 고객 수: "+ list.size()); //리스트에 추가된 고객 수 확인
					} else if(list.get(index).getLoanBankBookNumber()==null){ //NullPointException 방지 {
						list.add(new Bank());//리스트에 새로운 Bank인스턴스가 생성됨
						list.get(list.size()-1).openBank();
						System.out.println("현재 고객 수: "+ list.size()); //리스트에 추가된 고객 수 확인
					} else { System.out.println("이미 대출 통장이 개설되어있습니다."); 
					}
					break;
					
				//로그인 하기
				case "3":
					if(index==-1) {
						System.out.println("인터넷 뱅킹 ID :"); 
						String id = sc.next();
						System.out.println("비밀번호 :"); 
						String password = sc.next();
						
						for(int i=0; i<list.size(); i++) {
							if(list.get(i).getId().equals(id)) {
								if(list.get(i).getPassword().equals(password)) {
									index=i; System.out.println("로그인 성공");
									break;
								}
								System.out.println("비밀번호 불일치");
							}
						}
						if(index==-1) {
							System.out.println("로그인 실패");
						}
					} else {
						System.out.println("이미 로그인 상태입니다.");
					}
					break;
					
				//로그아웃하기
				case "4": 
					if(index!=-1) {
					System.out.println("로그아웃하시겠습니까?(Y/N)");
					char log = sc.next().charAt(0);
					
					if(log=='Y'||log=='y') {
						System.out.println("로그아웃되었습니다.");
						index=-1;
					} else {
						System.out.println("로그아웃 취소");
					}
					} else {
						System.out.println("로그인 상태가 아닙니다.");
					}
					break;
					
				//예금 계좌 보기
				case "5": 
					
					if(index!=-1) {
						list.get(index).bankBookView();
					} else {
						System.out.println("먼저 로그인하십시오.");
					}
					break;
				
				case "6": 
					
					if(index!=-1) {
						list.get(index).loanBankBookView();
					} else {
						System.out.println("먼저 로그인하십시오.");
					}
					break;	
				//프로그램 종료
				case "7" :
					break Outter;
					
				default : 
				
			}
		}
		System.out.println("은행 프로그램을 종료합니다.");
	}
}

