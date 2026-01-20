package kr.spartaclub.running.day04.step3;

public class Main {
    public static void main(String[] args) {

        int ticketPrice = 100_000;
        int myFanPower = 50_000;

        // Bad case - return으로 막는 경우

        boolean isSuccess = buyTicketLegacy(myFanPower, ticketPrice);


        if (isSuccess) {
            // 결제창으로 전환
            System.out.println("결제를 진행합니다.");
        } else {
            System.out.println("돈을 더 모아오세요");
        }

        System.out.println("===========");

        System.out.println("Good Case = throw로 실패를 알리는 경우");

        try {
            buyTicket(myFanPower, ticketPrice);
            System.out.println(" 결제를 진행합니다. ");
        } catch (Exception e) {
            System.out.println("돈을 더 모아오세요");
        }


    }

    // 실패하면 에러를 던지는 방식
    private static void buyTicket(int myFanPower, int ticketPrice) {
        if (myFanPower<ticketPrice){
            throw new RuntimeException("팬심이 부족합니다");
        }
        System.out.println("예매 성공!!");
    }


    /**
     *  티켓을 구매하는 기능
     * @param myFanPower - 팬심(돈)
     * @param ticketPrice - 실제 티켓 가격
     * @return 구매 성공 실패를 논리로 리턴
     * @author - Mr.Hwang
     * @since 2026.01.20
     */
    private static boolean buyTicketLegacy(int myFanPower, int ticketPrice) {
        if (myFanPower < ticketPrice) {
            System.out.println(" 팬심이 부족합니다.");
            return false;
        }
        return true;
    }
}
