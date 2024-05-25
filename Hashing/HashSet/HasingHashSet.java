package Hashing.HashSet;

import java.util.HashSet;

public class HasingHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);
        System.out.println("Size -" + set.size());
        if(set.contains(1)) {
            System.out.println("Contains");
        }
        if(!set.contains(7)) {
            System.out.println("not contain");
        }
        if(set.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("Not empty");
        }
        set.remove(1);
        System.out.println(set);

    }
}
