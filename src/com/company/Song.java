package com.company;

public class Song {

    private String artist;
    private String album;
    private String title;
    private String comment;
    private String track;
    private String composer;
    private String year;
    private String path;

    public Song(){}

    public Song(Song song) {
        this.artist = song.artist;
        this.album = song.album;
        this.title = song.title;
        this.comment = song.comment;
        this.track = song.track;
        this.composer = song.composer;
        this.year = song.year;
        this.path = song.path;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setTrack(String track) {
        this.track = track;
    }


    public void setComposer(String composer) {
        this.composer = composer;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }

    public String getTrack() {
        return track;
    }

    public String getComposer() {
        return composer;
    }

    public String getYear() {
        return year;
    }

    public String getPath() {
        return path;
    }
}
