package kr.spartaclub.running.day01.step7;

public enum Menu {
    AMERICANO(20, "아메리카노"),
    LATTE(30, "카페라떼"),
    ESPRESSO(10, "에스프레소");

    private final int requiredBeans;
    private final String description;

    Menu(int requiredBeans, String description) {
        this.requiredBeans = requiredBeans;
        this.description = description;
    }

    public int getRequiredBeans() { return requiredBeans; }

    public String getDescription() {
        return description;
    }
}

