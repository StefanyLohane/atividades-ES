package revisao.questao2;

import java.util.Scanner;

public class Calculo2 {
        Scanner scan = new Scanner(System.in);
        int[] vnum = new int[10];
        int num;
        int soma = 0;

        public void pegarNumeros(){
            for(int i = 0; i < 10; i++){
                num = scan.nextInt();
                vnum [i] = num;
            }
        }

        public  int soma(){
            for(int j=0; j<10; j++){
                soma = soma + vnum[j];

            }
            return soma;
        }
}
