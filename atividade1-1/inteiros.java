import java.util.Scanner;

public class inteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, qtd = 0, soma = 0;
        int maior = 0, menor = 0;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num != -1) {
            maior = num;
            menor = num;

            while (num != -1) {
                soma += num;
                qtd++;

                if (num > maior) maior = num;
                if (num < menor) menor = num;

                System.out.print("Digite um número: ");
                num = sc.nextInt();
            }

            System.out.println("Quantidade: " + qtd);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Média: " + (double) soma / qtd);
        }

        sc.close();
    }
}
