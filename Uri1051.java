import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

 Double sal, faixa1, faixa2, imptot, impfx1, impfx2;

sal = teclado.nextDouble();

if (sal <= 2000.00){
     System.out.printf("Isento\n");
 }
else if (sal >= 2000.01 && sal <= 3000.00){
     faixa1=sal-2000.00;
    imptot=faixa1*0.08;
    System.out.printf("R$ %.2f\n", imptot);
}
else if (sal >= 3000.01 && sal <= 4500.00){
    faixa2=sal-3000.00;
    faixa1=sal-2000.00;
 //   impfx1=faixa1*0.08;
    impfx2=faixa2*0.18;
 //   imptot=impfx1 + impfx2;
    System.out.printf("R$ %.6f\n", faixa1);
}
    }
 }