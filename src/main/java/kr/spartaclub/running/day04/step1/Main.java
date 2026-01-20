package kr.spartaclub.running.day04.step1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 리스트 준비
        List<String> iveMembers = List.of("장원영", "안유진", "레이", "가을", "이서", "리즈");

        // 10번 멤버를 주세요
        try { // 트라이! 함해봐
            String member = iveMembers.get(10); // 예외 발생시 즉시 캐치로 이동
            System.out.println("member = " + member); // 예외발생시 실행x
        } catch (IndexOutOfBoundsException e) { // 잡아줄게
            System.out.println("멤버는 6명이 최대입니다");
        }





    }
}
