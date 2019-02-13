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
public class Test {
    private iSort s;
    public Test(iSort s){
        this.s = s;
    }
    public void sort(int arr[],int l,int r){
        s.sort(arr,l,r);
    }
    
}
