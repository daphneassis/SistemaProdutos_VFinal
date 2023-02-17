package pagamento;

import java.util.Scanner;

public class SelecionarOpcaoPagamentosClasseConcreta implements SelecionarOpcoesPagamentosInterface {

    private static Scanner sc = new Scanner(System.in);

    @Override
    public OpcaoDePagamento escolherOpcao(OpcaoDePagamento[] opcoesArray) {
        System.out.println("Qual a opção que deseja escolher? ");
        int opcao = sc.nextInt();
        System.out.print("pagamento selecionado: ");
        return opcoesArray[opcao];
    }
}


