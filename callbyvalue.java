import java.util.*;

class Pizza{
	int radius;
	Pizza(int r) {
		radius = r;
	}
	Pizza whosLargest(Pizza a, Pizza b) {
		if(a.radius>b.radius)
			return a;
		else
			return b;
	}
}
public class callbyvalue {
	public static void main(String[] args) {
		Pizza obj1 = new Pizza(5);
		Pizza obj2 = new Pizza(7);
		
		Pizza[] objs = new Pizza[5];
		for(int i = 0;i<objs.length;i++) {
			objs[i] = new Pizza(i+2);
			System.out.println(objs[i].radius);
		}
		
		Pizza largest = obj1.whosLargest(obj1,obj2);
		System.out.println(largest.radius+"인치 피자가 더 큽니다.");
	}
}
