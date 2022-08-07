// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

class Solution{
    void swap(int arr[], int l, int r){
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }
    
    int randomPartition(int arr[], int l, int r){
        int n = r-l+1;
        Random rd = new Random();
        int pivot = rd.nextInt(n);
        swap(arr, l + pivot, r);
        return partition(arr, l, r);
    }
    
    int kthSmallest(int arr[], int l, int r, int k)
    {
        // If k is smaller than number of elements in array
        if (k > 0 && k <= r - l + 1)
        {
            // find a position for random partition
            int pos = randomPartition(arr, l, r);
            
            // if this pos gives the kth smallest element, then return
            if (pos-l == k-1)
                return arr[pos];
                
            // else recurse for the left and right half accordingly
            if (pos-l > k-1)  
                return kthSmallest(arr, l, pos-1, k);
            return kthSmallest(arr, pos+1, r, k-pos+l-1);
        }
    
        return Integer.MAX_VALUE;
    }
    
    int partition(int arr[], int l, int r)
    {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++)
        {
            if (arr[j] <= x)
            {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
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

