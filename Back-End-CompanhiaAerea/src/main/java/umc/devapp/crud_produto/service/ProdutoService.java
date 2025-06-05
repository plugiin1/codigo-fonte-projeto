package umc.devapp.crud_produto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umc.devapp.crud_produto.entity.Produto;
import umc.devapp.crud_produto.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> getAllProductsService() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> getProductService(Integer id){
        return produtoRepository.findById(id);
    }

    public Produto insertProductService(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deleteProductByIdService(Integer id){
        produtoRepository.deleteById(id);
    }

    public Produto updateProductService(Produto produto){
        Produto updatedProduct;
        updatedProduct = produto;
        return produtoRepository.save(updatedProduct);
    }

    public Produto salvarProduto(Produto produtoAdaptado) {
        return null;
    }
}
