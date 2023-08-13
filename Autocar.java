abstract class emergencyStop{
	abstract void emerStop(int dist);
}
abstract class obstacle extends emergencyStop {
	abstract void obs(String whatIsIt);
}

interface OperateCar1{
	void stop();
	void start();
	void setSpeed(int speed);
	void turn(int degree);
}

public class Autocar extends obstacle implements OperateCar1{
	void obs(String whatIsIt) {
		System.out.println("앞에 "+whatIsIt+" 이 발견되었습니다.");
	}
	void emerStop(int dist) {
		System.out.println("자동차가 "+dist+" m앞에서 급정거 했습니다.");
	}
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 "+ speed + "km/h로 바꿉니다.");
	}
	public void turn(int degree) {
		System.out.println("자동차가 방향을 "+degree +"도 만큼 바꿉니다.");
	}
	public static void main(String[] args) {
		Autocar obj = new Autocar();
		obj.start();
		obj.setSpeed(30);
		obj.turn(15);
		obj.stop();
		obj.obs("bicycle");
		obj.emerStop(3);
	}
}
