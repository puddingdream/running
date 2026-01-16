package kr.spartaclub.running.day02.step1;

public class Main {
    public static void main(String[] args) {

        HamburgerChef burgerKing = new HamburgerChef();


        //함부기 레시피를 알려주자
        burgerKing.setRecipe(new CheeseBurgerRecipe());
        //버거킹에게 햄버거 제작을 의뢰
        burgerKing.makeBurger();


        //다른 손님이 와서 또다른 레시피를 말해줌
        burgerKing.setRecipe(new BaconBurgerRecipe());
        System.out.println("=========");
        burgerKing.makeBurger();




    }


}
