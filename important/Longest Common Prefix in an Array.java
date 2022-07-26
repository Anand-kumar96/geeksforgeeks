//https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1
class Solution{
    String longestCommonPrefix(String arr[], int n){
     int i = 0, j, len = arr[0].length();
        String str = "";
        while(i<len){
            str = arr[0].substring(0,i+1);
            for(j=1; j<n; j++){
                if(arr[j].startsWith(str)==false){
                    str = str.substring(0,i);
                    break;
                }
            }
            if(j!=n)
                break;
            i++;
        }
        if(str.isEmpty())
            return "-1";
        return str;
        
    
    }
}
