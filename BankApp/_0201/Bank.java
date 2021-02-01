package _0201;



import java.util.Scanner;

public class Bank {
		Scanner sc = new Scanner(System.in);
		
		//꼭 필요한 변수들
		private String name; //이름
		//		private int number; //고객번호
		private String id; //아이디
		private String password; //비밀번호


		private String phoneNumber; //전화번호
		private String address; //주소
		private String bankBookNumber; //예금 통장 번호
		private double money; // 예금 통장 잔액
		private String loanBankBookNumber;//대출 통장 번호
		

		private double loanMoney; //대출 통장 잔액
		private boolean key; // 로그인 여부

		//getter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public String getPassword() {
			return password;
		}
		public String getLoanBankBookNumber() {
			return loanBankBookNumber;
		}
		public String getBankBookNumber() {
			return bankBookNumber;
		}
		
		//예금 계좌 개설
		public Bank openBank() {
			//이미 예금 계좌가 있는지 확인
//			if(this.bankBookNumber!=null) {
//				System.out.println("이미 예금 계좌가 있습니다.");
//				return null;
//			}
			
			//대출 계좌가 있고 로그인한 상태이면 입력 생략 
//			if(this.loanBankBookNumber==null&&key==false) {
				System.out.println("이름 :"); this. name = sc.next();
				System.out.println("인터넷 뱅킹 id :"); this.id = sc.next();
				System.out.println("비밀번호 :"); this.password = sc.next();
				System.out.println("전화번호 :"); this.phoneNumber = sc.next();
				System.out.println("주소 :"); this.address = sc.next();
//			}
			
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
			System.out.println("예금 통장이 개설되었습니다.");
			return this;
		}
		
		//대출 계좌 개설
		public void openLoanBank() {
//			//이미 대출 계좌가 있는지 확인
//			if(loanBankBookNumber!=null) {
//				System.out.println("이미 대출 계좌가 있습니다.");
//				return;
//			}
//			//예금 계좌가 없고 로그인 상태가 아니면 정보 입력 
//			if(bankBookNumber==null&&key==false) {
				System.out.println("이름 :"); this.name = sc.next();
				System.out.println("인터넷 뱅킹 id :"); this.id = sc.next();
				System.out.println("비밀번호 :"); this.password = sc.next();
				System.out.println("전화번호 :"); this.phoneNumber = sc.next();
				System.out.println("주소 :"); this.address = sc.next();
//			}
			
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
		

		
		//나의 예금 계좌 보기
		public void bankBookView() {
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
		}
		
		//나의 대출 계좌 보기
		public void loanBankBookView() {

				System.out.println(this.name + "님의 대출 계좌 보기");
				System.out.println("================");
				System.out.println("이름: " + this.name);
				System.out.println("대출 통장 번호 :" + this.loanBankBookNumber);
				System.out.println("잔액" + this.loanMoney + "원");
				System.out.println("월 마다 갚아야 하는 금액" + (int) (this.loanMoney * 102 / 100 / 12)+ "원"); //연 2% 이자를 12개월로 나눔
				System.out.println("최종적으로 갚아야 하는 금액" + (int) (this.loanMoney * 102 / 100) + "원");//연 2% 이자
				System.out.println("================");
				System.out.println("뒤로가기(아무 키나 누르세요)");
				String back = sc.next();
		}
		
}