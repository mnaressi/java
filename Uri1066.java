import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

int num, par=0, imp=0, pos=0, neg=0;

for(int cont=0;cont<5;cont++){
num = teclado.nextInt();
    if (num%2 == 0){
        par++;
    }
    else imp++;
    if (num > 0){
        pos++;
    }  
    else if (num < 0){
    neg++;
    }  
}
System.out.println(par+" valor(es) par(es)");
System.out.println(imp+" valor(es) impar(es)");
System.out.println(pos+" valor(es) positivo(s)");
System.out.println(neg+" valor(es) negativo(s)");

}

}
