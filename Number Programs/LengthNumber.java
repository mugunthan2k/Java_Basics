package Practise1;

public class LengthNumber {

	public static void main(String[] args) {
		int n=1235433;
		int count=0;
		for(int i=n;i>0;i/=10)
		{
			count++;
		}
		System.out.println(count);

	}

}
