/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trucoInt;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author kira
 */
public class Truco {
    
     private static Cartas vira;
     
     public static void main(String[] args){
         
           Cartas cartaJogador, cartaMaquina;
            Baralho novo = new Baralho();
            novo.geraBaralho();
            
            novo.distribuiCartas();
            //teste
            
            System.out.println("Vira:");
            vira = novo.sortearVira();
            System.out.print(vira.getNumero()+" - ");
            System.out.println(vira.getNaipe());
            
            novo.atribuirManilhas();
            
            novo.atribuirPesos(novo.cartasJogador);
            novo.atribuirPesos(novo.cartasMaquina);
            System.out.println("Cartas Jogador");
            novo.mostrarCartasJogador();
            
            System.out.println("Cartas Maquina");
            novo.mostrarCartasMaquina();
               
            
            cartaJogador = new Cartas(); 
            cartaJogador.setNumero(JOptionPane.showInputDialog("Digite o numero"));
            cartaJogador.setNaipe(JOptionPane.showInputDialog("Digite o naipe"));
            JOptionPane.showConfirmDialog(null, "teste", "Vai", 0);
            System.out.println("Carta jogador: "+cartaJogador.getNumero());
            System.out.println("Carta jogador: "+cartaJogador.getNaipe());

    
            
            
            
    }    
}
