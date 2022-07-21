/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int testCase=sc.nextInt();
		for(int i=0;i<testCase;i++){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    if(n>1 && m>1){
		        if(n%2==0 && m%2==0){
		            System.out.println(0);
		        }
		        else if(n%2==0 && m%2!=0){
		            System.out.println((m%2)*n);
		        }
		        else if(n%2!=0 && m%2==0) {
		            System.out.println((n%2)*m);
		        }
		        else{
		            System.out.println(m+n-1);
		        }
		    }
		    else if(n>1 && m==1){
		        System.out.println(n);
		    }
		    else if(n==1 && m>1){
		        System.out.println(m);
		    }
		    else if(n==1 && m==1){
		        System.out.println(1);
		    }
		        
		}
	}
}

