package model;

import javax.swing.JOptionPane;

public class PilhaHeap {
    public NoPilha topo;
    public int cont;

    public PilhaHeap() {
        this.topo = null;
        this.cont = 0;
    }
    
    // Metodo que empilha dados na pilha heap
    public void push(Object dado){
        NoPilha newPilha = new NoPilha();
        
        // preencher atributos internos de dados
        newPilha.valor = dado;
        
        // configurar as variaveis de instancia d ligação
        if(topo == null){
            // se o anterior aponta para null o novo vai para o topo
            newPilha.ant = null;
        }else{
            // se o anterior estiver no topo o novo entrar no topo
            newPilha.ant = topo;
            
        }
        topo = newPilha;
    }
    
    public void pop(){
        // prevenção
        if(topo == null){
            JOptionPane.showMessageDialog(null, "A Pilha já esta vazia.");
            return;
        }
        
        NoPilha temp = topo;
        
        topo = temp.ant; // o novo topo será o anterior
        temp = null;
        cont --; // diminui os elementos empilhados
    }
    
    public void plotar(){
        // prevenção
        if (topo == null){
            return;
        }
        
        NoPilha temp = topo;
        String saida = "";
        
        while(temp != null){
            saida += temp.valor + "\n";
            temp = temp.ant; // muda o temp atual para o temp anterior
        }
        JOptionPane.showMessageDialog(null, saida);
    }
}