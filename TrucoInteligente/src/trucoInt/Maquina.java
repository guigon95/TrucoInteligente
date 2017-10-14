/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trucoInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author mathe
 */
public class Maquina {
    
    public Cartas maquinaJogarMaior(Cartas vira, ArrayList<Cartas> cartasMaquina){
        
          int posMaior = 0;
          int valorMaior = 0;
          
          for(int i = 0; i<cartasMaquina.size(); i++){
              
              if(cartasMaquina.get(i).getValor() > valorMaior){
                  posMaior = i;
                  valorMaior = cartasMaquina.get(i).getValor();
              }
          }
          
          return cartasMaquina.get(posMaior);
    }
    
    public Cartas maquinaJogarMenor(Cartas vira, Cartas turno, ArrayList<Cartas> cartasMaquina){
        int posMenor=0, valorMenor=cartasMaquina.get(0).getValor();
            
            for(int i = 1; i<cartasMaquina.size(); i++){
              
                if(cartasMaquina.get(i).getValor() < valorMenor){
                    posMenor = i;
                    valorMenor = cartasMaquina.get(i).getValor();
                }
            }
          
            return cartasMaquina.get(posMenor);
    }
    
    public Cartas maquinaJogarMaiorMenor(Cartas vira, Cartas turno, ArrayList<Cartas> cartasMaquina){
        
        if(turno.getValor() >= maquinaJogarMaior(vira, cartasMaquina).getValor()){
                      
            return maquinaJogarMenor(vira, turno, cartasMaquina);
        }else
            return maquinaJogarMaior(vira, cartasMaquina);
    }
    
    public Cartas maquinaJogarAleatorio(ArrayList<Cartas> cartasMaquina){
               
        return cartasMaquina.get((int) (Math.random() * cartasMaquina.size()));
    }
     
    
    public boolean maquinaAceitaTruco(ArrayList<Cartas> cartasMaquina){
          int valorMaior = 0;
          
          for(int i = 0; i<cartasMaquina.size(); i++){
              
              if(cartasMaquina.get(i).getValor() > 150){
                  return true;
              }
          }
          
          //so aceita truco se tiver alguma manilha
         
        return false;
        
    }
    
    
}
