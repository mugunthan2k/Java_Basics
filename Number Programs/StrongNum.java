package Practise1;

public class StrongNum {

	public static void main(String[] args) {
		int n=145,rem=0,sum=0;
		for(int i=n;i>0;i/=10)
		{
			rem=i%10;
			int fact=1;
			for(int j=1;j<=rem;j++)
			{
				fact=fact*j;
			
			}
			sum+=fact;
			
		}
		if(sum==n)
		{
			System.out.println("Strong");
		}
		else
		{
			System.out.println("Not Strong");
		}
	}

}
