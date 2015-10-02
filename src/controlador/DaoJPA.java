/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Murilo
 */
public class DaoJPA {
    public static EntityManager getEM(){
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("SogecoProjetoPU");
        return fabrica.createEntityManager();
    }
}
