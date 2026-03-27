import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSiTePortasBien {
    private static int indiceLinea = 0;

    public static void main(String[] args) {
        ImageIcon iconoAlbum = new ImageIcon("path/icono.png"); // Rellena el directorio
        ImageIcon imagenAlbum = new ImageIcon("path/imagen.png");

        String artista = "Nsqk";
        String album = "ATP";
        String cancion = "si te portas bien";
        String textoPortada = album + " - " + cancion;
        String tituloPortada = artista + " - " + album;
        String tituloLetra = artista + " - " + cancion;

        JLabel labelPortada = new JLabel(textoPortada);
        labelPortada.setFont(new Font("Arial", Font.BOLD, 16));
        labelPortada.setIcon(imagenAlbum);
        labelPortada.setHorizontalTextPosition(JLabel.CENTER);
        labelPortada.setVerticalTextPosition(JLabel.BOTTOM);

        String letraStr = """
                Eh
                Ma
                Mami,
                Mami, sé
                Mami, sé que
                Mami, sé que no
                Mami, sé que no fun
                Mami, sé que no funcio
                Mami, sé que no funciona
                Mami, sé que no funciona más
                No
                No me
                No me que
                No me quedan
                No me quedan ga
                No me quedan ganas
                de em
                de empe
                de empezar
                de empezar o
                de empezar otra
                de empezar otra vez
                Si así
                Si así se
                Si así segui
                Si así seguimos,
                na
                nadie
                nadie va a
                nadie va a ga
                nadie va a ganar
                Y
                Y to
                Y todas
                Y todas mis
                Y todas mis car
                Y todas mis cartas,
                Y todas mis cartas, ba
                Y todas mis cartas, baby,
                Y todas mis cartas, baby, ya
                Y todas mis cartas, baby, ya las
                Y todas mis cartas, baby, ya las ju
                Y todas mis cartas, baby, ya las jugué
                ¿Y
                ¿Y qué
                ¿Y qué pre
                ¿Y qué preten
                ¿Y qué pretendes
                ¿Y qué pretendes que
                ¿Y qué pretendes que su
                ¿Y qué pretendes que suce
                ¿Y qué pretendes que suceda en
                ¿Y qué pretendes que suceda en la
                ¿Y qué pretendes que suceda en la ma
                ¿Y qué pretendes que suceda en la maña
                ¿Y qué pretendes que suceda en la mañana?
                Los
                Los cigarros
                Los cigarros no
                Los cigarros no vuelven
                Los cigarros no vuelven a
                Los cigarros no vuelven a prender
                Cuando
                Cuando el
                Cuando el sol
                Cuando el sol re
                Cuando el sol reve
                Cuando el sol revele
                to
                todas
                todas tus
                todas tus pa
                todas tus pala
                todas tus palabras
                Los
                Los corazones
                Los corazones solo
                Los corazones solo rompen
                Los corazones solo rompen u
                Los corazones solo rompen una
                Los corazones solo rompen una vez
                Yeah
                Yo
                Yo sé
                Yo sé que
                Yo sé que tú
                Yo sé que tú me
                Yo sé que tú me ves
                Ay,
                Ay, me
                Ay, me ves
                .
                ..
                ...
                Es
                Es que
                Es que te
                Es que te veo
                Es que te veo y
                so
                sona
                sonaban
                sonaban las
                sonaban las viejas
                sonaban las viejas de
                sonaban las viejas de Feid
                Como
                Como flor
                Como flor delicada,
                Como flor delicada, me
                Como flor delicada, me dejas
                Como flor delicada, me dejas caer
                Solo
                Solo funciona
                              si
                te
                te por
                te portas
                te portas bien
                So
                Solo
                Solo fun
                Solo funcio
                Solo funciona
                si
                si te
                si te por
                si te portas
                si te portas bien
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
        // Dejamos focusable en true para que responda al Espacio
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