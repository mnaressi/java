import java.util.Scanner;

public class Exercicio3 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double Sal, kw, cemkw, pago, desc;

        System.out.println("Digite o Salario");
        Sal = teclado.nextDouble();
        System.out.println("Digite o KW");
        kw = teclado.nextDouble();     

        cemkw=(Sal/7)/100;

        pago=kw*cemkw;

        desc=pago-((pago*10)/100);

        System.out.println("Valor KW"+cemkw);
        System.out.println("Valor pago"+pago);
        System.out.println("Valor com desc"+desc);



    }
}