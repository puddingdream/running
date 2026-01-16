package kr.spartaclub.running.day01.step5;


// 이 클래스는 "객체를 생성하고 조립하는 역할"만 담당합니다. (Configuration)
// 실제 비즈니스 로직(커피 만들기, 주문 받기)은 여기서 하지 않습니다.
public class OrderContext {

    // 오전반 설정: 사람 바리스타 + 캐셔
    public static Cashier configMorningShift() {
        return new Cashier(new Barista()); // 의존성 주입 (DI)
    }

    // 오후반 설정: 로봇 바리스타 + 캐셔
    public static Cashier configAfternoonShift() {
        return new Cashier(new RobotBarista()); // 의존성 주입 (DI)
    }
}
