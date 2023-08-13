class Shape{
	protected int x,y;
	public void draw() {System.out.println("Shape draw");}
	void getarea() {
	}
}
/*
class Rectangle extends Shape{
	private int width, height;
	public void draw() {System.out.println("Rectangle draw");}
	void getarea() {
		System.out.println("도형의 넓이는 : "+width*height);
	}
}
*/
class Triangle extends Shape{
	private int base, height;
	public void draw() {System.out.println("Triangle draw");}
	void getarea() {
		System.out.println("도형의 넓이는 : "+base*height*0.5);
	}
}

class Circle extends Shape{
	final double PI = 3.14;
	private int radius;
	Circle(int r){
		radius = r;
	}
	Circle(){
		
	}
	public void draw() {System.out.println("Circle draw");}
	void getarea() {
		System.out.println("도형의 넓이는 : "+PI*(double)radius*(double)radius);
	}
}
public class ShapeTest {
	public static void print(Shape s) {
		System.out.println("x = "+s.x + " y = "+s.y);
	}
	public static void prints(Shape s) {
		//if(s instanceof Rectangle)
			//System.out.println("실제 타입은 Rectangle");
		if(s instanceof Triangle)
			System.out.println("실제 타입은 Triangle");
		if(s instanceof Circle)
			System.out.println("실제 타입은 Circle");
	}
	public static void main(String[] args) {
		
		//Shape s1 = new Rectangle();
		Shape s2 = new Triangle();
		Shape s3 = new Circle(4);		
		
		s3.getarea();
		
		//print(s1);
		print(s2);
		print(s3);
		
		System.out.println();
		
		//prints(s1);
		prints(s2);
		prints(s3);
		
		System.out.println();
		
		Shape[] Shapes = new Shape[3];
		
		//Shapes[0] = new Rectangle();
		Shapes[1] = new Triangle();
		Shapes[2] = new Circle();
		
		
		for(int i =0;i<Shapes.length;i++) {
			Shapes[i].draw();
		}
	}

}
