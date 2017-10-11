/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trucoInt;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kira
 */
public class Baralho {

    /**
     * @return the turno
     */
    public Cartas getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(Cartas turno) {
        this.turno = turno;
    }
    
    int i = 0;
     //cria vetor do baralho
    ArrayList<Cartas> totalCartas = new ArrayList<Cartas>();
    ArrayList<Cartas> distribuirBaralho = new ArrayList<Cartas>();
    ArrayList<Cartas> cartasJogador = new ArrayList<Cartas>();
    ArrayList<Cartas> cartasMaquina = new ArrayList<Cartas>();
    ArrayList<Cartas> manilhas = new ArrayList<Cartas>();
    
    ArrayList<Cartas> cartasJogadorSemExclusao = new ArrayList<Cartas>();
    
    private Cartas turno;
    
    private Cartas cartas;
    private Cartas vira;
    
    Jogo1 jogo = new Jogo1();
    
    public void geraBaralho() {
       
        
        cartas = new Cartas();
        cartas.setNumero("3");
        cartas.setNaipe("Paus");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("2");
        cartas.setNaipe("Paus");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("A");
        cartas.setNaipe("Paus");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("K");
        cartas.setNaipe("Paus");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("J");
        cartas.setNaipe("Paus");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("Q");
        cartas.setNaipe("Paus");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        
        /*******************************/
        
                cartas = new Cartas();
        cartas.setNumero("3");
        cartas.setNaipe("Sete-Copas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("2");
        cartas.setNaipe("Sete-Copas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("A");
        cartas.setNaipe("Sete-Copas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("K");
        cartas.setNaipe("Sete-Copas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("J");
        cartas.setNaipe("Sete-Copas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("Q");
        cartas.setNaipe("Sete-Copas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
       
        
        /*************************/
        
        cartas = new Cartas();
        cartas.setNumero("3");
        cartas.setNaipe("Espadas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("2");
        cartas.setNaipe("Espadas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("A");
        cartas.setNaipe("Espadas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("K");
        cartas.setNaipe("Espadas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("J");
        cartas.setNaipe("Espadas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("Q");
        cartas.setNaipe("Espadas");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
         /*******************************/
        
        cartas = new Cartas();
        cartas.setNumero("3");
        cartas.setNaipe("Ouro");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("2");
        cartas.setNaipe("Ouro");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("A");
        cartas.setNaipe("Ouro");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("K");
        cartas.setNaipe("Ouro");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("J");
        cartas.setNaipe("Ouro");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
        
        cartas = new Cartas();
        cartas.setNumero("Q");
        cartas.setNaipe("Ouro");
        totalCartas.add(cartas);
        distribuirBaralho.add(cartas);
 
    }
    
    public void distribuiCartas(){
     
        System.out.println("Distribuindo Cartas do Jogador");
            //Embaralhamos os números:
        Collections.shuffle(distribuirBaralho);
        //Distribuindo cartas para jogador
        for (int i = 0; i < 3; i++) {
           cartasJogador.add(distribuirBaralho.get(i));
           cartasJogadorSemExclusao.add(distribuirBaralho.get(i));
           distribuirBaralho.remove(i);   
        }

        //Distribuindo cartas para maquina
        for (int i = 0; i < 3; i++) {
           cartasMaquina.add(distribuirBaralho.get(i));
           distribuirBaralho.remove(i);   
        }
    }
    
    
    
    
    public void mostrarCartasTurnoJogador(){
        
      
           System.out.print(getTurno().getNumero()+" - ");       
           System.out.println(getTurno().getNaipe()+" Valor: "+getTurno().getValor());  
        
    }
    
    public Cartas sortearVira(){
        
    vira = distribuirBaralho.get(0);
    
    return vira;
         
    }
    
    public void mostrarCartasJogador(){
        
        for (int i = 0; i < cartasJogador.size(); i++) {
           System.out.print(cartasJogador.get(i).getNumero()+" - ");       
           System.out.println(cartasJogador.get(i).getNaipe()+" Valor: "+cartasJogador.get(i).getValor());  
//           jogo.setCarta();
        } 
    }
    
    public void removerCartasJogador(int pos){
        cartasJogador.remove(pos);
        
    }
    
    public void removerCartasMaquina(int pos){
        cartasMaquina.remove(pos);
        
    }
            
    public void mostrarCartasMaquina(){
        
        for (int i = 0; i < cartasMaquina.size(); i++) {
           System.out.print(cartasMaquina.get(i).getNumero()+" - ");       
           System.out.println(cartasMaquina.get(i).getNaipe()+" Valor: "+cartasMaquina.get(i).getValor());  
        }
    }
    
    public void atribuirManilhas(){
        
        for (int i = 0; i < totalCartas.size(); i++) {
            
            if(totalCartas.get(i).getNumero().equals(vira.getNumero()) && !vira.getNumero().equals("3")){
                
               cartas = new Cartas();
               cartas.setNaipe(totalCartas.get(i).getNaipe());
               cartas.setNumero(totalCartas.get(i-1).getNumero());
               manilhas.add(cartas);
                System.out.println("Manilha: "+cartas.getNumero()+" - "+cartas.getNaipe());
            }
            else if(totalCartas.get(i).getNumero().equals(vira.getNumero()) && vira.getNumero().equals("3")){
               cartas = new Cartas();
               cartas.setNaipe(totalCartas.get(i).getNaipe());
               cartas.setNumero("Q");
               manilhas.add(cartas);
               System.out.println("Manilha: "+cartas.getNumero()+" - "+cartas.getNaipe());
            }
        }
        
    }
    
    /*
    
    Manilha - 150
    
    Paus - 40 pontos
    Sete Copas - 30 pontos    
    Espadas - 20 pontos
    Ouro - 10 pontos
    
    3 - 6
    2 - 5
    A - 4
    K - 3
    J - 2
    Q - 1
     
    
    */
    
    
    public void atribuirPesos(ArrayList<Cartas> list){
        
         for(int i = 0; i<list.size(); i++){
          

                //atribuindo peso dos numeros
                if(list.get(i).getNumero().equals("3")){
                    list.get(i).setValor(35);
                }
                else if(list.get(i).getNumero().equals("2")){
                    list.get(i).setValor(30);                
                }
                else if(list.get(i).getNumero().equalsIgnoreCase("A")){
                    list.get(i).setValor(25);            
                }
                else if(list.get(i).getNumero().equalsIgnoreCase("K")){
                    list.get(i).setValor(20); 
                }
                else if(list.get(i).getNumero().equalsIgnoreCase("J")){
                    list.get(i).setValor(15); 
                }
                else if(list.get(i).getNumero().equalsIgnoreCase("Q")){
                    list.get(i).setValor(10);     
                }
                
               //atribuindo peso das manilhas
                for(int j = 0; j<manilhas.size(); j++){
                    if(list.get(i).getNumero().equals(manilhas.get(j).getNumero()) &&
                            list.get(i).getNaipe().equals(manilhas.get(j).getNaipe())){
                        list.get(i).setValor(list.get(i).getValor() + 150);
                                             
                        //atribuindo peso dos naipes
                        if(list.get(i).getNaipe().equalsIgnoreCase("Paus")){
                            list.get(i).setValor(list.get(i).getValor() + 4);
                        }
                        else if(list.get(i).getNaipe().equalsIgnoreCase("Sete-Copas")){
                            list.get(i).setValor(list.get(i).getValor() + 3);
                        }
                        else if(list.get(i).getNaipe().equalsIgnoreCase("Espadas")){
                            list.get(i).setValor(list.get(i).getValor() + 2);
                        }
                        else if(list.get(i).getNaipe().equalsIgnoreCase("Ouro")){
                            list.get(i).setValor(list.get(i).getValor() + 1);
                        }
                    }
                }
        }
        
    }
}
