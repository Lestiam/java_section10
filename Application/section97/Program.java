package Application.section97;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); //para instanciar um tipo que é uma interface, preciso instanciar uma classe que implementa esta interface

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");//sobrecarga, indico a posição que quero adicionar e depois o que eu quero adicionar

        System.out.println(list.size());//mostra o tamanho da lista


        for (String x : list){ //par cada String x pertencente a minha lista "list"... eu vou mandar imprimir na tela o valor de x
            System.out.println(x);
        }

        System.out.println("---------------------------------------");

        //list.remove("Anna");//remove o dado à partir da comparação do valor dele com outro
        //list.remove(1);//remove o cara da posição 1 (Alex)

        list.removeIf(x -> x.charAt(0) == 'M');//remove elementos que atendam a um PREDICADO (retorna verdadeiro ou falso), neste caso, remove todo o String x, tal que x na posição 0 equivala a M

        for (String x : list){ //par cada String x pertencente a minha lista "list"... eu vou mandar imprimir na tela o valor de x
            System.out.println(x);
        }

        System.out.println("---------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //encontra a posição do Bob
        System.out.println("Index of Bob: " + list.indexOf("Marco"));//quando o indexOf não encontra o elemento, ele retorna -1

        System.out.println("---------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //o filter vai me devolver um stream filtrado conforme o predicado: Me devolva todos que a primeira letra começa com 'A'
        //porém, o stream não é compatível com o tipo Lista, então tenho que converte-lo usando o collect para lista novamente
        //Então primeiro eu converto para tipo stream, faço a operação que eu quero e depois converto ele para lista novamente

        for (String x : result){ //imprime a lista result
            System.out.println(x);
        }

        System.out.println("---------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //o findFirst pega o primeiro elemento desse stream e se esse elemento não existir, ele vai me retornar nulo
        System.out.println(name);
        String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse("desgraça");
        System.out.println(name2);
    }
}
