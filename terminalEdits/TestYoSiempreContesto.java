public class TestYoSiempreContesto {
    public static void imprimirTexto(String texto, String colorLetra, long tiempoMostrarTexto,
                                     long tiempoEsperaFinal, boolean saltoDeLinea) {
        long tiempoPorLetra = tiempoMostrarTexto / texto.length();

        for (char c : texto.toCharArray()) {
            System.out.print(colorLetra + c);
            System.out.flush(); // Esto hace que las letras se muestren al momento y no por grupos

            // Se espera el tiempo hasta la letra siguiente
            try {
                Thread.sleep(tiempoPorLetra);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }

        if(saltoDeLinea) {
            System.out.println();
        }

        // Se espera el tiempo final luego de mostrar el texto completo
        try {
            Thread.sleep(tiempoEsperaFinal);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String letraStr = "Salvemos esto (muah) (quiero hacer demasiadas cosas)\n" +
                "(Sólo que a veces no sé por dónde empezar)\n" +
                "Que si se va, uh, lo sabes\n" +
                "Se nos olvida caminar\n" +
                "Si me muero\n" +
                "Ven a buscarme\n" +
                "Tan pronto tengas otro cuerpo\n" +
                "Y otra forma de mirarme";

        String[] letraArr = letraStr.split("\n");

        // Colores
        final String ROSA_CUARZO = "\u001B[38;2;217;185;163m";
        final String ROJO_NOCHE = "\u001B[38;2;153;0;0m";
        final String AZUL_PROFUNDO = "\u001B[38;2;0;153;153m";
        final String VERDE_OSCURO = "\u001B[38;2;164;198;57m";
        final String NARANJA_ATARDECER = "\u001B[38;2;255;179;71m";
        final String AMATISTA = "\u001B[38;2;157;80;187m";

        final String BOLD = "\u001B[1m"; // Esto vuelve el texto negrita
        final String BOLD_OFF = "\u001B[22m"; // Esto quita el texto negrita

        System.out.print("\033[H\033[2J"); // Esto borra la ruta del directorio y deja solo el nombre de la cancion en la terminal
        imprimirTexto("LATIN MAFIA - ", "", 100, 0, false);
        imprimirTexto("Yo siempre contesto.\n", BOLD + NARANJA_ATARDECER, 300, 0, true);

        imprimirTexto("Salvemos esto (muah) (quiero hacer demasiadas cosas)", BOLD_OFF + ROSA_CUARZO, 3000, 300, true);
        imprimirTexto("(Sólo que a veces no sé por dónde empezar)", ROSA_CUARZO, 1600, 400, true);
        imprimirTexto("Que si se va,", ROSA_CUARZO, 1500, 2500, false);
        imprimirTexto(" uh,", ROSA_CUARZO, 2000, 100, false);
        imprimirTexto(" lo sabes", ROSA_CUARZO, 1400, 2500, true);
        imprimirTexto("Se nos olvida caminar", ROSA_CUARZO, 3000, 5000, true);

        imprimirTexto("Si me ", ROSA_CUARZO, 927, 0, false);
        imprimirTexto("muero", ROJO_NOCHE, 773, 3600, true);

        imprimirTexto("Ven a ", ROSA_CUARZO, 814, 0, false);
        imprimirTexto("buscarme", AZUL_PROFUNDO, 1086, 2800, true);

        imprimirTexto("Tan pronto tengas otro ", ROSA_CUARZO, 2141, 0, false);
        imprimirTexto("cuerpo", VERDE_OSCURO, 559, 2800, true);

        imprimirTexto("Y otra forma de ", ROSA_CUARZO, 1948, 0, false);
        imprimirTexto("mirarme", AMATISTA, 852, 5000, true);
    }
}
