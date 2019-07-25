package com.orcamento.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "PRODUTOS")
@SequenceGenerator(name = "SEQ_PRODUTO", allocationSize = 1, sequenceName = "SEQ_PRODUTO")
public class Produto implements Entidade {

    @Id
    @Column(name = "ID_PRODUTO")
    @GeneratedValue(generator = "SEQ_PRODUTO", strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "{Produto.nome.NotNull}")
    @Column(name = "NOME_PRODUTO", length = 120)
    private String nome;

    @NotNull(message = "{Produto.descricao.NotNull}")
    @Column(name = "DESCRICAO_PRODUTO", length = 150)
    private String descricao;

    @NotNull(message = "{Produto.nome.NotNull}")
    @Column(name = "DT_INICIO_ORCAMENTO")
    private Date inicioOrcamento;

    @Column(name = "DT_FIM_ORCAMENTO")
    private Date fimOrcamento;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getInicioOrcamento() {
        return inicioOrcamento;
    }

    public void setInicioOrcamento(Date inicioOrcamento) {
        this.inicioOrcamento = inicioOrcamento;
    }

    public Date getFimOrcamento() {
        return fimOrcamento;
    }

    public void setFimOrcamento(Date fimOrcamento) {
        this.fimOrcamento = fimOrcamento;
    }
}
