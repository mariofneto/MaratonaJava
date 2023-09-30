package maratonajava.introducao.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(10 - 10);
    }
    public void multiplicaDoisNumeros(int a, int b){
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double a, double b){
        if(b == 0){
            return 0;
        }
        return a/b;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println(num1 + " && " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println(soma);
    }
}
