class Math1 {
	int add(int x,int y){return x+y;}
	int add(int x,int y,int z){return x+y+z;}
	int add(int x,int y, int z, int r){return x+y;}
	double add(double x, double y){return x+y;}
	
}
public class Overloading1 {
	public static void main(String[] args) {
	Math1 a = new Math1();
	System.out.println(a.add(3,5));
	System.out.println(a.add(3.5,4.2));
	}
}