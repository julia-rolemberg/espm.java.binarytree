public class Main {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.inserir(6);
        arvore.inserir(4);
        arvore.inserir(8);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(9);

        //impressao em ordem
        System.out.println("impressao em ordem");
        arvore.emOrdem();

        System.out.println("Tamanho da árvore: "+ arvore.size()+"\n");

        System.out.println("impressao das folhas");
        arvore.imprimirFolhas();
    }
}
