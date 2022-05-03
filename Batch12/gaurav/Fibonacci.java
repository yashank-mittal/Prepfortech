package oneshot;

import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args) {
        // Simpler solution
        System.out.println("fib(5) = " + fib(10));
      
        // Optimised using DP
        System.out.println(" fibOptimised (5) = " + fibOptimised(100, new HashMap<>()));
    }

    private static int fib(int n) {
        if(n == 1 || n == 0) return n;

        return fib(n-1) + fib(n-2);
    }

    private static long fibOptimised(int n, HashMap<Integer, Long> cache) {
        if(n == 1 || n == 0) return n;
        Long prevResult = cache.getOrDefault(n - 1, 0L);
        Long prevPrevResult = cache.getOrDefault(n - 2, 0L);

        if(prevResult == 0) {
            prevResult = fibOptimised(n - 1, cache);
            cache.put(n-1, prevResult);
        }

        if(prevPrevResult == 0) {
            prevPrevResult = fibOptimised(n - 2, cache);
            cache.put(n-2, prevPrevResult);
        }

        return prevResult + prevPrevResult;
    }
}
