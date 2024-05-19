package Practise1;

public class OddNum {

	public static void main(String[] args) {
		int start =1;
		int end =10;
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
