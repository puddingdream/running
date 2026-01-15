package kr.spartaclub.running.day01.step4;

// ⭕ GOOD Code: 메시지 전송 (Messaging)
public class Customer {

    public void order(String menuName, Cashier cashier) {
        // Step 3: 손님은 이제 바리스타를 몰라도 됩니다. (Loose Coupling)
        // 웃는 얼굴의 캐셔에게만 말하면 되죠.

        System.out.println("손님: " + menuName + " 주세요!");
        Coffee coffee = cashier.takeOrder(menuName);

        if (coffee != null) {
            System.out.println("손님: (홀짝) 음~ " + coffee + " 맛있다.");
        } else {
            System.out.println("손님: (아쉽) 다음에 올게요.");
        }
    }
}