package umc.devapp.crud_produto.entity;

import umc.devapp.crud_produto.entity.Produto;

import java.math.BigDecimal;

public class ProdutoAdapter {

    public static Produto adaptar(ProdutoExterno externo) {
        return Produto.builder()
                .cliente(externo.nomeCliente)
                .descricao(externo.infoProduto)
                .produto("Produto Adaptado")
                .preco(BigDecimal.valueOf(externo.precoUnitario))
                .quantidade(externo.quantidadeUnidades)
                .peso(0.0)
                .tamanho(0.0)
                .fornecedor("Fornecedor Desconhecido")
                .frete(BigDecimal.ZERO)
                .build();
    }
}
