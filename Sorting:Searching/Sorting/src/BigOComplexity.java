/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigocomplexity;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author rileyoest
 */
public class BigOComplexity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array2d = new int[5][2];

        Random rand = new Random();

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < 2; j++) {

                array2d[i][j] = rand.nextInt(11);
                
            }
           
        }
        System.out.println(Arrays.deepToString(array2d));
        System.out.println("Merge : " + Arrays.deepToString(BigOComplexity.merge(array2d)));

    }
    

    protected static int[][] merge(int[][] intervals) {

        if (intervals.length < 2) {
            return intervals;
        }

        Queue<Integer> elements = new LinkedList<>();
        for (int i = 0; i < intervals.length - 1; i++) {

            if (intervals[i][1] >= intervals[i + 1][0]) {

                elements.add(intervals[i][0]);
                elements.add(intervals[i + 1][1]);
                i++;

            } else {
                elements.add(intervals[i][0]);
                elements.add(intervals[i][1]);
            }
        }
        int[][] merged = new int[elements.size()][2];
        int n = 0;
        while (n < merged.length && elements.size() >=2) {
            merged[n][0] = elements.poll();
            merged[n][1] = elements.poll();
            n++;

        }
        return merged;
    }

}
