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
		
		System.out.println("���� : XXX-XXX-XXXXXX");
		System.out.print("���¹�ȣ�� �Է����ּ��� : ");
		String a = sc.next();
		
		System.out.print("�Ա��� ���� �Է����ּ��� : ");
		String b = sc.next();
		
		System.out.print("�Ա��� �ݾ��� �Է����ּ��� : ");
		int c = sc.nextInt();
		
		bank newbank = new bank();
		newbank.setmoney(c);
		newbank.setName(b);
		newbank.setAcnumber(a);
		
		System.out.println("���¹�ȣ : "+newbank.getAcnumber());
		System.out.println("�Ա��� �� : "+newbank.getName());
		System.out.println("�Աݵ� �� : "+newbank.getmoney());
	}
}
