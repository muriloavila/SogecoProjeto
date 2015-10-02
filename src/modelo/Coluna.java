/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 *
 * @author Murilo
 */
@Entity
@Table(name = "coluna")
public class Coluna implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_coluna", columnDefinition = "integer")
    private long id;
    @Column(name = "nome_coluna")
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "id_colecao")
    private Colecao colecao;
    @OneToMany(mappedBy = "coluna")
    private List<Item> itens;

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
     * @return the colecao
     */
    public Colecao getColecao() {
        return colecao;
    }

    /**
     * @param colecao the colecao to set
     */
    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }

    /**
     * @return the itens
     */
    public List<Item> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
