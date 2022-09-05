
//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S){
        // method 01
    String str[]=S.split("\\."); // we have to write \\ to split
    int n=str.length;
    String ans="";
    for(int i=n-1;i>0;i--){
            ans=ans+str[i]+".";
        }
      ans=ans+str[0];
       
    return ans;
    
    
    //  //method 02
      class Solution {
    String reverseWords(String S){
      String str[]=S.split("\\."); // we have to write \\ to split
    int n=str.length;
    String ans="";
    for(int i=n-1;i>=0;i--){
            ans=ans+str[i]+".";
      }
      ans=ans.substring(0,ans.length()-1);
    return ans;
    
    // // method 03
      class Solution {
    String reverseWords(String S){
    StringBuilder sb=new StringBuilder();
    String str[]=S.split("[.]"); // ("\\.");

    for(int i=str.length-1;i>0;i--){
        sb.append(str[i]);
        sb.append(".");
    }
    sb.append(str[0]);
    return sb.toString();
    
    
    // method 04
      class Solution {
    String reverseWords(String S){
    Stack<String>st=new Stack<>();
    String ans="";
    String str[]=S.split("[.]"); // ("\\.");
    for(int i=0;i<str.length;i++){
        st.push(str[i]);
        st.push(".");
    }
    st.pop();
    while(!st.isEmpty()){
        ans+=st.pop();
    }
    return ans;
     
    }
}
