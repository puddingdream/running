package kr.spartaclub.running.day01.step3;

// ⭕ GOOD Code: 주문을 받아서 바리스타에게 전달하는 역할 (Manager)
public class Cashier {

    // 💡 Tip: 의존성 필드에 final을 붙이면 좋은 이유
    // 1. 불변성 보장: 한 번 정해지면 절대 바뀌지 않아서 안전해요. (실수로 다른 객체로 덮어쓰기 방지)
    // 2. 초기화 강제: 생성자에서 반드시 값을 넣어야 컴파일이 되므로, 설정 누락(NullPointerException)을 막아줘요.
    private final Barista barista;

    // 캐셔는 바리스타를 알고 있어야 함 (협력 관계)
    public Cashier(Barista barista) {
        this.barista = barista;
    }

    public Coffee takeOrder(String menuName) {
        System.out.println("캐셔: 주문 확인했습니다. (" + menuName + ")");

        // 캐셔가 바리스타에게 "만들어줘"라고 메시지 전달
        // 손님이 직접 바리스타에게 가는 게 아님!
        return barista.makeCoffee(menuName);
    }
}
