class mymath{
	public static int power(int a, int b) {
		int z = 1;
		for(int i=1;i<=b;i++)
			z 	*= a;
		return z;
	}
	public static int power2(int a) {
		int x = a*a*a;
		return x;
	}
}

class Pizzact{
	String topping;
	String large2;
	int large;
	static int count = 0;
	
	
	public Pizzact(String tp,int a){
		topping = tp;
		large = a;
		if(a == 1)
			large2 = "Small";
		else if(a == 2)
			large2 = "Large";
		else
			large2 = "X";
		count++;
	}
	public String toString() {
		return "피자의 종류는 "+topping+" 피자의 사이즈는 "+large2;
	}
}
public class Pizzecount {
	public static void main(String[] args) {
		Pizzact piz1 = new Pizzact("Potato", 1);
		Pizzact piz2 = new Pizzact("shrimp", 2);
		Pizzact piz3 = new Pizzact("Sweet Potato", 2);
		
		System.out.println(piz1);
		System.out.println(piz2);
		System.out.println(piz3);
		
		System.out.println("금일 피자 판매량은 "+Pizzact.count+"입니다");
		System.out.println(mymath.power(2,5));
		System.out.println(mymath.power2(4));
	}
}
