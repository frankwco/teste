/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo;

/**
 *
 * @author Frank
 */
public class AulaPOO {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente c=new Cliente();
       c.alterarLimite(-300.);
       c.alterarLimite(500., 0.);
       
       
        System.out.println(c.getValorLimite());
    }      

}