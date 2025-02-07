package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ErrorDialog {

    public static void showErrorDialog(String errorMessage) {
        // Create a new JDialog
        JDialog dialog = new JDialog((Frame) null, "Login Error", true);
        dialog.setSize(350, 210);
        dialog.setLayout(new BorderLayout());
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        // Add the error message as a label
        JLabel messageLabel = new JLabel(errorMessage, SwingConstants.CENTER);
        dialog.add(messageLabel, BorderLayout.CENTER);

        // Create an "OK" button
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose(); // Close the dialog when "OK" is pressed
            }
        });

        // Add the button to the dialog
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        dialog.add(buttonPanel, BorderLayout.SOUTH);

        // Center the dialog on the screen
        dialog.setLocationRelativeTo(null);

        // Make the dialog visible
        dialog.setVisible(true);
    }
}
