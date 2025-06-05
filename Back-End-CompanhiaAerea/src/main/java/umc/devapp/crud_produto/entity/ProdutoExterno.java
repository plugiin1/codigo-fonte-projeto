package umc.devapp.crud_produto.entity;

public class ProdutoExterno {
    public String nomeCliente;
    public String infoProduto;
    public double precoUnitario;
    public int quantidadeUnidades;

    // construtor para facilitar testes
    public ProdutoExterno(String nomeCliente, String infoProduto, double precoUnitario, int quantidadeUnidades) {
        this.nomeCliente = nomeCliente;
        this.infoProduto = infoProduto;
        this.precoUnitario = precoUnitario;
        this.quantidadeUnidades = quantidadeUnidades;
    }

    public ProdutoExterno() {}
}
