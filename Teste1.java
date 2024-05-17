import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String nome, ultimoSobrenome;
        String iniciais = "";
        System.out.print("Nome completo do colaborador: ");
        nome = kb.nextLine();
        ultimoSobrenome = nome.substring(nome.lastIndexOf(" ")+1);

        String[] split = nome.split(" ");
        for (int i = 0; i < split.length -1; i++) {
            String s = split[i];
            if (!Character.isLowerCase(s.charAt(0))) {
                iniciais += s.charAt(0) + ". ";
            }
        }
        System.out.println("Nome impresso no crachá: " + ultimoSobrenome.toUpperCase()+", "+iniciais);
    }
}