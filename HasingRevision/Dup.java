package HasingRevision;

import java.util.HashSet;

public class Dup {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
Solution sol = new Solution();
        System.out.println(sol.trueOr(arr));

    }
}
class Solution {
    public boolean trueOr(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else {
                return true;
            }
        }
        return false;
    }
}