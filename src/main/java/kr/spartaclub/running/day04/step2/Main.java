package kr.spartaclub.running.day04.step2;

public class Main {

    public static void main(String[] args) {

        System.out.println("아이브 컴백 3초전!");

        try {
            for (int i = 3; i > 0; i--) {
                System.out.println("%d초".formatted(i));
                Thread.sleep(2000);
            }
            System.out.println("와!!! 아이브 컴백!");
        } catch (InterruptedException e) {
            System.out.println("컴백이 연기되었습니다.");
        }
    }
}