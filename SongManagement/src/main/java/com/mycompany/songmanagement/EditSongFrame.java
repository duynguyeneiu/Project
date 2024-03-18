/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.songmanagement;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class EditSongFrame extends javax.swing.JFrame {

    private ArrayList<Song> list = new ArrayList<>();
    private int index;
    private Song song;

    public EditSongFrame(ArrayList<Song> list, int index) {
        this.list = list;
        this.index = index;
        initComponents();
        song = list.get(index);
        nameText.setText(song.getName());
        authorText.setText(song.getAuthor());
        singerText.setText(song.getSinger());
        manufacturerText.setText(song.getManufacturer());
        yearText.setText(String.valueOf(song.getYear()));
        albumText.setText(song.getAlbum());
        genres.setSelectedItem(song.getGenre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        nameSong = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        author = new javax.swing.JLabel();
        authorText = new javax.swing.JTextField();
        singer = new javax.swing.JLabel();
        manufacturer = new javax.swing.JLabel();
        singerText = new javax.swing.JTextField();
        manufacturerText = new javax.swing.JTextField();
        year = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        uploadImageButton = new javax.swing.JButton();
        album = new javax.swing.JLabel();
        albumText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genres = new javax.swing.JComboBox<>();
        addButton2 = new javax.swing.JButton();
        addButton3 = new javax.swing.JButton();

        setTitle("Edit Information");
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel2.setLayout(new java.awt.GridBagLayout());

        nameSong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameSong.setForeground(new java.awt.Color(56, 132, 209));
        nameSong.setText("Song: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(nameSong, gridBagConstraints);

        nameText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel2.add(nameText, gridBagConstraints);

        author.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        author.setForeground(new java.awt.Color(56, 132, 209));
        author.setText("Author:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(author, gridBagConstraints);

        authorText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        authorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel2.add(authorText, gridBagConstraints);

        singer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        singer.setForeground(new java.awt.Color(56, 132, 209));
        singer.setText("Singer:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 0);
        jPanel2.add(singer, gridBagConstraints);

        manufacturer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manufacturer.setForeground(new java.awt.Color(56, 132, 209));
        manufacturer.setText("Manufacturer:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(manufacturer, gridBagConstraints);

        singerText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        singerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singerTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel2.add(singerText, gridBagConstraints);

        manufacturerText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 0);
        jPanel2.add(manufacturerText, gridBagConstraints);

        year.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        year.setForeground(new java.awt.Color(56, 132, 209));
        year.setText("Year of Release:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(year, gridBagConstraints);

        yearText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel2.add(yearText, gridBagConstraints);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        image.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        image.setIconTextGap(1);
        image.setMaximumSize(new java.awt.Dimension(125, 125));
        image.setMinimumSize(new java.awt.Dimension(125, 125));
        image.setName(""); // NOI18N
        image.setPreferredSize(new java.awt.Dimension(125, 125));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 11, 10);
        jPanel2.add(image, gridBagConstraints);

        uploadImageButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uploadImageButton.setIcon(new javax.swing.ImageIcon("D:\\CSE203_OOP\\Project\\SongManagement\\src\\main\\java\\com\\mycompany\\songmanagement\\Icons\\upload image.png")); // NOI18N
        uploadImageButton.setText("Change Image");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 20, 5);
        jPanel2.add(uploadImageButton, gridBagConstraints);

        album.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        album.setForeground(new java.awt.Color(56, 132, 209));
        album.setText("Album");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        jPanel2.add(album, gridBagConstraints);

        albumText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        jPanel2.add(albumText, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 132, 209));
        jLabel3.setText("Genre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        jPanel2.add(jLabel3, gridBagConstraints);

        genres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jazz ", "Pop", "Rock ", "Folk ", "Classical", "Country", "EDM", "Classical ", "Rap", "Dance", "Blue ", "Opera", "Hip hop ", "R&B ", "Others" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        jPanel2.add(genres, gridBagConstraints);

        addButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton2.setIcon(new javax.swing.ImageIcon("D:\\CSE203_OOP\\Project\\SongManagement\\src\\main\\java\\com\\mycompany\\songmanagement\\Icons\\tick.png")); // NOI18N
        addButton2.setText("Done");
        addButton2.setMaximumSize(new java.awt.Dimension(180, 136));
        addButton2.setMinimumSize(new java.awt.Dimension(80, 36));
        addButton2.setOpaque(true);
        addButton2.setPreferredSize(new java.awt.Dimension(80, 36));
        addButton2.setRequestFocusEnabled(false);
        addButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 20, 5);
        jPanel2.add(addButton2, gridBagConstraints);

        addButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton3.setIcon(new javax.swing.ImageIcon("D:\\CSE203_OOP\\Project\\SongManagement\\src\\main\\java\\com\\mycompany\\songmanagement\\Icons\\cross.png")); // NOI18N
        addButton3.setText("Cancel");
        addButton3.setMaximumSize(new java.awt.Dimension(180, 136));
        addButton3.setMinimumSize(new java.awt.Dimension(80, 36));
        addButton3.setOpaque(true);
        addButton3.setPreferredSize(new java.awt.Dimension(90, 36));
        addButton3.setRequestFocusEnabled(false);
        addButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 20, 5);
        jPanel2.add(addButton3, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void authorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorTextActionPerformed

    private void singerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singerTextActionPerformed

    private void addButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton2ActionPerformed
        if (nameText.getText().isEmpty()) {
            setBorderColor(nameText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Name of the song");
            nameText.requestFocus();
        } else if (authorText.getText().isEmpty()) {
            setBorderColor(authorText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Author's name");
            authorText.requestFocus();
        } else if (singerText.getText().isEmpty()) {
            setBorderColor(singerText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Singer's name");
            singerText.requestFocus();
        } else if (manufacturerText.getText().isEmpty()) {
            setBorderColor(manufacturerText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Manufacturer of the song");
            manufacturerText.requestFocus();
        } else if (yearText.getText().isEmpty()) {
            setBorderColor(yearText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Release year of the song");
            yearText.requestFocus();
        } else if (albumText.getText().isEmpty()) {
            setBorderColor(albumText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Album of the song");
            albumText.requestFocus();
        } else if (!isNumber(yearText.getText())) {
            setBorderColor(yearText, Color.red);
            JOptionPane.showMessageDialog(this, "Invalid number: " + yearText.getText());
            yearText.requestFocus();
        } else {
            song.setName(nameText.getText());
            song.setAuthor(authorText.getText());
            song.setSinger(singerText.getText());
            song.setManufacturer(manufacturerText.getText());
            song.setYear(Integer.parseInt(yearText.getText()));
            song.setGenre(genres.getSelectedItem().toString());
            song.setAlbum(albumText.getText());
            JOptionPane.showMessageDialog(this, "Successfully changed information of the song!");
            dispose();

        }
    }//GEN-LAST:event_addButton2ActionPerformed

    private void addButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_addButton3ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton2;
    private javax.swing.JButton addButton3;
    private javax.swing.JLabel album;
    private javax.swing.JTextField albumText;
    private javax.swing.JLabel author;
    private javax.swing.JTextField authorText;
    private javax.swing.JComboBox<String> genres;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel manufacturer;
    private javax.swing.JTextField manufacturerText;
    private javax.swing.JLabel nameSong;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel singer;
    private javax.swing.JTextField singerText;
    private javax.swing.JButton uploadImageButton;
    private javax.swing.JLabel year;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
