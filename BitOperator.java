import java.util.Scanner;

public class BitOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세탁기 초기상태 Byte를 입력하세요.(0~127)");
		int status = sc.nextInt();
		Integer.toBinaryString(status);
		
		System.out.println("세탁기 초기상태 = "+Integer.toBinaryString(status));
		System.out.println("전기가 연결되었는지 =" +((status&0b0000001)!=0));
		System.out.println("수도가 연결되었는지 =" +((status&0b0000010)!=0));
		System.out.println("문이 닫혀 있는지 =" +((status&0b0000100)!=0));
		System.out.println("빨래가 들어있는지 =" +((status&0b0001000)!=0));
		System.out.println("빨래가 너무 많이 들어있지 않은 지 =" +((status&0b0010000)!=0));
		System.out.println("배수관이 막혀 있지 않은 지 =" +((status&0b0100000)!=0));
		System.out.println("빨래가 한쪽에 치우쳐 있지 않은 지 =" +((status&0b1000000)!=0));
		
	}
}
