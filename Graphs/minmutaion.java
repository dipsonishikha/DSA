// leetcode 433


// Example 1:

// Input: startGene = "AACCGGTT", endGene = "AACCGGTA", bank = ["AACCGGTA"]
// Output: 1

// Example 2:

// Input: startGene = "AACCGGTT", endGene = "AAACGGTA", bank = ["AACCGGTA","AACCGCTA","AAACGGTA"]
// Output: 2
//  this question is similar to The word ladder problem-:
// so we are given with an 8 character ka string(start gene) and we have to make it endgene with the Strings present in the bank;
//  we can solve this queustion using the bfs approch but we would also need hashSet(to store the bank as searching in a set is less
// expensive as compared to array))
import java.util.*;
class Pair<K,V>{
    public K key;
    public V value;
    pubic Pair(K,V){
        this.key=key;
        this.value=value;
    }
}
class Solution{
     public int minMutation(String startGene, String endGene, String[] bank){
      
     }