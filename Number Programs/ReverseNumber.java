package Practise1;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=12345;
		int rem=0;
		int dig=0;
		for(int i=n;i>0;i/=10)
		{
			rem=i%10;
			dig=rem+dig*10;
		}
		System.out.println(dig);
	}

}
