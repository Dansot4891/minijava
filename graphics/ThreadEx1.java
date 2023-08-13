package graphics;
class R implements Runnable{
	String name;
	public R(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.print(name + i + " ");
		}
	}
}
	
public class ThreadEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new R("A"));
		Thread t2 = new Thread(new R("B"));
		t1.start();
		t2.start();
	}
}
