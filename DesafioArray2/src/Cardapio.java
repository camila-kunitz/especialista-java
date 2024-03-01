import java.util.Arrays;

public class Cardapio {

    ItemCardapio[] itens = new ItemCardapio[0];

    // TODO implementar inclusão de item do cardápio
    void adicionarItem(ItemCardapio item) {
        this.itens = Arrays.copyOf(this.itens, this.itens.length + 1);
        this.itens[itens.length - 1] = item;

    }


    // TODO implementar exclusão de item do cardápio da posição informada
    void removerItem(int indice) {
        ItemCardapio[] novosItens = new ItemCardapio[itens.length - 1];

        System.arraycopy(itens, 0, novosItens, 0, indice);
        System.arraycopy(itens, indice + 1,
                novosItens, indice, novosItens.length - indice);

        itens = novosItens;
    }


    // TODO implementar código para imprimir na console os itens
    //  do cardápio que estiverem entre o preço mínimo e máximo

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
                item.imprimir();
            }

    }
    }

}
