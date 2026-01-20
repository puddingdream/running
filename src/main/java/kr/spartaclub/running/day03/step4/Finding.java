package kr.spartaclub.running.day03.step4;

import static kr.spartaclub.running.day03.step4.Menu.menuList;

public class Finding {
    public static void main(String[] args) {

        // 요리 목록에서 채식주의가 먹을 수 있는 요리가 하나라도 있는가?
        boolean flag1 = menuList.stream()
//                .filter(menu -> menu.getType() == DishType.MEAT)
                .anyMatch(menu -> menu.isVegetarian());

        System.out.println("flag1 = " + flag1);

        // 요리 목록에서 모든 요리가 1000칼로리 미만입니까?
        boolean flag2 = menuList.stream()
                .allMatch(m -> m.getCalories() < 1000);
        System.out.println("flag2 = " + flag2);

        // 요리 중에 첫번째 발견된 생선요리를 찾기
        Dish firstFishDish = menuList.stream()
                .filter(m -> m.getType() == DishType.FISH)
                .findFirst()
                .get(); // optional 이라서 get으로 까주기

        System.out.println("firstFishDish = " + firstFishDish);


    }
}