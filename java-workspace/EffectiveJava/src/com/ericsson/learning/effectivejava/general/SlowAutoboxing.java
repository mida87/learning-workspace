package com.ericsson.learning.effectivejava.general;

import java.util.Date;

public class SlowAutoboxing {
    public static void main(String[] args) {
        Date startTime = new Date();

        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            // Long is every time unboxed and boxed, thus unnecessary creating new Objects
            sum += i;
        }

        Date endTime = new Date();
        final long elapsedTime = endTime.getTime() - startTime.getTime();
        System.out.println("Time elapsed: " + elapsedTime);
        System.out.println("Sum: " + sum);
    }
}
