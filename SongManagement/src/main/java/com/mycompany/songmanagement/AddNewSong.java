/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.songmanagement;

import static com.mycompany.songmanagement.musicPlayer.clip;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class AddNewSong extends javax.swing.JFrame {

    private ArrayList<Artist> artists;
    private ArrayList<Album> albums;
    private ArrayList<Song> list;
    private Song song;

    public AddNewSong(ArrayList<Song> list, ArrayList<Artist> artists, ArrayList<Album> albums) {
        this.list = list;
        this.artists = artists;
        this.albums = albums;
        this.song = new Song();
        initComponents();
        ImageIcon frameIcon= new ImageIcon(getClass().getResource("/Icons/frameIcon.png"));
        setIconImage(frameIcon.getImage());
        setAlbumBox();
        setArtistBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        songLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        artistLabel = new javax.swing.JLabel();
        urlLabel = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        uploadImageButton = new javax.swing.JButton();
        functions = new javax.swing.JPanel();
        saveSongButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        albumLabel = new javax.swing.JLabel();
        manufacturerText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genres = new javax.swing.JComboBox<>();
        artistBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        albumBox = new javax.swing.JComboBox<>();
        urlText = new javax.swing.JTextField();
        UploadMusicButton = new javax.swing.JButton();
        manufacturerLabel = new javax.swing.JLabel();

        setTitle("Add new Song\n");

        jPanel2.setLayout(new java.awt.GridBagLayout());

        songLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songLabel.setForeground(new java.awt.Color(56, 132, 209));
        songLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        songLabel.setText("Song: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 0);
        jPanel2.add(songLabel, gridBagConstraints);

        nameText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel2.add(nameText, gridBagConstraints);

        artistLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        artistLabel.setForeground(new java.awt.Color(56, 132, 209));
        artistLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        artistLabel.setText("Artist:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 0);
        jPanel2.add(artistLabel, gridBagConstraints);

        urlLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        urlLabel.setForeground(new java.awt.Color(56, 132, 209));
        urlLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        urlLabel.setText("URL:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 0);
        jPanel2.add(urlLabel, gridBagConstraints);

        year.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        year.setForeground(new java.awt.Color(56, 132, 209));
        year.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        year.setText("Year of Release:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(year, gridBagConstraints);

        yearText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        yearText.setPreferredSize(new java.awt.Dimension(75, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel2.add(yearText, gridBagConstraints);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/musicDefaultIcon.png"))); // NOI18N
        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        image.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        image.setIconTextGap(1);
        image.setMaximumSize(new java.awt.Dimension(125, 125));
        image.setMinimumSize(new java.awt.Dimension(125, 125));
        image.setName(""); // NOI18N
        image.setPreferredSize(new java.awt.Dimension(125, 125));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 10);
        jPanel2.add(image, gridBagConstraints);

        uploadImageButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uploadImageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/upload image.png"))); // NOI18N
        uploadImageButton.setText("Upload Image");
        uploadImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 20, 0);
        jPanel2.add(uploadImageButton, gridBagConstraints);

        functions.setMinimumSize(new java.awt.Dimension(100, 100));
        functions.setPreferredSize(new java.awt.Dimension(100, 50));
        functions.setLayout(new java.awt.GridBagLayout());

        saveSongButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveSongButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        saveSongButton.setText("Save");
        saveSongButton.setMaximumSize(new java.awt.Dimension(88, 36));
        saveSongButton.setMinimumSize(new java.awt.Dimension(88, 36));
        saveSongButton.setPreferredSize(new java.awt.Dimension(88, 22));
        saveSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSongButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        functions.add(saveSongButton, gridBagConstraints);

        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cross mark.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setMaximumSize(new java.awt.Dimension(98, 36));
        cancelButton.setMinimumSize(new java.awt.Dimension(98, 36));
        cancelButton.setPreferredSize(new java.awt.Dimension(98, 22));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        functions.add(cancelButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(functions, gridBagConstraints);

        albumLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        albumLabel.setForeground(new java.awt.Color(56, 132, 209));
        albumLabel.setText("Album:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 0);
        jPanel2.add(albumLabel, gridBagConstraints);

        manufacturerText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel2.add(manufacturerText, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 132, 209));
        jLabel3.setText("Genre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        genres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jazz ", "Pop", "Rock ", "Folk ", "Classical", "Country", "EDM", "Classical ", "Rap", "Dance", "Blue ", "Opera", "Hip hop ", "R&B ", "Others" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 11);
        jPanel2.add(genres, gridBagConstraints);

        artistBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        artistBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                artistBoxMouseClicked(evt);
            }
        });
        artistBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 3, 7, 3);
        jPanel2.add(artistBox, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addSinger.png"))); // NOI18N
        jButton1.setText("New Artist");
        jButton1.setPreferredSize(new java.awt.Dimension(117, 22));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 10);
        jPanel2.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addAlbum.png"))); // NOI18N
        jButton2.setText("New Album");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 10);
        jPanel2.add(jButton2, gridBagConstraints);

        albumBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        albumBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                albumBoxMouseClicked(evt);
            }
        });
        albumBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(albumBox, gridBagConstraints);

        urlText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        urlText.setFocusable(false);
        urlText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 0);
        jPanel2.add(urlText, gridBagConstraints);

        UploadMusicButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UploadMusicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/uploadMusic.png"))); // NOI18N
        UploadMusicButton.setText("Upload Music");
        UploadMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadMusicButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 5, 10);
        jPanel2.add(UploadMusicButton, gridBagConstraints);

        manufacturerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manufacturerLabel.setForeground(new java.awt.Color(56, 132, 209));
        manufacturerLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        manufacturerLabel.setText("Manufacturer:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 0);
        jPanel2.add(manufacturerLabel, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageButtonActionPerformed
        String filePath = "";
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif", "png");
        chooser.setFileFilter(filter);
        int selectedFile = chooser.showOpenDialog(this);
        if (selectedFile == JFileChooser.APPROVE_OPTION) {
            filePath = chooser.getSelectedFile().getAbsolutePath();
        }
//        Path path = Paths.get(filePath);
//        filePath = path.getParent().relativize(path).toString();  
        ImageIcon icon = new ImageIcon(filePath);
        image.setIcon(icon);
        song.setImagePath(filePath);
    }//GEN-LAST:event_uploadImageButtonActionPerformed

    private void saveSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSongButtonActionPerformed
        addSong();
    }//GEN-LAST:event_saveSongButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void urlTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlTextActionPerformed

    private void UploadMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadMusicButtonActionPerformed
        String filePath = "";
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 & WVA", "mp3", "wav");
        chooser.setFileFilter(filter);
        int selectedFile = chooser.showOpenDialog(this);
        if (selectedFile == JFileChooser.APPROVE_OPTION) {
            filePath = chooser.getSelectedFile().getAbsolutePath();
        }
//        Path path = Paths.get(filePath);
//        filePath = path.getParent().relativize(path).toString();
        urlText.setText(filePath);
        song.setSongPath(filePath);
    }//GEN-LAST:event_UploadMusicButtonActionPerformed

    private void artistBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artistBoxActionPerformed

    private void artistBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artistBoxMouseClicked
        artistBox.removeAllItems();
        setArtistBox();
    }//GEN-LAST:event_artistBoxMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddNewArtist addnewartist = new AddNewArtist(list, artists, albums);
        addnewartist.setVisible(true);
        addnewartist.setLocationRelativeTo(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AddNewAlbum addnewalbum = new AddNewAlbum(list, artists, albums);
        addnewalbum.setVisible(true);
        addnewalbum.setLocationRelativeTo(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void albumBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumBoxActionPerformed
        
    }//GEN-LAST:event_albumBoxActionPerformed

    private void albumBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_albumBoxMouseClicked
        albumBox.removeAllItems();
        setAlbumBox();
    }//GEN-LAST:event_albumBoxMouseClicked

    private void addSong() {
        ImageIcon crossIcon = new ImageIcon(getClass().getResource("/Icons/cross mark.png"));
        ImageIcon aceptIcon = new ImageIcon(getClass().getResource("/Icons/accept mark.png"));
        ImageIcon exclamationIcon = new ImageIcon(getClass().getResource("/Icons/exclamation mark.png"));
        ImageIcon questionIcon = new ImageIcon(getClass().getResource("/Icons/question mark.png"));
        if (nameText.getText().isEmpty()) {
            setBorderColor(nameText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Name of the song", "Message", 1, exclamationIcon);
            nameText.requestFocus();
        } else if (manufacturerText.getText().isEmpty()) {
            setBorderColor(manufacturerText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Manufacturer of the song", "Message", 1, exclamationIcon);
            manufacturerText.requestFocus();
        } else if (yearText.getText().isEmpty()) {
            setBorderColor(yearText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Release year of the song", "Message", 1, exclamationIcon);
            yearText.requestFocus();
        } else if (manufacturerText.getText().isEmpty()) {
            setBorderColor(manufacturerText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Album of the song", "Message", 1, exclamationIcon);
            manufacturerText.requestFocus();
        } else if (!songFilePathIsOK(urlText.getText())) {
            setBorderColor(urlText, Color.red);
            JOptionPane.showMessageDialog(this, "Invalid url: " + urlText.getText(), "Message", 1, exclamationIcon);
            UploadMusicButton.requestFocus();
        } else if (!isNumber(yearText.getText())) {
            setBorderColor(yearText, Color.red);
            JOptionPane.showMessageDialog(this, "Invalid number: " + yearText.getText(), "Message", 1, exclamationIcon);
            yearText.requestFocus();
        } else {
            song.setNameSong(nameText.getText());
            song.setArtist(artistBox.getSelectedItem().toString());
            song.setAlbum(albumBox.getSelectedItem().toString());
            song.setManufacturer(manufacturerText.getText());
            song.setYear(Integer.parseInt(yearText.getText()));
            song.setGenre(genres.getSelectedItem().toString());
            list.add(song);
            for (Album album : albums) {
                if (album.getAlbumName().equals(albumBox.getSelectedItem().toString())) {
                    album.getSongList().add(song.getNameSong());
                }
            }

            saveFile();
            JOptionPane.showMessageDialog(this, "Successfully added a new song!", "Message", JOptionPane.INFORMATION_MESSAGE, aceptIcon);
            dispose();
        }
    }

    private boolean songFilePathIsOK(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                AudioInputStream ais = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(ais);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private boolean isNumber(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void setBorderColor(JTextField text, Color color) {
        Border bor = BorderFactory.createLineBorder(color);
        text.setBorder(bor);
    }

    private void setArtistBox() {
        for (Artist art : artists) {
            artistBox.addItem(art.getName());
        }
        artistBox.addItem("None");
    }

    private void setAlbumBox() {
        for (Album alb : albums) {
            albumBox.addItem(alb.getAlbumName());
        }
        albumBox.addItem("None");
    }

    private void saveFile() {
        String fileName = "SongList.data";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
            oos.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, new ImageIcon(getClass().getResource("/Icons/cross mark.png")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, new ImageIcon(getClass().getResource("/Icons/cross mark.png")));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UploadMusicButton;
    private javax.swing.JComboBox<String> albumBox;
    private javax.swing.JLabel albumLabel;
    private javax.swing.JComboBox<String> artistBox;
    private javax.swing.JLabel artistLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel functions;
    private javax.swing.JComboBox<String> genres;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JTextField manufacturerText;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton saveSongButton;
    private javax.swing.JLabel songLabel;
    private javax.swing.JButton uploadImageButton;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlText;
    private javax.swing.JLabel year;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
