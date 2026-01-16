package kr.spartaclub.running.day02.step4;

// 사과 데이터 설계도
public class Apple {

    private int weight; // 무게 (g)
    private Color color; // 색상
    // 당도수치
    // 원산지
    // 수확자

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

}
