//Kevin Schuab
package supermercado;

public class Supermercado {

    Mensagem mensagem;

    public static void main(String[] args) {

        ProdutoEntity produto = new ProdutoEntity(1, "Refrigerante", 10.90);

        ProdutoController cp = new ProdutoController();

        cp.salvarProduto(produto);

    }

}
