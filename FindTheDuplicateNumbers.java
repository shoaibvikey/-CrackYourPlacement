public class FindTheDuplicateNumbers {
    
}
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] bool = new boolean[nums.length];
        for(int num:nums){
            if(bool[num]){
                return num;
            }
            bool[num] = true;
        }
        return 0;
    }
}