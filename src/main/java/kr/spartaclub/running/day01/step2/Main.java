package kr.spartaclub.running.day01.step2;

public class Main {
    public static void main(String[] args) {

        // 바리스타 한명 나오세요!
        Barista bariKim = new Barista();
        // 손님 한명 나오세요
        Customer sonny = new Customer();

        sonny.order("아이스 아메리카노", bariKim);
        sonny.order("카페라떼", bariKim);
        sonny.order("카페라떼", bariKim);
        sonny.order("마끼아또", bariKim);
        sonny.order("뜨아", bariKim);
        sonny.order("두쫀쿠", bariKim);

    }
}
