package bank_0202;
//main() 에 나오는 구문을 메소드로 처리해 보세요., 그리고 중복되는 코드를 없애보세요. 
//메소드를 만들어서 호출하는 형식으로 바꿔보세요. main()은 단지 스타트 해주는 격으로 만들어 보세여
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankGo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		View view  = new View();
		Log log = new Log();
		Client client = new Client();
		OpenBank open = new OpenBank();
		int index=-1;//로그인하기 전 인덱스는 -1


		List <Client> list = new ArrayList<Client>(); //Bank리스트 생성
		
		Outter : while(true) {
			view.mainView();
			String select = sc.next();
			
			switch(select) {
			
			//신규 예금 계좌 개설
			case "1": //로그아웃 상태이거나 대출 계좌가 없을 때 생성 가능
				List <Client> check = open.openBank(list, index);				
				if(check!=null) list = check;
				break;
			
			//신규 대출 계좌 생성
			case "2"://로그아웃 상태이거나 대출 계좌가 없을 때 생성 가능
				check = open.openLoanBank(list, index);
				if(check!=null) list = check;
				break;
					
			//로그인 하기
			case "3":
				index=log.logIn(index, list);	
				break;
					
			//로그아웃하기
			case "4": 
				index=log.logOut(index);
				break;
					
			//예금 계좌 보기
			case "5": 
				view.bankBookView(index, list);	
				break;
			
			//대출 계좌 보기
			case "6": 
				view.loanBankBookView(index, list);	
				break;	
					
			//프로그램 종료
			case "7" :
				break Outter;
					
			default : 
				
			}
		}
		System.out.println("은행 프로그램을 종료합니다.");
	}
}