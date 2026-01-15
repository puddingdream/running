package kr.spartaclub.running.day01.step4;

public class Coffee {
    private String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "☕ " + name;
    }
}