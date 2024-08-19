package Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class My_Labels {
    public JLabel logoLabelFun() {
        /* Logo label implementation */

        ImageIcon logoIcon = new ImageIcon("assets//Main_Logo_Resized.png");
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
        /* Navigation label implementation */

        JLabel navigationLabel = new JLabel();
        navigationLabel.setLayout(new GridLayout(4, 1, 10, 10));
        return navigationLabel;
    }

    public JLabel userFormLabelFun() {
        JLabel userFormLabel = new JLabel();
        userFormLabel.setLayout(null);

        /* Form Title */
        JLabel formTitle = new JLabel("Add New Employee");
        formTitle.setForeground(Color.WHITE);
        formTitle.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
        formTitle.setBounds(130, 80, 350, 30);
        userFormLabel.add(formTitle);

        /* User Name Label */
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        nameLabel.setBounds(100, 150, 100, 30);
        userFormLabel.add(nameLabel);

        /* User ID Label */
        JLabel idLabel = new JLabel("User ID:");
        idLabel.setForeground(Color.WHITE);
        idLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        idLabel.setBounds(100, 200, 100, 30);
        userFormLabel.add(idLabel);

        /* User Designation */
        JLabel designationLabel = new JLabel("Postion:");
        designationLabel.setForeground(Color.WHITE);
        designationLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        designationLabel.setBounds(100, 250, 100, 30);
        userFormLabel.add(designationLabel);

        return userFormLabel;
    }

    public JLabel showUserLabelFun() {
        JLabel showUserLabel = new JLabel();
        showUserLabel.setText("Show User");
        showUserLabel.setVerticalTextPosition(JLabel.TOP);
        showUserLabel.setHorizontalTextPosition(JLabel.CENTER);
        showUserLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
        showUserLabel.setForeground(Color.WHITE);
        return showUserLabel;
    }

    public JLabel deleteUserLabelFun() {
        JLabel deleteUserLabel = new JLabel();
        ImageIcon image = new ImageIcon("assets//fired_resized.png");
        deleteUserLabel.setIcon(image);
        deleteUserLabel.setText("Delete User");
        deleteUserLabel.setVerticalAlignment(JLabel.TOP);
        deleteUserLabel.setHorizontalAlignment(JLabel.CENTER);
        deleteUserLabel.setVerticalTextPosition(JLabel.BOTTOM);
        deleteUserLabel.setHorizontalTextPosition(JLabel.CENTER);
        deleteUserLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
        deleteUserLabel.setForeground(Color.WHITE);
        deleteUserLabel.setIconTextGap(-10);
        return deleteUserLabel;
    }
}
