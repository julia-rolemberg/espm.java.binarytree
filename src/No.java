public class No {

    //atributos
    int info;
    No esq;
    No dir;

    //construtor
    public No(int info) {
        this.info = info;
        esq = null;
        dir = null;
    }

    public void inserirNo(int valor) {
        if(valor > info) {
            if(dir == null) {
                dir = new No(valor);
            }else {
                dir.inserirNo(valor);
            }
        }else {
            if(esq == null) {
                esq = new No(valor);
            }else {
                esq.inserirNo(valor);
            }
        }
    }


}
