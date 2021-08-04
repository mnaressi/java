import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double temp, velo, lit, dist;

        System.out.println("Digite o tempo");
        temp = teclado.nextDouble();
        System.out.println("Digite a velocidade");
        velo = teclado.nextDouble();  

        dist=velo*temp;

        lit=dist/12 ;

        System.out.println("Combustivel gasto = "+ lit);

    }

}