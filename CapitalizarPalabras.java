public class CapitalizarPalabras {

    public static String capitalizarPalabra(String palabra) {
        return palabra.substring(0, 1).toLowerCase() + palabra.substring(1).toUpperCase();
    }

    public static String capitalizarFrase(String frase) {
        String[] palabras = frase.split(" ");
        StringBuilder fraseCapitalizada = new StringBuilder();

        for (String palabra : palabras) {
            fraseCapitalizada.append(capitalizarPalabra(palabra) + " ");
        }

        return fraseCapitalizada.toString().trim();
    }

    public static void main(String[] args) {
        String fraseOriginal = "Hola Mundo";
        String fraseCapitalizada = capitalizarFrase(fraseOriginal);

        System.out.println("Frase original: " + fraseOriginal);
        System.out.println("Frase con minusculas iniciales: " + fraseCapitalizada);
    }
}