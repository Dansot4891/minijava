import java.util.*;

class Person1{
	private String prinum;
	private double weight;
	String Name;
	String sex;
	
	void putPrinum(String pn) {
		prinum = pn;
	}
	void putweight(double w) {
		weight = w;
	}
	public String getPrinum() {
		return prinum;
	}
	double getweight() {
		return weight;
	}
}
class Student extends Person1{
	int id;
}
public class person {
	public static void main(String[] args) {
		Student woo = new Student();
		woo.putPrinum("000724");
		woo.putweight(66.4);
		woo.id = 1234123;
		
		System.out.println(woo.getPrinum());
		System.out.println(woo.getweight());
	}
}
