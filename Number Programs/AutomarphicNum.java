package Practise1;

public class AutomarphicNum
{
	public static void main(String[] args) 
	{
		int n=25;
		int sqr=n*n;
		int count=0,dig=1,ans=0;
		for(int i=n;i>0;i/=10)
		{
			count++;
		}
		for(int j=1;j<=count;j++)
		{
			dig=dig*10;
		}
		ans=sqr%dig;
		if(ans==n)
		{
			System.out.println("Automorphic");
		}
		else
		{
			System.out.println("Not Automarphic");
		}
	}
}
