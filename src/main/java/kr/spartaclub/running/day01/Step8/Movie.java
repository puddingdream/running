package kr.spartaclub.running.day01.Step8;

public class Movie {

    public String title;
    private int totalSeats;
    private int bookedSeats;

    public Movie(String title, int totalSeats, int bookedSeats) {
        this.title = title;
        this.totalSeats = totalSeats;
        this.bookedSeats = bookedSeats;
    }
}
