/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songmanagement;

import java.util.*;
import java.io.*;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class Artist {
    private String name, imagePath;
    private int follower;
    private ArrayList<String> albums;
    

    public Artist() {
    }

    public Artist(String artistName, int follower, ArrayList<String> albums) {
        this.name = artistName;
        this.imagePath = "/Icons/defaultArtistIcon.png";
        this.follower = follower;
        this.albums = albums;
    }
    

    public String getname() {
        return name;
    }

    public void setname(String artistName) {
        this.name = artistName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

   
}
