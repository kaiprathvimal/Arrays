package Hashing.HashSet;

import java.util.HashMap;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,4,6,6,7,4};
        int[] arr2 = {3,2,1,6,9,4,1};
        System.out.println(inter(arr1,arr2));
    }
    public static int inter(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if(set.contains(arr2[j])) {
                count++;
                set.remove(arr2[j]);
            }
        }

        return count;

    }
}

