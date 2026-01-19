package kr.spartaclub.running.day03.step4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static kr.spartaclub.running.day03.step4.DishType.MEAT;
import static kr.spartaclub.running.day03.step4.Menu.menuList;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCalorieMeats = menuList.stream()
                .filter(menu -> menu.getType() == MEAT)
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList());


        lowCalorieMeats.forEach(System.out::println);

        System.out.println("========================");

        // 메뉴들을 이름 내림차로 정렬 (zyx순)
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
//                .collect(toList())
                .forEach(System.out::println);

        System.out.println("========================");

        // 300 칼로리 이상인 요리 중 칼로리가 낮은 탑3 요리를 필터링
        menuList.stream()
                .filter(m -> m.getCalories() >= 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .forEach(System.out::println);
    }

}