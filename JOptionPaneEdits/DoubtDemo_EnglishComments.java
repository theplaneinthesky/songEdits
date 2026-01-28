/* GUI (Graphical  User Interface) Imports:
 * javax.swing contains the "Swing" components for creating window-based applications.
 * java.awt contains the older "Abstract Window Toolkit" classes for styles and layouts.
 */
import javax.swing.JLabel;      // Component to display text and/or an image on the screen
import javax.swing.JOptionPane; // Class to create standard pop-up dialog boxes
import javax.swing.ImageIcon;   // Implementation of the Icon interface to handle image files
import java.awt.Font;           // Class to define text styles (size, weight, and typeface)

public class DoubtDemo_EnglishComments {
    public static void main(String[] args) {
        
        // Load the small icon for the message boxes and the large album cover
        ImageIcon lyricsIcon = new ImageIcon("path/lyricsIcon.png"); // The path is the image directory
        ImageIcon albumCover = new ImageIcon("path/albumCover.png");

        // Create a label to hold the album title text
        JLabel albumLabel = new JLabel("Doubt (demo)");

        // Define a Font object: "Arial", Bold style, size 20
        Font largeFont = new Font("Arial", Font.BOLD, 20);
        
        albumLabel.setFont(largeFont);   // Apply the font to the label text
        albumLabel.setIcon(albumCover);  // Assign the cover image to the label
        
        // Positioning: Text will be centered horizontally relative to the icon, 
        // and placed at the bottom (below the image).
        albumLabel.setHorizontalTextPosition(JLabel.CENTER);
        albumLabel.setVerticalTextPosition(JLabel.BOTTOM);

        // Define the lyrics using a Text Block or String with '\n' (newline)
        String lyricsText = """
                Scared of my own
                image
                Scared of my own
                immaturity
                """; 

        // Split the text into an array of strings, breaking it at every newline (\n)
        String[] lyricsArray = lyricsText.split("\n");

        // Show the initial dialog with the label (Image + Text)
        // PLAIN_MESSAGE removes the default "i" or "?" icons
        JOptionPane.showMessageDialog(
                null, 
                albumLabel, 
                "Twenty One Pilots - Doubt (demo)", 
                JOptionPane.PLAIN_MESSAGE
        );

        // Loop through each line in the array and display it in a new dialog box
        for (String line : lyricsArray) {
            JOptionPane.showMessageDialog(
                    null,
                    line,                               // The specific lyric line
                    "Twenty One Pilots - Doubt (demo)", // The window title
                    JOptionPane.INFORMATION_MESSAGE,    // Uses the standard Info look
                    lyricsIcon                          // Displays the custom lyrics icon
            );
        }
    }
}
