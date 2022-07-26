// https://practice.geeksforgeeks.org/problems/find-the-frequency/1
class Solution{
    int findFrequency(int A[], int x){
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(A[i]==x){
                count++;
            }
        }
        return count;
}
}
