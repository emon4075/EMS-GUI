package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class My_Frame extends JFrame implements ActionListener {
    ImageIcon frameIcon = new ImageIcon("E://Swing Project//assets//goat.png");
    JPanel mainPanel;
    JButton addButton, deleteButton, showButton, exitButton;

    My_Frame() {
        mainPanelFun();
        this.add(mainPanel);
        this.setSize(600, 600);
        this.setTitle("Employee Management System");
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(frameIcon.getImage());
        this.setVisible(true);
    }

    public void mainPanelFun() {
        mainPanel = new JPanel();
        mainPanel.setBackground(new Color(103, 65, 136));
        mainPanel.setBounds(0, 0, 600, 600);
        mainPanel.setLayout(null);

        My_Labels myLabels = new My_Labels();

        /* Logo Label Start */

        JLabel logoLabel = myLabels.logoLabelFun();
        logoLabel.setBounds(100, 20, 400, 200);
        mainPanel.add(logoLabel);

        /* Logo Label End */

        /* Navigation Label & Adding Buttons With ActionListener Start */

        JLabel navigationLabel = myLabels.navigationLabelFun();
        navigationLabel.setBounds(220, 280, 150, 150);

        addButton = new JButton("Add User");
        addButton.setFocusable(false);
        addButton.setBackground(new Color(200, 240, 35));
        addButton.setFont(new Font("Courier New", Font.PLAIN, 15));
        addButton.addActionListener(this);

        showButton = new JButton("Show User");
        showButton.setFocusable(false);
        showButton.setBackground(new Color(200, 240, 35));
        showButton.setFont(new Font("Courier New", Font.PLAIN, 15));
        showButton.addActionListener(this);

        deleteButton = new JButton("Delete User");
        deleteButton.setFocusable(false);
        deleteButton.setBackground(new Color(200, 240, 35));
        deleteButton.setFont(new Font("Courier New", Font.PLAIN, 15));
        deleteButton.addActionListener(this);

        exitButton = new JButton("Exit EMS");
        exitButton.setFocusable(false);
        exitButton.setBackground(new Color(200, 240, 35));
        exitButton.setFont(new Font("Courier New", Font.PLAIN, 15));
        exitButton.addActionListener(this);

        navigationLabel.add(addButton);
        navigationLabel.add(showButton);
        navigationLabel.add(deleteButton);
        navigationLabel.add(exitButton);

        mainPanel.add(navigationLabel);

        /* Navigation Label & Adding Buttons With ActionListener End */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
}
