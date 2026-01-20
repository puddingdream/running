package kr.spartaclub.running.day02.step4;

import java.util.Arrays;
import java.util.List;

import static kr.spartaclub.running.day02.step4.Color.*;
import static kr.spartaclub.running.day02.step4.Color.YELLOW;
import static kr.spartaclub.running.day02.step4.FilterApples.*;
import static kr.spartaclub.running.day02.step4.WareHouse.*;

public class Main {
    public static void main(String[] args) {

        List<Apple> greenApples
                = filterGreenApples(appleBasket);
        System.out.println("greenApples = " + greenApples);

        for (Apple greenApple : greenApples) {
            System.out.println("greenApple = " + greenApple);
        }

        System.out.println("============");
        List<Apple> appleList2 = filterApplesByColor(appleBasket, YELLOW);
        for (Apple apple : appleList2) {
            System.out.println("apple = " + apple);
        }

        System.out.println("====== 100g이상 사과들 필터링 === ");
        List<Apple> appleList3 = filterApples(appleBasket, apple -> apple.getWeight() >= 100);
        for (Apple apple : appleList3) {
            System.out.println("apple = " + apple);
        }

        System.out.println("==== 숫자 리스트에서 짝수만 필터링");
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 99, 88, 34);

        List<Integer> filter1 = filter(integerList, n -> n % 2 == 0);
        System.out.println("filter1 = " + filter1);
        System.out.println("==== 음식 리스트에서 3글자 음식만 필터링");

        List<String> filter2 = filter(List.of("짜장면", "치킨", "족발", "탕수육", "오렌지"), str -> str.length() == 3);
        System.out.println("filter2 = " + filter2);

        List<Apple> filter3 = filter(appleBasket, a -> a.getColor() == RED || a.getColor() == YELLOW);
        filter3.forEach(System.out::println);


        System.out.println("===============");

        List<Color> fiterName = Example.getAppleNames(appleBasket);
        System.out.println("fiterName = " + fiterName);

        List<Object> objects = Example.mapApple(appleBasket, Apple::getWeight);
        System.out.println("objects = " + objects);

        for (Object object : objects) {
            System.out.println("object = " + object);
        }

        System.out.println("===============");
        List<Integer> weights = Example.map(appleBasket, apple -> apple.getWeight());
        for (Integer weight : weights) {
            System.out.println("weight = " + weight);
        }

        System.out.println("===============");

//        List<Student> classRoom = Arrays.asList(
//                new Student("김철수", 90),
//                new Student("이영희", 100),
//                new Student("박지성", 85)
//        );

    }


}

