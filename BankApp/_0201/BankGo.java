package _0201;
//main() �� ������ ������ �޼ҵ�� ó���� ������., �׸��� �ߺ��Ǵ� �ڵ带 ���ֺ�����. 
//�޼ҵ带 ���� ȣ���ϴ� �������� �ٲ㺸����. main()�� ���� ��ŸƮ ���ִ� ������ ����� ������
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankGo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		View view  = new View();
		Log log = new Log();
		
		int index=-1;//�α����ϱ� �� �ε����� -1
//		ArrayList�� ����� ���� ������

		List <Bank> list = new ArrayList<Bank>(); //Bank����Ʈ ����
		
		Outter : while(true) {
			view.mainView();
			String select = sc.next();
			
			switch(select) {
				//�ű� ���� ���� ����
				case "1": //�α׾ƿ� �����̰ų� ���� ���°� ���� �� ���� ����
					if(index==-1) {
						list.add(new Bank());//����Ʈ�� ���ο� Bank�ν��Ͻ��� ������
						
						list.get(list.size()-1).openBank();
						System.out.println("���� �� ��: "+ list.size()); //����Ʈ�� �߰��� �� �� Ȯ��
					} //���� ������ �ִµ� ���� ������ ���� ��
					else if(list.get(index).getBankBookNumber()==null){ //NullPointException ����
						list.add(new Bank());
						list.get(list.size()-1).openBank();
						System.out.println("���� �� ��: "+ list.size()); 
					} else{
						System.out.println("�̹� ���� ������ �����Ǿ��ֽ��ϴ�.");
					}
					break;
				
				//�ű� ���� ���� ����
				case "2"://�α׾ƿ� �����̰ų� ���� ���°� ���� �� ���� ����
					if(index==-1) {
						list.add(new Bank());//����Ʈ�� ���ο� Bank�ν��Ͻ��� ������
						list.get(list.size()-1).openBank();
						System.out.println("���� �� ��: "+ list.size()); //����Ʈ�� �߰��� �� �� Ȯ��
					} else if(list.get(index).getLoanBankBookNumber()==null){ //NullPointException ���� {
						list.add(new Bank());//����Ʈ�� ���ο� Bank�ν��Ͻ��� ������
						list.get(list.size()-1).openBank();
						System.out.println("���� �� ��: "+ list.size()); //����Ʈ�� �߰��� �� �� Ȯ��
					} else { System.out.println("�̹� ���� ������ �����Ǿ��ֽ��ϴ�."); 
					}
					break;
					
				//�α��� �ϱ�
				case "3":
					index=log.logIn(index, list);	
					break;
					
				//�α׾ƿ��ϱ�
				case "4": 
					index=log.logOut(index);
					break;
					
				//���� ���� ����
				case "5": 
					
					if(index!=-1) {
						list.get(index).bankBookView();
					} else {
						System.out.println("���� �α����Ͻʽÿ�.");
					}
					break;
				
				case "6": 
					
					if(index!=-1) {
						list.get(index).loanBankBookView();
					} else {
						System.out.println("���� �α����Ͻʽÿ�.");
					}
					break;	
				//���α׷� ����
				case "7" :
					break Outter;
					
				default : 
				
			}
		}
		System.out.println("���� ���α׷��� �����մϴ�.");
	}
}