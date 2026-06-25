// Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.
// https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1

// Input: txt = "forxxorfxdofr", pat = "for"
// Output: 3
class occuranceofanagram{
    public static boolean allzero(int[] arr){
        for(int it:arr){
            if(it!=0){
                return false;
            }
        }
        return true;
    }
    public static int search(String pat, String txt){
      int[] ch=new int[26];
    //   freq array for all 26 letters.
     for(char c:pat.toCharArray()){
        int it=c-'a';
        ch[it]++;
     }
     int i=0,j=0,count=0;
     while(j<txt.length()){
        int it=txt.charAt(j)-'a';
        ch[it]--;
        if(j-i+1==pat.length()){
            if(allzero(ch)) count++;
            int itr=txt.charAt(i)-'a';
            ch[itr]++;
            i++;
        }
        j++;
     }
     return count;
    }
    public static void main(String[] args) {
        String txt="forxxorfxdofr";
        String pat="for";
        int result=search(pat,txt);
        System.out.println(result);
    }
}