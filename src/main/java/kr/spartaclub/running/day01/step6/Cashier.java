package kr.spartaclub.running.day01.step6;

// 캐셔는 'DIP'를 지키고 있습니다.
// 구체적인 구현체(Barista)가 아니라, 추상화(CoffeeMaker)에 의존합니다.
public class Cashier {
    private CoffeeMaker coffeeMaker;

    // 생성자 주입 (Constructor Injection)
    // "누가 커피를 만들지는 내 알 바 아니고, 그냥 만들어줄 사람만 줘."
    public Cashier(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public Coffee takeOrder(Menu menu) {
        System.out.println("💰 캐셔: " + menu.name() + " 주문 받았습니다.");
        return coffeeMaker.makeCoffee(menu);
    }
}
