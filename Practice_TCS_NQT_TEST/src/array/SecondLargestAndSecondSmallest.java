package array;

public class SecondLargestAndSecondSmallest {
	public static void main(String[] args) {
		int[] a = { 12, 6, 2, 1, 9, 8, 4, 7, 5, 13 };
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int ab : a) {
			System.out.print(ab+" ");
		}
		System.out.println("\nSecond Largest :"+a[a.length-2]);
		System.out.println("Second Smallest :"+a[1]);
	}	
}
