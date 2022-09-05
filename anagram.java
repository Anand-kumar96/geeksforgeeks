class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b){
        //method 01
        
        char str1[]=a.toCharArray();
        char str2[]=b.toCharArray();
        int n1=str1.length;
        int n2=str2.length;
        Arrays.sort(str1);
        Arrays.sort(str2);
      if(n1!=n2){
          return false;
      }else{
          for(int i=0;i<n1;i++){
              if(str1[i]!=str2[i]){
                  return false;
              }
          }
      }
        return true;
    }
    
    
    
    //method 02
    // using 1 hashmap
    
        char str1[]=a.toCharArray();
        char str2[]=b.toCharArray();
        int n1=str1.length;
        int n2=str2.length;
        if(n1!=n2){
            return false;
        }
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<n1;i++){
            if(hm.containsKey(str1[i])){
             hm.put(str1[i],hm.get(str1[i])+1);
            }else{
                hm.put(str1[i],1);
            }
        }
        
        for(int i=0;i<n1;i++){
            if(!hm.containsKey(str2[i])){
                return false;
            }else if(hm.containsKey(str2[i])){
                hm.put(str2[i],hm.get(str2[i])-1);
            }
            }
           
            for(Character num:hm.keySet()){
                if(hm.get(num)!=0){
                    return false;
                }
            }
            return true;
        
}


//method 03
// using method 

        char str1[]=a.toCharArray();
        char str2[]=b.toCharArray();
        int n1=str1.length;
        int n2=str2.length;
        if(n1!=n2){
            return false;
        }
         Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2)){
            return true;
        }
        return false;



// method 04
// using 2 hashmap---> error i don't know why

        char str1[]=a.toCharArray();
        char str2[]=b.toCharArray();
        int n1=str1.length;
        int n2=str2.length;
        if(n1!=n2){
            return false;
        }
        HashMap<Character,Integer>hm1=new HashMap<>();
        for(int i=0;i<n1;i++){
            if(hm1.containsKey(str1[i])){
             hm1.put(str1[i],hm1.get(str1[i])+1);
            }else{
                hm1.put(str1[i],1);
            }
        }
        HashMap<Character,Integer>hm2=new HashMap<>();
        for(int i=0;i<n2;i++){
            if(hm2.containsKey(str2[i])){
             hm2.put(str2[i],hm2.get(str2[i])+1);
            }else{
                hm2.put(str2[i],1);
            }
        }
        
        for(int i=0;i<n1;i++){
            if(hm1.get(str1[i])!=hm2.get(str1[i])){
                return false;
            }
        }
        return true;
        
        
        
       // method 05-->counting character
       
        char str1[]=a.toCharArray();
        char str2[]=b.toCharArray();
        int n1=str1.length;
        int n2=str2.length;
        if(n1!=n2){
            return false;
        }
        int al1[]=new int[256];// total no. of char in asci table
        int al2[]=new int[256];
         int index=0;
        for(int i=0;i<n1;i++){
            index=(int)str1[i];// typecasting char to asci
            al1[index]++;
        }
        index=0;
         for(int i=0;i<n1;i++){
            index=(int)str2[i];// typecasting char to asci
            al2[index]++;
        }
       for(int i=0;i<256;i++){
           if(al1[i]!=al2[i]){
               return false;
           }
       }
       return true;
}
}
