import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
import javax.swing.border.LineBorder;

public class Calculator {
    // add window dimensionsf
     int windowWidth = 370;
     int windowHeight = 550;

     //add colors
        Color lightGray = new Color(240, 240, 240);
        Color darkGray = new Color(200, 200, 200);
        Color orange = new Color(255, 165, 0);
        Color black = new Color(0, 0, 0);
        Color white = new Color(255, 255, 255); 
        
     //add the frame
        JFrame frame = new JFrame("Calculator");
        JLabel titleLabel = new JLabel("Calculator", SwingConstants.CENTER);
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 5, 5));
        JLabel displayLabel = new JLabel();
         String[] buttonLabels = {
            "C", "±", "%", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "="
        };

        //add frame components
        Calculator() {
            //set frame properties
            frame.setSize(windowWidth, windowHeight);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout());

            //make the frame visible
            frame.setVisible(true);


            displayLabel.setBackground(black);
            displayLabel.setForeground(white);
            displayLabel.setFont(new Font("Arial", Font.BOLD, 24));
            displayLabel.setHorizontalAlignment(JLabel.RIGHT);
            displayLabel.setBorder(new LineBorder(darkGray, 2));
            displayLabel.setText("0");
            displayLabel.setOpaque(true);  
            
            //Panel of display
            JPanel displayPanel = new JPanel(new BorderLayout());
            displayPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            displayPanel.add(displayLabel, BorderLayout.CENTER);    
            frame.add(displayPanel, BorderLayout.NORTH);
            //add buttons to the button panel
            for (String label : buttonLabels) {
                JButton button = new JButton(label);
                button.setFont(new Font("Arial", Font.BOLD, 18));
                button.setBackground(lightGray);
                button.setFocusPainted(false);
                buttonPanel.add(button);
            }
            frame.add(buttonPanel, BorderLayout.CENTER);
            




        }

    
}
