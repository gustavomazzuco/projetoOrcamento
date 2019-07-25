package com.orcamento.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table( name = "ORCAMENTOS")
@SequenceGenerator(name = "SEQ_ORCAMENTO", allocationSize = 1, sequenceName = "SEQ_ORCAMENTO")
public class Orcamento implements Entidade {

    @Id
    @Column(name = "ID_ORCAMENTO")
    @GeneratedValue(generator = "SEQ_ORCAMENTO", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "ID_USUARIO",
            foreignKey =
            @ForeignKey(name = "FK_ORCAMENTO_USUARIO",
                    value = ConstraintMode.CONSTRAINT))
    private Usuario usuario;

    @ManyToOne()
    @JoinColumn(name = "ID_PRODUTO",
            foreignKey =
            @ForeignKey(name = "FK_ORCAMENTO_PRODUTO",
                    value = ConstraintMode.CONSTRAINT))
    private Produto produto;

    @NotNull
    @Column(name = "VL_PRODUTO", precision = 15, scale = 5)
    private BigDecimal valor;


    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
