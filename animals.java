class Animal{
	public void speak() {
		System.out.println("Animal Å¬·¡½ºÀÇ speak()");
	}
}
class Dog extends Animal{
	public void speak() {
		System.out.println("¸Û¸Û");
	}
}
class Cat extends Animal{
	public void speak() {
		System.out.println("³Ä¿Ë");
	}
}
public class animals {
	public static void main(String[] args) {
		Animal[] a = new Animal[3];
		
		a[0] = new Animal();
		a[1] = new Dog();
		a[2] = new Cat();
		
		a[0].speak();
		a[1].speak();
		a[2].speak();
	}
}
