package Application.section90.ex3;

import Application.section90.ex3.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoas vet[] = new Pessoas[n];
        double media = 0.0;
        int menor16 = 0;


        for (int i =0; i < vet.length; i++){
            System.out.println("Dados da " + (i+1) + "ª pessoa");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            vet[i] = new Pessoas(nome,idade,altura);
            media += vet[i].getAltura() / n;
            if (vet[i].getIdade() < 16)
                menor16 ++;
        }

            double porcento = menor16 * 100.0 / n;//calculo de porcentagem(quantos % o numero de pessoas menor de 16 anos é do total de pessoas(n))
        System.out.printf("\nAltura média: %.2f%n" , media);//%n depois do %.2f é para saltar uma linha após
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , porcento);//dois % juntos imprime um "%" no final e %n pula uma linha após

        System.out.println("Nome das pessoas com menos de 16 anos: ");
        for (int i =0; i< vet.length; i++){
            if (vet[i].getIdade() < 16)
                System.out.println(vet[i].getNome());
        }
        sc.close();
    }
}
