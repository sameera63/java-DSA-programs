package miniproject;

import java.util.*;

public class combination2 {
	static void combinations(int[] a,int index,int target,String p) 
	{
		if(target==0) {
			System.out.println(p);
			return;
		}
		for(int i=index;i<a.length;i++)
		{
		if(i>a[index]&&a[i]==a[i-1]) 
			continue;
		if(a[i]>target)
		{
			break;
		}
	combinations(a,i+1,target-a[i],p+a[i]+" ");
		}
	}
	public static void main(String[] arg) {
		int []a= {2,4,8,7,6,1};
		int target=6;
		combinations(a,0,target,"");
		}
}
