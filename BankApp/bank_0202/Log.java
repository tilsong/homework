package bank_0202;

import java.util.List;
import java.util.Scanner;

public class Log {
	Scanner sc = new Scanner(System.in);
	
	//로그인 메소드
	public int logIn(int index, List<Bank> list) {
		if(index==-1) {
			System.out.println("인터넷 뱅킹 ID :"); 
			String id = sc.next();
			System.out.println("비밀번호 :"); 
			String password = sc.next();
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getId().equals(id)) {
					if(list.get(i).getPassword().equals(password)) {
						 System.out.println("로그인 성공");
						 return i;
					}
					System.out.println("비밀번호 불일치");
					return -1;
				}
			}
			if(index==-1) {
				System.out.println("로그인 실패");
				return -1;
			}
		} else {
			System.out.println("이미 로그인 상태입니다.");
			return index;
		}
		return index;
	}
	
	//로그아웃 메소드
	public int logOut(int index) {
		if(index!=-1) {
			System.out.println("로그아웃하시겠습니까?(Y/N)");
			char check = sc.next().charAt(0);
			
			if(check=='Y'||check=='y') {
				System.out.println("로그아웃되었습니다.");
				return -1;
			} else {
				System.out.println("로그아웃 취소");
				return index;
			}
		} else {
			System.out.println("로그인 상태가 아닙니다.");
			return -1;
		}
	}
}







