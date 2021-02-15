package GuiBank;

public abstract class Client {
		
		
		//고객 정보 변수
		protected String name; //이름
		protected String id; //아이디
		protected String password; //비밀번호
		protected String phoneNumber; //전화번호
		protected String address; //주소
		protected String bankBookNumber; //통장 번호
		protected double money; // 통장 잔액
		
		
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
		public void setMoney(String money) {
			this.money=Double.valueOf(money);
		}
		public void setBankBookNumber(String bankBookNumber) {
			this.bankBookNumber = bankBookNumber;
		}
		public String getBankBookNumber() {
			return bankBookNumber;
		}
		public String getAddress() {
			return address;
		}
		public double getMoney() {
			return money;
		}
		
		//toString
//		@Override
//		public String toString() {
//			return "이름: " + getName() + " 통장번호 : " + getBankBookNumber()+ " Id : " +getId() + " Password : " + getPassword()+" 전화번호 : " + getPhoneNumber() +
//					" 주소 : " + getAddress();
//		}

		
}