import java.util.Scanner;
public class MiniProject {
	public static void main(String[] args) {
		int a;
		a = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("정답을 추측하여 보시오. : ");
			int b = sc.nextInt();
			if(a == b) {
				count++;
				System.out.println("축하합니다. 시도횟수 = "+count);
				break;
			}else if(a>b){
				System.out.println("제시한 정수가 낮습니다.");
				count++;
			}else {
				System.out.println("제시한 정수가 높습니다.");
				count++;
			}
		}
	}
}
