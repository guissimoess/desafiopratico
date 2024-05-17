import java.util.ArrayList;
import java.util.List;

public class Teste2 {
    public static void main(String[] args) {
        String frase = "Ana, 89,78, Maria, 45.8, 27, 56, Paula Pereira, 978, A, VIVA, 35, 125, 8999";
        String [] partes = frase.split(", ");

        List<Double> numeros = new ArrayList<>();
        List<String> palavras = new ArrayList<>();

        for (String parte : partes) {
            try {
                double numero = Double.parseDouble(parte);
                numeros.add(numero);
            } catch (NumberFormatException e ) {
                palavras.add(parte);
            }
        }

        System.out.print("Números: ");
        for (Double numero: numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.print("Palavras: ");
        for (String palavra: palavras) {
            System.out.print(palavra + " ");
        }

    }
}