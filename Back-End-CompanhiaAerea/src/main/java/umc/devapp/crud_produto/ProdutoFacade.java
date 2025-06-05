package umc.devapp.crud_produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import umc.devapp.crud_produto.entity.Produto;
import umc.devapp.crud_produto.repository.ProdutoRepository;

@Component
public class ProdutoFacade {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criarProduto(Produto produto) {
        SingletonLoggerService.getInstance().log("Salvando produto...");
        return produtoRepository.save(produto);
    }

    public Produto buscarProduto(int id) {
        SingletonLoggerService.getInstance().log("Buscando produto...");
        return produtoRepository.findById(id).orElse(null);
    }

    public void deletarProduto(int id) {
        SingletonLoggerService.getInstance().log("Deletando produto...");
        produtoRepository.deleteById(id);
    }
}
