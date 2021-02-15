package GuiBank;

public class SavingClient extends Client {//적금
	private double yearInterestAmount = money*1.02;
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
				" 주소 : " + getAddress() + "적금액 : " + getMoney() + "월 적금 증액  : " + getMonthInterestAmount() + " 연 만기 시 총액 : " + getYearInterestAmount()+"\n"; 
	}
}
