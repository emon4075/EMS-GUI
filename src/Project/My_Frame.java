package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class My_Frame extends JFrame implements ActionListener {
    ImageIcon frameIcon = new ImageIcon("E://Swing Project//assets//goat.png");
    JPanel mainPanel, addUserPanel, showUserPanel;
    JButton addButton, deleteButton, showButton, exitButton, submitFormButton, exitFormButton, showUserButton,
            exitShowUserButton;

    @SuppressWarnings("rawtypes")
    JComboBox designationComboBox;
    JTextField nameField, idField, showIdField;
    JTextArea T;

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

        /* User Name Text Field */
        nameField = new JTextField();
        nameField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        nameField.setBounds(200, 150, 200, 30);
        nameField.addActionListener(this);

        /* User ID Text Field */
        idField = new JTextField();
        idField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        idField.setBounds(200, 200, 200, 30);
        idField.addActionListener(this);

        /* Designation */
        String[] designations = { "Intern", "Lead Developer", "DevOps", "QA Engineer", "Team Lead" };
        designationComboBox = new JComboBox(designations);
        designationComboBox.setBounds(200, 250, 200, 30);
        designationComboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        designationComboBox.addActionListener(this);

        /* Submit Button */
        submitFormButton = new JButton("Submit");
        submitFormButton.setFocusable(false);
        submitFormButton.setBackground(new Color(200, 240, 35));
        submitFormButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        submitFormButton.setBounds(250, 350, 100, 30);
        submitFormButton.addActionListener(this);

        /* Exit Button */
        exitFormButton = new JButton("Exit");
        exitFormButton.setFocusable(false);
        exitFormButton.setBackground(new Color(200, 240, 35));
        exitFormButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        exitFormButton.setBounds(250, 390, 100, 30);
        exitFormButton.addActionListener(this);

        addUserPanel.add(userFormLabel);
        addUserPanel.add(nameField);
        addUserPanel.add(idField);
        addUserPanel.add(designationComboBox);
        addUserPanel.add(submitFormButton);
        addUserPanel.add(exitFormButton);
    }

    public void showUserPanelFun() {
        showUserPanel = new JPanel();
        showUserPanel.setBackground(new Color(103, 65, 136));
        showUserPanel.setBounds(0, 0, 600, 600);
        showUserPanel.setLayout(null);

        My_Labels myLabels = new My_Labels();

        /* Calling showUserLabel */
        JLabel showUserLabel = myLabels.showUserLabelFun();
        showUserLabel.setBounds(200, 20, 300, 150);
        showUserPanel.add(showUserLabel);

        /* Adding Id Label */
        JLabel idLabel = new JLabel("User Id :");
        idLabel.setForeground(Color.WHITE);
        idLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        idLabel.setBounds(100, 150, 100, 30);
        showUserPanel.add(idLabel);

        /* Adding Id TextField */
        showIdField = new JTextField();
        showIdField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        showIdField.setBounds(200, 150, 200, 30);
        showIdField.addActionListener(this);
        showUserPanel.add(showIdField);

        /* showUserButton */
        showUserButton = new JButton("Show");
        showUserButton.setFocusable(false);
        showUserButton.setBackground(new Color(200, 240, 35));
        showUserButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        showUserButton.setBounds(250, 210, 100, 30);
        showUserButton.addActionListener(this);
        showUserPanel.add(showUserButton);

        /* Exit Button */
        exitShowUserButton = new JButton("Exit");
        exitShowUserButton.setFocusable(false);
        exitShowUserButton.setBackground(new Color(200, 240, 35));
        exitShowUserButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        exitShowUserButton.setBounds(250, 510, 100, 30);
        exitShowUserButton.addActionListener(this);
        showUserPanel.add(exitShowUserButton);

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
        if (e.getSource() == submitFormButton) {
            String myName = nameField.getText();
            String myId = idField.getText();
            String myPosition = (String) designationComboBox.getSelectedItem();

            String fileName = "employee" + myId + ".txt";
            String filePath = "E://Swing Project//Database//" + fileName;

            try {
                if (myName.equals("") || myId.equals("")) {
                    JOptionPane.showMessageDialog(null, "No Option Can Be Left Blank", "Error Occured",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    FileWriter File = new FileWriter(filePath);
                    try {
                        File.write("User Name : " + myName + "\n");
                        File.write("User ID : " + myId + "\n");
                        File.write("Position : " + myPosition + "\n");
                    } finally {
                        File.close();
                        JOptionPane.showMessageDialog(null, "Employee Added Successfully", "Add Employee Form",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                }
            } catch (Exception i) {
                System.out.println(i.getMessage());
                System.exit(0);
            }
        }
        if (e.getSource() == exitFormButton) {
            System.exit(0);
        }
        if (e.getSource() == showButton) {
            this.remove(mainPanel);
            showUserPanelFun();
            this.add(showUserPanel);
            this.revalidate();
            this.repaint();
        }
        if (e.getSource() == showUserButton) {
            try {
                String filePath = "E://Swing Project//Database//" + "employee" + showIdField.getText() + ".txt";
                File F = new File(filePath);
                if (F.exists()) {
                    JTextArea T = new JTextArea();
                    T.setBounds(100, 280, 400, 200);
                    T.setBackground(new Color(103, 65, 136));
                    T.setFont(new Font("Monospaced", Font.BOLD, 20));
                    T.setBorder(BorderFactory.createLineBorder(new Color(200, 240, 35), 5));
                    T.setEditable(false);
                    T.setForeground(Color.WHITE);
                    T.setLineWrap(true);
                    T.setWrapStyleWord(true);
                    showUserPanel.add(T);
                    showUserPanel.revalidate();
                    showUserPanel.repaint();
                    T.append("From : " + F.getName() + "\n");
                    try (Scanner fileReader = new Scanner(F)) {
                        while (fileReader.hasNextLine()) {
                            T.append(fileReader.nextLine());
                            T.append("\n");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "File Not Found", "Wrong ID", JOptionPane.ERROR_MESSAGE);
                }
            } catch (FileNotFoundException j) {
                JOptionPane.showMessageDialog(null, "Error: " + j.getMessage(), "File Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == exitShowUserButton) {
            System.exit(0);
        }
        if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

}
