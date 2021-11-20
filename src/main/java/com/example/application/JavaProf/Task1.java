package com.example.application.JavaProf;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner STDIN = new Scanner(System.in);
       int count = 0;
       while (STDIN.hasNext()){
           count++;
           System.out.println(count + " " + STDIN.nextLine());
        }
    }
}
