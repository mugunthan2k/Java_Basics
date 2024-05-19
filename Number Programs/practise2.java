package Practise1;

public class practise2 
{
	public static void main(String[] args) 
	{
		String s="raman yiih";
		char[]a=s.toCharArray();
		int count=0;
		for(char c:a)
		{
			if(c>='a'&&c<='z')
			{
				String s1=s.replace(c+"", "");
				 count+=s.length()-s1.length();
				 s=s1;
			}			 
		}
		System.out.println(count);
	}
}
