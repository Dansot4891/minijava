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
		}System.out.println("��� ���� �� = "+sum);
		for(int[] g : x) {
			System.out.println(Arrays.toString(g));
		}
		
		String[] b = {"���۷δ�","�ӽ���","��Ͼ�","�ҽ���","������"};
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
		
		
		
		
		/* -1�� �Է� ���� ������ �հ� ����ϱ� 
		int sum = 0;
		int a = 0;
		while(a != -1) {
			sum += a;
			System.out.print("������ �Է��Ͻÿ�. : ");
			a = sc.nextInt();
			
		}
		System.out.printf("������ ���� %d�Դϴ�.",sum);
		*/
		
		
		
		/* factorial ���ϱ�
		System.out.print("���� �Է����ּ���. : ");
		int a = sc.nextInt();
		double sum = 1;
		for(int i =1;i<=a;i++) {
			sum *= i;
		}
		System.out.printf("%d!�� %.0f�Դϴ�.",a,sum);
		*/
		
		
		
		/* switch �̿��Ͽ� ���� ���ϱ�
		System.out.print("������ �Է��Ͻÿ� : ");
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
		System.out.printf("���� : %c",grade);
		*/
		
		
		
		/* ���� ���� ���ϱ� ���� �ִ� Ŭ���� �̿�
		System.out.print("���� �������� �Է��Ͻÿ�. : ");
		int a = sc.nextInt();
		
		Circle circle1 = new Circle(a);
		
		System.out.println("���� ���̴� " + circle1.area()+ "�Դϴ�");
		*/
		
		/* ���� ���� ��!
		System.out.print("����(0), ����(1), ��(2) : ");
		int x = sc.nextInt();
		
		int y = (int)(Math.random()*3);
		
		if((x==1&&y==2) || (x==2&&y==1)|| (x==0&&y==1)) {
			System.out.printf("�ΰ� : %d, ��ǻ�� : %d �ΰ� �й�",x,y);
		}else if(x==y) {
			System.out.printf("�ΰ� : %d, ��ǻ�� : %d ���º�",x,y);
		}else if((y==1&&x==2) || (y==2&&x==1)|| (y==0&&x==1)) {
			System.out.printf("�ΰ� : %d, ��ǻ�� : %d �ΰ� �¸�",x,y);
		}else {
			System.out.println("�ùٸ��� ���� ���Դϴ�. �ٽ� �õ����ּ���.");
		}
		*/
	}
}
