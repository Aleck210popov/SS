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

    private FrameRegionArthropods(RegionArthropods regionArthropods) {
        super("Членестоногие");
        this.regionArthropods = regionArthropods;
        this.setSize(700, 500);
        panelMain = new PanelMain();
        this.add(panelMain);
        panelMain.setVisible(true);
        panelMain.setBounds(0, 0, this.getWidth(), this.getHeight());

    }

    public static FrameRegionArthropods getSingleton(RegionArthropods regionArthropods) {
        if (singleton == null) {
            singleton = new FrameRegionArthropods(regionArthropods);
        }
        return singleton;
    }

    private class PanelMain extends JPanel {
        private final JScrollPane scrollPane;
        private final JTextArea textArea;
        private final JComboBox<String> comboBox;
        private final PanelSouth panelSouth;


        {
            textArea = new JTextArea(String.valueOf(regionArthropods.getArthropods()[0]));
            scrollPane = new JScrollPane(textArea);
            comboBox = new JComboBox<>(regionArthropods.getNameArthropod());
            panelSouth = new PanelSouth();
        }

        private PanelMain() {
            this.setLayout(new BorderLayout());
            this.add(comboBox, BorderLayout.NORTH);
            this.add(scrollPane, BorderLayout.CENTER);
            panelSouth.setSize(200, this.getHeight());
            this.add(panelSouth, BorderLayout.SOUTH);

            textArea.setFont(new Font("Dialog", Font.PLAIN, 30));

            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JComboBox box = (JComboBox) e.getSource();
                    String item = (String) box.getSelectedItem();
                    try {
                        if (item == null) {
                            throw new RuntimeException("Не выбрано значение");
                        }
                        String[] arrStrArthropod = regionArthropods.getNameArthropod();
                        Arthropod[] arrArthropod = regionArthropods.getArthropods();
                        if (arrArthropod.length != arrStrArthropod.length) {
                            throw new RuntimeException("Ошибка");
                        }
                        for (int i = 0; i < arrStrArthropod.length; i++) {
                            if (item.equals(arrStrArthropod[i])) {
                                textArea.setText(arrArthropod[i].toString());
                            }
                        }
                    } catch (RuntimeException ex) {
                        JOptionPane.showMessageDialog(null,
                                "Не выбрано значение", "Ошибка", JOptionPane.YES_OPTION);
                    }
                }
            });

        }
        private class PanelSouth extends  JPanel{
            private final JButton buttonCalcLegs;
            private final JButton buttonNumberEmployees;
            private final JLabel labelCalcLegs;
            private final JLabel labelNumberEmployees;
            {
                buttonCalcLegs = new JButton("Посчитать количество ног");
                buttonNumberEmployees = new JButton("Показать различные виды");
                labelCalcLegs = new JLabel();
                labelNumberEmployees = new JLabel();
            }

            private PanelSouth() {
                this.setLayout(new GridLayout(2, 2));
                this.add(buttonCalcLegs);
                this.add(buttonNumberEmployees);
                this.add(labelCalcLegs);
                this.add(labelNumberEmployees);
                buttonCalcLegs.setFont(new Font("Dialog", Font.PLAIN, 20));
                buttonNumberEmployees.setFont(new Font("Dialog", Font.PLAIN, 20));
                labelCalcLegs.setFont(new Font("Dialog", Font.PLAIN, 20));
                labelNumberEmployees.setFont(new Font("Dialog", Font.PLAIN, 13));
                buttonCalcLegs.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        labelCalcLegs.setText("Количество ног: " + regionArthropods.calcLegs());
                    }
                });
                buttonNumberEmployees.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        labelNumberEmployees.setText(String.valueOf(regionArthropods.numberEmployees()));
                    }
                });
            }
        }
    }
}
