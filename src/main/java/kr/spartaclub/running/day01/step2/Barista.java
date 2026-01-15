package kr.spartaclub.running.day01.step2;


// ⭕ GOOD Code: 내 상태(beans)는 내가 관리한다! (캡슐화)
public class Barista {
    // 1. private으로 외부 접근 차단
    private int beans = 100;

    // 2. 상태를 변경하는 로직을 스스로 수행 (책임 수행)
    public Coffee makeCoffee(String menuName) {
        if (this.beans >= 20) {
            this.beans -= 20;
            System.out.println("바리스타: (쓱싹쓱싹) 커피 만드는 중...");
            return new Coffee(menuName);
        } else {
            System.out.println("바리스타: 원두가 부족합니다!");
            return null; // 간단한 예제를 위해 null 반환
        }
    }
}