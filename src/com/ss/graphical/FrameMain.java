package com.ss.graphical;

import com.ss.one.Triangle;
import com.ss.two.Arthropod;
import com.ss.two.RegionArthropods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMain extends JFrame{
    private final JPanel panelMaster;

    {
        panelMaster = new JPanel();
        this.add(panelMaster);
        this.setSize(600, 700);
        panelMaster.setBorder(BorderFactory.createLineBorder(Color.black));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelMaster.setLayout(null);
    }
    FrameMain(){
        super("Главное меню");
        JLabel jLabel = new JLabel("Не переданы значения");
        panelMaster.add(jLabel);
        jLabel.setBounds(0 , 0, this.getWidth(), this.getHeight());
        jLabel.setFont(new Font("Dialog", Font.PLAIN, 35));
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.CENTER);
    }
    FrameMain(Triangle triangle){
        super("Главное меню");
        JButton buttonTriangle = new JButton("Треугольник");
        panelMaster.add(buttonTriangle);
        buttonTriangle.setBounds(100 , 80, this.getWidth()-200, this.getHeight()-200);
        FrameTriangle frameTriangle = FrameTriangle.getSingleton(triangle);
        frameTriangle.setVisible(false);

        buttonTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameTriangle.setVisible(true);
            }
        });
    }

    FrameMain(RegionArthropods regionArthropods) {
        super("Главное меню");
        JButton buttonArthropod = new JButton("Регион членистоногих");
        panelMaster.add(buttonArthropod);
        buttonArthropod.setBounds(100, 80, this.getWidth() - 200, this.getHeight() - 200);
        FrameRegionArthropods frameArthropod = FrameRegionArthropods.getSingleton(regionArthropods);
        frameArthropod.setVisible(false);
        buttonArthropod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameArthropod.setVisible(true);
            }
        });
    }
    FrameMain(Triangle triangle, RegionArthropods regionArthropods){
        super("Главное меню");
        JButton buttonTriangle = new JButton("Треугольник");
        JButton buttonArthropod = new JButton("Регион членистоногих");
        panelMaster.add(buttonTriangle);
        buttonTriangle.setBounds(100 , 50, this.getWidth()-200, 115);
        panelMaster.add(buttonArthropod);
        buttonArthropod.setBounds(100, 215, this.getWidth()-200, 115);
        FrameTriangle frameTriangle = FrameTriangle.getSingleton(triangle);
        frameTriangle.setVisible(false);
        FrameRegionArthropods frameArthropod = FrameRegionArthropods.getSingleton(regionArthropods);
        frameArthropod.setVisible(false);

        buttonTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameTriangle.setVisible(true);
            }
        });

        buttonArthropod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameArthropod.setVisible(true);
            }
        });
    }
    FrameMain(Triangle triangle, RegionArthropods regionArthropods, boolean isLanguage) {
        super("Главное меню");
        JButton buttonTriangle = new JButton("Треугольник");
        JButton buttonArthropod = new JButton("Регион членистоногих");
        JButton buttonLanguage = new JButton("Словарь");
        panelMaster.add(buttonTriangle);
        buttonTriangle.setBounds(100 , 50, this.getWidth()-200, 115);
        panelMaster.add(buttonArthropod);
        buttonArthropod.setBounds(100, 215, this.getWidth()-200, 115);
        panelMaster.add(buttonLanguage);
        buttonLanguage.setBounds(100, 415, this.getWidth()-200, 115);
        FrameTriangle frameTriangle = FrameTriangle.getSingleton(triangle);
        frameTriangle.setVisible(false);
        FrameRegionArthropods frameArthropod = FrameRegionArthropods.getSingleton(regionArthropods);
        frameArthropod.setVisible(false);
        FrameLanguage frameLanguage = FrameLanguage.getSingleton();
        frameLanguage.setVisible(false);

        buttonTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameTriangle.setVisible(true);
            }
        });

        buttonArthropod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameArthropod.setVisible(true);
            }
        });
        buttonLanguage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameLanguage.setVisible(true);
            }
        });
    }
}
