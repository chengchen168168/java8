package com.example.java8;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * 并行
 */
public class Parallel {

    private static long sum(Long n){
        long result = 0;
        for (long i = 1L; i <= n; i++) {
            result+=i;
        }
        return result;
    }

    //装箱拆箱损耗性能
    private static long parallelSum(long n){
       return Stream.iterate(1L,i->i+1).limit(n).parallel().reduce(0L,Long::sum);
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(Parallel.sum(10000000L));
        System.out.println(TimeUnit.SECONDS.convert(System.nanoTime()-start,TimeUnit.NANOSECONDS));

        long start1 = System.nanoTime();
        System.out.println(Parallel.parallelSum(10000000L));
        System.out.println(TimeUnit.SECONDS.convert(System.nanoTime()-start1,TimeUnit.NANOSECONDS));
    }
}
