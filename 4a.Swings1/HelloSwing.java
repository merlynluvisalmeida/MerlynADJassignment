package swinDemo;
import javax.swing.*;
import java.awt.*;
public class HelloSwing {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Hello Program");

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI B, Welcome to Swing Programming");

        // Set font: plain style, size 32
        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Center the label horizontally and vertically
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        // Add the label to the frame
        frame.add(label);

        // Set frame size
        frame.setSize(800, 200);

        // Close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make frame visible
        frame.setVisible(true);
    }
}