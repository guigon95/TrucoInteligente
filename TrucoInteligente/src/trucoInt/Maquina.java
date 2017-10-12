/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trucoInt;

import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class Maquina {
    
    public Cartas maquinaJogarMaior(Cartas vira, Cartas turno, ArrayList<Cartas> cartasMaquina){
        
          Cartas cartaTurno;
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
    
    
    public Cartas maquinaJogarAleatorio(Cartas vira, Cartas turno, ArrayList<Cartas> cartasMaquina){
        
        return cartasMaquina.get(0);
        
    }
    
    
    
}
