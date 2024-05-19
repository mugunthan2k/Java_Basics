package Practise1;

public class SumDigits 
{

	public static void main(String[] args) 
	{
		int n=123;
		int rem=0,ans=0;
		for(int i=n;i>0;i/=10)
		{
			rem=i%10;
			ans+=rem;
		}
		System.out.println(ans);

	}

}
