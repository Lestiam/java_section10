package Application.section102;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o tamanho da matriz que você deseja criar? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int negativos = 0;
        System.out.println("Digite os elementos da sua matriz: ");

        //basicamente faz um for pra percorrer as linhas e depois um outro for para percorrer as colunas,
        //aí ele vai andando gradualmente elemento por elemento
        for (int i = 0; i < mat.length; i++){ //o primeiro for percorre as linhas
            for (int j = 0; j < mat[i].length; j++){ //para cada linha, eu vou ter um outro for percorrendo as colunas
                mat [i][j] = sc.nextInt(); //no for mais interno eu falo que o mat, linha i, coluna j, vai receber as variaveis
                //ele vai ler primeiro a linha 0 do I, aí vai pro J e preenche o número de colunas necessários, quando o j < n
                //der "false", ele pula fora do J e volta pra variável I para ir para a próxima linha e aí sim, voltar ao
                //J para preencher as colunas, e assim por diante
                if (mat[i][j] < 0)
                    negativos ++;
            }
        }

        System.out.println("Sua matriz ficou da seguinte forma: ");
        for (int i = 0; i < mat.length; i++){ //para imprimir a matriz de forma "bonita"
            for (int j = 0; j < mat[i].length; j++){ //mat[i].length é a mesma coisa que a quantidade de colunas da matriz...
                System.out.print(mat [i][j] + "  "); //... é o tamanho do vetor correspondente àquela linha
            }
            System.out.println();
        }

        System.out.println("Sua diagonal principal é: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat [i][i] + " "); //imprime a diagonal principal,
            // que é quando a linha e a coluna ficam na mesma posição do vetor
        }
        System.out.println();
        System.out.println("Números negativos: " + negativos);

        sc.close();
    }
}
