package kr.spartaclub.running.day04.step4.exception;


// 너는 앞으로 예외 클래스란다
public class IdolNotFoundException extends RuntimeException {

    public IdolNotFoundException() {
    }

    // 에러 메세지를 부모에게 전달하는 로직을 반드시 넣어주세요!
    public IdolNotFoundException(String message) {
        super(message);
    }
}
