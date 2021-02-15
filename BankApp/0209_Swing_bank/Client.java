package GuiBank;


import java.util.List;

public class Client {
		
		
		//고객 정보 변수
		private String name; //이름
		private String id; //아이디
		private String password; //비밀번호
		private String phoneNumber; //전화번호
		private String address; //주소
		private String bankBookNumber; //예금 통장 번호
		private double money; // 예금 통장 잔액
//		private String loanBankBookNumber;//대출 통장 번호
//		private double loanMoney; //대출 통장 잔액
		
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
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAddress() {
			return address;
		}
		public void setMoney(String money) {
			double m= Double.parseDouble(money);
			this.money = m;
		}
//		public String getLoanBankBookNumber() {
//			return loanBankBookNumber;
//		}
//		public void setLoanBankBookNumber(String loanBankBookNumber) {
//			this.loanBankBookNumber = loanBankBookNumber;
//		}
		public void setBankBookNumber(String bankBookNumber) {
			this.bankBookNumber = bankBookNumber;
		}
		public String getBankBookNumber() {
			return bankBookNumber;
		}
		public double getMoney() {
			return money;
		}
//		public double getLoanMoney() {
//			return loanMoney;
//		}
//		public void setLoanMoney(double loanMoney) {
//			this.loanMoney = loanMoney;
//		}
		
}