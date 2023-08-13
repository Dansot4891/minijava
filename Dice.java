import java.util.*;
class Dice1{
	int face;
	int a = 0;
	public Dice1(int f) {
		face = f;
	}
	
	void roll() {
		face = (int)(Math.random()*6 + 1);
	}
	void getValue() {
		a++;
	}
	void setValue() {
		
	}
}
public class Dice {
	public static void main(String[] args) {
		Dice1 dice1 = new Dice1(0);
		Dice1 dice2 = new Dice1(0);
		
		while(true) {
			dice1.getValue();
			dice1.roll();
			dice2.roll();
			if(dice1.face == 1 && dice2.face == 1) {
				System.out.println();
				System.out.printf("주사위 1 = %d 주사위2 = %d\n",dice1.face,dice2.face);
				System.out.println("(1,1)이 나오는데 걸린 횟수 = " + dice1.a);
				break;
			}else {
				System.out.printf("주사위 1 = %d 주사위2 = %d\n",dice1.face,dice2.face);
			}
		}
	}
}
