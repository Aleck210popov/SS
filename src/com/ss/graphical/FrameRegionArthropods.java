package com.ss.graphical;


import com.ss.two.Arthropod;
import com.ss.two.RegionArthropods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameRegionArthropods extends JFrame {
    private final PanelMain panelMain;
    private static FrameRegionArthropods singleton;
    private final RegionArthropods regionArthropods;
    private FrameRegionArthropods(RegionArthropods regionArthropods){
        super("Комплексные числа");
        this.regionArthropods=regionArthropods;
        this.setSize(700, 500);
        panelMain = new PanelMain();
        this.add(panelMain);
        panelMain.setVisible(true);
        panelMain.setBounds(0, 0, this.getWidth(), this.getHeight());

    }
    public static FrameRegionArthropods getSingleton(RegionArthropods regionArthropods)
    {
        if (singleton == null)
        {
            singleton = new FrameRegionArthropods(regionArthropods);
        }
        return singleton;
    }
    private class PanelMain extends JPanel {
        private final JScrollPane scrollPane;
        private final JTextArea textArea;
        private final JComboBox<String> comboBox;
        private final JButton buttonCalcLegs;
        private final JButton buttonNumberEmployees;
        {
            textArea = new JTextArea(String.valueOf(regionArthropods.getArthropods()[0]));
            scrollPane = new JScrollPane(textArea);
            comboBox = new JComboBox<>(regionArthropods.getNameArthropod());
            buttonCalcLegs = new JButton();
            buttonNumberEmployees = new JButton();
        }
        private PanelMain() {
            this.setLayout(new GridLayout(4, 1));
            this.add(comboBox);
            this.add(scrollPane);
            this.add(buttonCalcLegs);
            this.add(buttonNumberEmployees);
            textArea.setFont(new Font("Dialog", Font.PLAIN, 30));
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JComboBox box = (JComboBox)e.getSource();
                    String item = (String)box.getSelectedItem();
                    try {
                        if (item==null) {
                            throw new RuntimeException("Не выбрано значение");
                        }
                        String[] arrStrArthropod = regionArthropods.getNameArthropod();
                        Arthropod[] arrArthropod = regionArthropods.getArthropods();
                        if (arrArthropod.length!=arrStrArthropod.length){
                            throw new RuntimeException("Ошибка");
                        }
                        for (int i = 0; i<arrStrArthropod.length; i++){
                            if(item.equals(arrStrArthropod[i])){
                                textArea.setText(arrArthropod[i].toString());
                            }
                        }
                    } catch (RuntimeException ex){
                        JOptionPane.showMessageDialog(null, "Не выбрано значение", "Ошибка", JOptionPane.YES_OPTION);
                    }
                }
            });
        }
    }
}
