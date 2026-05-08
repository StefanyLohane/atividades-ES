package lista1;

public class R4 {
    public static void main(String[] args) {
        int somaI = 0;
        int multP = 1;
        int i = 0;

        while(i<=30){
            if(i%2 == 0){
                multP = multP * i;
                i = i+ 1;
            }
            else if(i%2 == 1){
                somaI = somaI + i;
                i = i+1;
            }
        }

        System.out.println("A soma de todos os ímpares é: "+ somaI +" E a multiplicação dos pares é: "+ multP);

    }
    
}
