/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLID;

/**
 *
 * @author USER
 */
public class BubbleSort implements iSort {

    @Override
    public void sort(int[] arr,int l,int r) {
       // int n = arr.length;
        int temp = 0;
        for (int i = l; i < r; i++) {
            for (int j = 1; j < (r - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        
    }

}
