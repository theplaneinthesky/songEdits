import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainContandoOvejas {
    private static int indiceLinea = 0;

    public static void main(String[] args) {
        ImageIcon iconoAlbum = new ImageIcon("path.png");
        ImageIcon imagenAlbum = new ImageIcon("path.png");

        String artista = "WOS";
        String album = "OSCURO ÉXTASIS";
        String cancion = "CONTANDO OVEJAS";
        String textoPortada = album + " - " + cancion;
        String tituloPortada = artista + " - " + album;
        String tituloLetra = artista + " - " + cancion;

        JLabel labelPortada = new JLabel(textoPortada);
        labelPortada.setFont(new Font("Arial", Font.BOLD, 14));
        labelPortada.setIcon(imagenAlbum);
        labelPortada.setHorizontalTextPosition(JLabel.CENTER);
        labelPortada.setVerticalTextPosition(JLabel.BOTTOM);

        String letraStr = """
                Yo ya
                Yo ya la conocía,
                la loca
                la loca baila sola
                en esa
                en esa esquina
                Y cuando me ve,
                me silba
                me silba melodías
                Dice que si lo malo
                pega fuerte y
                pega fuerte y deja heridas
                El corazón transforma
                El corazón transforma la canción
                en su mejor guarida
                Y aunque no quiera
                oscurecerme
                Cuenta que no es buena
                en eso
                en eso de la suerte
                Que el brebaje
                Que el brebaje bajo el brazo
                la acompaña siempre
                Y es pa' acortar el plazo
                de su cita
                de su cita con la muerte
                Camina el
                Camina el planeta
                Siente que algo le falta,
                que no nació completa
                Que nunca nadie supo
                cómo quererla de cerca
                Quizás no tenga cara y
                sea solo una
                sea solo una silueta
                Mirala
                Mirala cómo
                Mirala cómo baila,
                Mirala cómo baila, eh
                Nadie quiere mirar
                Cuando ella gambetea
                entre la
                entre la tempestad
                Un trago por el miedo
                Un trago por el miedo a la soledad
                Un trago por el
                miedo a la sobriedad
                eh
                Nadie quiere mirar
                Cuando ella gambetea
                entre la
                tempestad
                Cuando la noche aprieta,
                sale a susurrar
                Permanecer tan cuerdo
                te
                te puede
                te puede hacer
                te puede hacer mal
                """;

        String[] letraArr = letraStr.split("\n");

        JOptionPane.showMessageDialog(null, labelPortada, tituloPortada, JOptionPane.PLAIN_MESSAGE);

        JFrame ventana = new JFrame(tituloLetra);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setMinimumSize(new Dimension(380, 180));

        Color fondoDialogo = UIManager.getColor("Panel.background");

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 25, 15, 25));
        panelPrincipal.setBackground(fondoDialogo);

        JLabel labelLetra = new JLabel(letraArr[indiceLinea]);
        labelLetra.setFont(new Font("Arial", Font.PLAIN, 16));
        labelLetra.setIcon(iconoAlbum);

        labelLetra.setIconTextGap(40);
        labelLetra.setHorizontalTextPosition(JLabel.TRAILING);
        labelLetra.setVerticalTextPosition(JLabel.CENTER);

        JButton botonOk = new JButton("OK");
        botonOk.setFocusable(true);
        botonOk.setMargin(new Insets(2, 20, 2, 20));

        botonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indiceLinea++;
                if (indiceLinea < letraArr.length) {
                    labelLetra.setText(letraArr[indiceLinea]);
                    ventana.pack();
                    if(ventana.getWidth() < 380) ventana.setSize(380, ventana.getHeight());
                    ventana.setLocationRelativeTo(null);
                } else {
                    ventana.dispose();
                }
            }
        });

        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.setBackground(fondoDialogo);
        panelBoton.add(botonOk);

        panelPrincipal.add(labelLetra, BorderLayout.CENTER);
        panelPrincipal.add(panelBoton, BorderLayout.SOUTH);

        ventana.add(panelPrincipal);
        ventana.pack();

        if(ventana.getWidth() < 380) ventana.setSize(380, ventana.getHeight());

        // Hacer que el botón OK sea el predeterminado como enfocado
        ventana.getRootPane().setDefaultButton(botonOk);

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        // Forzar el foco en el botón OK para que al teclear Espacio funcione siempre
        botonOk.requestFocusInWindow();
    }
}