/**
 * input :{0, 1, 0, 2, 0, 1, 2, 1, 2}
 * output:{0, 0, 0, 1, 1, 1, 2, 2, 2}
 */

package test;

import java.util.Arrays;

public class SegregateElementsFromRandomOrder {
	public static void main(String[] args) {
		int[] arr= {0, 1, 0, 2, 0, 0, 2, 1, 0};
		int[] arr1=new int[arr.length];	
		
		for(int i=0;i<arr.length;i++) {

			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int ab : arr) {
			System.out.print(ab+" ");
		}
	}

}
