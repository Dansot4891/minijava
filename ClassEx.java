import java.util.*;

class cafe{
	String coffee, bread;
	public cafe(String coffee,String bread) {
		this.coffee = coffee;
		this.bread = bread;
	}
	void order() {
		System.out.println("�ֹ��Ͻ� "+coffee+"�� "+bread+" ���Խ��ϴ�.");
	}
}
public class ClassEx {
	public static void main(String[] args) {
		
		cafe a1 = new cafe("�Ƹ޸�ī��","��Ϻ극��");
		a1.order();
	}
}
