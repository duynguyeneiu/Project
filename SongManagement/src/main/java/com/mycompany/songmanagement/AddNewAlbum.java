/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.songmanagement;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class AddNewAlbum extends javax.swing.JFrame {

    private ArrayList<Artist> artists;
    private ArrayList<Album> albums;
    private ArrayList<Song> list;
    private Album album;
    public AddNewAlbum(ArrayList<Song> list, ArrayList<Artist> artists, ArrayList<Album> albums) {
        this.list = list;
        this.artists = artists;
        this.albums = albums;
        this.album = new Album();
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        songLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        year = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        uploadImageButton = new javax.swing.JButton();
        functions = new javax.swing.JPanel();
        saveSongButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        manufacturerLabel = new javax.swing.JLabel();
        genreBox = new javax.swing.JComboBox<>();
        artistBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Album");

        jPanel2.setLayout(new java.awt.GridBagLayout());

        songLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songLabel.setForeground(new java.awt.Color(56, 132, 209));
        songLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        songLabel.setText("Album Name:");
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
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel2.add(nameText, gridBagConstraints);

        year.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        year.setForeground(new java.awt.Color(56, 132, 209));
        year.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        year.setText("Year of Release:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(year, gridBagConstraints);

        yearText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        yearText.setPreferredSize(new java.awt.Dimension(75, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        jPanel2.add(yearText, gridBagConstraints);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/albumDefaultIcon.png"))); // NOI18N
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
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(30, 10, 15, 10);
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
        gridBagConstraints.gridwidth = 4;
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
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 17, 0);
        jPanel2.add(functions, gridBagConstraints);

        label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(56, 132, 209));
        label.setText("Genre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 0);
        jPanel2.add(label, gridBagConstraints);

        manufacturerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        manufacturerLabel.setForeground(new java.awt.Color(56, 132, 209));
        manufacturerLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        manufacturerLabel.setText("Artist:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 0);
        jPanel2.add(manufacturerLabel, gridBagConstraints);

        genreBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jazz ", "Pop", "Rock ", "Folk ", "Classical", "Country", "EDM", "Classical ", "Rap", "Dance", "Blue ", "Opera", "Hip hop ", "R&B ", "Others" }));
        genreBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 11);
        jPanel2.add(genreBox, gridBagConstraints);

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
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 3, 7, 3);
        jPanel2.add(artistBox, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addSinger.png"))); // NOI18N
        jButton1.setText("New Artist");
        jButton1.setPreferredSize(new java.awt.Dimension(117, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 10);
        jPanel2.add(jButton1, gridBagConstraints);

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
        ImageIcon icon = new ImageIcon(filePath);
        image.setIcon(icon);
        album.setImagePath(filePath);
    }//GEN-LAST:event_uploadImageButtonActionPerformed

    private void saveSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSongButtonActionPerformed
        addArtist();
        dispose();
    }//GEN-LAST:event_saveSongButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void genreBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreBoxActionPerformed

    private void artistBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artistBoxActionPerformed

    private void artistBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artistBoxMouseClicked
        artistBox.removeAllItems();
        setComboBox();
    }//GEN-LAST:event_artistBoxMouseClicked

    private void addArtist() {
        ImageIcon aceptIcon = new ImageIcon(getClass().getResource("/Icons/accept mark.png"));
        ImageIcon exclamationIcon = new ImageIcon(getClass().getResource("/Icons/exclamation mark.png"));
        if (nameText.getText().isEmpty()) {
            setBorderColor(nameText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Name of the album", "Message", 1, exclamationIcon);
            nameText.requestFocus();
        } else if (yearText.getText().isEmpty()) {
            setBorderColor(yearText, Color.red);
            JOptionPane.showMessageDialog(this, "Please enter Release year of the album", "Message", 1, exclamationIcon);
            yearText.requestFocus();
        } else if (!isNumber(yearText.getText())) {
            setBorderColor(yearText, Color.red);
            JOptionPane.showMessageDialog(this, "Invalid number: " + yearText.getText(), "Message", 1, exclamationIcon);
            yearText.requestFocus();
        } else {
            album.setAlbumName(nameText.getText());
            album.setYearOfRelease(Integer.parseInt(yearText.getText()));           
            album.setGenre(genreBox.getSelectedItem().toString());
            album.setArtist(artistBox.getSelectedItem().toString());
            albums.add(album);
            JOptionPane.showMessageDialog(this, "Successfully create a new album!", "Message", JOptionPane.INFORMATION_MESSAGE, aceptIcon);
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

    private void setBorderColor(JTextField text, Color color) {
        Border bor = BorderFactory.createLineBorder(color);
        text.setBorder(bor);
    }
     private void setComboBox() {
        for (Artist art : artists) {
            artistBox.addItem(art.getName());
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> artistBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel functions;
    private javax.swing.JComboBox<String> genreBox;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton saveSongButton;
    private javax.swing.JLabel songLabel;
    private javax.swing.JButton uploadImageButton;
    private javax.swing.JLabel year;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
