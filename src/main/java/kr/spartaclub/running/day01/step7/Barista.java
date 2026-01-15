package kr.spartaclub.running.day01.step7;


// 바리스타의 진화: "난 만들기만 할게, 재료는 창고에서 가져와"
public class Barista implements CoffeeMaker {

    //    private int beans = 100;
    private BeanStorage storage; // 이제 바리스타는 창고를 알고 있습니다.

    public Barista(BeanStorage storage) {
        this.storage = storage;
    }


    // Barista.java의 변화
    public Coffee makeCoffee(Menu menu) { // String 대신 Enum을 받음
        int requiredBeans = menu.getRequiredBeans();

        // 1. 창고에 원두가 있는지 확인 (직접 세지 않고 물어봄!)
        if (!storage.hasEnoughBeans(requiredBeans)) {
            System.out.println("🧔🏻‍♂️ 바리스타: 원두가 다 떨어졌어요...");
            return null;
        }

        // 2. 창고에서 원두를 꺼내와서 사용함
        storage.useBeans(requiredBeans);
        System.out.println("🧔🏻‍♂️ 바리스타: 정성을 다해 핸드드립으로 만듭니다... (원두 -%d)".formatted(requiredBeans));
        return new Coffee(menu.getDescription());
    }


}
