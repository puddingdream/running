package kr.spartaclub.running.day03.step1;

import java.util.Objects;

public class Idol {
    private  String name;
    private  String  team;
    private  int score;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Idol(String name, String team, int score) {
        this.name = name;
        this.team = team;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Idol idol = (Idol) o;
        return score == idol.score && Objects.equals(name, idol.name) && Objects.equals(team, idol.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, team, score);
    }
}
