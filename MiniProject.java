import java.util.Scanner;
public class MiniProject {
	public static void main(String[] args) {
		int a;
		a = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("������ �����Ͽ� ���ÿ�. : ");
			int b = sc.nextInt();
			if(a == b) {
				count++;
				System.out.println("�����մϴ�. �õ�Ƚ�� = "+count);
				break;
			}else if(a>b){
				System.out.println("������ ������ �����ϴ�.");
				count++;
			}else {
				System.out.println("������ ������ �����ϴ�.");
				count++;
			}
		}
	}
}
