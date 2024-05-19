package Practise1;

public class PalindromeNum {

	public static void main(String[] args) {
		int n=121,sum=0,rem=0;
		for(int i=n;i>0;i/=10)
		{
			rem=i%10;
			sum=sum*10+rem;
		}
		
		if(n==sum)
		{
			System.out.println("Palindrome");
		}
		else 
			System.out.println("not palindrome");
	}

}
