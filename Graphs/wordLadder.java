// leetcode 127.
import java.util.*;
class wordLadder{
   public static int ladderLength(String beginWord, String endWord, ArrayList<String> wordList) {
      HashSet<String> set=new HashSet<>(wordList);
      if(!set.contains(endWord)) return 0;
      Queue<Pair<String,Integer>> q=new LinkedList<>();
      q.offer(new Pair<>(beginWord,1));
      set.remove(beginWord);
      while(!q.isEmpty()){
        Pair<String,Integer> curr=q.poll();
        String word=curr.key;
        Integer no=curr.value;
        if(word.equals(endWord) )return no;
        for(int i=0;i<word.length();i++){
             char[] arr=word.toCharArray();
             char original=arr[i];
             for(char c='a';c<='z';c++){
                arr[i]=c;
                String newWord=new String(arr);
                if(set.contains(newWord)){
                q.offer(new Pair<>(newWord,no+1));
                set.remove(newWord);
                }
             }
             arr[i]=original;
        }
      }
    return 0;
   }
   public static void main(String[] args){
    String beginWord="hit";
    String endWord="cog";
    ArrayList<String> wordList=new ArrayList<>();
    wordList.add("hot");
    wordList.add("dot");
    wordList.add("dog");
    wordList.add("lot");
    wordList.add("log");
    wordList.add("cog");
    int ans=ladderLength(beginWord,endWord,wordList);
    System.out.println(ans);
   }
   
}
class Pair<K,V>{
    public final K key;
    public final V value;
    public Pair(K key,V value){
        this.key=key;
        this.value=value;
    }
}
// timecomplexity-
// Spacecomplexity-O(n)--set, O(n)--queue-->O(n)
// timecomplexity-O(NL^2)