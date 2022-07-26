// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

class Solution{
     public static void swap(int ar[], int a, int b){
        int t=ar[a];
        ar[a]=ar[b];
        ar[b]=t;
    }
    public static int partition(int nums[], int l, int h){
        int pivot =nums[h];
        int i=l;
          int j=l;
          while(i<=h)
          {
           if(nums[i]<=pivot)
           {
               swap(nums[i],nums[j]);
               i++;
               j++;
           }
           else
           i++;
          }
          return j-1;
        }
    
    public static int quicksort(int nums[], int k, int l, int h){
        if(l<h){
            int piv=partition(nums, l, h);
            
            if(piv+1==k){
                return nums[piv];
            }
            
            else if(piv+1<k){
                l=piv+1;
                return quicksort(nums, k, l, h);
            }else{
                h=piv-1;
                return quicksort(nums, k, l, h);
            }
        }
        
        return nums[h];
    }
    
    
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
        return quicksort(arr, k, l, r);
    } 
}
