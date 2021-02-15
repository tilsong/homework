package _0210;

import java.util.HashMap;
import java.util.Scanner;

public class OpenBank {
	Scanner sc = new Scanner(System.in);
	HashMap bankBookMap=null;
	// 그룹에 전화번호를 추가하는 메서드
		public void addBank(HashMap bankBookMap) {
			this.bankBookMap=bankBookMap;
			Bank bank = new Bank();
			
			System.out.println("1.적금|2.신탁|3.대출|4.뒤로가기");
			int choose = sc.nextInt();
			if (choose == 4) { bank.mainView(bankBookMap); }
			
			String bankKind = addGroup(choose);
			// 정보입력 메소드
			Client client = clientInfoInput(bankKind);
			if(client==null) {
				addBank(bankBookMap);
			}
			HashMap group = (HashMap) bankBookMap.get(bankKind);
			// "기타"
			group.put(client.getBankBookNumber(), client); // 이름은 중복될 수 있으니 전화번호를 key로 저장한다.
			bank.mainView(bankBookMap);
		}
		
		// 적금, 신탁, 대출 중 결정하는 메소드
		public String addGroup(int choose) {
			String[] bankKinds = { "적금", "신탁", "대출" };
			if (!bankBookMap.containsKey(bankKinds[choose - 1]))//
				bankBookMap.put(bankKinds[choose - 1], new HashMap());
			System.out.println(bankKinds[choose - 1] + " 통장을 선택하셨습니다.");
			return bankKinds[choose - 1];
		}
		
		// 정보입력 메소드
		public Client clientInfoInput(String bankKind) {
			Client client = null;
			// 고객정보입력
			switch (bankKind) {
			case "적금":
				client = new SavingClient();
				break;
			case "신탁":
				client = new TrustClient();
				break;
			case "대출":
				client = new LoanClient();
				break;
			}

			System.out.println("이름 :");
			String name = sc.next();
			client.setName(name);
			System.out.println("인터넷 뱅킹 id :");
			String id = sc.next();
			client.setId(id);
			System.out.println("비밀번호 :");
			String password = sc.next();
			client.setPassword(password);
			System.out.println("전화번호 :");
			String phoneNumber = sc.next();
			client.setPhoneNumber(phoneNumber);
			System.out.println("주소 :");
			String address = sc.next();
			client.setAddress(address);

			// 예금액 입력
			System.out.println(bankKind + "액 :");
			double money = sc.nextDouble();
			client.setMoney(money);
			
			//가입
			System.out.println("입력하신 내용 : " + " 이름: " + client.getName() + " Id : " + client.getId() + " Password : "
					+ client.getPassword() + " 전화번호 : " + client.getPhoneNumber() + " 주소 : " + client.getAddress()
					+ bankKind + " 액: " + money + "\n => 해당 내용으로 가입하시겠습니까? (Y/N)");
			char join = sc.next().charAt(0);
			if (!(join == 'Y' || join == 'y')) {
				return client=null;
			}
			String bankBookNumber = makeBankBookNumber();
			client.setBankBookNumber(bankBookNumber);

			System.out.println(bankKind + " 통장이 개설되었습니다.");
			return client;
		}

		// 통장 번호 만들기
		public String makeBankBookNumber() {
			String k = "";
			for (int j = 0; j < 2; j++) {
				int a = (int) (1000000 * Math.random());
				k += Integer.toString(a);
				if (j == 0) {
					k += "-";
				}
			}
			return k;
		}
}
