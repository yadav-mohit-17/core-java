package array;

public class RotateArrayFromKthIndex {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] res=new int[arr.length];
		int k=3,count=0 ,index=0;
		
		for(int i=k;i<arr.length;i++) {
			res[index]=arr[i];
			index++;
			count++;
		}
		for(int i=0;i<arr.length-count;i++) {
			res[index]=arr[i];
			index++;
		}
		System.out.print("Original Array :");
		for(int ab : arr) {
			System.out.print(ab+" ");
		}
		
		System.out.print("\nRotated Array  :");
		for(int ab :res) {
			System.out.print(ab+" ");
		}	
	}

}
