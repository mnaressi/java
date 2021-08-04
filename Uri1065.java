import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

int num, par=0;

for(int cont=0;cont<5;cont++){
num = teclado.nextInt();
    if (num%2 == 0){
        par++;
    }
}
System.out.println(par+" valores pares");

}

}
