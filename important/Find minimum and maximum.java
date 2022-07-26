// https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
//code
class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
       long min=Long.MAX_VALUE;
       long max=Long.MIN_VALUE;
       for(int i=0;i<n;i++){
           max=Math.max(max,a[i]);
           min=Math.min(min,a[i]);
       }
       return new pair(min,max);
    }
}
