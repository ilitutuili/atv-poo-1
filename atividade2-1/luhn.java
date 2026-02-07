import java.util.Scanner;

public class luhn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o número: ");
            String numero = sc.nextLine();

            numero = numero.replace(" ", "");

            if (numero.length() <= 1) {
                System.out.println("Número inválido");
                return;
            }

            int soma = 0;
            boolean dobrar = false;

            for (int i = numero.length() - 1; i >= 0; i--) {
                char c = numero.charAt(i);

                if (!Character.isDigit(c)) {
                    System.out.println("Número inválido");
                    return;
                }

                int n = c - '0';

                if (dobrar) {
                    n *= 2;
                    if (n > 9) n -= 9;
                }

                soma += n;
                dobrar = !dobrar;
            }

            if (soma % 10 == 0)
                System.out.println("Número válido");
            else
                System.out.println("Número inválido");

            sc.close();
        }
    }
}
