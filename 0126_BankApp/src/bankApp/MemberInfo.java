package bankApp;

import java.util.Scanner;

public class MemberInfo {
	Scanner s = new Scanner(System.in);
	private String[] name = new String[10];
	private int[] number = new int[10];
	private String[] id = new String[10];
	private String[] password = new String[10];
	private String[] phoneNumber = new String[10];
	private String[] address = new String[10];
	private String[] bankBookNumber = new String[10];
	private double[] creditMoney = new double[10];
	private String[] loanPassbookNumber = new String[10];
	private double[] loanMoney = new double[10];
	
	//get()
	public String getName(int key) { return name[key]; }
	public String getId(int key) { return id[key]; }
	public String getPassword(int key) { return password[key]; }
	public String getPhoneNumber(int key) { return phoneNumber[key]; }
	public String getAddress(int key) { return address[key]; }
	public String getBankBookNumber(int key) { return bankBookNumber[key]; }
	public double getCreditMoney(int key) { return creditMoney[key]; }
	public String getLoanPassbookNumber(int key) { return loanPassbookNumber[key]; }
	public double getLoanMoney(int key) { return loanMoney[key]; }

	//로그인
	public int logIn(String id, String password) {
		for (int i = 0; i < 10; i++) {
			if (this.id[i].equals(id)) {
				if (this.password[i].equals(password)) {
					return i;
				}
				System.out.println("잘못된 비밀번호입니다.");
				return -1;
			}
		}
		System.out.println("잘못된 아이디입니다");
		return -1;
	}

	//예금 계좌 개설
	public void signUpOpenBankBook(String name, String id, String password, String phoneNumber, String address,
			double credit) {
		for (int i = 0; i < 10; i++) {
			if (this.name[i] == null) {
				this.name[i] = name;
				this.id[i] = id;
				this.number[i] = i + 1;
				this.password[i] = password;
				this.phoneNumber[i] = phoneNumber;
				this.address[i] = address;
				//통장번호 작성
				String k = "";
				for (int j = 0; j < 2; j++) {
					int a = (int) (1000000 * Math.random());
					k += Integer.toString(a);
					if (j == 0) {
						k += "-";
					}
				}
				this.bankBookNumber[i] = k;
				this.creditMoney[i] += credit;
			}
			break;
		}
		System.out.println("예금 계좌가 개설되었습니다.");
	}

	//대출 개좌 개설
	public void signUpOpenLoanPassBook(String name, String id, String password, String phoneNumber, String address,
			double loanMoney) {
		for (int i = 0; i < 10; i++) {
			if (this.name[i] == null) {
				this.name[i] = name;
				this.id[i] = id;
				this.number[i] = i + 1;
				this.password[i] = password;
				this.phoneNumber[i] = phoneNumber;
				this.address[i] = address;
				//통장번호 작성
				String k = "";
				for (int j = 0; j < 2; j++) {
					int a = (int) (1000000 * Math.random());
					k += Integer.toString(a);
					if (j == 0) {
						k += "-";
					}
				}
				this.loanPassbookNumber[i] = k;
				this.loanMoney[i] = loanMoney;
			}
			break;
		}
		System.out.println("대출 계좌가 개설되었습니다.");
	}
}