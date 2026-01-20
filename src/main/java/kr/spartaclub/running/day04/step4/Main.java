package kr.spartaclub.running.day04.step4;

import kr.spartaclub.running.day04.step4.exception.IdolNotFoundException;
import kr.spartaclub.running.day04.step4.exception.NotEnoughFanPowerException;

public class Main {
    public static void main(String[] args) {

        int myFanPower = 50_000;
        // 시나리오 1 : 정상예매
        buyTicketSafe("IVE", 30_000, myFanPower);

        System.out.println("===============");

        // 시나리오 2 : 팬심 부족
        buyTicketSafe("IVE" , 100_000, myFanPower);

        System.out.println("===============");
        // 시나리오 3 : 없는 아이돌
        buyTicketSafe("Black Pink", 15_000, myFanPower);



    }
    // try catch를 전담하는 래퍼 메서드
    public static  void  buyTicketSafe(String idolName, int price, int fanPower){
        try{
            buyTicekt(idolName,price,fanPower);
        } catch (IdolNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("아이브를 입력하라고!");
        } catch (NotEnoughFanPowerException e) {
            System.out.println(e.getMessage());
            System.out.println("돈을좀 더 벌어와");
        }
    }



    public static void buyTicekt(String idolName, int price, int fanPower){

        // 아이돌이 실제로 존재하는지 체크
        // 가정: 아이돌은 IVE밖에 없다고 가정
        if(!"IVE".equals(idolName)){
            throw new IdolNotFoundException("그런 아이돌은 세상에 없다.");
        }


        // 팬심체크
        if(fanPower < price){
            throw new NotEnoughFanPowerException("돈이 부족합니다.");
        }
        System.out.println("%s 콘서트 예매 성공!".formatted(idolName));
    }


}



