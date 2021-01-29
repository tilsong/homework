package bankApp;

import java.util.Scanner;

public class Bank {
		Scanner sc = new Scanner(System.in);
		
		//꼭 필요한 변수들
		private String name; //이름
		private int number; //고객번호
		private String id; //아이디
		private String password; //비밀번호
		private String phoneNumber; //전화번호
		private String address; //주소
		private String bankBookNumber; //예금 통장 번호
		private String loanBankBookNumber; //대출 통장 번호
		private double money; // 통장 잔액
		private double loanMoney;//대출 통장 잔액
		private boolean key; // 로그인 여부
		
		//getter

		//예금 계좌 개설
		public void openBank() {
			//이미 예금 계좌가 있는지 확인
			if(this.bankBookNumber!=null) {
				System.out.println("이미 예금 계좌가 있습니다.");
				return;
			}
			
			//대출 계좌가 있고 로그인한 상태이면 입력 생략 
			if(this.loanBankBookNumber==null&&key==false) {
				System.out.println("이름 :"); this. name = sc.next();
				System.out.println("인터넷 뱅킹 id :"); this.id = sc.next();
				System.out.println("비밀번호 :"); this.password = sc.next();
				System.out.println("전화번호 :"); this.phoneNumber = sc.next();
				System.out.println("주소 :"); this.address = sc.next();
			}
			
			//예금액 입력
			System.out.println("예금액 :"); this.money = sc.nextDouble();
			
			//통장 번호 만들기
			String k = "";
			for (int j = 0; j < 2; j++) {
				int a = (int) (1000000 * Math.random());
				k += Integer.toString(a);
				if (j == 0) {
					k += "-";
				}
			}
			this.bankBookNumber = k;
		}
		
		//대출 계좌 개설
		public void openLoanBank() {
			//이미 대출 계좌가 있는지 확인
			if(loanBankBookNumber!=null) {
				System.out.println("이미 대출 계좌가 있습니다.");
				return;
			}
			//예금 계좌가 없고 로그인 상태가 아니면 정보 입력 
			if(bankBookNumber==null&&key==false) {
				System.out.println("이름 :"); this.name = sc.next();
				System.out.println("인터넷 뱅킹 id :"); this.id = sc.next();
				System.out.println("비밀번호 :"); this.password = sc.next();
				System.out.println("전화번호 :"); this.phoneNumber = sc.next();
				System.out.println("주소 :"); this.address = sc.next();
			}
			
			//대출액 입력
			System.out.println("대출액 :"); this.loanMoney = sc.nextDouble();
					
			//통장 번호 만들기
			String k = "";
			for (int j = 0; j < 2; j++) {
			int a = (int) (1000000 * Math.random());
			k += Integer.toString(a);
				if (j == 0) {
					k += "-";
				}
			}		
			this.loanBankBookNumber = k;
		}		
		
		//로그인 하기
		public Boolean login() {
			System.out.println("인터넷 뱅킹 ID :"); String id = sc.next();
			if(!(id.equals(this.id))) {
				return this.key;
			}
			System.out.println("비밀번호 :"); String password = sc.next();
			if(!(password.equals(this.password))) {
				return this.key;
			}
			return this.key = true;
			
		}
		//로그아웃 하기
		public Boolean logOut() {
			System.out.println("로그아웃하시겠습니까?(Y/N)");
			String log = sc.nextLine();
			
			if(log=="Y"||log=="y") {
				System.out.println("로그아웃되었습니다.");
				this.key=false;
				return false;
			}
			
			return false;
			
		}
		
		//나의 예금 계좌 보기
		public void bankBookView() {
			if(this.key==true) {
				System.out.println(this.name + "님의 예금 계좌 보기");
				System.out.println("================");
				System.out.println("이름: " + this.name);
				System.out.println("예금 통장 번호 :" + this.bankBookNumber);
				System.out.println("잔액" + this.money + "원");
				System.out.println("월 마다 받는 금액" + (int) (this.money * 2 / 100 / 12)+ "원"); //연 2% 이자를 12개월로 나눔
				System.out.println("최종적으로 받는 금액" + (int) (this.money * 2 / 100) + "원");//연 2% 이자
				System.out.println("================");
				System.out.println("뒤로가기(아무 키나 누르세요)");
				String back = sc.next();
			} else {
				System.out.println("먼저 로그인하십시오");
			}
		}
		
		//나의 예금 계좌 보기
		public void loanBankBookView() {
			if(this.key==true) {
				System.out.println(this.name + "님의 예금 계좌 보기");
				System.out.println("================");
				System.out.println("이름: " + this.name);
				System.out.println("대출 통장 번호 :" + this.loanBankBookNumber);
				System.out.println("잔액" + this.loanMoney + "원");
				System.out.println("월 마다 갚아야 하는 금액" + (int) (this.loanMoney * 102 / 100 / 12)+ "원"); //연 2% 이자를 12개월로 나눔
				System.out.println("최종적으로 갚아야 하는 금액" + (int) (this.loanMoney * 102 / 100) + "원");//연 2% 이자
				System.out.println("================");
				System.out.println("뒤로가기(아무 키나 누르세요)");
				String back = sc.next();
			} else {
				System.out.println("먼저 로그인하십시오");
			}
		}
		
}
















