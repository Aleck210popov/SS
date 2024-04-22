package com.ss.graphical;

import com.ss.one.Triangle;

import javax.swing.*;

public class FrameTriangle extends JFrame {
    private final JPanel panelMain;
    JPanel panelAdd;
    JPanel panelDelete;
    JPanel panelList;
    private final Triangle triangle;
    private static FrameTriangle singleton;

    private FrameTriangle(Triangle triangle){
        // Инициализация элиментов и начальные настройки
        super("Штат сотрудников");
        this.setSize(1000, 700);
        this.triangle=triangle;
        panelMain = new JPanel();
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
}
