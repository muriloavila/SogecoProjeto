/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author Murilo
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item", columnDefinition = "integer")
    private long id;
    @Column(name = "nome_item")
    private String valor;
    @ManyToOne
    @JoinColumn(name = "id_coluna")
    private Coluna coluna;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the coluna
     */
    public Coluna getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(Coluna coluna) {
        this.coluna = coluna;
    }
}
