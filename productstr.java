import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a*b;
		String res=Integer.toString(c);
		System.out.println(res);
	}
}
