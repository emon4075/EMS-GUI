package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class My_Labels {
    public JLabel logoLabelFun() {
        ImageIcon logoIcon = new ImageIcon("E://Swing Project//assets//Main_Logo_Resized.png");
        JLabel logoLabel = new JLabel();
        logoLabel.setText("Employee Manager");
        logoLabel.setIcon(logoIcon);
        logoLabel.setVerticalTextPosition(JLabel.BOTTOM);
        logoLabel.setHorizontalTextPosition(JLabel.CENTER);
        logoLabel.setIconTextGap(-50);
        logoLabel.setVerticalAlignment(JLabel.TOP);
        logoLabel.setHorizontalAlignment(JLabel.CENTER);
        logoLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
        logoLabel.setForeground(Color.WHITE);
        return logoLabel;
    }

    public JLabel navigationLabelFun() {
        JLabel navigationLabel = new JLabel();
        navigationLabel.setLayout(new GridLayout(4, 1, 10, 10));
        return navigationLabel;
    }
}
