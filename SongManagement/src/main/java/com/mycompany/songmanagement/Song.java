/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songmanagement;

import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Student
 */
public class Song implements Serializable {

     private String nameSong,artist, manufacturer, genre, album;
    private int year;
    private String imagePath,songPath;
    
    
    private ArrayList<Song> authors,singers;

    public Song() {

    }

    public Song(String nameSong, String artist, String manufacturer, String genre, String album, int year, ArrayList<Song> authors, ArrayList<Song> singers) {
        this.nameSong = nameSong;
        this.artist = artist;
        this.manufacturer = manufacturer;
        this.genre = genre;
        this.album = album;
        this.year = year;
        this.authors = authors;
        this.singers = singers;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public ArrayList<Song> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Song> authors) {
        this.authors = authors;
    }

    public ArrayList<Song> getSingers() {
        return singers;
    }

    public void setSingers(ArrayList<Song> singers) {
        this.singers = singers;
    }
    

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }

   

}