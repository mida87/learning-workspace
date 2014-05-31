package com.ericsson.learning.effectivejava.general;

import java.util.Date;

public class StringConcatenation {
    public static void main(String[] args) {
        Date startTime = new Date();

        String result = "";
        for (int i = 0; i < 1000; i++) {
            // Strings are immutable and string concatenation is much slower then e.g. StringBuilder concatenation
            result += "Lorem ipsum " + i + " dolor si amet. Lorem ipsum dolor si amet. " + 2*i + " Lorem ipsum dolor si amet. Lorem ipsum dolor si amet. ";
        }

        Date endTime = new Date();
        final long elapsedTime = endTime.getTime() - startTime.getTime();
        System.out.println("Time elapsed: " + elapsedTime);
        System.out.println(result);
    }
}
