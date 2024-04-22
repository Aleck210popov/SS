package com.ss.graphical;

import com.ss.two.Arthropod;

import javax.swing.*;

public class FrameArthropod extends JFrame {
    private final JPanel panelComplex;
    private final JPanel panelTrigComplex;
    private static FrameArthropod singleton;
    private final Arthropod arthropod;
    {
        panelComplex = new JPanel();
        panelTrigComplex = new JPanel();
    }
    private FrameArthropod(Arthropod arthropod){
        super("Комплексные числа");
        this.setSize(700, 500);
        this.add(panelComplex);
        panelComplex.setVisible(true);
        panelComplex.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.add(panelTrigComplex);

        this.arthropod=arthropod;


        panelTrigComplex.setVisible(false);
        panelTrigComplex.setBounds(0, 0, panelComplex.getWidth(), panelComplex.getHeight());
    }
    public static FrameArthropod getSingleton(Arthropod arthropod)
    {
        if (singleton == null)
        {
            singleton = new FrameArthropod(arthropod);
        }
        return singleton;
    }
}
