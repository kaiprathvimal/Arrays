import java.util.HashMap;
import java.util.Map;
//create map
//iterate through loop and add value to map
//iterate through loop, find difference - target - num[i]
// if that value is there in array return
public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution sol = new Solution();
        int[] result = sol.twoSum(nums,target);
        if (result.length == 2) {
            System.out.println(nums[0] + ","+nums[1]);
        }else {
            System.out.println("No value");
        }

    }

}
class Solution {
   public int[] twoSum(int[] nums,int target) {
       int n = nums.length;
       Map<Integer,Integer> newMap = new HashMap<>();
       for (int i =0; i<n; i++) {
           newMap.put(nums[i],i);
       }
       for (int i =0; i<n; i++) {
           int diff = target - nums[i];
           if(newMap.containsKey(diff) && newMap.get(diff) != nums[i]) {
               return new int[] {i,newMap.get(diff)};
           }
       }
       return new int[] {};

   }
}


