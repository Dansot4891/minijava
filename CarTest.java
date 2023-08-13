class Car{
	String color;
	int gear;
	int speed;
	private String carnumber;
	
	void putnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public Car() {
		
	}
	public Car(String c, int g, int s,String carnumber) {
		this.color = c;
		this.gear = g;
		this.speed = s;
		this.carnumber = carnumber;
	}
	void print() {
		System.out.println("���� ���� : "+color);
		System.out.println("���� ��� : "+gear);
		System.out.println("���� �ӵ� : "+speed);
		System.out.println("���� ��ȣ : "+carnumber);
	}
	public String toString() {
		return "Car [color = "+color+" gear = "+gear+" speed = "+speed+" carnumber = "+carnumber+"]";
	}
	void changegear(int gear) {
		gear = gear;
	}
	void speedup() {
		speed += 5;
	}
	void speeddown() {
		speed -= 5;
	}
}
public class CarTest {
	public static void main(String[] args) {
		Car mycar1 = new Car("����",2,80,"43��6744");
		Car mycar2 = new Car();
		mycar2.speed = 90;
		mycar2.putnumber("34��9212");
		mycar2.gear = 3;
		mycar2.color = "���";
		System.out.println("mycar1");
		mycar1.print();
		System.out.println("mycar2");
		mycar2.print();
		
		mycar2.speeddown();
		mycar1.speedup();
		System.out.println(mycar1);
		System.out.println(mycar2);
		
	}
}
