package supermercado;

public class ProdutoController {

    Mensagem mensagem = new Mensagem();
    Validacao validar = new Validacao();

    public void salvarProduto(ProdutoEntity produto) {

        if (validar.validacao(produto)) {
            mensagem.enviarMensagem();

        } else {
            mensagem.enviarMensagemErro();

        }

    }

}