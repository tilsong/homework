package _0210;

public class LoanClient extends Client {
	private double yearRepayment = money*0.02;
	private double monthRepayment = yearRepayment/12;
	
	public double getYearRepayment() {
		return yearRepayment;
	}
	public double getMonthRepayment() {
		return monthRepayment;
	}



	//toString
	@Override
	public String toString() {
		return "이름: " + getName() + " 통장번호 : " + getBankBookNumber()+ " Id : " +getId() + " Password : " + getPassword()+" 전화번호 : " + getPhoneNumber() +
				" 주소 : " + getAddress() + " 대출액 : " + getMoney() + " 월 상환액  : " + getMonthRepayment() + " 연 상환액 : " + getYearRepayment();
	}
}
