// Lc-368 
// Given a set of distinct positive integers nums, return the largest subset answer such that every pair 
// (answer[i], answer[j]) of elements in this subset satisfies:

//     answer[i] % answer[j] == 0, or
//     answer[j] % answer[i] == 0

// If there are multiple solutions, return any of them.

// TestCase1-Input: nums = [1,2,3]
// Output: [1,2]

// TestCase2- Input: nums = [1,2,4,8]
// Output: [1,2,4,8]


// so in this question we have to return an subset of the given array in which elements should be divisible by each other.ie,for
// example if we take 1 and then for picking up do we need to check if either 1%2==0 or 2%1==0(matlb vise versa is also allowed);
// so this seems like pick not pick patter but with few catches 
// 1.We gotta return the array.
// 2.we have to check for divisiblity
// gives heavy Lis vibes right??..i will take help of Lis Tabulation code.

import java.util.*;
class LargestDivisibles{
    public List<Integer>  LongestDivisibleSubset(int[] nums){

    }
}