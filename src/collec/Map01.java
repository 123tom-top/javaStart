package collec;

import java.util.*;

public class Map01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        test01(map);
    }


    private static void test01(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
//        for (String key:keys){
//            System.out.println(key+":"+map.get(key));
//        }
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            int value = map.get(key);
            System.out.println(key + ":" + map.get(key) + "...." + value);
        }


//        Map<String, Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//        map.put("three", 3);
//map.put("one",4);
//
//        int value=map.get("one");
//        System.out.println(map+"..."+map.size()+"..."+value);
//        System.out.println(map.containsKey("one"));
//        map.clear();
//        map.put("one", 1);
//        System.out.println(map);


    }
}
