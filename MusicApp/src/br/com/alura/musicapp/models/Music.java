package br.com.alura.musicapp.models;

public class Music extends Audio {
    private String album;
    private String artist;
    private String type;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getRating() {
        if(this.getTotalPlays() > 2000) {
            return 10;
        } else {
            return 8;
        }
    }
}
