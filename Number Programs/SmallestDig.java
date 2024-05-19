package Practise1;

public class SmallestDig {

	public static void main(String[] args) {
		int n=134234984;
		int rem=0,small=9;
		for(int i=n;i>0;i/=10)
		{
			rem=i%10;
			
			if(small>rem)
			{
				small=rem;
				
			}
		}
		System.out.println(small);
	}

}
