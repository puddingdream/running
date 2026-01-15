package kr.spartaclub.running.day01.step6;


public class Barista implements CoffeeMaker {
    private int beans = 100;

    // Barista.java의 변화
    public Coffee makeCoffee(Menu menu) { // String 대신 Enum을 받음
        int requiredBeans = menu.getRequiredBeans();
        if (this.beans < requiredBeans) {
            System.out.println("🧔🏻‍♂️ 바리스타: 원두가 다 떨어졌어요...");
            return null;
        }
        this.beans -= requiredBeans;
        System.out.println("🧔🏻‍♂️ 바리스타: 정성을 다해 핸드드립으로 만듭니다... (원두 -%d)".formatted(requiredBeans));
        return new Coffee(menu.name());
    }


}
