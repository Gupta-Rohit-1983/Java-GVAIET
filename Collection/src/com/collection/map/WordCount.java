package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCount {

    public static void main(String[] args) {
        String msd = " name is bond, james bond;" + "grandparent name is also james," + "and we are bond family";

        Map<String, Integer> wordCount = getWordCount(msd);
        wordCount.forEach((k,v)-> System.out.println("Key : " + k + ", Values : " +
        v));
    }

    public static Map<String, Integer> getWordCount(String msg) {

        StringTokenizer tokens = new StringTokenizer(msg, "[,;: ]");

        Map<String, Integer> wordCount = new HashMap<>();
        while (tokens.hasMoreTokens()) {
            String temp = tokens.nextToken();
            if (wordCount.putIfAbsent(temp.toLowerCase(), 1) != null) {
                wordCount.compute(temp, (k, v) -> v + 1);
            }
        }

        return wordCount;
    }

}
