import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,sum;
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�. ");//���� �ٲ��� �ʴ´�.
		x = sc.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�. ");
		y = sc.nextInt();
		
		sum = x+y;
		System.out.println(sum);
	}
}
