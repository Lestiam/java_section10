package Application.section90.ex2;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double vet[] = new double[n];

        for (int i=0; i<vet.length; i++){
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
        }
        double sum = 0.0;
        double avg = 0.0;

        System.out.print("Valores = ");

        for (int i=0; i< vet.length; i++){
            System.out.printf(" %.2f" , vet[i]);
            sum += vet[i];
            avg = sum / n;
        }

        System.out.printf("\nSoma = %.2f\n" , sum);
        System.out.printf("\nMédia = %.2f\n" , avg );

        sc.close();
    }
}
