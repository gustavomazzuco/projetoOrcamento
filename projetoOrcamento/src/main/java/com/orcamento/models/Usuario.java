package com.orcamento.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "USUARIOS")
@SequenceGenerator(name = "SEQ_USUARIO", allocationSize = 1, sequenceName = "SEQ_USUARIO")
public class Usuario implements Entidade {

    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(generator = "SEQ_USUARIO", strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "{Usuario.nome.NotNull}")
    @Column(name = "NOME_USUARIO", length = 50)
    private String nome;

    @NotNull(message = "{Usuario.login.NotNull}")
    @Column(name = "LOGIN", length = 20)
    private String usuario;

    @NotNull(message = "{Usuario.senha.NotNull}")
    @Column(name = "SENHA", length = 20)
    private String senha;

    @NotNull(message = "{Usuario.telefone.NotNull}")
    @Column(name = "TELEFONE", length = 20)
    private String telefone;

    @Email
    @NotNull(message = "{Usuario.email.NotNull}")
    @Column(name = "EMAIL", length = 120)
    private String email;

    @NotNull(message = "{Usuario.tipo.NotNull}")
    @Column(name = "TIPO_USUARIO", length = 20)
    private String tipo;

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
