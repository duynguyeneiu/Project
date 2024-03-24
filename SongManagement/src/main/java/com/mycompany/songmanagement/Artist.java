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
public class Artist implements Serializable{

    private String name, agency, gender, nationality, imagePath;
    private int follower, yearOfBirth;
    private ArrayList<String> albums;

    public Artist() {
        this.follower = 15000000;
        
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
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

    public ArrayList<String> getAlbums() {
        return albums;
    }

    public int getAlbumsSize() {
        if (albums == null) {
            return 0;
        }
        return albums.size();

    }

    public void setAlbums(ArrayList<String> albums) {
        this.albums = albums;
    }

}
