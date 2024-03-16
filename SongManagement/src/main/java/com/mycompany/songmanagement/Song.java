/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songmanagement;

import javax.swing.*;

/**
 *
 * @author Student
 */
public class Song {
    private String author, singer, name, type, album, recodLabel,id, genre;
    private ImageIcon image;

    public Song() {
        
    }

    public Song(String id,String author, String singer, String name, String type, String album, String recodLabel) {
        this.id=id;
        this.author = author;
        this.singer = singer;
        this.name = name;
        this.type = type;
        this.album = album;
        this.recodLabel = recodLabel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getRecodLabel() {
        return recodLabel;
    }

    public void setRecodLabel(String recodLabel) {
        this.recodLabel = recodLabel;
    }
    
    
}
