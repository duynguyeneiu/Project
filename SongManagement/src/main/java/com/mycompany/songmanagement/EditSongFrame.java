/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.songmanagement;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
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
public class EditSongFrame extends javax.swing.JFrame {

    private ArrayList<Artist> artists;
    private ArrayList<Album> albums;
    private ArrayList<Song> list;
    private int index;
    private Song song;

    public EditSongFrame(ArrayList<Song> list, int index, ArrayList<Artist> artists, ArrayList<Album> albums) {
        this.list = list;
        this.index = index;
        this.artists = artists;
        this.albums = albums;
        initComponents();
        setComboBox();
        
        song = list.get(index);
        nameText.setText(song.getNameSong());
        artistBox.setSelectedItem(song.getArtist());
        albumBox.setSelectedItem(song.getAlbum());
        image.setIcon(new ImageIcon(song.getImagePath()));
        manufacturerText.setText(song.getManufacturer());
        yearText.setText(String.valueOf(song.getYear()));
        genres.setSelectedItem(song.getGenre());
        urlText.setText(song.getSongPath());
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
        doneButton = new javax.swing.JButton();
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

        setTitle("Edit Information");
        setPreferredSize(new java.awt.Dimension(600, 600));

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
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 20, 0);
        jPanel2.add(uploadImageButton, gridBagConstraints);

        functions.setMinimumSize(new java.awt.Dimension(100, 100));
        functions.setPreferredSize(new java.awt.Dimension(100, 50));
        functions.setLayout(new java.awt.GridBagLayout());

        doneButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tick.png"))); // NOI18N
        doneButton.setText("Done");
        doneButton.setMaximumSize(new java.awt.Dimension(88, 36));
        doneButton.setMinimumSize(new java.awt.Dimension(88, 36));
        doneButton.setPreferredSize(new java.awt.Dimension(88, 22));
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        functions.add(doneButton, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 3, 7, 3);
        jPanel2.add(artistBox, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addSinger.png"))); // NOI18N
        jButton1.setText("New Singer");
        jButton1.setPreferredSize(new java.awt.Dimension(117, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 10);
        jPanel2.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addAlbum.png"))); // NOI18N
        jButton2.setText("New Album");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 10);
        jPanel2.add(jButton2, gridBagConstraints);

        albumBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
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
        UploadMusicButton.setText("Change");
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

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        editSong();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void urlTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlTextActionPerformed

    private void UploadMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadMusicButtonActionPerformed
        String filePath = "";
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 & WVA", "mp3", "wva");
        chooser.setFileFilter(filter);
        int selectedFile = chooser.showOpenDialog(this);
        if (selectedFile == JFileChooser.APPROVE_OPTION) {
            filePath = chooser.getSelectedFile().getAbsolutePath();
        }
        urlText.setText(filePath);
//        Path path = Paths.get(filePath);
//        filePath = path.getParent().relativize(path).toString();
        song.setSongPath(filePath);
    }//GEN-LAST:event_UploadMusicButtonActionPerformed
    private void editSong() {
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
        } else if (!isvalidAudioURL(urlText.getText())) {
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
            JOptionPane.showMessageDialog(this, "Successfully add a new song!", "Message", JOptionPane.INFORMATION_MESSAGE, aceptIcon);
            dispose();
        }
    }

    private boolean isNumber(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isvalidAudioURL(String a) {
        try {
            File file = new File(a);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
            return true;
        } catch (UnsupportedAudioFileException | IOException ex) {
            return false;
        }
    }

    private void setBorderColor(JTextField text, Color color) {
        Border bor = BorderFactory.createLineBorder(color);
        text.setBorder(bor);
    }

    private void setComboBox() {
        for (Artist art : artists) {
            artistBox.addItem(art.getname());
        }
        for (Album alb : albums) {
            artistBox.addItem(alb.getAlbumName());
        }
    }

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UploadMusicButton;
    private javax.swing.JComboBox<String> albumBox;
    private javax.swing.JLabel albumLabel;
    private javax.swing.JComboBox<String> artistBox;
    private javax.swing.JLabel artistLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton doneButton;
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
    private javax.swing.JLabel songLabel;
    private javax.swing.JButton uploadImageButton;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlText;
    private javax.swing.JLabel year;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
