package kr.spartaclub.running.day01.step7;

// 새로운 객체의 등장: `BeanStorage` (원두 창고)
public class BeanStorage {
    private int beans = 100;

    public boolean hasEnoughBeans(int amount) {
        return beans >= amount;
    }

    public void useBeans(int amount) {
        if (hasEnoughBeans(amount)) {
            beans -= amount;
            System.out.println("창고: 원두 " + amount + "g 출고됨. (남은 양: " + beans + "g)");
        }
    }
}