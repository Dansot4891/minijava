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
		System.out.println("�տ� "+whatIsIt+" �� �߰ߵǾ����ϴ�.");
	}
	void emerStop(int dist) {
		System.out.println("�ڵ����� "+dist+" m�տ��� ������ �߽��ϴ�.");
	}
	public void start() {
		System.out.println("�ڵ����� ����մϴ�.");
	}
	public void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
	}
	public void setSpeed(int speed) {
		System.out.println("�ڵ����� �ӵ��� "+ speed + "km/h�� �ٲߴϴ�.");
	}
	public void turn(int degree) {
		System.out.println("�ڵ����� ������ "+degree +"�� ��ŭ �ٲߴϴ�.");
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
