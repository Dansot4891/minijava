
public class Test {

	public static void main(String[] args) {
		var day = "SAT";
		var today ="";
		switch (day) {
			case "SAT","SUN": today ="주말"; break;
			case "MON","TUS","WED","THU","FRI": today ="주중"; break;
			default: System.out.println("Error"); break;
		}
		System.out.println(today);
	}

}
