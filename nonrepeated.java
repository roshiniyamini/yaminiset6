import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, flag = 0, count = 0;
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt();
        int a[] = new int[n];
       
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i != j)
                {
                    if(a[i] != a[j])
                    {
                        flag = 1;
                    }
                    else
                    {
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag == 1)
            {
                count++;
                System.out.print(a[i]);
            }
        }
    }   
}	
