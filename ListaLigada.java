public class ListaLigada {
    No inicio;
    
    public void adicionaInicio(int d) {
        No novo = new No(d);
        novo.proximo = inicio;
        inicio = novo;
    }
    
    public No removeInicio() {
        No aux = null;
        if (!vazia()) {
            inicio = inicio.proximo;
        }
        return aux;
    }

    
    public No removeFim() {
        No aux = inicio;
        if (!vazia()){
            if (!(aux.proximo == null)){
                while (aux.proximo.proximo != null)
                    aux = aux.proximo;
            }
            aux.proximo = null
        } else {
            inicio = null;
            aux = null;
        } else {
            System.out.println ("Lista está vazia!");
        }
        return aux;
    }
        
    public No busca(int d) {
        No aux = null;
        // código para busca
        No busca = inicio;
        while (busca != null) {
            if (busca.dado == d) {
                aux = busca;
                break;
            }
            busca = busca.proximo;
        }
        return aux;
    }

    public No busca2(int d) {
        No aux = null;
        // código para busca
        No busca=inicio;
        for(; busca!=null && busca.dado!=d; busca=busca.proximo) {
        }
        aux = busca;
        return aux;
    }
    
    public boolean vazia() {
        return inicio == null;
    }
    
    public void adicionaFim(int d) {
        No aux = inicio;
        No novo = new No(d);
        if (vazia()) {
            adicionaInicio(d);
        } else  {
            while (aux.proximo != null ) { // loop para o fim da lista
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }
    
    public void imprimir() {
        if (!vazia()) {
            No aux = inicio;
            while (aux != null ) {
                System.out.print(aux.dado+" ");
                aux = aux.proximo;
            }
            System.out.println();
        } else {
            System.out.println("Lista Vazia!");
        }
    }
}