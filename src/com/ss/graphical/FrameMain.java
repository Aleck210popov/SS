package com.ss.graphical;

import com.ss.one.Triangle;
import com.ss.two.Arthropod;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMain extends JFrame{
    private final JPanel panelMaster;

    {
        panelMaster = new JPanel();
        this.add(panelMaster);
        this.setSize(600, 400);
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
        JButton buttonTriangle = new JButton("Штат сотрудников");
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

    FrameMain(Arthropod arthropod) {
        super("Главное меню");
        JButton buttonArthropod = new JButton("Тригонаметрически числа");
        panelMaster.add(buttonArthropod);
        buttonArthropod.setBounds(100, 80, this.getWidth() - 200, this.getHeight() - 200);
        FrameArthropod frameArthropod = FrameArthropod.getSingleton(arthropod);
        frameArthropod.setVisible(false);
        buttonArthropod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameArthropod.setVisible(true);
            }
        });
    }
    FrameMain(Triangle triangle, Arthropod arthropod){
        super("Главное меню");
        JButton buttonTriangle = new JButton("Штат сотрудников");
        JButton buttonArthropod = new JButton("Тригонаметрически числа");
        panelMaster.add(buttonTriangle);
        buttonTriangle.setBounds(100 , 50, this.getWidth()-200, 115);
        panelMaster.add(buttonArthropod);
        buttonArthropod.setBounds(100, 215, this.getWidth()-200, 115);
        FrameTriangle frameTriangle = FrameTriangle.getSingleton(triangle);
        frameTriangle.setVisible(false);
        FrameArthropod frameArthropod = FrameArthropod.getSingleton(arthropod);
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
}
