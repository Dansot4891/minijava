import java.util.Arrays;
public class RaggedArray2 {
	public static void main(String[] args) {
		int[][] rarray = new int[3][];
		
		rarray[0] = new int[] {1,2,3,4};
		rarray[1] = new int[] {5,6,7};
		rarray[2] = new int[] {8,9};
		
		for(int i=0;i<rarray.length;i++) {
			for(int j=0;j<rarray[i].length;j++) {
				System.out.print(rarray[i][j] + " ");
			}
		}
	}
}
