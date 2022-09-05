// https://practice.geeksforgeeks.org/problems/peak-element/1

// code
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
     int indexpeak=0;
     for(int i=1;i<n;i++){
         if(arr[i]>arr[indexpeak]){
            indexpeak=i ;
         }
         
     }
     return indexpeak;
    }
}
