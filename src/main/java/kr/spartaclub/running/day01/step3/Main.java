package kr.spartaclub.running.day01.step3;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1일차 Step 3: 객체 간 메시징 (Messaging) ===");

        Barista chulsoo = new Barista();
        Cashier younghee = new Cashier(chulsoo); // 캐셔는 바리스타와 협력
        Customer gildong = new Customer();

        // 손님 -> (주문) -> 캐셔 -> (제조 요청) -> 바리스타 -> (커피 반환)
        gildong.order("따뜻한 라떼", younghee);

        System.out.println("\n--- 추가 주문 ---");
        gildong.order("에스프레소", younghee);

    }
}
