
public class Test {

	public static void main(String[] args) {
		var day = "SAT";
		var today ="";
		switch (day) {
			case "SAT","SUN": today ="�ָ�"; break;
			case "MON","TUS","WED","THU","FRI": today ="����"; break;
			default: System.out.println("Error"); break;
		}
		System.out.println(today);
	}

}
