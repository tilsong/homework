package bank_0202;


import java.util.List;
import java.util.Scanner;

public class Bank {
		Scanner sc = new Scanner(System.in);
		
		//고객 정보 변수
		private String name; //이름
		private String id; //아이디
		private String password; //비밀번호
		private String phoneNumber; //전화번호
		private String address; //주소
		private String bankBookNumber; //예금 통장 번호
		private double money; // 예금 통장 잔액
		private String loanBankBookNumber;//대출 통장 번호
		private double loanMoney; //대출 통장 잔액

		//나의 예금 계좌 보기
		public void bankBookView(int index, List<Bank> list) {
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
		public void loanBankBookView(int index, List<Bank> list) {
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
		
		//getter, setter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getId() {
			return id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setMoney(double money) {
			this.money = money;
		}
		public String getLoanBankBookNumber() {
			return loanBankBookNumber;
		}
		public void setLoanBankBookNumber(String loanBankBookNumber) {
			this.loanBankBookNumber = loanBankBookNumber;
		}
		public void setBankBookNumber(String bankBookNumber) {
			this.bankBookNumber = bankBookNumber;
		}
		public String getBankBookNumber() {
			return bankBookNumber;
		}
		public double getMoney() {
			return money;
		}
		public double getLoanMoney() {
			return loanMoney;
		}
		public void setLoanMoney(double loanMoney) {
			this.loanMoney = loanMoney;
		}
		
}