/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songmanagement;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class musicPlayer {
    static musicPlayer player = new musicPlayer();
    static Clip clip;
    public static musicPlayer getInstance() {
        return player;
    }

    private musicPlayer() {
    }
    public static void loadMusic(String filePath){
        try{
            File file= new File (filePath);
            if(file.exists()){
                AudioInputStream ais= AudioSystem.getAudioInputStream(file);
                clip= AudioSystem.getClip();
                clip.open(ais);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error load music"+e.getMessage());
        }
    }
            
}
