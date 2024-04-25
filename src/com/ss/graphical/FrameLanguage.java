package com.ss.graphical;

import com.ss.foor.Dictionary;
import com.ss.foor.Language;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class FrameLanguage extends JFrame {
    private final PanelMain panelMain;
    private static FrameLanguage singleton;

    {
        panelMain = new PanelMain();
    }

    private FrameLanguage() {
        // Инициализация элиментов и начальные настройки
        super("Штат сотрудников");
        this.setSize(800, 400);
        this.add(panelMain);
    }

    public static FrameLanguage getSingleton() {
        if (singleton == null) {
            singleton = new FrameLanguage();
        }
        return singleton;
    }

    private static class PanelMain extends JPanel {
        private final JTextField textAreaInputText;
        private final JButton buttonTranslation;
        private final JLabel labelOutputText;
        private final JComboBox<Language> comboBoxWith;
        private final JComboBox<Language> comboBoxTo;

        {
            textAreaInputText = new JTextField();
            buttonTranslation = new JButton("Перевести");
            labelOutputText = new JLabel();
            comboBoxTo = new JComboBox<>(Language.getLanguage());
            comboBoxWith = new JComboBox<>(Language.getLanguage());
        }

        public PanelMain() {
            this.setLayout(new GridLayout(5, 1));
            this.add(textAreaInputText);
            this.add(comboBoxWith);
            this.add(buttonTranslation);
            this.add(comboBoxTo);
            this.add(labelOutputText);
            textAreaInputText.setFont(new Font("Dialog", Font.PLAIN, 28));
            textAreaInputText.setHorizontalAlignment(JTextField.CENTER);
            labelOutputText.setFont(new Font("Dialog", Font.PLAIN, 28));
            labelOutputText.setHorizontalAlignment(JLabel.CENTER);
            labelOutputText.setVerticalAlignment(JLabel.CENTER);


            buttonTranslation.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    labelOutputText.setText(Dictionary.translation(textAreaInputText.getText(),
                            (Language) Objects.requireNonNull(comboBoxWith.getSelectedItem()),
                            (Language) Objects.requireNonNull(comboBoxTo.getSelectedItem())));
                }
            });
        }
    }
}
