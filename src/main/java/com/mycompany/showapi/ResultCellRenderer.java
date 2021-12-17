/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.showapi;

import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ryankent
 */
public class ResultCellRenderer extends JLabel implements ListCellRenderer<ShowResults> {
    @Override
    public Component getListCellRendererComponent(
        JList<? extends ShowResults> list,
        ShowResults result,
        int index,
        boolean isSelected,
        boolean cellHasFocus)
        
        {
            try {
                BufferedImage img = ImageIO.read(new URL(result.getImage_thumbnail_path()));
                Image resultImage = img.getScaledInstance(img.getWidth() / 2, img.getHeight() / 2, Image.SCALE_SMOOTH);
                //Image resultImage = img.getScaledInstance(100, 75, Image.SCALE_SMOOTH);     //This is an option for making every image have the same size
                
                setIcon(new ImageIcon(resultImage));
            }
            catch(Exception e) {}
            setText(result.getName());
        if (isSelected)
        {
            setBackground(ShowResults.selectionColor);
        
        }
        else
        {
            setBackground(ShowResults.nonSelectionColor);
       
        }
            setOpaque(true);
            return this;

        }
}
