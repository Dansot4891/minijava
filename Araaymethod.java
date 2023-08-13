class find{
	public static double min(double[] list) {
		double minnum = list[0];
		
		for(int i=0;i<list.length;i++) {
			if(list[i]<=minnum) {
				minnum = list[i];
			}
		}return minnum;
	}
	public static double max(double[] list) {
		double maxnum = list[0];
		
		for(int i=0;i<list.length;i++) {
			if(list[i]>=maxnum) {
				maxnum = list[i];
			}
		}return maxnum;
	}
}
public class Araaymethod {
	public static void main(String[] args) {
		double list1[] = {1.1,2.2,3.3,4.4,5.5,6.6};
		double list2[] = {5.5,4.4,3.3,2.2,1.1};
		//double list2[] = {1.1,2.2,3.3,4.4,5.5,6.6};
		
		double a = find.min(list2);
		double b = find.max(list2);
		System.out.println("최소 : "+a);
		System.out.println("최대 : "+b);
	}
}
