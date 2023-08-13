package graphics;

import java.lang.reflect.Array;

class MyException extends Exception{
	public MyException() {}
	public MyException(String msg) {
		super(msg);
	}
	public String toString() {
		return("너 인덱스 넘었지");
	}
}
public class Snippet {
	public static void main(String[] args) throws MyException {
		int[] array = {1,2,3,4,5};
		int i = array.length;
		try {
			Array(array, i);
		}catch(MyException e) {
			System.out.println(e);
		}
	}
	public static void Array(int[] array,int i) throws MyException{
		if(i >= array.length) {
			MyException me = new MyException();
			throw me;
		}
		for(int k=0;k<=array.length;k++) {
			System.out.print(array[k] + " ");
		}
	}
		
}
