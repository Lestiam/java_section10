package Application.section96;

public class LacoForEach {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i =0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("-----------------------------------------");

        for (String obj : vect){//se lê: para cada objeto "obj" contido no vetor vect, faça:
            System.out.println(obj);//chamar obj nesse for, tem o mesmo efeito de chamar o vect[i] (vect na posição i) no for normal
        }
    }
}
