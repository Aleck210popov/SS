package com.ss.graphical;


import com.ss.two.RegionArthropods;

import javax.swing.*;

public class FrameRegionArthropods extends JFrame {
    private final JPanel panelComplex;
    private final JPanel panelTrigComplex;
    private static FrameRegionArthropods singleton;
    private final RegionArthropods regionArthropods;
    {
        panelComplex = new JPanel();
        panelTrigComplex = new JPanel();
    }
    private FrameRegionArthropods(RegionArthropods regionArthropods){
        super("Комплексные числа");
        this.setSize(700, 500);
        this.add(panelComplex);
        panelComplex.setVisible(true);
        panelComplex.setBounds(0, 0, this.getWidth(), this.getHeight());
        this.add(panelTrigComplex);

        this.regionArthropods=regionArthropods;


        panelTrigComplex.setVisible(false);
        panelTrigComplex.setBounds(0, 0, panelComplex.getWidth(), panelComplex.getHeight());
    }
    public static FrameRegionArthropods getSingleton(RegionArthropods regionArthropods)
    {
        if (singleton == null)
        {
            singleton = new FrameRegionArthropods(regionArthropods);
        }
        return singleton;
    }
}
