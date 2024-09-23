package com.deloitte.lab2.ex4;
//Create a method which accepts an integer array and removes all the duplicates in the array.
//Return the resulting array in descending order
import java.util.Arrays;
import java.util.LinkedHashSet; //A LinkedHashSet maintains insertion order while ensuring no duplicates exist.
import java.util.Set;

public class Lab2Ex4 {

    public int[] modifyArray(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();//The LinkedHashSet ensures no duplicates 
        for (int num : arr) {//iterates through each element (num) 
            set.add(num);//each element is added to the set.
            
        }

        int[] result = new int[set.size()];
        int index = 0;//track of the current position in the result array.
        for (int num : set) {
            result[index++] = num;//index is incremented to the next position for the next element
        }
        //Sorting Descending

        Arrays.sort(result);
        reverseArray(result);

        return result;
    }

    private void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;// initialized to point to the last element in the array.

        while (left < right) {
            int temp = arr[left];// temp is used to store the element at the left index.
            arr[left] = arr[right];// swapped and assigned to the left index.
            arr[right] = temp;// completing the swap.
            left++;//left is incremented to move towards the center of the array.
            right--;//right is decremented to move towards the center of the array from the other end.
        }
    }

    public static void main(String[] args) {
        Lab2Ex4 remover = new Lab2Ex4();
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        int[] modifiedArr = remover.modifyArray(arr);
        for (int num : modifiedArr) {
            System.out.println(num);
        }
    }
}
