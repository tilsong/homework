package bank;
//main() 에 나오는 구문을 메소드로 처리해 보세요., 그리고 중복되는 코드를 없애보세요. 
//메소드를 만들어서 호출하는 형식으로 바꿔보세요. main()은 단지 스타트 해주는 격으로 만들어 보세여
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankGo {
	
	public void go(Client client) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("1. 신규 계좌 개설");
		System.out.println("2. 종료하기");
		
		String select = sc.next();
		
		if(select.equals("1")) {
			//신규 예금 계좌 개설	
			OpenBank open = new OpenBank();
			open.openBank(client);	
		} else {
			//exit();
			System.out.println("은행 프로그램을 종료합니다.");
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		new BankGo().go(client);
	}
}
