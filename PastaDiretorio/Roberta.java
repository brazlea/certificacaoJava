package PastaDiretorio;



class Calculadora{

    public int calcula(int... numeros){

        int soma = 0;

        for (int i = 0; i < numeros.length; i++){

            soma += numeros[i];

        }
        return soma;

    }

}

public class Roberta {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        System.out.println(c.calcula(1,2));
        System.out.println(c.calcula(1,2,3,4,5,6,7,8,9));
        System.out.println(c.calcula(100,200,39999,5678));

    }
}
