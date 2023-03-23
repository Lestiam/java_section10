package Application.section90.ultimoExercicio;

import Application.section90.ultimoExercicio.entities.DadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        DadosPessoas[] vet = new DadosPessoas[n];
        double menorAltura = Integer.MAX_VALUE; //seto o menor altura com o maior valor
        double maiorAltura = Integer.MIN_VALUE; //seto o maior valor com o menor valor
        double altura = 0.0;

        for (int i =0; i<vet.length; i++){
            System.out.print("Altura da " + (i+1) + "ª pessoa: ");
            altura = sc.nextDouble();
            System.out.print("Gênero da " + (i+1) + "ª pessoa: ");
            char genero = sc.next().toUpperCase().charAt(0);
            vet[i] = new DadosPessoas(altura, genero);
        }

        double mulher = 0.0;
        double somaAltura = 0.0;
        int homem = 0;

        for (int i =0; i< vet.length; i++) {
            if (vet[i].getAltura() < menorAltura)//valido se o que foi digitado é menor que o mínimo
                menorAltura = vet[i].getAltura(); //mínimo recebe oq foi digitado

            if(vet[i].getAltura() > maiorAltura)//valido se o que foi digitado é maior que o máximo
                maiorAltura = vet[i].getAltura();//máximo recebe oq foi digitado

            if(vet[i].getGenero() == 'F') {
                mulher++;
                somaAltura += vet[i].getAltura();
            }
            else
                homem ++;
        }

        double media = somaAltura / mulher;
        System.out.printf("Menor altura = %.2f%n ", menorAltura);
        System.out.printf("Maior altura = %.2f%n ", maiorAltura);
        System.out.printf("Média das alturas das mulheres =  %.2f%n" , media);
        System.out.println("Numero de homens = " + homem);

    }
}
