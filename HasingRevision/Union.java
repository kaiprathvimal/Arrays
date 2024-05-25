package HasingRevision;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,45,6,1};
        int[] arr2 = {45,6,7,8,9};
        //union and its count = 9{1,2,3,45,6,7,8,9}
        HashSet<Integer> set = new HashSet<>();
        System.out.println(set);
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        System.out.println(set.size() + "" + set);
    }
}
