/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songmanagement;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class Album implements Serializable {

    private String albumName, imagePath, genre;
    private int yearOfRelease;
    private ArrayList<String> songList;
    private String artist;

    public Album() {
        songList = new ArrayList<>();
    }

    public Album(String albumName, ArrayList<String> songList, String artist) {
        this.albumName = albumName;
        this.songList = songList;
        this.artist = artist;
    }

    public int getSongsSize() {
        if (songList == null) {
            return 0;
        }
        return songList.size();
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public ArrayList<String> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<String> songList) {
        this.songList = songList;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}
