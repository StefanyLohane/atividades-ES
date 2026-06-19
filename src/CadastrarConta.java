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
    public void adicionarPosicao(Conta conta, int posicao){
        for(int cont = totalElementos-1; cont>=posicao; cont--){ //cont inicia na primeira posição vazia; enquanto cont estiver perto ou sendo a posição...;diminui de cont para chegar
            contas[cont+1] = contas[cont]; // lugar q vai copiar o que tá no segundo lugar (ABCC)
        }
        contas[posicao] = conta; //substitui o valor que quero na posição q eu quero
        totalElementos++;
    }

    public void removerPosicao(Conta conta, int posicao){
        for(int cont = totalElementos-1; cont>=posicao; cont--){
            
        }


    }


    }

