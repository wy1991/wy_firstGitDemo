package com.sina.wy;

public class PaiXu {
	 public void perm(char[] c,int start,int end)
	 {
	  if(start==end)
	  {
	   for(int i=0;i<=end;i++)
	   {
	    System.out.print(c[i]);
	   }
	   System.out.println();
	  }
	  else
	  {
	   for(int i=start;i<=end;i++)
	   {
	    char temp=c[start];
	    c[start]=c[i];
	    c[i]=temp;
	    perm(c,start+1,end);
	    temp=c[start];
	    c[start]=c[i];
	    c[i]=temp;
	   }
	  }
	 }
	 public static void main(String[] args) {
		 PaiXu p=new PaiXu();
	  p.perm("abcd".toCharArray(), 0, "abcd".length()-1);
	 }
	}
