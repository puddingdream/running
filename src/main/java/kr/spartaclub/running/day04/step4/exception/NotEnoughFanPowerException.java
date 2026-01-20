package kr.spartaclub.running.day04.step4.exception;

public class NotEnoughFanPowerException extends  RuntimeException{

    public NotEnoughFanPowerException() {
    }

    // 에러 메세지를 부모에게 전달하는 로직을 반드시 넣어주세요!
    public  NotEnoughFanPowerException(String message){
        super(message);
    }



}
