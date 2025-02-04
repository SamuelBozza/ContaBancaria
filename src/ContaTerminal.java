import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma mensagem:");
        String lendo = ler.nextLine();

        System.out.println(lendo);
    }
}
