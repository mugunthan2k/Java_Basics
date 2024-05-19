package Practise1;

public class NivenNum {

	public static void main(String[] args) {
		int n=12;
		int sum=0,rem=0,res=0;
		for(int i=n;i>0;i/=10)
		{
			rem=i%10;
			sum+=rem;
		}
		res=n/sum;
		if(n%sum==0)
		{
			System.out.println(res+" Given number is Niven Number");
		}
		else
		{
			System.out.println("Not a Number");
		}

	}

}
