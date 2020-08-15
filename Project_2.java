package ru.geekbrains.j_one.lesson_a.online;

import java.util.Arrays;

public class Project_2 {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 0, 1};
        if (arr[0] == 1) arr[0] = 0;
            // ...
        else arr[0] = 1;
        if (arr[1] == 1) arr[1] = 0;
            // ...
        else arr[1] = 1;
        if (arr[2] == 1) arr[2] = 0;
            // ...
        else arr[2] = 1;
        if (arr[3] == 1) arr[3] = 0;
            // ...
        else arr[3] = 1;
        if (arr[4] == 1) arr[4] = 0;
            // ...
        else arr[4] = 1;
        if (arr[5] == 1) {
            arr[5] = 0;

        }
        //
        else {
            arr[5] = 1;

        }
        System.out.println(Arrays.toString(arr));
        // ...

        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[8];
        int j = 0;
        for (int i = 0; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));


        System.out.println(Arrays.toString(arr));
        {
            int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) arr3[i] = arr3[i] * 2;
                {
                    // System.out.println(Arrays.toString(arr3));
                }
            }
        }


        System.out.println(Arrays.toString(arr));
            int numbers[] = { 1,2,3,4 };
            int min, max;
            min = max = numbers[0];

            for (int i = 1; i < 4; i++) {
                if (numbers[i] < min)
                    min = numbers[i];
                if(numbers[i] > max){
                    max = numbers[i];
                }
            }
            System.out.println("min is: " + min + "; max is: " + max);
        }
    }












