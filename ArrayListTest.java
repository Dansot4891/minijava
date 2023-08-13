import java.util.*;
class ArrayListTest {
	public static void main(String args[]) {
		ArrayList<String>list = new ArrayList<>();
		list.add("Ã¶¼ö");
		list.add("¿µÈñ");
		list.add("¼ø½Å");
		list.add("ÀÚ¿µ");
		System.out.printf("List : ");
		for(String obj : list) {
			System.out.print(obj + " ");
		}System.out.println();
		ArrayList<String>list2 = new ArrayList<>();
		list2.add("¿µÈñ");
		list2.add("ÀÚ¿µ");
		System.out.printf("List2 : ");
		for(String obj1 : list2) {
			System.out.print(obj1 + " ");
		}System.out.println();
		for(int i = 0;i<list.size();i++) {
			for(int j = 0; j<list2.size();j++) {
				if(list.get(i).equals(list2.get(j))) {
					list.remove(i);
				}
			}
		}
		System.out.print("(List-List2) : ");
		for(String obj2 : list) {
			System.out.print(obj2+" ");
		}
	}
}
