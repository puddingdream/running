package kr.spartaclub.running.day01.Step8;

public class Main {
    public static void main(String[] args) {
        Student steve = new Student("Steve", 60);
        Student geymi = new Student("geymi",70);

        System.out.println("steve = " + steve.getScore());
        System.out.println("geymi = " + geymi.getScore());

        steve.setScore(200);
        geymi.setScore(90);

        System.out.println("steve = " + steve.getScore());
        System.out.println("geymi = " + geymi.getScore());





    }
}
