import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CadastrarConta{
    Conta[] contas = new Conta[3];
    int totalElementos = 0;

    public void adicionarConta(Conta conta){

        contas[totalElementos] = conta;
        totalElementos++;

        //OU
        //for (int i  = 0; i < contas.length; i++){
          //  if (contas[i] == null) {
            //    contas[i] = conta;
              //  break;
                
            //}
        //}
    }

    public void listarContas(){
        System.out.println((Arrays.toString(contas)));

    }

    public Conta procurarConta (String nome){
        for(int i = 0; i < totalElementos; i++){
            if (contas[i].getNome().equals(nome)) {
                return contas[i];
                
            }
        }
        return null;
    }

}
