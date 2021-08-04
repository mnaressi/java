import java.util.Scanner;

public class Uri10638{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

 double cod, qtd, valor;

cod = teclado.nextDouble();
qtd = teclado.nextDouble();

if(cod == 1){
    valor=qtd*4;
    System.out.printf("Total: R$ %.2f\n", valor);
}
else if(cod == 2 ){
    valor=qtd*4.5;
    System.out.printf("Total: R$ %.2f\n", valor);
}
else if(cod == 3 ){
    valor=qtd*5;
    System.out.printf("Total: R$ %.2f\n", valor);
}
else if(cod == 4 ){
    valor=qtd*2;
    System.out.printf("Total: R$ %.2f\n", valor);
}
else if(cod == 5 ){
    valor=qtd*1.5;
    System.out.printf("Total: R$ %.2f\n", valor);
}


}
}