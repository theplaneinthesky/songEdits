public class TestCf {

    public static void imprimirTexto(String texto, String colorLetra, long tiempoEsperaTexto,
                                     long tiempoEsperaFinal, boolean saltoDeLinea, boolean limpiarLinea,
                                     boolean moverCursor) {
        long tiempoPorLetra = tiempoEsperaTexto / texto.length();

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

        // Esto es para borrar la linea actual, puede ayudar a hacer efectos
        if(limpiarLinea) {
            System.out.print("\033[2K");
            System.out.flush();
        }

        // Esto es para mover el cursor al inicio de la linea actual, sirve para sobrescribir el texto
        if(moverCursor) {
            System.out.print("\r");
        }
    }

    public static void main(String[] args) {

        final String NARANJA_VIVIDO = "\u001B[38;5;208m"; // Color del titulo
        final String NARANJA_CLARO = "\u001B[38;5;215m"; // Color del texto
        final String ROJO_VIVIDO = "\u001B[38;5;196m"; // Color
        final String BOLD = "\u001B[1m"; // Esto vuelve el texto negrita
        final String BOLD_OFF = "\u001B[22m"; // Esto quita el texto negrita

        System.out.print("\033[H\033[2J"); // Esto borra la ruta del directorio y deja solo el nombre del programa en la terminal
        imprimirTexto("Nsqk - ", BOLD_OFF, 50, 300, false, false, false);
        imprimirTexto("Cienciaficción\n", BOLD_OFF + NARANJA_VIVIDO, 50, 2800, true, false, false);

        imprimirTexto("¿Cómo te sientes estos meses que no estoy allá contigo?", BOLD_OFF + NARANJA_CLARO, 3500, 2000, true, false, false);
        imprimirTexto("Y tú no entiendes por qué me fui, no importa cuánto te lo explico", NARANJA_CLARO, 3500, 1800, true, false, false);
        imprimirTexto("Si no me iba, no creo que seguiríamos juntos, entiende", NARANJA_CLARO, 3500, 2200, true, false, false);
        imprimirTexto("Que me voy de tu lao, la verdad, porque no quiero perderte", NARANJA_CLARO, 3000, 2000, true, false, false);
        imprimirTexto("Y sé que sientes tú lo mismo que yo", NARANJA_CLARO, 3000, 2400, true, false, false);

        imprimirTexto("Desde ese ", NARANJA_CLARO, 937, 0, false, false, false);
        imprimirTexto("atardecer ", BOLD + ROJO_VIVIDO, 846, 0, false, false, false);
        imprimirTexto("en Nueva York", BOLD_OFF + NARANJA_CLARO, 1217, 1800, true, false, false);

        imprimirTexto("No funciona de lejos, no funciona de cerca", NARANJA_CLARO, 2200, 600, true, false, false);
        imprimirTexto("Dime, ¿cómo le hacemos?", NARANJA_CLARO, 1200, 1600, true, false, false);
        imprimirTexto("Ey, ", NARANJA_CLARO, 200, 500, false, false, false);
        imprimirTexto("ey", NARANJA_CLARO, 100, 600, true, true, false);

        imprimirTexto("Ciencia ficción ", NARANJA_CLARO, 800, 500, false, false, false);
        imprimirTexto("que tú y yo duremos...", NARANJA_CLARO, 1400, 5000, true, false, false);

    }
}