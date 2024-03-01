public class ContaPagar {

    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isPago() {
        return pago;
    }

    public boolean isPendente() {
        return !isPago();
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public void pagar() {
        if (isPago()) {
            throw new RuntimeException("Conta já está paga!");
        }
        pago = true;
    }

    public void cancelarPagamento() {
        if (isPendente()) {
            throw new RuntimeException("Conta está pendente de pagamento");
        }

        pago = false;
    }
}
