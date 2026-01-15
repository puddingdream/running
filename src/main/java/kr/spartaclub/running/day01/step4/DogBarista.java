package kr.spartaclub.running.day01.step4;

public class DogBarista implements CoffeeMaker {


    @Override
    public Coffee makeCoffee(String menuName) {
        System.out.println("멍멍이 바리스타 첨보냐?");
        System.out.println("왈왈 짖으며 %s 커피만드는중 ".formatted(menuName));
        return new Coffee(menuName);
    }
}
