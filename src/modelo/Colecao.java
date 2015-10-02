/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
/**
 *
 * @author Murilo
 */
@Entity
@Table(name = "colecao")
public class Colecao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_colecao", columnDefinition = "integer")
    private long id;
    @Column(name = "nome_colecao")
    private String nome;
    @Column(name = "categoria_colecao")
    private String categoria;
    @Column(name = "nColuna_colecao")
    private int numeroColunas;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @OneToMany(mappedBy = "colecao")
    private List<Coluna> colunas;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the colunas
     */
    public List<Coluna> getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(List<Coluna> colunas) {
        this.colunas = colunas;
    }

    /**
     * @return the numeroColunas
     */
    public int getNumeroColunas() {
        return numeroColunas;
    }

    /**
     * @param numeroColunas the numeroColunas to set
     */
    public void setNumeroColunas(int numeroColunas) {
        this.numeroColunas = numeroColunas;
    }
}
