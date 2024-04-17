package test;

public class MultiplyTwoArrayInReverse {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		
		String result="";
		for(int i=0;i<a.length;i++) {
			int num1=a[i];
			for(int j=a.length-1;j>=0;j--) {
				int num2=a[j];
				result=result+Integer.toString(num1*num2)+" ";
				break;
			}	
		}
		System.out.print("Result :"+result);
    }
}