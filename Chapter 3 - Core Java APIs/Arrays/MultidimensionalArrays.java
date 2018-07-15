import java.util.*; // import whole package including Arrays
import java.util.Arrays; // import just Arrays

/**
* you have to know how many elements will be in the
* array when you create it and then you are stuck with that choice.
*/
public class MultidimensionalArrays{
	public static void main(String... args){
		System.out.println("AKISIISIS");
		
		int[][] vars1; // 2D array
		int vars2 [][]; // 2D array
		int[] vars3[]; // 2D array
		int[] vars4 [], space [][]; // a 2D AND a 3D array
		
		String [][] rectangle = new String[3][2];
		rectangle[0][1] = "set";
		System.out.println(rectangle[0][1]);
		
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		System.out.println(differentSize[0][1]);
		//System.out.println(differentSize[1][1]); //Runtime exception
		
		int [][] args1 = new int[4][];
		args1[0] = new int[5];
		args1[1] = new int[3];
		
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " "); // print element
			System.out.println(); // time for a new row
		}
		
		for (int[] inner : twoD) {
			for (int num : inner)
				System.out.print(num + " ");
			System.out.println(); // time for a new row
		}
	}
}