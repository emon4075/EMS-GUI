package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class My_Frame extends JFrame implements ActionListener {
    ImageIcon frameIcon = new ImageIcon("E://Swing Project//assets//goat.png");
    JPanel mainPanel, addUserPanel;
    JButton addButton, deleteButton, showButton, exitButton, submitButton;
    @SuppressWarnings("rawtypes")
    JComboBox designationComboBox;

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
        addButton.setMnemonic(KeyEvent.VK_A);

        showButton = new JButton("Show User");
        showButton.setFocusable(false);
        showButton.setBackground(new Color(200, 240, 35));
        showButton.setFont(new Font("Courier New", Font.PLAIN, 15));
        showButton.addActionListener(this);
        showButton.setMnemonic(KeyEvent.VK_S);

        deleteButton = new JButton("Delete User");
        deleteButton.setFocusable(false);
        deleteButton.setBackground(new Color(200, 240, 35));
        deleteButton.setFont(new Font("Courier New", Font.PLAIN, 15));
        deleteButton.addActionListener(this);
        deleteButton.setMnemonic(KeyEvent.VK_D);

        exitButton = new JButton("Exit EMS");
        exitButton.setFocusable(false);
        exitButton.setBackground(new Color(200, 240, 35));
        exitButton.setFont(new Font("Courier New", Font.PLAIN, 15));
        exitButton.addActionListener(this);
        exitButton.setMnemonic(KeyEvent.VK_X);

        navigationLabel.add(addButton);
        navigationLabel.add(showButton);
        navigationLabel.add(deleteButton);
        navigationLabel.add(exitButton);

        mainPanel.add(navigationLabel);
        /* Navigation Label & Adding Buttons With ActionListener End */
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void addUserPanelFun() {
        addUserPanel = new JPanel();
        addUserPanel.setBackground(new Color(103, 65, 136));
        addUserPanel.setBounds(0, 0, 600, 600);
        addUserPanel.setLayout(null);

        My_Labels myLabels = new My_Labels();

        /* addUserPanel + userFormPanel */
        JLabel userFormLabel = myLabels.userFormLabelFun();
        userFormLabel.setBounds(0, 0, 600, 600);
        /* Baki Gulao Add Korte Hobe */

        /* Designation */
        String[] designations = { "Intern", "Lead Developer", "DevOps", "QA Engineer", "Team Lead" };
        designationComboBox = new JComboBox(designations);
        designationComboBox.setBounds(200, 250, 200, 30);
        designationComboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        designationComboBox.addActionListener(this);

        /* Submit Button */
        submitButton = new JButton("Submit");
        submitButton.setFocusable(false);
        submitButton.setBackground(new Color(200, 240, 35));
        submitButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        submitButton.setBounds(250, 350, 100, 30);
        submitButton.addActionListener(this);

        addUserPanel.add(userFormLabel);
        addUserPanel.add(designationComboBox);
        addUserPanel.add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            this.remove(mainPanel);
            addUserPanelFun();
            this.add(addUserPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == submitButton) {
            System.out.println("HAHA");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
}
