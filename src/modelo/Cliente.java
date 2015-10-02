package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", unique = true, columnDefinition = "integer")
    private long id;
    @Column(name = "nome_cliente", nullable = false, length = 200)
    private String nome;
    @Column(name="login_cliente", nullable = false, length = 50)
    private String login;
    @Column(name = "senha_cliente", nullable=false)
    private String senha;
    @Column(name = "email_cliente", nullable = false, length = 200)
    private String email;
    @OneToMany(mappedBy = "cliente")
    private List<Colecao> colecoes;

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
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the colecoes
     */
    public List<Colecao> getColecoes() {
        return colecoes;
    }

    /**
     * @param colecoes the colecoes to set
     */
    public void setColecoes(List<Colecao> colecoes) {
        this.colecoes = colecoes;
    }
}
