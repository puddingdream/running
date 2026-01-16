package kr.spartaclub.running.day01.step7;

// 이 클래스는 "객체를 생성하고 조립하는 역할"만 담당합니다. (Configuration)
// 실제 비즈니스 로직(커피 만들기, 주문 받기)은 여기서 하지 않습니다.

//조립 공장(OrderContext)의 업데이트
//이제 객체가 하나 더 늘어났으니, 조립하는 과정도 보여줍니다.
public class OrderContext {

    // 오전반 설정: 사람 바리스타(창고주입) + 캐셔
    public static Cashier configMorningShift() {
        // 1. 창고를 먼저 만들고
//        BeanStorage storage = new BeanStorage();
        // 2. 창고를 가진 바리스타를 만들고
//        Barista barista = new Barista(storage);
        // 3. 그 바리스타와 일할 캐셔를 만듭니다.
        return new Cashier(new Barista(new BeanStorage()));
    }

    // 오후반 설정: 로봇 바리스타 + 캐셔
    public static Cashier configAfternoonShift() {
        return new Cashier(new RobotBarista()); // 의존성 주입 (DI)
    }
}
