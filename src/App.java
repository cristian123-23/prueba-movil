import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Convertir el nombre a minúsculas para contar las vocales sin importar mayúsculas o minúsculas
        nombre = nombre.toLowerCase();

        char[] nombreArray = nombre.toCharArray();
        int contadorVocales = 0;

        for (char letra : nombreArray) {
            if (esVocal(letra)) {
                contadorVocales++;
            }
        }

        System.out.println("Tu nombre tiene " + contadorVocales + " vocal(es).");

        scanner.close();
    }

    public static boolean esVocal(char letra) {
        return "aeiou".contains(String.valueOf(letra));
    }
}
