package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();
        int[] encoded = {1,2,3};
        int first = 1;

        for(int val:tt.decode(encoded,first)){
            System.out.print(val+" ");
        }
    }
}