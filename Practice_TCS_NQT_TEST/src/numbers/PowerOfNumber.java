package numbers;

public class PowerOfNumber {
	public static void main(String[] args) {
		int n=5;
		int pow=3;
		int ans=1;
		
		for(int i=0;i<pow;i++) {
			ans=ans*n;
		}
		System.out.println("Power of n into "+pow+" times is :" +ans);
	}

}
