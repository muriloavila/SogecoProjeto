/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import controlador.DaoJPA;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author Murilo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long col = Long.parseLong(sc.nextLine());
        EntityManager em = DaoJPA.getEM();

        Colecao colec = new Colecao();

        try {
            colec = em.find(Colecao.class, col);
            System.out.println("Coleção: " + colec.getNome() + "\n");
            System.out.println("Cliente: " + colec.getCliente().getNome() + "\n");
            System.out.println("Colunas: ");
            for(Coluna colu: colec.getColunas()){
                System.out.println(colu.getNome() + "\n");
                for(Item item: colu.getItens()){
                    System.out.println("\t-"+item.getValor()+"\n");
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}
