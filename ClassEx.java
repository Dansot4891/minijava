import java.util.*;

class cafe{
	String coffee, bread;
	public cafe(String coffee,String bread) {
		this.coffee = coffee;
		this.bread = bread;
	}
	void order() {
		System.out.println("주문하신 "+coffee+"와 "+bread+" 나왔습니다.");
	}
}
public class ClassEx {
	public static void main(String[] args) {
		
		cafe a1 = new cafe("아메리카노","허니브레드");
		a1.order();
	}
}
