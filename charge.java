class EVCharging{	
	public static boolean emptyStation = true; //true여야 charge 가능
	//if문
	public int currentSale=0;
	
	public int currentCharge;
	
	public static int totalSale=0;

	private double minute=0;

	public EVCharging() {}		

	public EVCharging(int kw) {
		currentCharge = kw;
		totalSale += kw;
	}	
	String dispChargeTime(){
		minute = currentCharge/10;
		return "Charging Time : " +minute+ " min.";
	}
	String dispCurrentSale(String car) {
		return car + " kw : "+currentCharge+"kw";
	}
}
public class charge {
	public static void main(String[] args) {
		EVCharging car1 = new EVCharging(30);
		if(car1.emptyStation == true) {
			car1.emptyStation = false;
			System.out.println(car1.dispCurrentSale("car1"));
			System.out.println(car1.dispChargeTime());
			System.out.println("EV Charge Station Total Sale : "+EVCharging.totalSale+"kw");
			car1.emptyStation = true;
		}else {System.out.println("작동되질 않습니다.");
		}
		EVCharging car2 = new EVCharging(40);
		if(car2.emptyStation == true) {
			car2.emptyStation = false;
			System.out.println(car2.dispCurrentSale("car2"));
			System.out.println(car2.dispChargeTime());
			System.out.println("EV Charge Station Total Sale : "+EVCharging.totalSale+"kw");
			car2.emptyStation = true;
		}else {System.out.println("작동되질 않습니다.");
		}
	}
}