package estudos.q3;

import java.util.Scanner;

public class Metodos3 {

    Scanner scan = new Scanner(System.in);
    int[] vetor1 = new int[3];
    int[] vetor2 = new int[3];

    public void encherVetores(){

        for(int i = 0; i < vetor1.length; i++){

            System.out.println("Digite o " + (i+1) + "º número do vetor 1");
            vetor1[i] = scan.nextInt();

        }
        for(int i = 0; i < vetor2.length; i++){

            System.out.println("Digite o " + (i+1) + "º número do vetor 2");
            vetor2[i] = scan.nextInt();

        }
    }

    public int[] juntarVetores(){
        int[] vetorJunto = new int[vetor1.length + vetor2.length];

        System.arraycopy(vetor1, 0, vetorJunto, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetorJunto, vetor1.length, vetor2.length);

        return vetorJunto;
    }
    
}
