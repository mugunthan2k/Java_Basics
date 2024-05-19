package Practise1;

public class XylemNum {

	public static void main(String[] args) {
		// 31233
		int n=31233;
		int last=n%10;
		int num=n/10;
		int rem=0,sum=0;
		int fir=0;
		while(num>9)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		fir=num+last;
		if(fir==sum)
		{
			System.out.println("Xylem");
		}
		else
		{
			System.out.println("ployem");
		}
	}

}
