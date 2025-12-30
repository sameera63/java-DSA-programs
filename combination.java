public class combination {
	static void combinations(int[] a,int index,int target,String p) 
	{
		if(target==0) {
			System.out.println(p);
			return;
		}
		if(index==a.length||target<0) 
			return;
		combinations(a,index,target-a[index],p+a[index]+" ");
		combinations(a,index+1,target,p);
		}
	public static void main(String[] arg) {
		int []a= {2,4,8,7,6,1};
		int target=8;
		combinations(a,0,target,"");
		}
	}


