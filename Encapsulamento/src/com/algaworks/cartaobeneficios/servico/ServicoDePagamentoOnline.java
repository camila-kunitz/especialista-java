package com.algaworks.cartaobeneficios.servico;

import com.algaworks.cartaobeneficios.Cartao;
import com.algaworks.cartaobeneficios.Estabelecimento;
import com.algaworks.cartaobeneficios.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor) {

        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
