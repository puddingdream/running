package kr.spartaclub.running.day01.Step8;

public class Student {
    private String name;
    private int score;



    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setScore(int score) {
        if ( score < 0 || score > 100 ){
            System.out.println("점수는 0이상 100점이하만 입력가능합니다. 입력값 : " + score );
            return;
        }this.score = score;
    }



}
