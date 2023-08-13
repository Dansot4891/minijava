import java.util.*;

class bank{
	private int money;
	private String name;
	private String Acnumber;
	
	public void setmoney(int money){
		this.money = money;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getmoney() {return money;}
	public String getName() {return name;}
	
	public void setAcnumber(String Acnumber){
		this.Acnumber = Acnumber;
	}
	public String getAcnumber() {return Acnumber;}
}
public class privateEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("예시 : XXX-XXX-XXXXXX");
		System.out.print("계좌번호을 입력해주세요 : ");
		String a = sc.next();
		
		System.out.print("입금자 명을 입력해주세요 : ");
		String b = sc.next();
		
		System.out.print("입금할 금액을 입력해주세요 : ");
		int c = sc.nextInt();
		
		bank newbank = new bank();
		newbank.setmoney(c);
		newbank.setName(b);
		newbank.setAcnumber(a);
		
		System.out.println("계좌번호 : "+newbank.getAcnumber());
		System.out.println("입금자 명 : "+newbank.getName());
		System.out.println("입금된 돈 : "+newbank.getmoney());
	}
}
