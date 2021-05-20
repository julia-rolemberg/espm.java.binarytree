public class Arvore {
    private No raiz;


    //inserir um elemento na árvore. útiliza um método auxiliar recursivo
    public void inserir(int valor) {

        if(raiz == null) {
            raiz = new No(valor);
        }else {
            raiz.inserirNo(valor);
        }
    }

    //executa o percurso em ordem
    public void emOrdem() {
        emOrdem_aux(raiz); //faço isso pq a raiz é privada
    }
    private void emOrdem_aux(No raiz) {
        if(raiz == null) {
            return;
        }

        emOrdem_aux(raiz.esq);
        System.out.print(raiz.info+"\t");
        emOrdem_aux(raiz.dir);

    }

    public void preOrdem() {
        preOrdem_aux(raiz); //faço isso pq a raiz é privada
    }
    private void preOrdem_aux(No raiz) {
        if(raiz == null) {
            return;
        }
        System.out.print(raiz.info+"\t");
        preOrdem_aux(raiz.esq);
        preOrdem_aux(raiz.dir);

    }

    public void posOrdem() {
        posOrdem_aux(raiz); //faço isso pq a raiz é privada
    }
    private void posOrdem_aux(No raiz) {
        if(raiz == null) {
            return;
        }
        posOrdem_aux(raiz.esq);
        posOrdem_aux(raiz.dir);
        System.out.print(raiz.info+"\t");


    }
}
