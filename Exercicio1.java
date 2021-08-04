import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

      System.out.println("Exercicio A");
        double la,lb, A;
        System.out.println("Digite o lado A");
        la = teclado.nextDouble();
        System.out.println("Digite o lado B");
        lb = teclado.nextDouble();
        A=la*lb;
        System.out.println("Area do quadrado = "+A);

        System.out.println("Exercicio C");
        double b,a;
        System.out.println("Digite a base");
        b = teclado.nextDouble();
        System.out.println("Digite a altura");
        a = teclado.nextDouble();
        A=(b*a)/2;
        System.out.println("Area do Triangulo = "+A);

        System.out.println("Exercicio E");
        double bma, bme, alt;
        System.out.println("Digite a base maior");
        bma = teclado.nextDouble();
        System.out.println("Digite a base menor");
        bme = teclado.nextDouble();
        System.out.println("Digite a altura");
        alt = teclado.nextDouble();
        A=(bme+bma)*alt/2;
        System.out.println("Area do Trapezio = "+A);
    
    }

        

    }
    
