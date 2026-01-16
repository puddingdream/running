package kr.spartaclub.running.day02.step2;

public class Main {
    public static void main(String[] args) {

        HamburgerChef burgerKing = new HamburgerChef();


        //  어떤 손님이 옴 - 지옥버거를 주문함
        // 지옥버거레시피를 가져와
        // 익명 클래스통해 레시피를 생성 (재활용할때)
        BurgerRecipe hellRecipe = new BurgerRecipe() {
            @Override
            public void cook() {
                System.out.println("# 지옥에서 만든 보라색 소스 준비해");
            }
        };

        //익명클래스로 빠르게 만든 레시피를 쉐피에게 전달
        burgerKing.setRecipe(hellRecipe);
        burgerKing.makeBurger();



        //인라인으로 익명클래스 전달
        burgerKing.setRecipe(new BurgerRecipe() {
            @Override
            public void cook() {
                System.out.println("# 양상추 3장");
                System.out.println("# 아보카도 듬뿍~~");
            }
        });
        burgerKing.makeBurger();

        // 위에 저거 컨트롤 알트 v 하면 익명클래스 인라인에서 빠지고
        // 뺀걸 다시 넣으려면  컨트롤 알트 n 하면 다시들어감





    };



}
