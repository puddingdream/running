package kr.spartaclub.running.day01.step1;

// ❌ BAD Code: 남의 주머니(Barista.beans)를 함부로 뒤지는 손님
public class Customer {

    public void order(String menuName, Barista barista) {
        System.out.println("손님: " + menuName + " 주세요.");


        // 문제점: 손님이 직접 바리스타의 원두를 꺼내서 확인하고 줄여버림 (절차지향적 코드)
        // 마치 카페에 가서 "내가 커피 타먹을게" 하고 주방에 들어가는 꼴
        if (barista.beans >= 20) {
            barista.beans -= 20; // 원두 20g 사용
            System.out.println("손님: (원두를 직접 갈아서 커피를 만듦) -> " + new Coffee(menuName));
        } else {
            System.out.println("손님: 원두가 부족하네... 못 먹겠다.");
        }
    }
}
