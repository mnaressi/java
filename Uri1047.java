import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

 int hini, mini, hfim, mfim, hdif, mdif, hdur, mdur, t1, t2;

hini = teclado.nextInt();
mini = teclado.nextInt();
hfim = teclado.nextInt();
mfim = teclado.nextInt();

t1=(hini*60)+mini;
t2=(hfim*60)+mfim;

mdif=t2-t1;

if (mdif <= 0){
    mdif=mdif + 24*60;
}
    hdur = mdif / 60;
    mdur = mdif % 60;

    System.out.println("O JOGO DUROU "+hdur+" HORA(S) E "+mdur+" MINUTO(S)");


/*if(mdur == 0){
    System.out.printf("O JOGO DUROU 24 HORA(S)");
}
else if (mdur == 60 || mdur == -60){
    System.out.printf("O JOGO DUROU 1 HORA(S) E 0 MINUTO(S)\n");
}
else if (mdur < 0){
    hdur=mdur + 24;
    System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n", hdur);
}
else if(mdur < 60){
    System.out.printf("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)\n", mdur);
}
else if (mdur > 0){ 
    hdif=mdur/60;
    mdif=mdur-(hdif*60);
    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hdif, mdif);
}*/

}
}