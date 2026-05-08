import java.util.Scanner;

public class R9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mes;

        System.out.println("Digite o número do mês: ");
        mes = scan.nextInt();

        if(mes==1){
            System.out.println("O mês é JANEIRO!");
        }
        
        if(mes==2){
            System.out.println("O mês é FEVREIRO!");
        }
        
        if(mes==3){
            System.out.println("O mês é MARÇO!");
        }

        if(mes==4){
            System.out.println("O mês é ABRIL!");
        }

        if(mes==5){
            System.out.println("O mês é MAIO!");
        }

        if(mes==6){
            System.out.println("O mês é JUNHO!");
        }

        if(mes==7){
            System.out.println("O mês é JULHO!");
        }

        if(mes==8){
            System.out.println("O mês é AGOSTO!");
        }

        if(mes==9){
            System.out.println("O mês é SETEMBRO!");
        }

        if(mes==10){
            System.out.println("O mês é OUTUBRO!");
        }

        if(mes==11){
            System.out.println("O mês é NOVEMBRO!");
        }

        if(mes==12){
            System.out.println("O mês é DEZEMBRO!");
        }

        else{
            System.out.println("MÊS INVÁLIDO!");
        }
    }
    
}
