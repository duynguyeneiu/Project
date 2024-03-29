/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.songmanagement;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Student
 */
public class Main extends javax.swing.JFrame {

    private ArrayList<Song> list;
    private ImageIcon crossIcon = new ImageIcon(getClass().getResource("/Icons/cross mark.png"));
    private ImageIcon aceptIcon = new ImageIcon(getClass().getResource("/Icons/accept mark.png"));
    private ImageIcon exclamationIcon = new ImageIcon(getClass().getResource("/Icons/exclamation mark.png"));
    private ImageIcon questionIcon = new ImageIcon(getClass().getResource("/Icons/question mark.png"));

    public Main() {
        list = new ArrayList<>();
        loadFile();
        initComponents();
//        ClassLoader classloader= getClass().getClassLoader();
//        URL iconUrl= classloader.getResource("Icons/frame icon.png");
//        ImageIcon icon = new ImageIcon(iconUrl);
//        setIconImage(icon.getImage());
        setLocationRelativeTo(null);
        addRowSorter(table);
      //  fillTable(list);

    }

    public ArrayList<Song> getList() {
        return list;
    }

    public void setList(ArrayList<Song> list) {
        this.list = list;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        refreshButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        SearchType = new javax.swing.JComboBox<>();
        searchText = new javax.swing.JTextField();
        SearchBuuton = new javax.swing.JButton();
        song = new javax.swing.JLabel();
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
        functions = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        album = new javax.swing.JLabel();
        albumText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        genres = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Project");
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new java.awt.GridLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Song", "Author", "Singer", "Genre", "Album", "Release Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setName(""); // NOI18N
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 132, 209));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/app Icon.png"))); // NOI18N
        jLabel1.setText("SONG MANAGEMENT");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        refreshButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(refreshButton, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        SearchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Song", "Author ", "Singer", "Manufacturer", "Years of Release", "Genre", "Album", " " }));
        SearchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTypeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 6, 10);
        jPanel2.add(SearchType, gridBagConstraints);

        searchText.setMinimumSize(new java.awt.Dimension(150, 22));
        searchText.setPreferredSize(new java.awt.Dimension(150, 22));
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 0);
        jPanel2.add(searchText, gridBagConstraints);

        SearchBuuton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SearchBuuton.setForeground(java.awt.Color.lightGray);
        SearchBuuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        SearchBuuton.setText("Search");
        SearchBuuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBuutonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        jPanel2.add(SearchBuuton, gridBagConstraints);

        song.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        song.setForeground(new java.awt.Color(56, 132, 209));
        song.setText("Song: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel2.add(song, gridBagConstraints);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 20, 0);
        jPanel2.add(uploadImageButton, gridBagConstraints);

        functions.setMinimumSize(new java.awt.Dimension(100, 100));
        functions.setPreferredSize(new java.awt.Dimension(100, 100));
        functions.setLayout(new java.awt.GridBagLayout());

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        addButton.setText("Add");
        addButton.setMaximumSize(new java.awt.Dimension(180, 136));
        addButton.setMinimumSize(new java.awt.Dimension(80, 36));
        addButton.setOpaque(true);
        addButton.setPreferredSize(new java.awt.Dimension(80, 36));
        addButton.setRequestFocusEnabled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 7);
        functions.add(addButton, gridBagConstraints);

        editButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        editButton.setText("Edit");
        editButton.setMaximumSize(new java.awt.Dimension(84, 36));
        editButton.setMinimumSize(new java.awt.Dimension(84, 36));
        editButton.setPreferredSize(new java.awt.Dimension(84, 36));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        functions.add(editButton, gridBagConstraints);

        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setMaximumSize(new java.awt.Dimension(88, 36));
        saveButton.setMinimumSize(new java.awt.Dimension(88, 36));
        saveButton.setPreferredSize(new java.awt.Dimension(88, 36));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        functions.add(saveButton, gridBagConstraints);

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setMaximumSize(new java.awt.Dimension(98, 36));
        deleteButton.setMinimumSize(new java.awt.Dimension(98, 36));
        deleteButton.setPreferredSize(new java.awt.Dimension(98, 36));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        functions.add(deleteButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(functions, gridBagConstraints);

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

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void SearchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTypeActionPerformed

    private void singerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_singerTextActionPerformed

    private void authorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
      //  addSong();
    }//GEN-LAST:event_addButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
      //  fillTable(list);
        refreshText();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        saveFile();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a song to edit", "Message", 1, new ImageIcon(getClass().getResource("/Icons/exclamation mark.png")));
        } else {
//            EditSongFrame edit = new EditSongFrame(list, table.getSelectedRow());
//            edit.setLocationRelativeTo(this);
//            edit.setVisible(true);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
//        if (table.getSelectedRow() != -1) {
//            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete the song: " + list.get(table.getSelectedRow()).getName(), "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, questionIcon);
//            if (option == JOptionPane.YES_OPTION) {
//                list.remove(table.getSelectedRow());
//
//            }
//        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void SearchBuutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBuutonActionPerformed
      //  search();
    }//GEN-LAST:event_SearchBuutonActionPerformed

    private void uploadImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageButtonActionPerformed
        String filePath = "";
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif","png");
        chooser.setFileFilter(filter);
        int selectedFile = chooser.showOpenDialog(this);
        if (selectedFile == JFileChooser.APPROVE_OPTION) {
            filePath = chooser.getSelectedFile().getPath();
        }
        
        ImageIcon icon = new ImageIcon(filePath);
        image.setIcon(icon);
        
    }//GEN-LAST:event_uploadImageButtonActionPerformed
//    private void search() {
//        String searchType = SearchType.getSelectedItem().toString();
//        String key = searchText.getText();
//        ArrayList<Song> search = new ArrayList<>();
//        switch (searchType) {
//            case "Song":
//                for (Song song : list) {
//                    if (song.getName().contains(key)) {
//                        search.add(song);
//                    }
//                }
//                break;
//            case "Author":
//                for (Song song : list) {
//                    if (song.getAuthor().contains(key)) {
//                        search.add(song);
//                    }
//                }
//                break;
//            case "Singer":
//                for (Song song : list) {
//                    if (song.getSinger().contains(key)) {
//                        search.add(song);
//                    }
//                }
//                break;
//            case "Manufacturer":
//                for (Song song : list) {
//                    if (song.getManufacturer().contains(key)) {
//                        search.add(song);
//                    }
//                }
//                break;
//            case "Years of Release":
//                if (isNumber(key)) {
//                    for (Song song : list) {
//                        if (song.getYear() == 0) {
//                            search.add(song);
//                        }
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(this, "Invalid search content: " + key);
//                    searchText.requestFocus();
//                }
//                break;
//            case "Genre":
//                for (Song song : list) {
//                    if (song.getGenre().contains(key)) {
//                        search.add(song);
//                    }
//                }
//                break;
//            case "Album":
//                for (Song song : list) {
//                    if (song.getAlbum().contains(key)) {
//                        search.add(song);
//                    }
//                }
//                break;
//        }
//        fillTable(search);
//    }

//    private void addSong() {
//        
//        if (nameText.getText().isEmpty()) {
//            setBorderColor(nameText, Color.red);
//            JOptionPane.showMessageDialog(this, "Please enter Name of the song", "Message", 1, exclamationIcon);
//            nameText.requestFocus();
//        } else if (authorText.getText().isEmpty()) {
//            setBorderColor(authorText, Color.red);
//            JOptionPane.showMessageDialog(this, "Please enter Author's name", "Message", 1, exclamationIcon);
//            authorText.requestFocus();
//        } else if (singerText.getText().isEmpty()) {
//            setBorderColor(singerText, Color.red);
//            JOptionPane.showMessageDialog(this, "Please enter Singer's name", "Message", 1, exclamationIcon);
//            singerText.requestFocus();
//        } else if (manufacturerText.getText().isEmpty()) {
//            setBorderColor(manufacturerText, Color.red);
//            JOptionPane.showMessageDialog(this, "Please enter Manufacturer of the song", "Message", 1, exclamationIcon);
//            manufacturerText.requestFocus();
//        } else if (yearText.getText().isEmpty()) {
//            setBorderColor(yearText, Color.red);
//            JOptionPane.showMessageDialog(this, "Please enter Release year of the song", "Message", 1, exclamationIcon);
//            yearText.requestFocus();
//        } else if (albumText.getText().isEmpty()) {
//            setBorderColor(albumText, Color.red);
//            JOptionPane.showMessageDialog(this, "Please enter Album of the song", "Message", 1, exclamationIcon);
//            albumText.requestFocus();
//        } else if (!isNumber(yearText.getText())) {
//            setBorderColor(yearText, Color.red);
//            JOptionPane.showMessageDialog(this, "Invalid number: " + yearText.getText(), "Message", 1, exclamationIcon);
//            yearText.requestFocus();
//        } else {
//            String name = nameText.getText();
//            String author = authorText.getText();
//            String singer = singerText.getText();
//            String manufacturer = manufacturerText.getText();
//            int year = Integer.parseInt(yearText.getText());
//            String genre = genres.getSelectedItem().toString();
//            String album = albumText.getText();
//            Song song = new Song(name, author, singer, manufacturer, genre, album, year);
//            list.add(song);
//            JOptionPane.showMessageDialog(this, "Successfully add a new song!", "Message", JOptionPane.INFORMATION_MESSAGE, aceptIcon);
//            refreshText();
//            fillTable(list);
//
//        }
//    }

    private boolean isNumber(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void refreshText() {
        nameText.setText("");
        nameText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        authorText.setText("");
        authorText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        singerText.setText("");
        singerText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        manufacturerText.setText("");
        manufacturerText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        yearText.setText("");
        yearText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        albumText.setText("");
        albumText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        genres.setSelectedIndex(0);
    }

    private void setBorderColor(JTextField text, Color color) {
        Border bor = BorderFactory.createLineBorder(color);
        text.setBorder(bor);
    }

//    private void fillTable(ArrayList<Song> list) {
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        int rowCount = table.getRowCount();
//        for (int i = rowCount - 1; i >= 0; i--) {
//            model.removeRow(i);
//        }
//        for (Song song : list) {
//            Object[] row = new Object[]{song.getName(), song.getAuthor(), song.getSinger(), song.getGenre(), song.getAlbum(), song.getYear()};
//            model.addRow(row);
//        }
//        pack();
//
//    }

    private void addRowSorter(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
    }

    String fileName = "SongList.data";

    private void loadFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            this.list = (ArrayList<Song>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error load file: " + ex.getMessage(), "Message", 1, crossIcon);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error load file: " + ex.getMessage(), "Message", 1, crossIcon);
        }
    }

    private void saveFile() {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(list);
            oos.close();
            JOptionPane.showMessageDialog(this, "Successfully saved file!");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, crossIcon);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, crossIcon);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBuuton;
    private javax.swing.JComboBox<String> SearchType;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel album;
    private javax.swing.JTextField albumText;
    private javax.swing.JLabel author;
    private javax.swing.JTextField authorText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel functions;
    private javax.swing.JComboBox<String> genres;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manufacturer;
    private javax.swing.JTextField manufacturerText;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JLabel singer;
    private javax.swing.JTextField singerText;
    private javax.swing.JLabel song;
    private javax.swing.JTable table;
    private javax.swing.JButton uploadImageButton;
    private javax.swing.JLabel year;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
