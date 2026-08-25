import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSiTePortasBien {

    // Contador para las lineas de la cancion
    // Empieza en el primer elemento
    private static int indiceLinea = 0;

    public static void main(String[] args) {

        // Cargamos las imágenes que vamos a usar
        // Cambia la ruta a dónde esten tus imagenes
        ImageIcon iconoAlbum = new ImageIcon("path/icono.png");
        ImageIcon imagenAlbum = new ImageIcon("path/imagen.png");

        // Guardamos los datos de la canción en variables de texto
        // Facilita armar los textos repetidos
        String artista = "Nsqk";
        String album = "ATP";
        String cancion = "si te portas bien";
        String textoPortada = album + " - " + cancion;
        String tituloPortada = artista + " - " + album;
        String tituloLetra = artista + " - " + cancion;

        // Creamos un JLabel para la portada
        // Le ponemos nuestro texto, le cambiamos el tipo de letra y le pegamos la imagen
        JLabel labelPortada = new JLabel(textoPortada);
        labelPortada.setFont(new Font("Arial", Font.BOLD, 16));
        labelPortada.setIcon(imagenAlbum);
        // Le decimos que el texto vaya centrado y debajo de la imagen.
        labelPortada.setHorizontalTextPosition(JLabel.CENTER);
        labelPortada.setVerticalTextPosition(JLabel.BOTTOM);

        // Aquí guardamos toda la letra. Usamos triple comilla (""") para poder
        // copiar y pegar el texto con sus saltos de línea sin problemas
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

        // Cortamos ese texto gigante cada vez que hay un salto de línea (\n)
        // Ahora tenemos una arreglo donde cada elemento es una línea de la canción
        String[] letraArr = letraStr.split("\n");

        // Mostramos un mensaje de alerta inicial con la portada
        // El programa se queda pausado hasta que se de a aceptar
        JOptionPane.showMessageDialog(null, labelPortada, tituloPortada, JOptionPane.PLAIN_MESSAGE);

        // Creamos la ventana principal
        JFrame ventana = new JFrame(tituloLetra);
        // Le decimos que cierre el programa entero cuando cerremos esta ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Bloqueamos la ventana para que el usuario no pueda estirarla o encogerla
        ventana.setResizable(false);
        // Le damos un tamaño mínimo para que no se vea muy pequeña al inicio
        ventana.setMinimumSize(new Dimension(380, 180));

        // Tomamos el color gris estandar de las ventanas
        Color fondoDialogo = UIManager.getColor("Panel.background");

        // Creamos un panel para meter nuestras cosas, como una caja
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        // Le ponemos un margen invisible alrededor para que el texto no quede pegado a la orilla
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 25, 15, 25));
        panelPrincipal.setBackground(fondoDialogo);

        // Este es el letrero que irá mostrando la letra.
        // Lo iniciamos con la línea 0 de nuestra lista.
        JLabel labelLetra = new JLabel(letraArr[indiceLinea]);
        labelLetra.setFont(new Font("Arial", Font.PLAIN, 16));
        labelLetra.setIcon(iconoAlbum);

        // Le damos un espacio entre la imagen y el texto para que se vea mejor.
        labelLetra.setIconTextGap(40);
        // Colocamos el texto a la derecha de la imagen.
        labelLetra.setHorizontalTextPosition(JLabel.TRAILING);
        labelLetra.setVerticalTextPosition(JLabel.CENTER);

        // Creamos el botón que hará avanzar la letra.
        JButton botonOk = new JButton("OK");
        // Permitimos que el botón pueda ser activado si presionas la barra espaciadora.
        botonOk.setFocusable(true);
        // Lo hacemos un poco más ancho
        botonOk.setMargin(new Insets(2, 20, 2, 20));

        // Aquí se configura que debe hacer el boton cuando es presionado
        botonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Sumamos 1 a nuestro contador para pasar a la siguiente línea
                indiceLinea++;

                // Si todavía quedan líneas en nuestra lista
                if (indiceLinea < letraArr.length) {
                    // Actualizamos el texto del letrero con la nueva línea.
                    labelLetra.setText(letraArr[indiceLinea]);

                    // Ajustamos la ventana para que encaje bien con el nuevo texto.
                    ventana.pack();
                    // Si al ajustar la ventana quedó muy pequeña, la volvemos a agrandar a 380px
                    if(ventana.getWidth() < 380) ventana.setSize(380, ventana.getHeight());
                    // La volvemos a centrar en la pantalla por si cambió de tamaño
                    ventana.setLocationRelativeTo(null);
                } else {
                    // Si ya se acabó la canción, cerramos la ventana.
                    ventana.dispose();
                }
            }
        });

        // Metemos el botón en su propio panel pequeño para que se mantenga en el centro
        // y no se deforme
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.setBackground(fondoDialogo);
        panelBoton.add(botonOk);

        // Finalmente, armamos la estructura donde colocamos la letra en el centro y el botón abajo
        panelPrincipal.add(labelLetra, BorderLayout.CENTER);
        panelPrincipal.add(panelBoton, BorderLayout.SOUTH);
        ventana.add(panelPrincipal); // Añadimos esto a la ventana

        // Le decimos a la ventana que calcule su tamaño ideal
        ventana.pack();
        if(ventana.getWidth() < 380) ventana.setSize(380, ventana.getHeight());

        // Hacemos que si presionas la tecla "Enter", actúe como si hicieras clic en el botón OK
        ventana.getRootPane().setDefaultButton(botonOk);

        // Centramos la ventana en la pantalla y la hacemos visible
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        // Por último, enfocamos la atención en el botón para que podamos usar
        // la barra espaciadora inmediatamente sin tener que usar el ratón primero
        botonOk.requestFocusInWindow();
    }
}
