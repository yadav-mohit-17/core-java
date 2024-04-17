/**
 * input :{10,20,30,40,50,60,70,80,90,100}
 * output:{100,10,90,20,80,30,70,40,60,50}
 */

package test;

public class AddElementSimultaneously {
	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] res = new int[arr.length]; // 10
		int index = 0, index1 = 1;

		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			res[index] = arr[i];
			index += 2;
		}
		for (int j = 0; j < arr.length / 2; j++) {
			res[index1] = arr[j];
			index1 += 2;
		}

		for (int ab : res) {
			System.out.print(ab + " ");
		}
	}

}
