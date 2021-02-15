package _0210;

public class TrustClient extends Client {//신탁
	private double yearInterestAmount = money*0.005;
	private double monthInterestAmount = yearInterestAmount/12;
	
	public double getYearInterestAmount() {
		return yearInterestAmount;
	}
	public double getMonthInterestAmount() {
		return monthInterestAmount;
	}

	//toString
	@Override
	public String toString() {
		return "이름: " + getName() + " 통장번호 : " + getBankBookNumber()+ " Id : " +getId() + " Password : " + getPassword()+" 전화번호 : " + getPhoneNumber() +
				" 주소 : " + getAddress() + " 예금액 : " + getMoney() + " 월 이자액  : " + getMonthInterestAmount() + " 연 이자액 : " + getYearInterestAmount(); 
	}
}
