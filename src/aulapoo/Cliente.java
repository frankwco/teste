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
public class Cliente {
    
    private Double valorLimite=0.;
    
    public void alterarLimite(Double valor){
        valorLimite+=valor;
    }
    public void alterarLimite(Double valorCredito, Double valorDebito){
        valorLimite+=valorCredito;
        valorLimite-=valorDebito;
    }

    public Double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(Double valorLimite) {
        this.valorLimite = valorLimite;
    }
    
    
    
    
}
