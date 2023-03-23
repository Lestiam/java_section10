package Application.section103;

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your matriz size");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] mat = new int [m][n];

        System.out.println("Enter numbers: ");
        for (int i = 0; i< mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat [i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Enter a number to search: ");
        int x = sc.nextInt();

        System.out.println("A posição do número e seus valores à esquerda, acima, à direita e abaixo são: ");

        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
