import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, hora;
        double valor, sal;

        cod = teclado.nextInt();
        hora = teclado.nextInt();    
        valor = teclado.nextDouble();
      
        sal=valor*hora;

       System.out.println("NUMBER = "+cod);
       System.out.printf("SALARY = U$ %.2f",sal);

    }

}