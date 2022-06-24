import java.util.Random;
import java.util.Scanner;

public class BasicArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();

		int n = sc.nextInt();
		// int[] arr={1,2,3,4};
		// int[][] arr={{1,2,3},{1,2,3}};
		// annonymous array return new int[]{1,2,3};
		// int[] arr=new int[n];
		// arr.length returns length
		// int[][] arr = new int[n][n];
		// for (int i = 0; i < arr.length; i++)
		// 	for (int j = 0; j < arr.length; j++)
		// 		arr[i][j] = rm.nextInt(4);

		// for (int[] x : arr) {

		// 	for (int y : x)
		// 		System.out.print(y + " ");
		// 	System.out.println();
		// }
		//copy array
		int[] a1={1,2,3};
		int[] a2=new int[3];
		//System.arraycopy(src, srcPos, dest, destPos, length);
		System.arraycopy(a1, 1, a2, 0, 2);
		//2 3 0 op
		for(int x:a2){
			System.out.println(x);
		}
		//clone array arr.clone(); return new array
	}
	/// dynamic array

}