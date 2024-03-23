/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.songmanagement;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class NewMain extends javax.swing.JFrame {

    private ArrayList<Artist> artists;
    private ArrayList<Song> list;
    private ArrayList<Album> albums;

    public NewMain() {
        list = new ArrayList<>();
        artists = new ArrayList<>();
        albums = new ArrayList<>();

        loadFile();
        initComponents();
        tab1.setVisible(true);
        if (list != null) {
            fillTable(list);
        }

        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);

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

        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        libraryButton = new javax.swing.JButton();
        albumButton = new javax.swing.JButton();
        artistButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        SearchBuuton = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        SearchType = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        functions = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        tab2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        SearchBuuton1 = new javax.swing.JButton();
        searchText1 = new javax.swing.JTextField();
        SearchType1 = new javax.swing.JComboBox<>();
        functions1 = new javax.swing.JPanel();
        addButton1 = new javax.swing.JButton();
        editButton1 = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        tab3 = new javax.swing.JPanel();
        tab4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePanel.setPreferredSize(new java.awt.Dimension(508, 60));
        titlePanel.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 132, 209));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/app Icon.png"))); // NOI18N
        jLabel1.setText("SONG MANAGEMENT");
        jLabel1.setPreferredSize(new java.awt.Dimension(311, 60));
        titlePanel.add(jLabel1);

        getContentPane().add(titlePanel, java.awt.BorderLayout.PAGE_START);

        menuPanel.setBackground(new java.awt.Color(204, 204, 255));
        menuPanel.setPreferredSize(new java.awt.Dimension(125, 369));
        menuPanel.setLayout(new java.awt.GridBagLayout());

        libraryButton.setBackground(new java.awt.Color(204, 204, 255));
        libraryButton.setText("Library");
        libraryButton.setMaximumSize(new java.awt.Dimension(125, 50));
        libraryButton.setMinimumSize(new java.awt.Dimension(125, 50));
        libraryButton.setPreferredSize(new java.awt.Dimension(125, 50));
        libraryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                libraryButtonMouseClicked(evt);
            }
        });
        libraryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        menuPanel.add(libraryButton, gridBagConstraints);

        albumButton.setBackground(new java.awt.Color(204, 204, 255));
        albumButton.setText("Albums");
        albumButton.setMaximumSize(new java.awt.Dimension(125, 50));
        albumButton.setMinimumSize(new java.awt.Dimension(125, 50));
        albumButton.setPreferredSize(new java.awt.Dimension(125, 50));
        albumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        menuPanel.add(albumButton, gridBagConstraints);

        artistButton.setBackground(new java.awt.Color(204, 204, 255));
        artistButton.setText("Artist");
        artistButton.setMaximumSize(new java.awt.Dimension(125, 50));
        artistButton.setMinimumSize(new java.awt.Dimension(125, 50));
        artistButton.setPreferredSize(new java.awt.Dimension(125, 50));
        artistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        menuPanel.add(artistButton, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setText("jButton4");
        jButton4.setMaximumSize(new java.awt.Dimension(125, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(125, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(125, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        menuPanel.add(jButton4, gridBagConstraints);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton5.setText("HOME");
        jButton5.setMaximumSize(new java.awt.Dimension(125, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(125, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(125, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        menuPanel.add(jButton5, gridBagConstraints);

        getContentPane().add(menuPanel, java.awt.BorderLayout.LINE_START);

        contentPanel.setLayout(new javax.swing.OverlayLayout(contentPanel));

        tab1.setBackground(new java.awt.Color(255, 255, 255));
        tab1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tab1.setMinimumSize(new java.awt.Dimension(822, 416));
        tab1.setPreferredSize(new java.awt.Dimension(822, 416));
        tab1.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel7.setLayout(new java.awt.GridBagLayout());

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
        jPanel7.add(SearchBuuton, gridBagConstraints);

        searchText.setMinimumSize(new java.awt.Dimension(150, 22));
        searchText.setPreferredSize(new java.awt.Dimension(200, 22));
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
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 5, 0);
        jPanel7.add(searchText, gridBagConstraints);

        SearchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Song", "Author ", "Singer", "Manufacturer", "Years of Release", "Genre", "Album", " " }));
        SearchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTypeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 6, 0);
        jPanel7.add(SearchType, gridBagConstraints);

        tab1.add(jPanel7, java.awt.BorderLayout.NORTH);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Song", "Artist", "Genre", "Album", "Release Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setName(""); // NOI18N
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        tab1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        functions.setMinimumSize(new java.awt.Dimension(100, 100));
        functions.setPreferredSize(new java.awt.Dimension(100, 40));
        functions.setLayout(new java.awt.GridBagLayout());

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        addButton.setText("Add");
        addButton.setMaximumSize(new java.awt.Dimension(180, 136));
        addButton.setMinimumSize(new java.awt.Dimension(80, 36));
        addButton.setOpaque(true);
        addButton.setPreferredSize(new java.awt.Dimension(80, 22));
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
        editButton.setPreferredSize(new java.awt.Dimension(84, 22));
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

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setMaximumSize(new java.awt.Dimension(98, 36));
        deleteButton.setMinimumSize(new java.awt.Dimension(98, 36));
        deleteButton.setPreferredSize(new java.awt.Dimension(98, 22));
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

        tab1.add(functions, java.awt.BorderLayout.SOUTH);

        contentPanel.add(tab1);

        tab2.setBackground(new java.awt.Color(255, 255, 255));
        tab2.setName(""); // NOI18N
        tab2.setPreferredSize(new java.awt.Dimension(822, 394));
        tab2.setLayout(new java.awt.BorderLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Song", "Artist", "Genre", "Album", "Release Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setName(""); // NOI18N
        table1.getTableHeader().setReorderingAllowed(false);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table1);

        tab2.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        SearchBuuton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SearchBuuton1.setForeground(java.awt.Color.lightGray);
        SearchBuuton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        SearchBuuton1.setText("Search");
        SearchBuuton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBuuton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        jPanel8.add(SearchBuuton1, gridBagConstraints);

        searchText1.setMinimumSize(new java.awt.Dimension(150, 22));
        searchText1.setPreferredSize(new java.awt.Dimension(200, 22));
        searchText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchText1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 5, 0);
        jPanel8.add(searchText1, gridBagConstraints);

        SearchType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Song", "Author ", "Singer", "Manufacturer", "Years of Release", "Genre", "Album", " " }));
        SearchType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchType1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 6, 0);
        jPanel8.add(SearchType1, gridBagConstraints);

        tab2.add(jPanel8, java.awt.BorderLayout.NORTH);

        functions1.setMinimumSize(new java.awt.Dimension(100, 100));
        functions1.setPreferredSize(new java.awt.Dimension(100, 40));
        functions1.setLayout(new java.awt.GridBagLayout());

        addButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        addButton1.setText("Add");
        addButton1.setMaximumSize(new java.awt.Dimension(180, 136));
        addButton1.setMinimumSize(new java.awt.Dimension(80, 36));
        addButton1.setOpaque(true);
        addButton1.setPreferredSize(new java.awt.Dimension(80, 22));
        addButton1.setRequestFocusEnabled(false);
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 7);
        functions1.add(addButton1, gridBagConstraints);

        editButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        editButton1.setText("Edit");
        editButton1.setMaximumSize(new java.awt.Dimension(84, 36));
        editButton1.setMinimumSize(new java.awt.Dimension(84, 36));
        editButton1.setPreferredSize(new java.awt.Dimension(84, 22));
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        functions1.add(editButton1, gridBagConstraints);

        deleteButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        deleteButton1.setText("Delete");
        deleteButton1.setMaximumSize(new java.awt.Dimension(98, 36));
        deleteButton1.setMinimumSize(new java.awt.Dimension(98, 36));
        deleteButton1.setPreferredSize(new java.awt.Dimension(98, 22));
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        functions1.add(deleteButton1, gridBagConstraints);

        tab2.add(functions1, java.awt.BorderLayout.SOUTH);

        contentPanel.add(tab2);

        tab3.setBackground(new java.awt.Color(0, 51, 255));
        tab3.setMinimumSize(new java.awt.Dimension(154, 56));
        tab3.setPreferredSize(new java.awt.Dimension(155, 124));
        tab3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contentPanel.add(tab3);

        tab4.setBackground(new java.awt.Color(153, 0, 153));
        tab4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contentPanel.add(tab4);

        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void artistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistButtonActionPerformed
        tab1.setVisible(false);
        tab2.setVisible(false);
        tab3.setVisible(true);
        tab4.setVisible(false);
    }//GEN-LAST:event_artistButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void libraryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryButtonActionPerformed

    }//GEN-LAST:event_libraryButtonActionPerformed

    private void SearchBuutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBuutonActionPerformed
        //  search();
    }//GEN-LAST:event_SearchBuutonActionPerformed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void SearchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTypeActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        new AddNewSong(list, artists, albums).setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        if (table.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a song to edit", "Message", 1, exclamationIcon);
        } else {
            EditSongFrame edit = new EditSongFrame(list, table.getSelectedRow(), artists, albums);
            edit.setLocationRelativeTo(this);
            edit.setVisible(true);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (table.getSelectedRow() != -1) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete the song: " + list.get(table.getSelectedRow()).getNameSong(), "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, questionIcon);
            if (option == JOptionPane.YES_OPTION) {
                list.remove(table.getSelectedRow());

            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void libraryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libraryButtonMouseClicked
        tab1.setVisible(true);
        fillTable(list);
        tab2.setVisible(false);
        tab3.setVisible(false);
        tab4.setVisible(false);
    }//GEN-LAST:event_libraryButtonMouseClicked

    private void albumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumButtonActionPerformed
        tab1.setVisible(false);
        tab2.setVisible(true);
        tab3.setVisible(false);
        tab4.setVisible(false);
    }//GEN-LAST:event_albumButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void SearchBuuton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBuuton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBuuton1ActionPerformed

    private void searchText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchText1ActionPerformed

    private void SearchType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchType1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchType1ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table1MouseClicked

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButton1ActionPerformed

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButton1ActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButton1ActionPerformed

    private void fillTable(ArrayList<Song> list) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = table.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Song song : list) {
            Object[] row = new Object[]{song.getNameSong(), song.getArtist(), song.getGenre(), song.getAlbum(), song.getYear()};
            model.addRow(row);
        }
    }

    private ImageIcon crossIcon = new ImageIcon(getClass().getResource("/Icons/cross mark.png"));
    private ImageIcon aceptIcon = new ImageIcon(getClass().getResource("/Icons/accept mark.png"));
    private ImageIcon exclamationIcon = new ImageIcon(getClass().getResource("/Icons/exclamation mark.png"));
    private ImageIcon questionIcon = new ImageIcon(getClass().getResource("/Icons/question mark.png"));

    private void loadFile() {
        String fileName = "SongList.data";
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
        String fileName = "SongList.data";
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
    private javax.swing.JButton SearchBuuton1;
    private javax.swing.JComboBox<String> SearchType;
    private javax.swing.JComboBox<String> SearchType1;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton albumButton;
    private javax.swing.JButton artistButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editButton1;
    private javax.swing.JPanel functions;
    private javax.swing.JPanel functions1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton libraryButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField searchText;
    private javax.swing.JTextField searchText1;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}