package kr.spartaclub.running.day01.step2;

// ⭕ GOOD Code: 바리스타에게 '주문'만 하면 됨
public class Customer {

    public void order(String menuName, Barista barista) {
        System.out.println("손님: " + menuName + " 주세요.");

        // 이제 손님은 원두가 몇 개인지, 어떻게 만드는지 알 필요가 없음
        // 그냥 "만들어줘"라고 요청(Message)만 보냄.
        Coffee coffee = barista.makeCoffee(menuName);

        if (coffee != null) {
            System.out.println("손님: 와! " + coffee + " 나왔다.");
        } else {
            System.out.println("손님: ㅠㅠ");
        }
    }
}