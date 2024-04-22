package com.ss.graphical;

import com.ss.one.Triangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTriangle extends JFrame {
    private final PanelMain panelMain;
    private final Triangle triangle;
    private static FrameTriangle singleton;

    private FrameTriangle(Triangle triangle){
        // Инициализация элиментов и начальные настройки
        super("Штат сотрудников");
        this.setSize(800, 400);
        this.triangle=triangle;
        panelMain = new PanelMain();
        this.add(panelMain);
    }
    public static FrameTriangle getSingleton(Triangle triangle)
    {
        if (singleton == null)
        {
            singleton = new FrameTriangle(triangle);
        }
        return singleton;
    }
    private class PanelMain extends JPanel {
        private final JLabel labelTriangle;
        private final JButton buttonTriangle;
        private final JLabel labelDataTriangle;
        {
            labelTriangle = new JLabel("Треугольник");
            buttonTriangle = new JButton("Показать данные");
            labelDataTriangle = new JLabel();
        }
        public PanelMain() {
            this.setLayout(new GridLayout(3 ,1));
            this.add(labelTriangle);
            this.add(buttonTriangle);
            this.add(labelDataTriangle);
            labelTriangle.setFont(new Font("Dialog", Font.PLAIN, 14));
            labelTriangle.setHorizontalAlignment(JLabel.CENTER);
            labelTriangle.setVerticalAlignment(JLabel.CENTER);
            buttonTriangle.setHorizontalAlignment(JLabel.CENTER);
            labelDataTriangle.setFont(new Font("Dialog", Font.PLAIN, 14));
            labelDataTriangle.setHorizontalAlignment(JLabel.CENTER);
            labelDataTriangle.setVerticalAlignment(JLabel.CENTER);

            buttonTriangle.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    labelDataTriangle.setText(triangle.getDataTriangle(triangle));
                }
            });
        }
    }
}
