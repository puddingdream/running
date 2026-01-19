package kr.spartaclub.running.day03.step4;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static kr.spartaclub.running.day03.step4.Menu.*;

public class Filtering {
    public static void main(String[] args) {

        // 요리 메뉴 중에서 비건요리만 필터링해주세요!
        List<Dish> vegetarianDishes = menuList.stream() // 1. 데이터소스 생성
                .filter(dish -> dish.isVegetarian()) // 2. 중간연산
                .collect(toList());                     // 3. 최종연산

        vegetarianDishes.forEach(System.out::println);

        System.out.println("=============");
        // 요리 메뉴중에서 요리이름이 4글자인것만 필터링
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .forEach(System.out::println);

        System.out.println("=============");

        // 400칼로리보다 큰 요리 중 앞에서 3개만 필터링
        menuList.stream()
                .filter(menu -> menu.getCalories() > 400)
                .limit(3) // 앞에서부터 3개만
                .forEach(System.out::println);


        System.out.println("=============");
        // 400칼로리보다 큰 요리중 앞에 2개는 건너뛰고 필터링
        menuList.stream()
                .filter(m -> m.getCalories() > 400)
                .skip(2)
                .forEach(System.out::println);

        // 숫자 리스트에서 짝수만 필터링
        System.out.println("=============");

        List<Integer> numbers
                = List.of(1, 2, 1, 3, 3, 2, 4, 4, 1, 3, 4);

        Set<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
//                .distinct()
                .collect(Collectors.toSet());

        System.out.println("evenNumbers = " + evenNumbers);

    }
}