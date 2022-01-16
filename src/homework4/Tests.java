package junittestcases;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tests {
    @Test
    public void test0() {

        int a = 5;
        int b = 10;
        int actualtotal;
        int expectedTotal = 15;
        actualtotal = a + b;

        Assert.assertEquals(expectedTotal, actualtotal);
        System.out.println("test 0 passed");

    }

    @Test
    public void test1() {

        int c = 27;
        int d = 18;
        int actualtotal;
        int expectedTotal = 9;
        actualtotal = c - d;

        Assert.assertEquals(expectedTotal, actualtotal);
        System.out.println("test 1 passed");

    }

    @Test
    public void test2() {

        int e = 10;
        int f = 11;
        int actualtotal;
        int expectedTotal = 100;
        actualtotal = e + f;

        Assert.assertEquals(expectedTotal, actualtotal);
        System.out.println("test 2 passed");

    }

    @Test
    public void test3() {

        int e = 100;
        int f = 5;
        int actualtotal;
        int expectedTotal = 20;
        actualtotal = e / f;

        Assert.assertEquals(expectedTotal, actualtotal);
        System.out.println("test 3 passed");

    }
    @Test
    public void test4() {

        String movie="Titanic";
        String Movie2="kmn";

        Assert.assertTrue(movie.contains(Movie2));
        System.out.println("test 4 passed");

    }
    @Test
    public void test5() {

        String movie="Titanic";
        String Movie2="Tit";

        Assert.assertTrue(movie.contains(Movie2));
        System.out.println("test 5 passed");

    }
    @Test
    public void test6() {

        char[] fruits={'a','p','p','l','e'};
       char[] fruit="apple".toCharArray();

        Assert.assertArrayEquals(fruits,fruit);
        System.out.println("test 6 passed");

    }
    @Test
    public void test7() {
        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(10, 27, 18, 1, 91, 89, 63, 58));
        int lucky = 27;

        Assert.assertTrue(number.contains(lucky));
        System.out.println("Test 7 passed");

    }

    @Test
    public void test8() {
        Map<String, String> example = new HashMap<>();
        example.put("toyota", "rav4");
        example.put("body", "doors");
        example.put("engine", "biturbine");
        example.put("color", "black");

        //String val;
        Assert.assertTrue(example.containsKey("toyota"));
        System.out.println("test 8 passed");


    }
    @Test
    public void test9() {
        Map<String, String> aptSize = new HashMap<>();
        aptSize.put("bedrooms", "two");
        aptSize.put("bathrooms","one");
        aptSize.put("livingrooms", "one");
        aptSize.put("balcony","three");

        Assert.assertTrue(aptSize.containsValue("four"));
        System.out.println("test 9 passed");


    }
}