package Application.section90.ex1;

import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vocÊ vai digitar? ");
        int n = sc.nextInt();
        if (n <= 10){
            int vect[] = new int[n];

            int i;
            for (i=0; i < vect.length; i++){
                System.out.print("Digite um número: ");
                vect[i] = sc.nextInt();
            }

            System.out.println("Números negativos: ");
            for (i = 0; i < vect.length; i++){
                if (vect[i] < 0)
                    System.out.println(vect[i]);
            }

        }
        else
            System.out.println("o array não pode ser maior que 10!");

        sc.close();
    }
}
