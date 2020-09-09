package com.stackroute;
/*
Program2
        Write a program where an array of strings is input and output is a Map< String,boolean>
        where each different string is a key and its value is true if that string appears 2 or more
        times in the array
        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
*/
import java.util.*;
public class CheckAppearance {
    //this method is used to check occurrence of string
    // value in big paragraph we set value is true if that string appears 2 or more times in the array
    public static String checkAppearance(String string) {
        if (string == null) return null;
        List<String> stringList = Arrays.asList(string.split("[\\W_]+"));
        Map<String, Integer> map = new HashMap<>();
        for (String each : stringList) {
            if (map.containsKey(each)) {
                map.replace(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        // new HashMap for desired output
        Map<String, Boolean> booleanMap = new HashMap<>();
        for (String each : map.keySet()) {
            if (map.get(each) >= 2) {
                booleanMap.put(each, true);
            } else {
                booleanMap.put(each, false);
            }
        }
        return booleanMap.toString();
    }

    //Main method Driver Code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=scanner.nextInt();
        String[] array=new String[size];
        System.out.println("Enter the array elements");
        for (int i=0;i<array.length;i++)
            array[i]=scanner.next();
        String result = checkAppearance(Arrays.toString(array));
        System.out.println(result);
    }
}
