package Application.section90.exPensionato;

import Application.section90.exPensionato.entities.Pensao;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int rent = sc.nextInt();
        Pensao[] vet = new Pensao[rent];
        sc.nextLine();

        for (int i = 0; i < vet.length; i++){
            System.out.print("Rent #" + (i+1)+ ":");
            System.out.print("\nName: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            vet[i] = new Pensao(rent,name, email, room);
        }

        for (int i = 0; i < vet.length - 1; i++){
            for (int j = 0; j < vet.length - i - 1; j++){
                if (vet[j].getRoom() > vet[j + 1].getRoom()) {
                    Pensao temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                }
            }
        }

        System.out.println("Busy rooms: ");
        for (Pensao pensao : vet ){
            if (pensao != null)
                System.out.println(pensao);
        }

        sc.close();
    }
}