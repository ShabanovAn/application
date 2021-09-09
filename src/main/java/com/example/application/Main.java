package com.example.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //private static ArrayList<Object> list;
    public List<Number> list;
    public static void main(String[] args) {
        int[] numbers = {10, 15, 22, 1, 56, 34, 45, 10, 15, 22, 56, 34, 45,99};
        System.out.println(searchInt(numbers));
        //System.out.println(Arrays.stream(numbers).max().getAsInt());
        Arrays.stream(numbers).distinct();
      //
    }

    /*
Напишите функцию, которая находит во входном массиве (или списке, на Ваш выбор) целых чисел два числа, ближайших к заданному: одно сверху, одно снизу, и возвращает эту пару упорядоченной по возрастанию.
Например, для массива [-10,100,20,50] и заданного числа 80 — функция должна вернуть пару [50,100]. Для заданного числа 120 — вернуть [100]. Для заданного числа -15 — [-10]. Для заданного числа 50 — [50,50]. Для пустого входного массива и любого заданного числа – вернуть пустой массив.
Сложность не более O(n), где n – длина массива.
*/

    public static int searchInt(int[] number) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }else {
                max = number[i];
            }
        }
         return max;
        }
    }

