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
     Jogo jogo;
     
     public void truco(){
         
            Cartas cartaJogador, cartaMaquina;
            Baralho novo = new Baralho();
            novo.geraBaralho();
            
            novo.distribuiCartas();
            
            System.out.println("Vira:");
            vira = novo.sortearVira();
            System.out.print(vira.getNumero()+" - ");
            System.out.println(vira.getNaipe());
            
            novo.atribuirManilhas();
            
            novo.atribuirPesos(novo.cartasJogador);
            novo.atribuirPesos(novo.cartasMaquina);
            System.out.println("Cartas Jogador");
            novo.mostrarCartasJogador();
            
            jogo = new Jogo();
            jogo.mostrarCartas(novo.cartasJogador);
            
            System.out.println("Cartas Maquina");
            novo.mostrarCartasMaquina();
               
            
           // cartaJogador = new Cartas(); 
            Object[] options = {novo.cartasJogador.get(0).getNumero()+" "+novo.cartasJogador.get(0).getNaipe(),
                    novo.cartasJogador.get(1).getNumero()+" "+novo.cartasJogador.get(1).getNaipe(),
                    novo.cartasJogador.get(2).getNumero()+" "+novo.cartasJogador.get(2).getNaipe()};
            int posCartaEscolhida = JOptionPane.showOptionDialog(null,
                "Escolha uma carta",
                 "Cartas Jogador",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[2]);
            
            novo.addCartasTurno(novo.cartasJogador.get(posCartaEscolhida)); //add carta array turno
            
            
                
            
            novo.removerCartasJogador(posCartaEscolhida);//remove carta do jogador
                        
            //cartaJogador.setNumero(JOptionPane.showInputDialog("Digite o numero"));
            //cartaJogador.setNaipe(JOptionPane.showInputDialog("Digite o naipe"));
            // JOptionPane.showConfirmDialog(null, "teste", "Vai", 0);
            //System.out.println("Carta jogador: "+cartaJogador.getNumero());
            //System.out.println("Carta jogador: "+cartaJogador.getNaipe());
            
            System.out.println("Cartas Jogador");
            novo.mostrarCartasJogador();
            System.out.println("Cartas Turno");   
            novo.mostrarCartasTurno();
            
    }    
     
     
     public void mostrarCartasTurno(){
         
     }
}
