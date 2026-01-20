package kr.spartaclub.running.day02.step4;

import java.util.ArrayList;
import java.util.List;

// 역할과 책임(R&R): 사과들을 조건에 맞게 걸러낼 방법들을 설계
public class FilterApples {

    /**
     * @param basket : 모든 사과가 담긴 바구니
     * @return : 녹색사과들이 담긴 새로운 리스트를 반환해주세요.
     * @requirement : 사과바구니에서 녹색 사과들만 필터링하는 기능을 만드세요
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {
        // 1. 녹색사과들만 담을 바구니
        List<Apple> greenBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    /**
     * @param basket : 모든 사과가 담긴 바구니
     * @return : 특정 색상사과들이 담긴 새로운 리스트를 반환해주세요.
     * @requirement : 사과바구니에서 특정 색상 사과들만 필터링하는 기능을 만드세요
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color targetColor) {
        // 1. 특정 색상 사과들만 담을 바구니
        List<Apple> colorBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == targetColor) {
                colorBasket.add(apple);
            }
        }
        return colorBasket;
    }

    /**
     * @param basket : 모든 사과가 담긴 바구니
     * @return : 특정 조건에 맞는 사과들이 담긴 새로운 리스트를 반환해주세요.
     * @requirement : 사과바구니에서 특정 조건의 사과들만 필터링하는 기능을 만드세요
     */
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate predicate) {
        // 1. 특정 색상 사과들만 담을 바구니
        List<Apple> filteredBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 필터링
        for (Apple apple : basket) {
// [디버깅] 현재 검사 중인 사과의 정보와 조건 부합 여부를 출력
            boolean isPass = predicate.test(apple);

            System.out.println("🔍 검사 중: %s | 통과 여부: %b".formatted(apple, isPass));

            if (isPass) {
                filteredBasket.add(apple);
                // [디버깅] 통과된 경우만 추가 로그
                System.out.println("   ✅ 바구니에 담겼습니다!");
            } else {
                // [디버깅] 탈락한 경우 이유를 추측할 수 있게 출력
                System.out.println("   ❌ 조건에 맞지 않아 탈락했습니다.");
            }
        }
        return filteredBasket;
    }

    /**
     * @requirement : 특정 리스트에서 특정 조건의 사과들만 필터링하는 기능을 만드세요
     * @param originList : 모든 데이터가 담긴 리스트
     * @return : 특정 조건에 맞는 데이터들이 담긴 새로운 리스트를 반환해주세요.
     */
    public static <T> List<T> filter(List<T> originList, GenericPredicate<T> predicate) {
        // 1. 특정 필터링된 데이터들만 담을 바구니
        List<T> filteredBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 필터링
        for (T t : originList) {
            if (predicate.test(t)) {
                filteredBasket.add(t);
            }
        }
        return filteredBasket;
    }
}
// itar for 반복문 만들어주는 단어