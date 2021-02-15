package _0210;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class View {
	Scanner sc = new Scanner(System.in);

	// 어떤 계좌 목록 볼지 결정하는 메소드
	public void chooseBankList(HashMap bankBookMap) {
		System.out.println("1.모두 보기|2.적금 계좌 보기|3.신탁 계좌 보기|4.대출 계좌 보기|5.뒤로 가기");
		String choose = sc.next();
		if (choose.equals("5"))
			Bank.mainView(bankBookMap);
		printList(choose, bankBookMap);
	}
	
	// 전화번호부 전체를 출력하는 메서드
	public void printList(String choose, HashMap bankBookMap) {

		Set set = bankBookMap.entrySet(); // 전체단위
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next(); // e = 적금, 신탁, 대출
			if (choose.equals("1") || choose.equals("2") && e.getKey().equals("적금")|| choose.equals("3") && e.getKey().equals("신탁")|| choose.equals("3") && e.getKey().equals("대출")) {

				Set subSet = ((HashMap) e.getValue()).entrySet();
				Iterator subIt = subSet.iterator(); //
				System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

				while (subIt.hasNext()) {

					Map.Entry subE = (Map.Entry) subIt.next(); // subE = (client.name, client)
					String telNo = (String) subE.getKey();
					Client client = (Client) subE.getValue();

					System.out.println(client.toString());// 각 통장별로 바꿀 수 있나?현재 잔액: \"+client.getMoney()

				}
			}
			System.out.println();
		}

		System.out.println("뒤로 가기 (아무키나 누르시오)");
		sc.next();
		Bank bank = new Bank();
		bank.mainView(bankBookMap);
	} // printList()
}
