package com.stackroute;
/*
Program1
        Write a program to find the number of counts in the following String . Store the output in
        Map< String ,Integer> as key value pair.
        Input : String str = “one one -one___two,,three,one @three*one?two”;
        Output : {"one":5 , "two":2, "three" :2}
*/
import java.util.*;
public class CheckFrequency {
    //Method for checking the frequency
    public static String checkFrequency(String string) {
        if (string == null)
            return null;
        List<String> stringList = Arrays.asList(string.split("[\\W_]+"));
        Map<String, Integer> map = new HashMap<>();
        for (String each : stringList) {
            if (map.containsKey(each)) {
                map.replace(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        return map.toString();
    }
    //Main method Driver Code
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String of elements");
        String string=scanner.nextLine();
        String result=checkFrequency(string);
        System.out.println(result);
    }
}
