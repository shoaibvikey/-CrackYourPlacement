/*
Given an array arr[] of length n. Find all possible unique permutations of the array in sorted order. A sequence A is greater than sequence B if there is an index i for which Aj = Bj for all j<i and Ai > Bi.

Example 1:

Input: 
n = 3
arr[] = {1, 2, 1}
Output: 
1 1 2
1 2 1
2 1 1
Explanation:
These are the only possible unique permutations
for the given array.
Example 2:

Input: 
n = 2
arr[] = {4, 5}
Output: 
Only possible 2 unique permutations are
4 5
5 4
Your Task:
You don't need to read input or print anything. You only need to complete the function uniquePerms() that takes an integer n, and an array arr of size n as input and returns a sorted list of lists containing all unique permutations of the array.

Expected Time Complexity:  O(n*n!)
Expected Auxilliary Space: O(n*n!)

Constraints:
1 ≤ n ≤ 9

---->> Answer

public class AllUniquePermutationsOnArray {
    
}
class Solution {
    static ArrayList<ArrayList<Integer>> ans;
    static Set<ArrayList<Integer>> set;
    Solution(){
        this.ans =  new ArrayList<>();
        this.set = new HashSet<>();
    }
    public static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
       
        unique_Permutation(arr,n,0);
        
        Collections.sort(ans,(x,y)->{
            for(int i=0;i<x.size();i++){
                if(x.get(i)!=y.get(i)) return x.get(i)-y.get(i);
            }
            return x.get(x.size())-y.get(y.size());
        });
        
        return ans;
    }
    public static void unique_Permutation(ArrayList<Integer> arr,int n,int pos){
        
        if(pos==n){
            if(!set.contains(arr)){
                ans.add(new ArrayList<>(arr));
                set.add(new ArrayList<>(arr));
            }
            return;
        }
        for(int i=pos;i<n;i++){
            swap(arr,pos,i);//Collections.swap(arr,pos,i);
            unique_Permutation(arr,n,pos+1);
            swap(arr,i,pos);//backtracking part
        }
    }
    public static void swap(ArrayList<Integer> arr,int i,int j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
}
 */

//  Another Comment