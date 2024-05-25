package Hashing.HashSet;

import java.util.HashMap;

public class Itenary {
    public static void main(String[] args) {
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("chennai","banglore");
        ticket.put("mumbai","delhi");
        ticket.put("goa","chennai");
        ticket.put("delhi","goa");
        String start = getTicket(ticket);
        while (ticket.containsKey(start)) {
            System.out.print(start + "->");
            start = ticket.get(start);
        }
        System.out.println(start);



    }
    public static String getTicket(HashMap<String,String> tick) {
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : tick.keySet()) {
            revMap.put(tick.get(key),key);
        }
        for (String key : tick.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

}
