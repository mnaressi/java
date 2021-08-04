import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, cem, cinq, vin, dez, cin, dois, um, resto;

        N = teclado.nextInt();
        System.out.println(N);
        cem=N/100;
        System.out.println(cem+" nota(s) de R$ 100,00");
        resto=N%100;
        cinq=resto/50;
        System.out.println(cinq+" nota(s) de R$ 50,00");
        resto=resto%50;
        vin=resto/20;
        System.out.println(vin+" nota(s) de R$ 20,00");
        resto=resto%20;
        dez=resto/10;
        System.out.println(dez+" nota(s) de R$ 10,00");
        resto=resto%10;
        cin=resto/5;
        System.out.println(cin+" nota(s) de R$ 5,00");
        resto=resto%5;
        dois=resto/2;
        System.out.println(dois+" nota(s) de R$ 2,00");
        resto=resto%2;
        um=resto/1;
        System.out.println(um+" nota(s) de R$ 1,00");

    }

}