package com.hohltier.decompiler.views;

import com.formdev.flatlaf.FlatClientProperties;
import com.hohltier.decompiler.controllers.WindowController;
import com.hohltier.decompiler.services.ResourceService;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.*;
import java.time.Year;

public class AboutView extends JDialog {

    public AboutView() {
        super((JFrame) WindowController.getINSTANCE().getComponent());
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_SHOW_ICON, false);
        setTitle(ResourceService.getTranslation("about"));
        setModal(true);
        setResizable(false);

        JPanel root = new JPanel(new MigLayout());
        setContentPane(root);

        JLabel logo = new JLabel(new ImageIcon(ResourceService.getLogo().getScaledInstance(64, 64, Image.SCALE_SMOOTH)));
        root.add(logo, "wrap");

        root.add(new JLabel("Decompiler"), "wrap");

        root.add(new JLabel("Version TODO"), "wrap");

        root.add(new JLabel(String.format("\u00a9 2022 - %s Sota", Year.now().getValue())), "wrap");

        pack();
        setLocationRelativeTo(getOwner());
    }

}