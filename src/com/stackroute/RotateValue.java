package com.stackroute;
/*
Program3
        Write a Program to modify the map as per the below scenarios
        Scenario 1 : Given two key-value pairs in map modify values {"val1": "java", "val2":
        "c++"} and return {"val1": " ", "val2":"java"}
        Scenario 2: Given two key-value pairs in map modify values {"val1": "mars", "val2":
        "saturn"} and return {"val1": " ", "val2":"mars"}
*/
import java.util.*;
public class RotateValue {
    //     If the key `val1` has a value, set the key `val2` to have that value, and
    //         Set the key `val1` to have the value `" "` (empty string).
    public static String rotateValue(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        String val1 = map.get("val1");
        map.replace("val2", val1);
        map.replace("val1", " ");
        return map.toString();
    }
    //Main method Driver Code
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String, String> hMap = new HashMap<>();
        System.out.println("Enter the size of map.");
        int size=scanner.nextInt();
        System.out.println("Enter the values in hash map");
        for (int i = 0; i < size; i++) {
            String value1 =scanner.next();
            String value2 =scanner.next();

            hMap.put(value1, value2);
        }
        String result=rotateValue(hMap);
        System.out.println(result);
    }
}
