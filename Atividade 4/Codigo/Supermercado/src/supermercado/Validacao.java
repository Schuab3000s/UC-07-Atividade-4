package supermercado;

public class Validacao {

    public boolean validacao(ProdutoEntity produto) {

        return !produto.getNome().equals("");

    }
}
