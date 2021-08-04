import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

 int hini, hfim, dur;

hini = teclado.nextInt();
hfim = teclado.nextInt();

if(hini == 0 && hfim == 0){
    System.out.println("O JOGO DUROU 24 HORA(S)");
}
else if(hfim > hini){
    dur=hfim-hini;
    System.out.printf("O JOGO DUROU %d HORA(S)",dur );
}
else {
    dur= 24 -(hini-hfim);
    System.out.printf("O JOGO DUROU %d HORA(S)",dur );
}

}
}