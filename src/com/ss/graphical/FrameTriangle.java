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
        private boolean isButtonClick;
        {
            labelTriangle = new JLabel("Треугольник");
            buttonTriangle = new JButton("Показать данные");
            labelDataTriangle = new JLabel();
            isButtonClick = false;
        }
        public PanelMain() {
            this.setLayout(new GridLayout(3 ,1));
            this.add(labelTriangle);
            this.add(buttonTriangle);
            this.add(labelDataTriangle);
            labelTriangle.setFont(new Font("Dialog", Font.PLAIN, 28));
            labelTriangle.setHorizontalAlignment(JLabel.CENTER);
            labelTriangle.setVerticalAlignment(JLabel.CENTER);
            buttonTriangle.setHorizontalAlignment(JLabel.CENTER);
            labelDataTriangle.setFont(new Font("Dialog", Font.PLAIN, 14));
            labelDataTriangle.setHorizontalAlignment(JLabel.CENTER);
            labelDataTriangle.setVerticalAlignment(JLabel.CENTER);

            buttonTriangle.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (isButtonClick) {
                        labelDataTriangle.setText("");
                        buttonTriangle.setText("Показать данные");
                        isButtonClick = false;
                    } else {
                        String text = String.format("Периметр: %.2f, площадь: %.2f," +
                                        " равносторонний: %s, равнобедренный: %s, прямоугольный: %s",
                                triangle.perimeter(),
                                triangle.surface(),
                                triangle.isEquilateral() ? "Да" : "Нет",
                                triangle.isIsosceles() ? "Да" : "Нет",
                                triangle.isRectangular() ? "Да" : "Нет");
                        labelDataTriangle.setText(text);
                        buttonTriangle.setText("Скрыть данные");
                        isButtonClick = true;
                    }
                }
            });
        }
    }
}
