package com.algaworks.cartaobeneficios.servico;

import com.algaworks.cartaobeneficios.Cartao;
import com.algaworks.cartaobeneficios.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
        }

}

