package estudos.q2;

import java.util.Scanner;

public class Metodos2 {
    Scanner scan = new Scanner(System.in);
    int[] numeros = new int [10];
    int soma = 0;

    public void lerNumeros(){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scan.nextInt();
        }
    }

    public void somar(){
        for(int j = 0; j < numeros.length; j ++){
            soma = soma + numeros[j];
        }

        System.out.print(soma);
    }
  
}
