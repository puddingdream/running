package kr.spartaclub.running.day02.step4;

import java.util.ArrayList;
import java.util.List;

public class Example {

    /**
     * @solution - try 1 : 사과 리스트에서 사과 이름만 추출하여 리스트에 담아줌
     * @param basket - 사과들이 담긴 바구니
     * @return - 사과 이름(String)만 담긴 명단 리스트
     */
    public static List<Color> getAppleNames(List<Apple> basket) {
        List<Color> colors = new ArrayList<>();
        for (Apple apple : basket) {
            colors.add(apple.getColor()); // 이름만 쏙!
        }
        return colors;
    }

    public static List<Object> mapApple(List<Apple> bsket, AppleFunction function){
        List<Object> apples = new ArrayList<>();
        for (Apple apple : bsket){
            apples.add(function.apply(apple));
        } return apples;


    }

    public static <T, R> List<R> map(List<T> list, GenericFunction<T, R> function) {
        List<R> filtering = new ArrayList<>();
        for (T  element :  list){
            filtering.add(function.apply(element));
        } return filtering;
    }




}
