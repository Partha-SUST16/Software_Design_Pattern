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
public class Main {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 8;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 20;
       
       
//        BubbleSort bs = new BubbleSort();
//        SORTING s = bs;
//        s.sort(arr, 0, arr.length);
        Test a1 = new Test(new BubbleSort());
        a1.sort(arr,0,arr.length);
        System.out.println("Bubble Sort");
        for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
        System.out.println("");
        
        
        Test a2 = new Test(new MergeSort());
        a2.sort(arr,0,arr.length-1);
        
        
        System.out.println("Merge Sort");
        for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
        System.out.println("");
    }
}
