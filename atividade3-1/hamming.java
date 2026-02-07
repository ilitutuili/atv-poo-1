import java.util.Scanner;

public class hamming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Cálculo de Distância de Hamming ===");
        System.out.print("Digite a primeira sequência de DNA: ");
        String dna1 = scanner.nextLine().toUpperCase();
        
        System.out.print("Digite a segunda sequência de DNA: ");
        String dna2 = scanner.nextLine().toUpperCase();
        
        scanner.close();
        
        if (dna1.length() != dna2.length()) {
            System.out.println("Erro: As sequências devem ter o mesmo tamanho!");
            return;
        }

        int cont = 0;

        for (int i = 0; i < dna1.length(); i++) {
            if (dna1.charAt(i) != dna2.charAt(i)) {
                cont++;
            }
        }

        System.out.println("Distância de Hamming: " + cont);
    }
}
