package _0201;
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
		
		int index=-1;//로그인하기 전 인덱스는 -1
//		ArrayList로 만드는 것이 적당함

		List <Bank> list = new ArrayList<Bank>(); //Bank리스트 생성
		
		Outter : while(true) {
			view.mainView();
			String select = sc.next();
			
			switch(select) {
				//신규 예금 계좌 개설
				case "1": //로그아웃 상태이거나 대출 계좌가 없을 때 생성 가능
					if(index==-1) {
						list.add(new Bank());//리스트에 새로운 Bank인스턴스가 생성됨
						
						list.get(list.size()-1).openBank();
						System.out.println("현재 고객 수: "+ list.size()); //리스트에 추가된 고객 수 확인
					} //대출 통장은 있는데 예금 통장은 없을 때
					else if(list.get(index).getBankBookNumber()==null){ //NullPointException 방지
						list.add(new Bank());
						list.get(list.size()-1).openBank();
						System.out.println("현재 고객 수: "+ list.size()); 
					} else{
						System.out.println("이미 예금 통장이 개설되어있습니다.");
					}
					break;
				
				//신규 대출 계좌 생성
				case "2"://로그아웃 상태이거나 대출 계좌가 없을 때 생성 가능
					if(index==-1) {
						list.add(new Bank());//리스트에 새로운 Bank인스턴스가 생성됨
						list.get(list.size()-1).openBank();
						System.out.println("현재 고객 수: "+ list.size()); //리스트에 추가된 고객 수 확인
					} else if(list.get(index).getLoanBankBookNumber()==null){ //NullPointException 방지 {
						list.add(new Bank());//리스트에 새로운 Bank인스턴스가 생성됨
						list.get(list.size()-1).openBank();
						System.out.println("현재 고객 수: "+ list.size()); //리스트에 추가된 고객 수 확인
					} else { System.out.println("이미 대출 통장이 개설되어있습니다."); 
					}
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
					
					if(index!=-1) {
						list.get(index).bankBookView();
					} else {
						System.out.println("먼저 로그인하십시오.");
					}
					break;
				
				case "6": 
					
					if(index!=-1) {
						list.get(index).loanBankBookView();
					} else {
						System.out.println("먼저 로그인하십시오.");
					}
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