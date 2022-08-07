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

// i got tle

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int n=arr.length;
      TreeSet<Integer>tm=new TreeSet<Integer>();
      for(int i=0;i<n;i++){
          tm.add(arr[i]);
      }
      int ans=Integer.MAX_VALUE;;
     int count=0;
      for(int nums:tm){
        arr[count++]=nums;
         }
         if(k>0){
      ans=arr[k-1];
         }
      return ans;
    
    
    }
}

//
class Solution{
     public static void swap(int ar[], int a, int b)
    {
        int t=ar[a];
        ar[a]=ar[b];
        ar[b]=t;
    }
    
    public static int partition(int nums[], int l, int h)
    {
        int i=l;
        int j=h;
        int pivot=nums[l];

        while(i<j)
        {
            while(i<=h && nums[i]<=pivot)
                i++;

            while(j>=l && nums[j]>pivot)
                j--;

            if(i<j)
                swap(nums, i, j);
        }
        swap(nums, j, l);

        return j;        
    }
    
    public static int quicksort(int nums[], int k, int l, int h)
    {
       
        if(l<h)
        {
            int piv=partition(nums, l, h);
            
            if(piv+1==k)
            {
                return nums[piv];
            }
            
            else if(piv+1<k)
            {
                l=piv+1;
                return quicksort(nums, k, l, h);
            }
            
            else 
            {
                h=piv-1;
                return quicksort(nums, k, l, h);
            }
        }
         
        return nums[h];
    }
    
    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        if(k==0){
            return Integer.MAX_VALUE;
        }else
        return quicksort(arr, k, l, r);
    } 
}

