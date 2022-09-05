//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
//method01
class Solution
{
    public static void sort012(int a[], int n)
    {
      int count1=0,count2=0,count3=0;
      for(int i=0;i<n;i++){
          if(a[i]==0){
              count1++;
          }
          else if(a[i]==1){
              count2++;
          }else
          count3++;
      }
      for(int i=0;i<n;i++){
          if(i<count1){
              a[i]=0;
          }
         else if(i>=count1 && i<count1+count2){
              a[i]=1;
          }else
          a[i]=2;
      }
    }
}





