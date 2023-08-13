import java.util.*;
/*
abstract class Emergencystop{
	abstract void emerStop1(int dist);
}
abstract class Obstacle extends Emergencystop{
	abstract void obs(String whatIsIt);
}

interface OperateCar{
	void start();
	void stop();
	void setspeed(int speed);
	void turn(int degree);
}
public class practice2 extends Obstacle implements OperateCar{
	void emerStop1(int dist) {
		System.out.println("자동차가 "+dist+" 앞에서 급정거 했습니다.");
	}
	void obs(String whatIsIt) {
		System.out.println("앞에 "+whatIsIt+" 이 발견되었습니다.");
	}
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	public void setspeed(int speed) {
		System.out.println("자동차가 속도를 "+speed+"km/h로 바꿉니다.");
	}
	public void turn(int degree) {
		System.out.println("자동차가 방향을 "+degree+"도 만큼 바꿉니다.");
	}
	public static void main(String[] args) {
		practice2 car = new practice2();
		car.start();
		car.setspeed(30);
		car.turn(15);
		car.stop();
		car.emerStop1(3);
		car.obs("bicycle");
	}
}
*/