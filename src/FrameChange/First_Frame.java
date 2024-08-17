package FrameChange;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class First_Frame extends JFrame implements ActionListener {
    JPanel firstPanel, secondPanel;
    JButton button;

    First_Frame() {
        P1(); // Initialize the first panel
        B(); // Initialize the button
        this.setSize(600, 600);
        this.setResizable(true);
        this.setLayout(null);
        this.add(button);
        this.add(firstPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void B() {
        button = new JButton();
        button.setText("Next");
        button.setFocusable(false);
        button.setBounds(100, 100, 200, 30);
        button.setFont(new Font("Consolas", Font.PLAIN, 30));
        button.setForeground(Color.GREEN);
        button.setBackground(Color.WHITE);
        button.addActionListener(this);
    }

    public void P1() {
        firstPanel = new JPanel();
        firstPanel.setBounds(0, 0, 600, 600);
        firstPanel.setBackground(Color.BLACK);
    }

    public void P2() {
        secondPanel = new JPanel();
        secondPanel.setBounds(0, 0, 600, 600);
        secondPanel.setBackground(Color.BLUE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            this.remove(firstPanel);
            P2();
            this.add(secondPanel);
            this.revalidate(); // Refresh the frame to display the new panel
            this.repaint(); // Repaint the frame to apply the changes
        }
    }
}
