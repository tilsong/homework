package bankApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberInfo open = new MemberInfo();


		// 메인 화면
		Outter: while (true) {
			System.out.println("==================");
			System.out.println("안녕하세요 비트은행입니다.");
			System.out.println("==================");
			System.out.println("1. 로그인");
			System.out.println("2. 신규 개좌 개설");
			System.out.println("3. 종료");
			System.out.println("번호를 입력하세요.(1/2/3)");
			int number = sc.nextInt();
			
			//1,2,3 외의 번호 입력하면 다시 입력

			if (!(number == 1 || number == 2 || number == 3)) {
				continue;
			}
			switch (number) {
			
			//1. 로그인	
			case 1:
				//로그인 메서드 -> 리턴
				System.out.println("로그인합니다.");
				System.out.println("인터넷 뱅킹 id를 입력하세요");
				String id = sc.next();
				System.out.println("비밀번호를 입력하세요");
				String password = sc.next();
				//로그인 메소드 호출, key값 반환
				int key = open.logIn(id, password);

				if (key != -1) {

					Outter1: while (true) {
						InfoView info = new InfoView();
						System.out.println("환영합니다 " + open.getName(key) + "님");
						System.out.println("1. 내 정보 보기");
						System.out.println("2. 예금 계좌 보기");
						System.out.println("3. 대출 계좌 보기");
						System.out.println("0. 메인 메뉴로 가기");
						System.out.println("번호를 입력하세요.(1/2/3/0)");
						
						int go = sc.nextInt();

						switch (go) {
							
						case 1:
							info.memberInfoView(key);
							break;

						case 2:
							info.bankBookView(key);
							break;

						case 3:
							info.loanPassBookView(key);
							break;
						case 0:
							break Outter1;
						}
					}
				}
				break;
			//신규 계좌 개설
			case 2:

				while (true) {
					System.out.println("1.예금 계좌 개설");
					System.out.println("2.대출 계좌 개설");
					System.out.println("번호를 입력하세요(1/2)");
					int whichBook = sc.nextInt();

					if (whichBook == 1) {
						OpenView join = new OpenView();
						join.openView();
						break;
					} else if (whichBook == 2) {
						OpenView join1 = new OpenView();
						join1.openLoanView();
						break;
					} else {
						continue;
					}

				}
				break;
			
			//3. 종료
			case 3:
				break Outter;
			}

		}
		System.out.println("은행 프로그램 종료");
	}

}
