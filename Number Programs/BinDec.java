package Practise1;

public class BinDec {

	public static void main(String[] args) {
		int n=1001;
		int j=1;
		int bin=0;
		for(int i=n;i>0;i/=10)
		{
			int bit=i%10;
			bin=bin+(bit*j);
			j=j*2;
		}
		System.out.println(bin);
	}

}
