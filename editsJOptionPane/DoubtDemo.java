import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;

public class DoubtDemo {
    public static void main(String[] args) {
        // Esta imagen la uso para el icono de las letras
        ImageIcon iconoAlbum = new ImageIcon("path/icono.png");
        // Esta imagen es para la portada del disco en el primer showMessageDialog
        ImageIcon imagenAlbum = new ImageIcon("path/imagen.png");

        // Label para la portada del album y su nombre
        JLabel label = new JLabel("Doubt (demo)");

        Font fuenteGrande = new Font("ArialS", Font.BOLD, 20);
        label.setFont(fuenteGrande);
        label.setIcon(imagenAlbum);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);

        // La letra de la cancion separa con saltos de linea "\n"
        String letraStr = """
                Scared of my own
                image
                Scared of my own
                immaturity
                Scared of my own
                ceiling
                Scared
                I'll die of
                uncertainty
                Fear might be the death
                of me
                Fear leads to
                anxiety
                Don't know what's
                inside of me
                Don't
                forget
                abou
                abou-bou-
                abou-bou-bou
                abou-bou-bou-bou
                abou-bou-bou-bou-bout
                me
                Don't
                forget
                abou
                abou-bou-
                abou-bou-bou
                abou-bou-bou-bou
                abou-bou-bou-bou-bout
                me
                Even
                when
                I
                doubt you
                I'm
                no
                good
                without you,
                no,
                no...
                Scared of my own
                image
                Scared of my own
                immaturity
                Scared of my own
                ceiling
                Scared
                I'll die of
                uncertainty
                Fear might be the death
                of me
                Fear leads to
                anxiety
                Don't know what's
                inside of me
                Don't
                forget
                abou
                abou-bou-
                abou-bou-bou
                abou-bou-bou-bou
                abou-bou-bou-bou-bout
                me
                Don't
                forget
                abou
                abou-bou-
                abou-bou-bou
                abou-bou-bou-bou
                abou-bou-bou-bou-bout
                me
                Even
                when
                I
                doubt you
                no
                good
                without
                you...
                """; 

        // Arreglo para la letra, usamos la funcion split que devuelve un arreglo con los String
        // delimitados por el patron "\n"
        String[] letraArr = letraStr.split("\n");

        // Le pasamos el label como argumento al showMessageDialog del titulo del album y su portada
        JOptionPane.showMessageDialog(
                null, label, "Twenty One Pilots - Doubt (demo)", JOptionPane.PLAIN_MESSAGE);

        // Recorremos letraArr para mostrar cada String con showMessageDialog()
        for (String linea : letraArr) {
            JOptionPane.showMessageDialog(
                    null,
                    linea,
                    "Twenty One Pilots - Doubt (demo)",
                    JOptionPane.INFORMATION_MESSAGE,
                    iconoAlbum
            );
        }
    }
}
