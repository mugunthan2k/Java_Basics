package Practise1;

public class AmstrongNum {

	public static void main(String[] args) {
		int n=153;
		int count=0;
		int rem=0,ans=0;
		for(int i=n;i>0;i/=10)
		{
			count++;
		}
		for(int j=n;j>0;j/=10)
		{
			rem=j%10;
			int fact=1;
			for(int i=1;i<=count;i++)
			{
				fact*=rem;
			}
			ans+=fact;
		}
		if(ans==n)
		{
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
	}

}
