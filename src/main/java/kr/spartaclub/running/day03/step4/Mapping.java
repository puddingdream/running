package kr.spartaclub.running.day03.step4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;
import static kr.spartaclub.running.day03.step4.Menu.menuList;

// 변환 및 추출
/*
    filter: 걸러내기 -> 10개를 필터링하면 3개가될 수 있음, x -> x
    map: 뽑아내기 -> 10개를 매핑하면 결과도 항상 10개, x -> y
 */
public class Mapping {

    public static void main(String[] args) {

        // 요리의 이름들만 추출
        List<String> nameList = menuList.stream()
                .map(dish -> dish.getName())
                .collect(toList());

        System.out.println("nameList = " + nameList);

        System.out.println("=========");

        List<String> browsers
                = List.of(
                "safari", "chrome", "ms edge",
                "opera", "firefox"
        );

        // 브라우저 목록에서 브라우저의 글자수를 수집
        List<Integer> lengthList = browsers.stream()
                .map(brow -> brow.length())
                .collect(toList());

        System.out.println("lengthList = " + lengthList);

        // 브라우저목록에서 첫글자들만 추출
        System.out.println("=========");

        List<Character> characters = browsers.stream()
                .map(str -> str.charAt(0))
                .toList();

        System.out.println("characters = " + characters);

        System.out.println("=========");

        // 요리 목록에서 요리 이름과 칼로리만 추출해서
        // 리스트에 모아서 가져오기
        List<Map<String, Object>> results = menuList.stream()
                .map(dish -> {
                    Map<String, Object> menuMap = new HashMap<>();
                    menuMap.put("menuName", dish.getName());
                    menuMap.put("calories", dish.getCalories());
                    return menuMap;
                })
                .toList();

        results.forEach(System.out::println);

        System.out.println("=========");

        List<SimpleDish> simpleDishes = menuList.stream()
                .map(SimpleDish::new)
                .toList();

        simpleDishes.forEach(System.out::println);

        // 요리 목록에서 500칼로리 이상의 메뉴들의 이름들만 추출
        System.out.println("=========");

        List<SimpleDish> menuNameList = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> new SimpleDish(dish))
                .toList();

        System.out.println("menuNameList = " + menuNameList);


    }

}