import java.util.Scanner;
public class StringSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ�. :");
		
		String model = sc.next();
		int price = 0;
		String a = "�� ���ڴ� ����.";
		switch(model) {
			case "�޺���̼�": price = 20000; break;
			case "���۽�����": price = 20000; break;
			case "��������": price = 15000; break;
			case "������": price = 25000; break;
			default: price = 0; break;
		}
		if(price ==0) {
			System.out.println(a);
		}else {
			System.out.println("����"+model+"�ǰ��� ="+price);
		}
	}
}
