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
		list[0] = new Movie("백투더퓨쳐", "로버트 저메키스");
		list[1] = new Movie("티파니에서 아침을", "에드워드 블레이크");
		
		for(int j = 0; j<list.length-2;j++) {
			System.out.println("(중지하시러면 No를 입력해주세요.) ");
			System.out.print("제목 : ");
			String a = sc.next();
			
			if(a.equals("No")) {
				System.out.println("입력을 중지하고 영화 목록을 출력하겠습니다.");
				break;
			}
			
			System.out.print("감독 : ");
			String b = sc.next();
			
			list[j+2] = new Movie(a,b);
			
		}
		
		for(int i=0;i<Movie.count;i++) {
	System.out.println("=============================");	
			System.out.println("제목 : "+list[i].title);
			System.out.println("감독 : "+list[i].director);
	System.out.println("=============================");
		}
	}
}
