import java.util.*;

/*class Circle{
	final double pi = 3.14;
	double r;
	public Circle(double r) {
		this.r = r;
	}
	double area() {
		return this.r*this.r*3.14;
	}
}*/
public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String>list = new ArrayList<>();
		list.add("3");
		list.add("4");
		list.add("wow");
		list.add("XD");
		for(int i = 0; i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		int count = 1;
		int sum = 0;
		int[][] x = new int[10][];
		for(int i = 0;i<x.length;i++) {
			x[i] = new int[i+1];
		}
		
		for(int i = 0;i<x.length;i++) {
			for(int k =0;k<x[i].length;k++) {
				x[i][k] = count;
				System.out.print(x[i][k]+" ");
				sum += count;
				count++;
			}System.out.println();
		}System.out.println("모든 값의 합 = "+sum);
		for(int[] g : x) {
			System.out.println(Arrays.toString(g));
		}
		
		String[] b = {"페퍼로니","머쉬룸","어니언","소시지","베이컨"};
		int[] a = {10, 20, 30 ,40, 50};
		int[][] z = {
				{10, 20, 30 ,40, 50},
				{10, 20, 30 ,40, 50},
				{10, 20, 30 ,40, 50}
		};
		System.out.println(Arrays.toString(a));
		for(int i = 0; i<z.length;i++) {
			for(int j = 0; j<z[i].length;j++) {
				System.out.print(z[i][j]+" ");
			}System.out.println();
		}
		for(String c : b) {
			System.out.print(c+" ");
		}
		System.out.println();
		for(int value : a) {
			System.out.print(value+" ");
		}
		System.out.println();
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		
		
		
		/* -1을 입력 받을 때까지 합계 계산하기 
		int sum = 0;
		int a = 0;
		while(a != -1) {
			sum += a;
			System.out.print("정수를 입력하시오. : ");
			a = sc.nextInt();
			
		}
		System.out.printf("정수의 합은 %d입니다.",sum);
		*/
		
		
		
		/* factorial 구하기
		System.out.print("수를 입력해주세요. : ");
		int a = sc.nextInt();
		double sum = 1;
		for(int i =1;i<=a;i++) {
			sum *= i;
		}
		System.out.printf("%d!는 %.0f입니다.",a,sum);
		*/
		
		
		
		/* switch 이용하여 학점 구하기
		System.out.print("성적을 입력하시오 : ");
		int x = sc.nextInt();
		
		int y = x/10;
		char grade = ' ';
		
		switch(y){
			case 10: case 9: grade = 'A'; break;
			case 8: grade ='B'; break;
			case 7: grade ='C'; break;
			case 6: grade ='D'; break;
			case 5: grade ='E'; break;
			default: grade = 'F'; break;
		}
		System.out.printf("학점 : %c",grade);
		*/
		
		
		
		/* 원의 넓이 구하기 위에 있는 클래스 이용
		System.out.print("원의 반지름을 입력하시오. : ");
		int a = sc.nextInt();
		
		Circle circle1 = new Circle(a);
		
		System.out.println("원의 넓이는 " + circle1.area()+ "입니다");
		*/
		
		/* 가위 바위 보!
		System.out.print("가위(0), 바위(1), 보(2) : ");
		int x = sc.nextInt();
		
		int y = (int)(Math.random()*3);
		
		if((x==1&&y==2) || (x==2&&y==1)|| (x==0&&y==1)) {
			System.out.printf("인간 : %d, 컴퓨터 : %d 인간 패배",x,y);
		}else if(x==y) {
			System.out.printf("인간 : %d, 컴퓨터 : %d 무승부",x,y);
		}else if((y==1&&x==2) || (y==2&&x==1)|| (y==0&&x==1)) {
			System.out.printf("인간 : %d, 컴퓨터 : %d 인간 승리",x,y);
		}else {
			System.out.println("올바르지 않은 수입니다. 다시 시도해주세요.");
		}
		*/
	}
}
