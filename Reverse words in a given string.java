//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
     String str[]=S.split("\\.");
        String ss="";
        int n=str.length;
        for(int i=n-1;i>=0;i--){
            ss+=str[i]+".";
        }
        int m=ss.length();
        String ans=ss.substring(0,m-1);
        return ans;
    }
}
