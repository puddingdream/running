package kr.spartaclub.running.day01.step1;


// ❌ BAD Code: 객체지향적이지 않은 절차지향적 설계
// 바리스타가 자신의 상태(beans)를 전혀 보호하지 않고 있음.
public class Barista {
    // 문제점: 누구나 접근 가능한 public 필드
    public int beans = 100; // 커피 원두 양 (그램)

    // 커피를 제조하는 행위도 사실상 없고, 그냥 재료만 가지고 있는 상태
}
