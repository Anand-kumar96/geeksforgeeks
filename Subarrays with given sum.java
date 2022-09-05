class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>hm=new HashMap<>();    
        int sum=0;
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
             if(sum==s){
                 list.add(1);
                 list.add(i+1);
                 return list;
             }
            if(hm.containsKey(sum-s) && hm.get(sum-s)!=i){
                list.add(hm.get(sum-s)+2);
                list.add(i+1);
                return list;
            }
           else hm.put(sum,i);
        }
        list.add(-1);
        return list;
    }
}

// second method
class Solution
{   
  //Function to find a continuous sub-array which adds up to a given number.
   static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
   {
          ArrayList<Integer> a = new ArrayList<Integer>();
      for(int i=0;i<n;i++)
      {
          int j=i+1;
          int sum = arr[i];
          while(sum<s && j < n)//1<12//1<arr.length
          {
              sum = sum + arr[j++];
          }
          if(sum == s)
          {
              a.add(i+1);
              a.add(j);
              return a;
          }
      }
      a.add(-1);
      return a;
    }
}
