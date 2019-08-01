package tests;

import java.util.HashMap;
import java.util.Map;

public class CountOfElements {

    // !!! TASK: How many times each element in the row is repeated? !!!

    public static void main(String[] args) {
        String str = "Hello Hello it's me ! ! !";
        Map<String, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(String.valueOf(chars[i]))) {
                map.put(String.valueOf(chars[i]), 1);
            } else {
                map.put(String.valueOf(chars[i]), map.get(String.valueOf(chars[i])) + 1);
            }
        }

        for (Map.Entry<String, Integer> maps : map.entrySet()) {
            System.out.println(maps.getKey() + " " + maps.getValue());
        }
    }


}








