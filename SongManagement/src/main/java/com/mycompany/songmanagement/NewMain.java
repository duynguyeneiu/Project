/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.songmanagement;

import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

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
        loadArtistFile();
        loadAlbumFile();

        initComponents();
        ImageIcon frameIcon= new ImageIcon(getClass().getResource("/Icons/frameIcon.png"));
        setIconImage(frameIcon.getImage());
        setLocationRelativeTo(null);
        
//        addRowSorter(table1);
//        addRowSorter(tableAlbum);
        addRowSorter(tableArtist);
        
        fillArtistTable(artists);
        fillAlbumTable(albums);
        fillTable(list);
        tabSong.setVisible(true);

        tabAlbum.setVisible(false);
        tabArtist.setVisible(false);
        tabAbout.setVisible(false);

    }
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
        aboutButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        contentPanel = new javax.swing.JPanel();
        tabSong = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        songSearchButton = new javax.swing.JButton();
        SongSearchText = new javax.swing.JTextField();
        songSearchType = new javax.swing.JComboBox<>();
        refreshSongTable = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        functions = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        tabAlbum = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAlbum = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        albumSearchButton = new javax.swing.JButton();
        albumSearchText = new javax.swing.JTextField();
        albumSearchType = new javax.swing.JComboBox<>();
        refreshAlbumTable = new javax.swing.JButton();
        functions1 = new javax.swing.JPanel();
        newAlbumButton = new javax.swing.JButton();
        editAlbum = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        addSongToAlbumButton = new javax.swing.JButton();
        tabArtist = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        artistSearchButton = new javax.swing.JButton();
        artistSearchText = new javax.swing.JTextField();
        artistSearchType = new javax.swing.JComboBox<>();
        refreshArtistTable = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableArtist = new javax.swing.JTable();
        functions2 = new javax.swing.JPanel();
        addArtist = new javax.swing.JButton();
        editArtist = new javax.swing.JButton();
        deleteButton2 = new javax.swing.JButton();
        tabAbout = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Song Management");

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
        libraryButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        libraryButton.setForeground(new java.awt.Color(51, 51, 255));
        libraryButton.setText("Library");
        libraryButton.setBorder(null);
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
        albumButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        albumButton.setForeground(new java.awt.Color(51, 51, 255));
        albumButton.setText("Albums");
        albumButton.setBorder(null);
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
        artistButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        artistButton.setForeground(new java.awt.Color(0, 51, 255));
        artistButton.setText("Artist");
        artistButton.setBorder(null);
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

        aboutButton.setBackground(new java.awt.Color(204, 204, 255));
        aboutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aboutButton.setForeground(new java.awt.Color(0, 51, 255));
        aboutButton.setText("About");
        aboutButton.setBorder(null);
        aboutButton.setMaximumSize(new java.awt.Dimension(125, 50));
        aboutButton.setMinimumSize(new java.awt.Dimension(125, 50));
        aboutButton.setPreferredSize(new java.awt.Dimension(125, 50));
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        menuPanel.add(aboutButton, gridBagConstraints);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 255));
        jButton5.setText("MENU");
        jButton5.setBorder(null);
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

        tabSong.setBackground(new java.awt.Color(255, 255, 255));
        tabSong.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tabSong.setMinimumSize(new java.awt.Dimension(822, 416));
        tabSong.setPreferredSize(new java.awt.Dimension(822, 416));
        tabSong.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        songSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        songSearchButton.setForeground(new java.awt.Color(153, 0, 255));
        songSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        songSearchButton.setText("Search");
        songSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songSearchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        jPanel7.add(songSearchButton, gridBagConstraints);

        SongSearchText.setMinimumSize(new java.awt.Dimension(150, 22));
        SongSearchText.setPreferredSize(new java.awt.Dimension(200, 22));
        SongSearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SongSearchTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 5, 0);
        jPanel7.add(SongSearchText, gridBagConstraints);

        songSearchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Song", "Artist", "Genre", "Release Year" }));
        songSearchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songSearchTypeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 6, 0);
        jPanel7.add(songSearchType, gridBagConstraints);

        refreshSongTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refreshSongTable.setText("Refresh");
        refreshSongTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshSongTableActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 90);
        jPanel7.add(refreshSongTable, gridBagConstraints);

        tabSong.add(jPanel7, java.awt.BorderLayout.NORTH);

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
        table1.setRequestFocusEnabled(false);
        table1.getTableHeader().setReorderingAllowed(false);
        table1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                table1FocusGained(evt);
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        tabSong.add(jScrollPane2, java.awt.BorderLayout.CENTER);

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
        gridBagConstraints.gridx = 2;
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
        gridBagConstraints.gridx = 3;
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
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        functions.add(deleteButton, gridBagConstraints);

        playButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/play.png"))); // NOI18N
        playButton.setText("Play");
        playButton.setMaximumSize(new java.awt.Dimension(84, 36));
        playButton.setMinimumSize(new java.awt.Dimension(84, 36));
        playButton.setPreferredSize(new java.awt.Dimension(84, 22));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        functions.add(playButton, gridBagConstraints);

        tabSong.add(functions, java.awt.BorderLayout.SOUTH);

        contentPanel.add(tabSong);

        tabAlbum.setBackground(new java.awt.Color(255, 255, 255));
        tabAlbum.setName(""); // NOI18N
        tabAlbum.setPreferredSize(new java.awt.Dimension(822, 394));
        tabAlbum.setLayout(new java.awt.BorderLayout());

        tableAlbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Album", "Artist", "Genre", "Release Year", "Songs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableAlbum.setName(""); // NOI18N
        tableAlbum.getTableHeader().setReorderingAllowed(false);
        tableAlbum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableAlbumFocusGained(evt);
            }
        });
        tableAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAlbumMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableAlbum);

        tabAlbum.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        albumSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        albumSearchButton.setForeground(new java.awt.Color(153, 0, 255));
        albumSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        albumSearchButton.setText("Search");
        albumSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumSearchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        jPanel8.add(albumSearchButton, gridBagConstraints);

        albumSearchText.setMinimumSize(new java.awt.Dimension(150, 22));
        albumSearchText.setPreferredSize(new java.awt.Dimension(200, 22));
        albumSearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumSearchTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 5, 0);
        jPanel8.add(albumSearchText, gridBagConstraints);

        albumSearchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Album", "Artist", "Genre", "Release Year", " " }));
        albumSearchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumSearchTypeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 6, 0);
        jPanel8.add(albumSearchType, gridBagConstraints);

        refreshAlbumTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refreshAlbumTable.setText("Refresh");
        refreshAlbumTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshAlbumTableActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 90);
        jPanel8.add(refreshAlbumTable, gridBagConstraints);

        tabAlbum.add(jPanel8, java.awt.BorderLayout.NORTH);

        functions1.setMinimumSize(new java.awt.Dimension(100, 100));
        functions1.setPreferredSize(new java.awt.Dimension(100, 40));
        functions1.setLayout(new java.awt.GridBagLayout());

        newAlbumButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        newAlbumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addAlbum.png"))); // NOI18N
        newAlbumButton.setText("Create New Album");
        newAlbumButton.setMaximumSize(new java.awt.Dimension(180, 136));
        newAlbumButton.setMinimumSize(new java.awt.Dimension(80, 36));
        newAlbumButton.setOpaque(true);
        newAlbumButton.setPreferredSize(new java.awt.Dimension(180, 22));
        newAlbumButton.setRequestFocusEnabled(false);
        newAlbumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAlbumButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 7);
        functions1.add(newAlbumButton, gridBagConstraints);

        editAlbum.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        editAlbum.setText("Edit");
        editAlbum.setMaximumSize(new java.awt.Dimension(84, 36));
        editAlbum.setMinimumSize(new java.awt.Dimension(84, 36));
        editAlbum.setPreferredSize(new java.awt.Dimension(84, 22));
        editAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAlbumActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        functions1.add(editAlbum, gridBagConstraints);

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

        addSongToAlbumButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addSongToAlbumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addsong.png"))); // NOI18N
        addSongToAlbumButton.setText("Add Song");
        addSongToAlbumButton.setMaximumSize(new java.awt.Dimension(84, 36));
        addSongToAlbumButton.setMinimumSize(new java.awt.Dimension(84, 36));
        addSongToAlbumButton.setPreferredSize(new java.awt.Dimension(150, 22));
        addSongToAlbumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongToAlbumButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        functions1.add(addSongToAlbumButton, gridBagConstraints);

        tabAlbum.add(functions1, java.awt.BorderLayout.SOUTH);

        contentPanel.add(tabAlbum);

        tabArtist.setBackground(new java.awt.Color(255, 255, 255));
        tabArtist.setMinimumSize(new java.awt.Dimension(822, 416));
        tabArtist.setPreferredSize(new java.awt.Dimension(822, 416));
        tabArtist.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        artistSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        artistSearchButton.setForeground(new java.awt.Color(153, 0, 255));
        artistSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        artistSearchButton.setText("Search");
        artistSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistSearchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        jPanel9.add(artistSearchButton, gridBagConstraints);

        artistSearchText.setMinimumSize(new java.awt.Dimension(150, 22));
        artistSearchText.setPreferredSize(new java.awt.Dimension(200, 22));
        artistSearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistSearchTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 5, 0);
        jPanel9.add(artistSearchText, gridBagConstraints);

        artistSearchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Artist", "Year of Birth", "Gender", "Nationality", "Management Agency", " " }));
        artistSearchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistSearchTypeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 6, 0);
        jPanel9.add(artistSearchType, gridBagConstraints);

        refreshArtistTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refreshArtistTable.setText("Refresh");
        refreshArtistTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshArtistTableActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 90);
        jPanel9.add(refreshArtistTable, gridBagConstraints);

        tabArtist.add(jPanel9, java.awt.BorderLayout.NORTH);

        tableArtist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Artist", "Year of Birth", "Gender", "Nationality", "Management Agency", "Albums"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableArtist.setName(""); // NOI18N
        tableArtist.getTableHeader().setReorderingAllowed(false);
        tableArtist.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableArtistFocusGained(evt);
            }
        });
        tableArtist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableArtistMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableArtist);

        tabArtist.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        functions2.setMinimumSize(new java.awt.Dimension(100, 100));
        functions2.setPreferredSize(new java.awt.Dimension(100, 40));
        functions2.setLayout(new java.awt.GridBagLayout());

        addArtist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addArtist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addSinger.png"))); // NOI18N
        addArtist.setText("New Artist\n");
        addArtist.setMaximumSize(new java.awt.Dimension(180, 136));
        addArtist.setMinimumSize(new java.awt.Dimension(100, 36));
        addArtist.setOpaque(true);
        addArtist.setPreferredSize(new java.awt.Dimension(150, 22));
        addArtist.setRequestFocusEnabled(false);
        addArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArtistActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 7);
        functions2.add(addArtist, gridBagConstraints);

        editArtist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editArtist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/edit.png"))); // NOI18N
        editArtist.setText("Edit");
        editArtist.setMaximumSize(new java.awt.Dimension(84, 36));
        editArtist.setMinimumSize(new java.awt.Dimension(84, 36));
        editArtist.setPreferredSize(new java.awt.Dimension(84, 22));
        editArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editArtistActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        functions2.add(editArtist, gridBagConstraints);

        deleteButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete.png"))); // NOI18N
        deleteButton2.setText("Delete");
        deleteButton2.setMaximumSize(new java.awt.Dimension(98, 36));
        deleteButton2.setMinimumSize(new java.awt.Dimension(98, 36));
        deleteButton2.setPreferredSize(new java.awt.Dimension(98, 22));
        deleteButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        functions2.add(deleteButton2, gridBagConstraints);

        tabArtist.add(functions2, java.awt.BorderLayout.SOUTH);

        contentPanel.add(tabArtist);

        tabAbout.setBackground(new java.awt.Color(255, 255, 255));
        tabAbout.setMinimumSize(new java.awt.Dimension(822, 416));
        tabAbout.setPreferredSize(new java.awt.Dimension(822, 416));
        tabAbout.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("About us");
        jLabel2.setPreferredSize(new java.awt.Dimension(38, 70));
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        tabAbout.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("This is my information...");
        jScrollPane1.setViewportView(jTextArea1);

        tabAbout.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        contentPanel.add(tabAbout);

        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void artistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistButtonActionPerformed
        tabSong.setVisible(false);
        tabAlbum.setVisible(false);
        tabArtist.setVisible(true);
        tabAbout.setVisible(false);
        artistButton.setBackground(new Color(153, 255, 153));
        albumButton.setBackground(new Color(204, 204, 255));
        libraryButton.setBackground(new Color(204, 204, 255));
        aboutButton.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_artistButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void libraryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryButtonActionPerformed
        tabSong.setVisible(true);
        if (list != null) {
            fillTable(list);
        }
        tabAlbum.setVisible(false);
        tabArtist.setVisible(false);
        tabAbout.setVisible(false);
        libraryButton.setBackground(new Color(153, 255, 153));
        artistButton.setBackground(new Color(204, 204, 255));
        albumButton.setBackground(new Color(204, 204, 255));
        aboutButton.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_libraryButtonActionPerformed

    private void songSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songSearchButtonActionPerformed
        ArrayList<Song> searchSong = new ArrayList();
        String type = songSearchType.getSelectedItem().toString();
        String key = SongSearchText.getText();
        switch (type) {
            case "Song" -> {
                for (Song song : list) {
                    if (song.getNameSong().contains(key)) {
                        searchSong.add(song);
                    }
                }
            }
            case "Artist" -> {
                for (Song song : list) {
                    if (song.getArtist().contains(key)) {
                        searchSong.add(song);
                    }
                }
            }
            case "Genre" -> {
                for (Song song : list) {
                    if (song.getGenre().contains(key)) {
                        searchSong.add(song);
                    }
                }
            }
            case "Release Year" -> {
                if (!isNumber(SongSearchText.getText())) {
                    JOptionPane.showMessageDialog(this, "Invalid number: " + SongSearchText.getText(), "Message", 1, exclamationIcon);
                } else {
                    int num = Integer.parseInt(key);
                    for (Song song : list) {
                        if (song.getYear() <= num + 5 && song.getYear() >= num - 5) {
                            searchSong.add(song);
                        }
                    }
                }
            }
        }
        fillTable(searchSong);
        SongSearchText.setText("");
    }//GEN-LAST:event_songSearchButtonActionPerformed

    private void SongSearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SongSearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SongSearchTextActionPerformed

    private void songSearchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songSearchTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songSearchTypeActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        AddNewSong addnewsong = new AddNewSong(list, artists, albums);
        addnewsong.setVisible(true);
        addnewsong.setLocationRelativeTo(this);
        saveFile();
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a song to edit", "Message", 1, exclamationIcon);
        } else {
            EditSongFrame edit = new EditSongFrame(list, table1.getSelectedRow(), artists, albums);
            edit.setLocationRelativeTo(this);
            edit.setVisible(true);
            if (!edit.isVisible()) {
                fillTable(list);
            }
        }
        fillTable(list);
        saveFile();
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (table1.getSelectedRow() != -1) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete the song: " + list.get(table1.getSelectedRow()).getNameSong(), "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, questionIcon);
            if (option == JOptionPane.YES_OPTION) {
                list.remove(table1.getSelectedRow());

            }
        }
        fillTable(list);
        saveFile();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void libraryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_libraryButtonMouseClicked
        tabSong.setVisible(true);
        fillTable(list);
        tabAlbum.setVisible(false);
        tabArtist.setVisible(false);
        tabAbout.setVisible(false);
    }//GEN-LAST:event_libraryButtonMouseClicked

    private void albumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumButtonActionPerformed
        tabSong.setVisible(false);
        tabAlbum.setVisible(true);
        tabArtist.setVisible(false);
        tabAbout.setVisible(false);

        albumButton.setBackground(new Color(153, 255, 153));
        artistButton.setBackground(new Color(204, 204, 255));
        libraryButton.setBackground(new Color(204, 204, 255));
        aboutButton.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_albumButtonActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

    }//GEN-LAST:event_table1MouseClicked

    private void albumSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumSearchButtonActionPerformed
        ArrayList<Album> searchAlbum = new ArrayList();
        String type = albumSearchType.getSelectedItem().toString();
        String key = albumSearchText.getText();
        switch (type) {
            case "Album" -> {
                for (Album alb : albums) {
                    if (alb.getAlbumName().contains(key)) {
                        searchAlbum.add(alb);
                    }
                }
            }
            case "Artist" -> {
                for (Album alb : albums) {
                    if (alb.getArtist().contains(key)) {
                        searchAlbum.add(alb);
                    }
                }
            }
            case "Genre" -> {
                for (Album alb : albums) {
                    if (alb.getGenre().contains(key)) {
                        searchAlbum.add(alb);
                    }
                }
            }
            case "Release Year" -> {
                if (!isNumber(albumSearchText.getText())) {
                    JOptionPane.showMessageDialog(this, "Invalid number: " + albumSearchText.getText(), "Message", 1, exclamationIcon);
                } else {
                    int num = Integer.parseInt(key);
                    for (Album alb : albums) {
                        if (alb.getYearOfRelease() <= num + 5 && alb.getYearOfRelease() >= num - 5) {
                            searchAlbum.add(alb);
                        }
                    }
                }
            }
        }
        fillAlbumTable(searchAlbum);
        albumSearchText.setText("");
    }//GEN-LAST:event_albumSearchButtonActionPerformed

    private void albumSearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumSearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_albumSearchTextActionPerformed

    private void albumSearchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumSearchTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_albumSearchTypeActionPerformed

    private void tableAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAlbumMouseClicked

    }//GEN-LAST:event_tableAlbumMouseClicked

    private void newAlbumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAlbumButtonActionPerformed
        AddNewAlbum addnewalbum = new AddNewAlbum(list, artists, albums);
        addnewalbum.setVisible(true);
        addnewalbum.setLocationRelativeTo(this);
        fillAlbumTable(albums);
        saveAlbumFile();
    }//GEN-LAST:event_newAlbumButtonActionPerformed

    private void editAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAlbumActionPerformed
        if (tableAlbum.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select an artist to edit", "Message", 1, exclamationIcon);
        } else {
            EditAlbumFrame edit = new EditAlbumFrame(list, tableAlbum.getSelectedRow(), artists, albums);
            edit.setLocationRelativeTo(this);
            edit.setVisible(true);
            fillAlbumTable(albums);
            saveAlbumFile();
        }
    }//GEN-LAST:event_editAlbumActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        if (tableAlbum.getSelectedRow() != -1) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete the album: " + albums.get(tableAlbum.getSelectedRow()).getAlbumName(), "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, questionIcon);
            if (option == JOptionPane.YES_OPTION) {
                albums.remove(tableAlbum.getSelectedRow());
            }
        }
        fillAlbumTable(albums);
        saveAlbumFile();
    }//GEN-LAST:event_deleteButton1ActionPerformed

    private void artistSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistSearchButtonActionPerformed
        ArrayList<Artist> searchArtist = new ArrayList();
        String type = artistSearchType.getSelectedItem().toString();
        String key = artistSearchText.getText();
        switch (type) {

            case "Artist" -> {
                for (Artist art : artists) {
                    if (art.getName().contains(key)) {
                        searchArtist.add(art);
                    }
                }
            }
            case "Gender" -> {
                for (Artist art : artists) {
                    if (art.getGender().contains(key)) {
                        searchArtist.add(art);
                    }
                }
            }
            case "Nationality" -> {
                for (Artist art : artists) {
                    if (art.getNationality().contains(key)) {
                        searchArtist.add(art);
                    }
                }
            }
            case "Management Agency" -> {
                for (Artist art : artists) {
                    if (art.getAgency().contains(key)) {
                        searchArtist.add(art);
                    }
                }
            }
            case "Year of Birth" -> {
                if (!isNumber(albumSearchText.getText())) {
                    JOptionPane.showMessageDialog(this, "Invalid number: " + albumSearchText.getText(), "Message", 1, exclamationIcon);
                } else {
                    int num = Integer.parseInt(key);
                    for (Artist art : artists) {
                        if (art.getYearOfBirth() <= num + 5 && art.getYearOfBirth() >= num - 5) {
                            searchArtist.add(art);
                        }
                    }
                }
            }
        }
        fillArtistTable(searchArtist);
        artistSearchText.setText("");
    }//GEN-LAST:event_artistSearchButtonActionPerformed

    private void artistSearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistSearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artistSearchTextActionPerformed

    private void artistSearchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistSearchTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artistSearchTypeActionPerformed

    private void tableArtistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableArtistMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableArtistMouseClicked

    private void addArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArtistActionPerformed
        AddNewArtist addnewartist = new AddNewArtist(list, artists, albums);
        addnewartist.setVisible(true);
        addnewartist.setLocationRelativeTo(this);
        fillArtistTable(artists);
        saveArtistFile(artists);

    }//GEN-LAST:event_addArtistActionPerformed

    private void editArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editArtistActionPerformed
        if (tableArtist.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select an artist to edit", "Message", 1, exclamationIcon);
        } else {
            EditArtistFrame edit = new EditArtistFrame(list, tableArtist.getSelectedRow(), artists, albums);
            edit.setLocationRelativeTo(this);
            edit.setVisible(true);
            fillArtistTable(artists);
            saveArtistFile(artists);

        }
    }//GEN-LAST:event_editArtistActionPerformed

    private void deleteButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton2ActionPerformed
        if (tableArtist.getSelectedRow() != -1) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete the artist: " + artists.get(tableArtist.getSelectedRow()).getName(), "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, questionIcon);
            if (option == JOptionPane.YES_OPTION) {
                artists.remove(tableArtist.getSelectedRow());
            }
        }
        fillArtistTable(artists);
        saveArtistFile(artists);
    }//GEN-LAST:event_deleteButton2ActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a song to play", "Message", 1, exclamationIcon);
        } else {
            Song song = list.get(table1.getSelectedRow());
            musicPlayerForm player = new musicPlayerForm(song);
            player.setVisible(true);
            player.setLocationRelativeTo(this);

        }

    }//GEN-LAST:event_playButtonActionPerformed

    private void addSongToAlbumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongToAlbumButtonActionPerformed
        if (tableAlbum.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select an album to add songs", "Message", 1, exclamationIcon);
        } else {
            AddSongToAlbum addSongtoAlbum = new AddSongToAlbum(list, tableAlbum.getSelectedRow(), artists, albums);
            addSongtoAlbum.setLocationRelativeTo(this);
            addSongtoAlbum.setVisible(true);
            saveAlbumFile();
        }
    }//GEN-LAST:event_addSongToAlbumButtonActionPerformed

    private void table1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_table1FocusGained
        
    }//GEN-LAST:event_table1FocusGained

    private void tableAlbumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableAlbumFocusGained
       
    }//GEN-LAST:event_tableAlbumFocusGained

    private void tableArtistFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableArtistFocusGained
      
    }//GEN-LAST:event_tableArtistFocusGained

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        tabSong.setVisible(false);
        tabAlbum.setVisible(false);
        tabArtist.setVisible(false);
        tabAbout.setVisible(true);
        aboutButton.setBackground(new Color(153, 255, 153));

        artistButton.setBackground(new Color(204, 204, 255));
        libraryButton.setBackground(new Color(204, 204, 255));
        albumButton.setBackground(new Color(204, 204, 255));
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void refreshSongTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshSongTableActionPerformed
        fillTable(list);
    }//GEN-LAST:event_refreshSongTableActionPerformed

    private void refreshAlbumTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshAlbumTableActionPerformed
        fillAlbumTable(albums);
    }//GEN-LAST:event_refreshAlbumTableActionPerformed

    private void refreshArtistTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshArtistTableActionPerformed
          fillArtistTable(artists);
    }//GEN-LAST:event_refreshArtistTableActionPerformed
    private void addRowSorter(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
    }

    private void fillTable(ArrayList<Song> list) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        int rowCount = table1.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Song song : list) {
            Object[] row = new Object[]{song.getNameSong(), song.getArtist(), song.getGenre(), song.getAlbum(), song.getYear()};
            model.addRow(row);
        }
    }

    private void fillArtistTable(ArrayList<Artist> artists) {
        DefaultTableModel model = (DefaultTableModel) tableArtist.getModel();
        int rowCount = tableArtist.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Artist artist : artists) {
            Object[] row = new Object[]{artist.getName(), artist.getYearOfBirth(), artist.getGender(), artist.getNationality(), artist.getAgency(), artist.getAlbumsSize()};
            model.addRow(row);
        }
    }

    private void fillAlbumTable(ArrayList<Album> albums) {
        DefaultTableModel model = (DefaultTableModel) tableAlbum.getModel();
        int rowCount = tableAlbum.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Album album : albums) {
            Object[] row = new Object[]{album.getAlbumName(), album.getArtist(), album.getGenre(), album.getYearOfRelease(), album.getSongsSize()};
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

    private void loadArtistFile() {
        String fileName = "ArtistList.data";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            this.artists = (ArrayList<Artist>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error load file: " + ex.getMessage(), "Message", 1, crossIcon);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error load file: " + ex.getMessage(), "Message", 1, crossIcon);
        }
    }

    private void loadAlbumFile() {
        String fileName = "AlbumList.data";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            this.albums = (ArrayList<Album>) ois.readObject();
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

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, crossIcon);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, crossIcon);
        }
    }

    private void saveArtistFile(ArrayList<Artist> artList) {
        String fileName = "ArtistList.data";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(artList);
            oos.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, new ImageIcon(getClass().getResource("/Icons/cross mark.png")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, new ImageIcon(getClass().getResource("/Icons/cross mark.png")));
        }
    }

    private void saveAlbumFile() {
        String fileName = "AlbumList.data";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(albums);
            oos.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, new ImageIcon(getClass().getResource("/Icons/cross mark.png")));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error save file: " + ex.getMessage(), "Message", 1, new ImageIcon(getClass().getResource("/Icons/cross mark.png")));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SongSearchText;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton addArtist;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addSongToAlbumButton;
    private javax.swing.JButton albumButton;
    private javax.swing.JButton albumSearchButton;
    private javax.swing.JTextField albumSearchText;
    private javax.swing.JComboBox<String> albumSearchType;
    private javax.swing.JButton artistButton;
    private javax.swing.JButton artistSearchButton;
    private javax.swing.JTextField artistSearchText;
    private javax.swing.JComboBox<String> artistSearchType;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton deleteButton2;
    private javax.swing.JButton editAlbum;
    private javax.swing.JButton editArtist;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel functions;
    private javax.swing.JPanel functions1;
    private javax.swing.JPanel functions2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton libraryButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton newAlbumButton;
    private javax.swing.JButton playButton;
    private javax.swing.JButton refreshAlbumTable;
    private javax.swing.JButton refreshArtistTable;
    private javax.swing.JButton refreshSongTable;
    private javax.swing.JButton songSearchButton;
    private javax.swing.JComboBox<String> songSearchType;
    private javax.swing.JPanel tabAbout;
    private javax.swing.JPanel tabAlbum;
    private javax.swing.JPanel tabArtist;
    private javax.swing.JPanel tabSong;
    private javax.swing.JTable table1;
    private javax.swing.JTable tableAlbum;
    private javax.swing.JTable tableArtist;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
