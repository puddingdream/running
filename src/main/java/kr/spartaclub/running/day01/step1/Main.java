package kr.spartaclub.running.day01.step1;

public class Main {
    public static void main(String[] args) {

        // 바리스타 한명 나오세요!
        Barista bariKim = new Barista();
        // 손님 한명 나오세요
        Customer sonnom = new Customer();

        // 1. 정상적인(?) 손놈의 강탈 과정
        sonnom.order("아이스 아메리카노", bariKim);

        // 2. 대참사
        // 어떤 나쁜 마음을 먹은 개발자가 나타나서...
        bariKim.beans = 0;
        System.out.println("누군가 원두를 다 훔쳐감: " + bariKim.beans);
    }
}
