public class Continhas {
    public static void main(String args[]){
        
        int a, b, c;

        a=23;
        b=4;

        c=a+b;
        System.out.println ("Valor da Soma = " + c);

        c=a-b;
        System.out.println ("Valor da Sub = " + c);

        c=a*b;
        System.out.println ("Valor da mult = " + c);

        c=a/b;
        System.out.println ("Valor da div = " + c);

        c=a%b;
        System.out.println ("Valor do resto = " + c);

        System.out.println ("CONTAS QUEBRADAS");

        float x, y, z;

        x=23;
        y=4;

        z=x/y;
        System.out.println ("Valor da div = " + z);

        x=23.0f;
        y=3.0f;

        z=x/y;
        System.out.println ("Valor da div = " + z);
        System.out.printf ("Valor da div com duas casas = %.2f", z);
        System.out.printf ("\nValor da div com tres casas = %.3f", z);
    }
}
