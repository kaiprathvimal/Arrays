package Hashing.HashSet;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr = {4,5,6};
        int[] arr1 = {1,2,4,3,6};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        System.out.println(set.size() + "" + set);
    }
}
