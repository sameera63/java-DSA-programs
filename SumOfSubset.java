class SumOfSubset
{
static boolean Subset(int[] a,int n,int target)
{
if(target==0)
{
return true;
}
if(n==0)
{
return false;
}
if(a[n-1]>target)
return Subset(a,n-1,target);
return Subset(a,n-1,target)||Subset(a,n-1,target-a[n-1]);
}
public static void main(String[] args)
{
int[] a={2,5,8,6,3,4};
int target=49;
System.out.println(Subset(a,a.length,target));
}
}