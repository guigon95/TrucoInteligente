/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trucoInt;

/**
 *
 * @author kira
 */
public class Cartas {
    
    private int valor; //Valor de compargação das cartas
    private String numero; //Numeração da carta
    private String naipe; //Naipe das cartas
    /**
     * @return the valor
     */
 
    public int getValor() {
        return valor;
    }
    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }
    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * @return the naipe
     */
    public String getNaipe() {
        return naipe;
    }
    /**
     * @param naipe the naipe to set
     */
    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
}
