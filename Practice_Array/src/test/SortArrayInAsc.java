package test;

public class SortArrayInAsc {
	public static void main(String[] args) {
		int[] a= {1,5,3,1,4,2,3,1,7,3};
		int[] a1=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a1[i]=a[i];
					a1[i]++;
				}
			}
		}
		for(int ab : a1) {
			System.out.print(ab+" ");
		}
	}

}
