package kr.spartaclub.running.day03.step4;

public class SimpleDish {

    private String menuName;
    private int calories;

    public SimpleDish(Dish dish) {
        this.menuName = dish.getName();
        this.calories = dish.getCalories();
    }

    public SimpleDish(String menuName, int calories) {
        this.menuName = menuName;
        this.calories = calories;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "menuName='" + menuName + '\'' +
                ", calories=" + calories +
                '}';
    }
}