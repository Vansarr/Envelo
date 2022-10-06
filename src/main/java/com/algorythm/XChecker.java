package com.algorythm;

import java.util.Arrays;

public class XChecker {

    private static boolean checkForX(int[] numbers, int x){
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        int left = -1;
        int right = numbers.length;

        while(right > left + 1) {
            int mid = (left + right) / 2;
            if (numbers[mid] <= x)
                right = mid;
            else
                left = mid;
        }
        return right < numbers.length && numbers[right] == x;
    }
}
