package com.example.demoles3.examples;

import org.apache.commons.lang3.RandomStringUtils;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import static com.example.demoles3.tests.TestData.*;

public class randomExamples {


    public static void main(String[] args) {
        System.out.println(randomString(50));
        System.out.println(randomEmail(20));
        System.out.println(randomNumber(1000000L, 99999999L));
        System.out.println(randomPhone("+79", 100000000L, 999999999L));

        String[] names = {"a", "b", "c", "d", "e"};
        System.out.println(randomListItem(names));

        System.out.println(RandomStringUtils.random(20, false, false));
        System.out.println(RandomStringUtils.random(20, true, false));
        System.out.println(RandomStringUtils.random(20, false, true));
        System.out.println(RandomStringUtils.random(20, true, true));
    }

    public static String getRandomValue(String[] arr) {
        int index = new Random().nextInt(arr.length);
        return arr[index];
    }

    public static String getRandomCity(String state) {
        String[] cities;
        switch (state) {
            case "NCR" : cities = ncr;
                break;
            case "Uttar Pradesh" : cities = uttarpradesh;
                break;
            case "Haryana" : cities = haryana;
                break;
            case "Rajasthan" : cities = rajasthan;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + state);

        };
        return cities[new Random().nextInt(cities.length)];
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
    public static String randomListItem(String[] values) {
        int index = randInt(0, values.length-1);
        return values[index];
    }

    public static String randomString(int len){
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String randomEmail(int len) {
        return randomString(len) + "@qa.guru";
    }

    static Long randomNumber(Long min, Long max) {
        return ThreadLocalRandom.current().nextLong(min, max);
    }

    public static String randomPhone(String prefix, Long min, Long max) {
        return prefix + randomNumber(min, max);
    }

}
