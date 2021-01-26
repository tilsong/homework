package bankApp;
import java.util.Scanner;
//계좌 개설
public class OpenView {
	MemberInfo open = new MemberInfo();
	
	//예금 계좌 개설
	public void openView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("예금 개좌를 개설합니다.");
		System.out.println("==========");
		System.out.println("개인 정보 입력");
		System.out.println("==========");
		System.out.println("이름 :");
		String name = sc.next();
		System.out.println("인터넷 뱅킹 id :");
		String id = sc.next();
		System.out.println("비밀번호 :");
		String password = sc.next();
		System.out.println("전화번호 :");
		String phoneNumber = sc.next();
		System.out.println("주소 :");
		String address = sc.next();
		System.out.println("예금액 :");
		double credit = sc.nextDouble();
		
		//정보 저장
		open.signUpOpenBankBook(name, id, password, phoneNumber, address, credit);
	}
	//대출 계좌 개설
	public void openLoanView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("대출 계좌를 개설합니다.");
		System.out.println("==========");
		System.out.println("개인 정보 입력");
		System.out.println("==========");
		System.out.println("이름 :");
		String name = sc.next();
		System.out.println("인터넷 뱅킹 id :");
		String id = sc.next();
		System.out.println("비밀번호 :");
		String password = sc.next();
		System.out.println("전화번호 :");
		String phoneNumber = sc.next();
		System.out.println("주소 :");
		String address = sc.next();
		System.out.println("대출 금액 :");
		double loanMoney = sc.nextDouble();
		
		//정보 저장	
		open.signUpOpenLoanPassBook(name, id, password, phoneNumber, address, loanMoney);
	}
}
