import java.util.Scanner;

public class Leitura {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double valorInt;
        double valorDou;
        float valorFloat;

        System.out.println("Digite um valor inteiro");
        valorInt = teclado.nextInt();
        System.out.println("Digite um valor double");
        valorDou = teclado.nextDouble();

        System.out.println("Valor digitado = "+valorInt);
        System.out.println("Valor digitado = "+valorDou);
    }

}