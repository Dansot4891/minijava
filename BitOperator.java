import java.util.Scanner;

public class BitOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��Ź�� �ʱ���� Byte�� �Է��ϼ���.(0~127)");
		int status = sc.nextInt();
		Integer.toBinaryString(status);
		
		System.out.println("��Ź�� �ʱ���� = "+Integer.toBinaryString(status));
		System.out.println("���Ⱑ ����Ǿ����� =" +((status&0b0000001)!=0));
		System.out.println("������ ����Ǿ����� =" +((status&0b0000010)!=0));
		System.out.println("���� ���� �ִ��� =" +((status&0b0000100)!=0));
		System.out.println("������ ����ִ��� =" +((status&0b0001000)!=0));
		System.out.println("������ �ʹ� ���� ������� ���� �� =" +((status&0b0010000)!=0));
		System.out.println("������� ���� ���� ���� �� =" +((status&0b0100000)!=0));
		System.out.println("������ ���ʿ� ġ���� ���� ���� �� =" +((status&0b1000000)!=0));
		
	}
}
