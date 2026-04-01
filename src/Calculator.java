import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
import javax.swing.border.LineBorder;

public class Calculator {
    // add window dimensionsf
     int windowWidth = 370;
     int windowHeight = 550;

     //add the frame
        JFrame frame = new JFrame("Calculator");

        //add frame components
        Calculator() {
            //set frame properties
            frame.setSize(windowWidth, windowHeight);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);

            //make the frame visible
            frame.setVisible(true);
        }

    
}
