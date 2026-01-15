package kr.spartaclub.running.day01.step6;

public class RobotBarista implements CoffeeMaker {
    private int electricity = 100;

    @Override
    public Coffee makeCoffee(Menu menu) {
        if (electricity >= 10) {
            electricity -= 10;
            System.out.println("🤖 로봇: 삐리릭. 고압 추출 모드 가동. (전기 -10)");
            return new Coffee(menu.name());
        } else {
            System.out.println("🤖 로봇: 배터리... 부족... 시스템... 종료...");
            return null;
        }
    }
}
