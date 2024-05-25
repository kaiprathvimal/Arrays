package Hashing.HashSet;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,5,1};//number count grater than n/3
        //1 - initialize map
        //iterate through loop and check exist or not ,if exist update or else add new pair
        //print the number with more count
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1 );
            }else {
                map.put(nums[i], 1 );
            }
        }
        for (int key :map.keySet()) {
            if(map.get(key) >n/3){
                System.out.println(key);
            }
        }

        //Get the key and its count
        for (Map.Entry<Integer,Integer> entry :map.entrySet()) {

                System.out.println(entry);

        }
        // repeating values
        for (int key :map.keySet()) {
            if(map.get(key) >1){
                System.out.println(key);
            }
        }
        //non repeating
        for (int key :map.keySet()) {
            if(map.get(key) == 1){
                System.out.println(key);
            }
        }


    }
}
