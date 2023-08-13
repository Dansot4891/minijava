package graphics;

public class ExceptionThrows {
	public static void main(String[] args) {
		int a = 10, b = 0, c;
		System.out.println("main: begin");
		try {
			System.out.println("main: divide(a,b) �޼ҵ�ȣ��");
			c = divide(a,b);
			System.out.println("main:after divide(a,b)"+c);
			}
		catch(ArithmeticException e) {
			System.out.println("main catch: ArimeticException �߻�");
			}System.out.println("main:end");
	}
	public static int divide(int a, int b) throws ArithmeticException{
		int c;
		try {
			System.out.println("try in divide(a,b): a/b ����");
			return(a/b);
			}
		catch(ArithmeticException e) {
			System.out.println("catch in divide: throw(e) ����");
			throw(e);
			}
	}
}
