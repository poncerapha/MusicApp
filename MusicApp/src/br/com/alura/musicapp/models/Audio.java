package br.com.alura.musicapp.models;

public class Audio {

    private String title;
    private int duration;
    private int totalPlays;
    private int totalLikes;
    private int rating;

    public void like() {
        this.totalLikes ++;
    }

    public void play() {
        this.totalPlays ++;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
