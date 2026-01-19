package kr.spartaclub.running.day03.step4;

public enum DishType {
    MEAT("육류"),
    FISH("어류"),
    OTHER("기타");

    private final String typeName;

    DishType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}