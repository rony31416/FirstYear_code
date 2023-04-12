package javabasic;

import java.util.*;

public class MergeSort {
 
    static void merge (ArrayList<Integer> ara, int lo, int mid, int hi) {
        int left=lo, right=mid+1, i=0;
        ArrayList<Integer> copy=new ArrayList<Integer>();
        while (left<=mid && right<= hi) {
            if (ara.get(left) < ara.get(right)) {
                copy.set(i, ara.get(left));
                left++;
            }
            else {
                copy.set(i, ara.get(right));
                right++;
            }
            i++;
        }
        if (left>mid) {
            while (right<=hi) {
                copy.set(i, ara.get(right));
                right++;
                i++;
            }
        }
        if (right>hi) {
            while (left<=mid) {
                copy.set(i, ara.get(left));
                left++;
                i++;
            }
        }
        int j=lo;
        i=0;
        while (j<=hi) {
            ara.set(j, copy.get(i));
            j++;
            i++;
        }
        copy.clear();
    }
 
    static void mergeSort(ArrayList<Integer> ara, int lo, int hi) {
        if (lo<hi) {
            int mid=lo+(hi-lo)/2;
            mergeSort(ara, lo, mid);
            mergeSort(ara, mid+1, hi);
            merge(ara, lo, mid, hi);
        }
    }
 
    public static void main(String[] args) {
        ArrayList<Integer> ara=new ArrayList<Integer>();
        Scanner obj_in=new Scanner (System.in);
 
        // ask to input array size
        System.out.println("Enter the size of the array:");
        int size=obj_in.nextInt();
 
        // ask to input the whole array
        System.out.println("Enter the array elements:");
        for (int i=0; i<size; i++) {
            int x=obj_in.nextInt();
            ara.add(x);
        }
 
        // print the unsorted array
        System.out.println("Before sorting:");
        for (int i:ara) System.out.println(i);
        mergeSort(ara, 0, size-1);
 
        // print the sorted array
        System.out.println("\nAfter sorting:");
        for (int i:ara) System.out.println(i);

    }
}
 
 