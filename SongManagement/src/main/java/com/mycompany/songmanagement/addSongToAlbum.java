/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.songmanagement;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author LAPTOPVTC.VN
 */
public class AddSongToAlbum extends javax.swing.JFrame {
    
    private ArrayList<Artist> artists;
    private ArrayList<Album> albums;
    private ArrayList<Song> list;
    private Album album;
    
    public AddSongToAlbum(ArrayList<Song> list, int index, ArrayList<Artist> artists, ArrayList<Album> albums) {
        this.list = list;
        this.artists = artists;
        this.albums = albums;
        album = albums.get(index);
        initComponents();
        ImageIcon frameIcon= new ImageIcon(getClass().getResource("/Icons/frameIcon.png"));
        setIconImage(frameIcon.getImage());
        fillTable(list);
        addRowSorter(tableSong);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tabSong = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        SearchButton1 = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        SearchType = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSong = new javax.swing.JTable();
        functions = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Song To Album");

        tabSong.setBackground(new java.awt.Color(255, 255, 255));
        tabSong.setMinimumSize(new java.awt.Dimension(822, 416));
        tabSong.setPreferredSize(new java.awt.Dimension(822, 416));
        tabSong.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        SearchButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SearchButton1.setForeground(java.awt.Color.lightGray);
        SearchButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        SearchButton1.setText("Search");
        SearchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 5, 0);
        jPanel7.add(SearchButton1, gridBagConstraints);

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

        tabSong.add(jPanel7, java.awt.BorderLayout.NORTH);

        tableSong.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSong.setName(""); // NOI18N
        tableSong.setRequestFocusEnabled(false);
        tableSong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableSongFocusGained(evt);
            }
        });
        tableSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSong);

        tabSong.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        functions.setMinimumSize(new java.awt.Dimension(100, 100));
        functions.setPreferredSize(new java.awt.Dimension(100, 40));
        functions.setLayout(new java.awt.GridBagLayout());

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        addButton.setText("Add song to the album");
        addButton.setMaximumSize(new java.awt.Dimension(180, 136));
        addButton.setMinimumSize(new java.awt.Dimension(80, 36));
        addButton.setOpaque(true);
        addButton.setPreferredSize(new java.awt.Dimension(200, 22));
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

        tabSong.add(functions, java.awt.BorderLayout.SOUTH);

        getContentPane().add(tabSong, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton1ActionPerformed
        //  search();
    }//GEN-LAST:event_SearchButton1ActionPerformed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void SearchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTypeActionPerformed

    private void tableSongFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableSongFocusGained
        fillTable(list);
    }//GEN-LAST:event_tableSongFocusGained

    private void tableSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSongMouseClicked

    }//GEN-LAST:event_tableSongMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        ImageIcon aceptIcon = new ImageIcon(getClass().getResource("/Icons/accept mark.png"));
        ImageIcon exclamationIcon = new ImageIcon(getClass().getResource("/Icons/exclamation mark.png"));
        if (tableSong.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a song to add to the Album", "Message", 1, exclamationIcon);
        } else {
            JOptionPane.showMessageDialog(this, "Success!", "Message", 1, aceptIcon);
            album.getSongList().add(list.get(tableSong.getSelectedRow()).getNameSong());
            DefaultTableModel model = (DefaultTableModel) tableSong.getModel();
            model.removeRow(tableSong.getSelectedRow());
            saveAlbumFile();
        }
    }//GEN-LAST:event_addButtonActionPerformed
    
    private void fillTable(ArrayList<Song> list) {
        DefaultTableModel model = (DefaultTableModel) tableSong.getModel();
        int rowCount = tableSong.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Song song : list) {
            Object[] row = new Object[]{song.getNameSong(), song.getArtist(), song.getGenre(), song.getAlbum(), song.getYear()};
            model.addRow(row);
        }
    }
    
    private void addRowSorter(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton1;
    private javax.swing.JComboBox<String> SearchType;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel functions;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchText;
    private javax.swing.JPanel tabSong;
    private javax.swing.JTable tableSong;
    // End of variables declaration//GEN-END:variables
}
