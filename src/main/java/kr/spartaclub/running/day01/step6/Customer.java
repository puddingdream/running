package kr.spartaclub.running.day01.step6;

public class Customer {
    public void order(Menu menu, Cashier cashier) {
        System.out.println("🙋 손님: " + menu.name() + " 주세요.");
        Coffee coffee = cashier.takeOrder(menu);

        if (coffee != null) {
            System.out.println("🙋 손님: " + coffee + " 감사합니다!");
        } else {
            System.out.println("🙋 손님: 아쉽네요...");
        }
    }
}
