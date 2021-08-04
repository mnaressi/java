import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;
        
        double H, M, S;

        N = teclado.nextInt();

        H = N/3600;

        M = (N%3600)/60;
       
        S = (N%3600)%60;

        System.out.printf("%.0f:%.0f:%.0f\n", H, M, S);

    }

}