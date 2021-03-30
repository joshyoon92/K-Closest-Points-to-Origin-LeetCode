package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        int[][] ans = kClosest(points,k);
        for (int[] a: ans) {
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        int N = points.length;
        int[] dists = new int[N];
        for (int i=0; i<N; i++){
            dists[i] = distance(points[i]);
        }
        Arrays.sort(dists);

        int distk = dists[k-1];
        int[][] ans = new int[k][];
        int count=0;
        for (int i=0; i<N; i++){
            if (distance(points[i]) <= distk){
                ans[count++] = points[i];
            }
        }
        return ans;
    }

    public static int distance(int[] point){
        return point[0]*point[0]+point[1]*point[1];
    }
}
