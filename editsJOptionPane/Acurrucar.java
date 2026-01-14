import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Esta imagen es para la portada del disco en el primer showMessageDialog (uso imagenes de 64x64 pixeles)
        ImageIcon iconoAlbum = new ImageIcon("path/icono.png");
        // Esta imagen la uso para el icono de las letras (uso imagenes de 300x300 pixeles)
        ImageIcon imagenAlbum = new ImageIcon("path/imagen.png");

        // Label para la portada del album y su nombre
        JLabel label = new JLabel("mix pa llorar en tu cuarto");

        Font fuenteGrande = new Font("ArialS", Font.BOLD, 20);
        label.setFont(fuenteGrande);
        label.setIcon(imagenAlbum);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);

        // Le pasamos el label como argumento al showMessageDialog
        JOptionPane.showMessageDialog(null, label, "Ed Maverick - mix pa llorar en tu cuarto", JOptionPane.PLAIN_MESSAGE);

        // La letra de la cancion separa con saltos de linea "\n"
        String letraStr = "Quiero que me digas\n" +
                "que me quieres\n" +
                "y\n" +
                "que me vas a extrañar\n" +
                "No mames,\n" +
                "no me mires\n" +
                "a los ojos,\n" +
                "que me vas a hacer\n" +
                "llorar\n" +
                "Dime que esta\n" +
                "no será\n" +
                "la última vez,\n" +
                "que te voy a\n" +
                "abrazaaar\n" +
                "Quisiera que todo\n" +
                "fuera mentira\n" +
                "y de chingazo\n" +
                "despertar\n" +
                "Quisiera que todo\n" +
                "fuera mentira\n" +
                "y de chingazo\n" +
                "despertar\n" +
                "Un día\n" +
                "más\n" +
                "Una vez\n" +
                "más\n" +
                "En tus brazos\n" +
                "yo\n" +
                "me quiero\n" +
                "acurrucar...";

        // Arreglo para la letra, usamos la funcion split que devuelve un arreglo con los String
        // delimitados por el patron "\n"
        String[] letraArr = letraStr.split("\n");

        // Recorremos letraArr para mostrar cada String con showMessageDialog()
        for (String linea : letraArr) {
            JOptionPane.showMessageDialog(
                    null,
                    linea,
                    "Ed Maverick - Acurrucar",
                    JOptionPane.INFORMATION_MESSAGE,
                    iconoAlbum
            );
        }
    }
}
