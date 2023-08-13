package hello1;
import java.util.*;


interface Comparable{
	void compareTo(Object other);
}
class Rectangle implements Comparable{
	public int width = 0;
	public int height = 0;
	
	public String toString() {
		return "Rectangle [width ="+width+", height="+height+"]";
	}
	public Rectangle(int w, int h) {
		width = w;
		height = h;
		System.out.println(this);
	}
	public int getArea() {
		return width*height;
	}
	public void compareTo(Object other) {
		Rectangle OtherRect = (Rectangle) other;
		if(this.getArea()<OtherRect.getArea())
			System.out.println(OtherRect+"�� �� Ů�ϴ�.");
		else if(this.getArea()>OtherRect.getArea())
			System.out.println(this+"�� �� Ů�ϴ�.");
		else
			System.out.println("���� �Ȱ���");
	}
}

public class hello {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100,30);
		Rectangle r2 = new Rectangle(200,10);
		r1.compareTo(r2);
		r2.compareTo(r1);
		
		
		
	}
}