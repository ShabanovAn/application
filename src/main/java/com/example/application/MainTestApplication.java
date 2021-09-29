package com.example.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class MainTestApplication {
    public static void main(String[] args) {
        System.out.println("ds");
        //System.out.println(killShars("ABCdefabc", "be"));
        System.out.println(killShars("ABCdefabc", "be"));
    }
    public static String  killShars(String val, String chars){
        String result = val;
        for (Object c : chars.toCharArray()) {
            if (result.contains(String.valueOf(c).toLowerCase()) || result.contains(String.valueOf(c).toUpperCase())) {
             result =  result.replaceAll(String.valueOf(c).toLowerCase(), "");
             result =  result.replaceAll(String.valueOf(c).toUpperCase(), "");
            }
        }
        return result;
    }
}


