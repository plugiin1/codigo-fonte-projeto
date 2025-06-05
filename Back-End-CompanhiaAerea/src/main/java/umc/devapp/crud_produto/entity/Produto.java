package umc.devapp.crud_produto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "cliente", nullable = false)
    private String cliente;

    @Column(name = "produto", nullable = false)
    private String produto;

    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    @Column(name = "peso")
    private double peso;

    @Column(name = "tamanho")
    private double tamanho;

    @Column(name = "fornecedor")
    private String fornecedor;

    @Column(name = "frete")
    private BigDecimal frete;
}
