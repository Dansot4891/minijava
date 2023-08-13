import java.util.*;

class Movie{
	String title, director;
	static int count;
	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
		count++;
	}
}

public class MovieArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Movie[] list = new Movie[10];
		list[0] = new Movie("������ǻ��", "�ι�Ʈ ����Ű��");
		list[1] = new Movie("Ƽ�ĴϿ��� ��ħ��", "������� ����ũ");
		
		for(int j = 0; j<list.length-2;j++) {
			System.out.println("(�����Ͻ÷��� No�� �Է����ּ���.) ");
			System.out.print("���� : ");
			String a = sc.next();
			
			if(a.equals("No")) {
				System.out.println("�Է��� �����ϰ� ��ȭ ����� ����ϰڽ��ϴ�.");
				break;
			}
			
			System.out.print("���� : ");
			String b = sc.next();
			
			list[j+2] = new Movie(a,b);
			
		}
		
		for(int i=0;i<Movie.count;i++) {
	System.out.println("=============================");	
			System.out.println("���� : "+list[i].title);
			System.out.println("���� : "+list[i].director);
	System.out.println("=============================");
		}
	}
}
