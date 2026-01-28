import javax.swing.JOptionPane; // Import the JOptionPane class for GUI dialog boxes
import javax.swing.ImageIcon;   // Import the ImageIcon class to handle images

public class HelloWorldJOptionPane {
    public static void main(String[] args) {

        // Create a new ImageIcon object using the specified file path
        ImageIcon albumIcon = new ImageIcon("path/icon.png"); // This is optional

        // Display a standard informative dialog box with custom parameters
        JOptionPane.showMessageDialog(
                null,                           // parentComponent: Center the dialog on the screen
                "Hello World",                  // message: The text displayed inside the dialog
                "Hello World in JOptionPane",   // title: The text shown in the window's title bar
                JOptionPane.INFORMATION_MESSAGE, // messageType: Defines the look (icon/style) of the dialog
                albumIcon                       // icon: A custom image to replace the default icon (optional)
        );
    }
}
