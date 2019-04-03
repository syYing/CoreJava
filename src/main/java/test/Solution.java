
package test;

import java.util.Arrays;

public class Solution {
    public static int countPrimes(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for(int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                count++;
                int temp = i + i;
                while(temp <= n) {
                    isPrime[temp] = false;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
