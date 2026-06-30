// 1358. Number of Substrings Containing All Three Characters
// Input: s = "abcabc"
// Output: 10
// Explanation: The substrings containing at least one occurrence of the characters a, b and c are 
// "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again)

import java.util.*;
class sswithall3c{
    public static int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int i=0,len=0;
        for(int j=0;j<n;j++){
          char ch=s.charAt(j);
          map.put(ch,map.getOrDefault(ch,0)+1);
          while(map.size()==3){
            len+=s.length()-j;
            char c=s.charAt(i);
            map.put(c,map.get(c)-1);
            if(map.get(c)==0) map.remove(c);
            i++;
          }
        }
        return len;
    }
    public static void main(String[] args){
        String s="abcabc";
        int len=numberOfSubstrings(s);
        System.out.println(len);

    }
}