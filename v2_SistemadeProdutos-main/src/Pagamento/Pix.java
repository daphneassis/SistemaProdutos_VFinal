package pagamento;

import Produtos.ProdutoAbstrato;
import carrinhoDeCompras.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Pix implements OpcaoDePagamento {

    protected List<ProdutoAbstrato> listaProdutosCarrinho = new ArrayList<>();

    private CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    @Override
    public void pagar() {
        if (analiseAntiFraude()==true) {
            System.out.println("pagamento via Pix aprovado!");
        } else {
            System.out.println("Forma de pagamento não aceita para esse valor");
        }
    }

    @Override
    public boolean analiseAntiFraude() {
        if (carrinhoDeCompras.precoCarrinhoParaPgto()>= 1000) {
            return false;
        } else {
            return true;
        }
    }

}
