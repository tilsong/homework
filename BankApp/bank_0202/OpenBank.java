package bank_0202;

import java.util.List;
import java.util.Scanner;

public class OpenBank {
	Scanner sc = new Scanner(System.in);
	//예금 계좌 개설
	public List<Client> openBank(List<Client> list, int index) {
		int temp;
		if(index==-1) {//신규
			list.add(new Client());//리스트에 새로운 Bank인스턴스가 생성됨
			temp=list.size()-1;//해당 인덱스에 정보를 입력함
			list=customerInfo(list,temp);//고객정보입력
		} else if(list.get(index).getBankBookNumber()==null){//대출 통장은 있는데 예금 통장은 없을 때
			temp=index;//해당 인덱스에 정보를 입력함
		} else {
			System.out.println("이미 예금 계좌가 있습니다.");
			return null;
		}
			
		//예금액 입력
		System.out.println("예금액 :"); double money = sc.nextDouble();
		list.get(temp).setMoney(money);
			
		//통장 번호 만들기
		String bankBookNumber = makeBankBookNumber();
		list.get(temp).setBankBookNumber(bankBookNumber);
		
		System.out.println("예금 통장이 개설되었습니다.");
		System.out.println("현재 고객 수: "+ list.size()); //리스트에 추가된 고객 수 확인
		return list;
	}
	

	
	//대출 계좌 개설
	public List<Client> openLoanBank(List<Client> list, int index) {
		int temp;
		if(index==-1) {//신규
			list.add(new Client());//리스트에 새로운 Bank인스턴스가 생성됨
			temp=list.size()-1;//해당 인덱스에 정보를 입력함
			list=customerInfo(list,temp);//고객정보입력
		} else if(list.get(index).getLoanBankBookNumber()==null){//예금 통장은 있는데 대출 통장은 없을 때
			temp=index;//해당 인덱스에 정보를 입력함
		} else {
			System.out.println("이미 대출 계좌가 있습니다.");
			return null;
		}
		
		//대출액 입력
		System.out.println("대출액 :"); double loanMoney = sc.nextDouble();
		list.get(temp).setLoanMoney(loanMoney);
				
		//통장 번호 만들기
		String bankBookNumber = makeBankBookNumber();
		list.get(temp).setLoanBankBookNumber(bankBookNumber);
		
		System.out.println("대출 통장이 개설되었습니다.");
		System.out.println("현재 고객 수: "+ list.size()); //리스트에 추가된 고객 수 확인
		return list;
	}		
	
	
	//통장 번호 만들기
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
	
	
	//고객정보입력
	public List<Client> customerInfo(List<Client> list, int temp) {
		
		System.out.println("이름 :"); String name = sc.next();
		list.get(temp).setName(name);
		System.out.println("인터넷 뱅킹 id :"); String id = sc.next();
		list.get(temp).setId(id);
		System.out.println("비밀번호 :"); String password = sc.next();
		list.get(temp).setPassword(password);
		System.out.println("전화번호 :"); String phoneNumber = sc.next();
		list.get(temp).setPhoneNumber(phoneNumber);
		System.out.println("주소 :"); String address = sc.next();
		list.get(temp).setAddress(address);
		return list;
	}
} 


