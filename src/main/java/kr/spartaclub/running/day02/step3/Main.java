package kr.spartaclub.running.day02.step3;

public class Main {
    public static void main(String[] args) {

        HamburgerChef burgerKing = new HamburgerChef();

        // 어떤 손님이 옴 - 지옥버거를 주문함
        // 지옥버거레시피를 가져와
        // 익명클래스를 통해 레시피를 생성
        BurgerRecipe hellRecipe = () -> System.out.println("# 지옥에서 만든 보라색 소스 준비해");


        // 익명클래스로 빠르게 만든 레시피를 쉐프에게 전달
        burgerKing.setRecipe(hellRecipe);
        burgerKing.makeBurger();

        // 인라인으로 익명클래스 전달
        burgerKing.setRecipe(
                () -> {
                    System.out.println("# 양상추 3장");
                    System.out.println("# 아보카도 듬뿍~~ 흐흐흐");
                }
        );


        burgerKing.makeBurger();

        System.out.println("====================");

        // 덧셈을 하고 싶어
        Calculator addOperation = new AddOperation();
        int addResult = addOperation.operate(20, 30);
        System.out.println("addResult = " + addResult);

        // 뺄셈을 하고 싶어? -> 클래스를 또만들까?
        Calculator subOperation = new Calculator() {
            @Override
            public int operate(int n1, int n2) {
                return n1 - n2;
            }
        };
        int subResult = subOperation.operate(100, 75);
        System.out.println("subResult = " + subResult);

        // 곱셈을하고싶어 -> 람다
        Calculator multiOperation = (n1, n2) -> n1 * n2;
        int multiResult = multiOperation.operate(3, 8);
        System.out.println("multiResult = " + multiResult);


    }
}