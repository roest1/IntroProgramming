/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author rileyoest
 */
public class KSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int k;
        int [] A = new int[5];
        Random rand = new Random();
        A[0] = 0;
        for(int i = 1; i < A.length - 1; i++){
            A[i] = 0;
        }
        A[A.length - 1] = 0;
        System.out.println(Arrays.toString(A));
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter k number min elements to extract : ");
        k = scan.nextInt();
        findMinK(A, k);
        
    }
    
   private static void findMinK(int [] A, int k){
       // defines a max PriorityQueue in O(1)
       PriorityQueue <Integer> pq = new PriorityQueue<>((x,y) -> Integer.compare(y, x));
       //for each i iterating over n lengthed array in O(n)
       for(int i : A){
           pq.offer(i);//inserts in O(logn)
           if(pq.size() > k){
               
               // extract max O(1)
               pq.poll();
           }
       }
       int [] result = new int[k]; // O(1)
       // for each j iterating over size k O(k)
       for(int j = 0; j < k; j++){
           result[j] = pq.poll();// add element to result O(1)
       }
       //sort non_increasing array O(k)
       reverseArray(result, 0, result.length - 1);
       //print result in O(k)
       printArray(result, result.length);
   }
   //reverse array with recursive method for size k of array O(r - l + 1) or O(k)
   private static void reverseArray(int [] A, int l, int r){
       if(l >= r){
           return; // O(1)
       }
       //swap l and r 
       // each line is O(1)
       int temp = A[l];
       A[l] = A[r];
       A[r] = temp;
       reverseArray(A, l + 1, r - 1);// O( r - l + 1)
       
   }
    
    // print array works in O(k) k being the size of array to print
    private static void printArray(int A[], int k){
        System.out.print("[");
        for(int i = 0; i < k; i++){
            if(i == k - 1){
                System.out.println(A[i] + "]");
            }
            else{
                System.out.print(A[i] + ", ");
            }
        }
    }
   
    
    
    
    
    
    
    
//    private static void kSort2(int [] A){
//
//        HashMap <Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < A.length; i++){
//            if(!map.containsKey(A[i])){
//                
//                A[i] = i + 1;
//       
//            }
//            else{
//                map.put(A[i], i);
//            }
//        }
//        printArray(A, A.length);
//        
//    }
//
//    
//   
//    
//     private static void kSort(int [] array, int n, int k){
//        PriorityQueue <Integer> pq = new PriorityQueue<>();
//        for(int i = 0; i < k + 1; i++){
//            pq.add(array[i]);
//        }
//        int index = 0;
//        for( int i = k + 1; i < n; i++){
//            array[index++] = pq.peek();
//            pq.poll();
//            pq.add(array[i]);
//        }
//        Iterator<Integer> iterator = pq.iterator();
//        while(iterator.hasNext()){
//            array[index++] = pq.peek();
//            pq.poll();
//        }
//    }
    
    
}