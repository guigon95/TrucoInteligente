/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trucoInt;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kira
 */
public class Jogo1 extends javax.swing.JFrame {
    
    private static Cartas vira;
    Truco truco;
    int rodada = 1, rodadaMaquinaPontos = 0, rodadaJogadorPontos = 0, vez = 0;
    int maoJogadorPontos=0, maoMaquinaPontos =0;
    Cartas maquinaTurno;
    Baralho novo;
    ArrayList<Cartas> maquinaCartasComExclusao = new ArrayList<Cartas>();
    
    
    /**
     * Creates new form Jogo
     */
    public Jogo1() {
        initComponents();
        
        lbl_carta1.setVisible(false);
        lbl_carta2.setVisible(false);
        lbl_carta3.setVisible(false);
        lbl_carta4.setVisible(false);
        lbl_carta5.setVisible(false);
        lbl_carta6.setVisible(false);
        lbl_cartaJogadorTurno.setVisible(false);
        lbl_cartaMaquinaTurno.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_carta3 = new javax.swing.JLabel();
        lbl_carta1 = new javax.swing.JLabel();
        lbl_carta2 = new javax.swing.JLabel();
        lbl_monte = new javax.swing.JLabel();
        lbl_carta4 = new javax.swing.JLabel();
        lbl_carta5 = new javax.swing.JLabel();
        lbl_carta6 = new javax.swing.JLabel();
        btn_jogar = new javax.swing.JButton();
        lbl_cartaJogadorTurno = new javax.swing.JLabel();
        lbl_cartaMaquinaTurno = new javax.swing.JLabel();
        btn_verificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_pontosJogador = new javax.swing.JLabel();
        lbl_pontosMaquina = new javax.swing.JLabel();
        lbl_maquina = new javax.swing.JLabel();
        lbl_pontosMaquinaTotal = new javax.swing.JLabel();
        lbl_jogador = new javax.swing.JLabel();
        lbl_pontosJogadorTotal = new javax.swing.JLabel();
        btn_tornar = new javax.swing.JButton();
        lbl_fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(596, 481));
        setResizable(false);
        setSize(new java.awt.Dimension(596, 481));
        getContentPane().setLayout(null);

        lbl_carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-blue.png"))); // NOI18N
        getContentPane().add(lbl_carta3);
        lbl_carta3.setBounds(350, 330, 80, 120);

        lbl_carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-blue.png"))); // NOI18N
        getContentPane().add(lbl_carta1);
        lbl_carta1.setBounds(150, 330, 80, 120);

        lbl_carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-blue.png"))); // NOI18N
        getContentPane().add(lbl_carta2);
        lbl_carta2.setBounds(250, 330, 80, 120);

        lbl_monte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-blue.png"))); // NOI18N
        getContentPane().add(lbl_monte);
        lbl_monte.setBounds(250, 180, 80, 120);

        lbl_carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-blue.png"))); // NOI18N
        getContentPane().add(lbl_carta4);
        lbl_carta4.setBounds(150, 40, 80, 120);

        lbl_carta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-blue.png"))); // NOI18N
        getContentPane().add(lbl_carta5);
        lbl_carta5.setBounds(250, 40, 80, 120);

        lbl_carta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-blue.png"))); // NOI18N
        getContentPane().add(lbl_carta6);
        lbl_carta6.setBounds(350, 40, 80, 120);

        btn_jogar.setText("Jogar");
        btn_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jogarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_jogar);
        btn_jogar.setBounds(490, 340, 80, 23);

        lbl_cartaJogadorTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-blue.png"))); // NOI18N
        getContentPane().add(lbl_cartaJogadorTurno);
        lbl_cartaJogadorTurno.setBounds(350, 180, 80, 120);

        lbl_cartaMaquinaTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-blue.png"))); // NOI18N
        getContentPane().add(lbl_cartaMaquinaTurno);
        lbl_cartaMaquinaTurno.setBounds(150, 180, 80, 120);

        btn_verificar.setText("Verificar");
        btn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_verificar);
        btn_verificar.setBounds(490, 380, 80, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pontos Mão:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 390, 70, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Pontos Mão:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 40, 69, 14);

        lbl_pontosJogador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pontosJogador.setText("0");
        getContentPane().add(lbl_pontosJogador);
        lbl_pontosJogador.setBounds(90, 390, 20, 14);

        lbl_pontosMaquina.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pontosMaquina.setText("0");
        getContentPane().add(lbl_pontosMaquina);
        lbl_pontosMaquina.setBounds(560, 40, 20, 14);

        lbl_maquina.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_maquina.setText("Máquina");
        getContentPane().add(lbl_maquina);
        lbl_maquina.setBounds(480, 20, 60, 14);

        lbl_pontosMaquinaTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pontosMaquinaTotal.setText("0");
        getContentPane().add(lbl_pontosMaquinaTotal);
        lbl_pontosMaquinaTotal.setBounds(540, 20, 20, 14);

        lbl_jogador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_jogador.setText("Jogador");
        getContentPane().add(lbl_jogador);
        lbl_jogador.setBounds(10, 370, 50, 14);

        lbl_pontosJogadorTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pontosJogadorTotal.setText("0");
        getContentPane().add(lbl_pontosJogadorTotal);
        lbl_pontosJogadorTotal.setBounds(70, 370, 20, 14);

        btn_tornar.setText("Tornar");
        btn_tornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tornarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tornar);
        btn_tornar.setBounds(490, 420, 80, 23);

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        getContentPane().add(lbl_fundo);
        lbl_fundo.setBounds(0, 0, 590, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogarActionPerformed
     
       //rodada = 0;
       iniciarJogada();
        
    }//GEN-LAST:event_btn_jogarActionPerformed

    private void btn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificarActionPerformed
        verificarRodada();
    }//GEN-LAST:event_btn_verificarActionPerformed

    private void btn_tornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tornarActionPerformed
        
        tornar();
        
    }//GEN-LAST:event_btn_tornarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jogo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_jogar;
    private javax.swing.JButton btn_tornar;
    private javax.swing.JButton btn_verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_carta1;
    private javax.swing.JLabel lbl_carta2;
    private javax.swing.JLabel lbl_carta3;
    private javax.swing.JLabel lbl_carta4;
    private javax.swing.JLabel lbl_carta5;
    private javax.swing.JLabel lbl_carta6;
    private javax.swing.JLabel lbl_cartaJogadorTurno;
    private javax.swing.JLabel lbl_cartaMaquinaTurno;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JLabel lbl_jogador;
    private javax.swing.JLabel lbl_maquina;
    private javax.swing.JLabel lbl_monte;
    private javax.swing.JLabel lbl_pontosJogador;
    private javax.swing.JLabel lbl_pontosJogadorTotal;
    private javax.swing.JLabel lbl_pontosMaquina;
    private javax.swing.JLabel lbl_pontosMaquinaTotal;
    // End of variables declaration//GEN-END:variables

    public void mostrarCartas(ArrayList<Cartas> listaCartasJogador){
        
        
        
        ImageIcon carta1 = new ImageIcon(getClass().getResource("/imagens/"+listaCartasJogador.get(0).getNumero()+"-"+listaCartasJogador.get(0).getNaipe().toLowerCase()+".png"));
        ImageIcon carta2 = new ImageIcon(getClass().getResource("/imagens/"+listaCartasJogador.get(1).getNumero()+"-"+listaCartasJogador.get(1).getNaipe().toLowerCase()+".png"));
        ImageIcon carta3 = new ImageIcon(getClass().getResource("/imagens/"+listaCartasJogador.get(2).getNumero()+"-"+listaCartasJogador.get(2).getNaipe().toLowerCase()+".png"));
        lbl_carta1.setIcon(carta1);
        lbl_carta2.setIcon(carta2);
        lbl_carta3.setIcon(carta3);

        //mostrando cartas jogador
        lbl_carta1.setVisible(true);
        lbl_carta2.setVisible(true);
        lbl_carta3.setVisible(true);
        
        
        //mostrando cartas da maquina
        lbl_carta4.setVisible(true);       
        lbl_carta5.setVisible(true);        
        lbl_carta6.setVisible(true);
        
    }
    
   public void iniciarJogada(){
       while(maoJogadorPontos <= 12 || maoMaquinaPontos <=12){
            
            novo = new Baralho();
            novo.geraBaralho();
            
            novo.distribuiCartas();
            
            System.out.println("Vira:");
            vira = novo.sortearVira();
            System.out.print(vira.getNumero()+" - ");
            System.out.println(vira.getNaipe());
            mostrarCartasVira(vira.getNumero(), vira.getNaipe());
            
            novo.atribuirManilhas();
            
            novo.atribuirPesos(novo.cartasJogador);
            novo.atribuirPesos(novo.cartasMaquina);
            System.out.println("Cartas Jogador");
            novo.mostrarCartasJogador();
            
       
            mostrarCartas(novo.cartasJogador);
            
            System.out.println("Cartas Maquina");
            novo.mostrarCartasMaquina();
            
                    
            while(rodada<=3 && 
                    !(rodadaJogadorPontos == 2 && rodadaMaquinaPontos == 0) &&
                    !(rodadaMaquinaPontos == 2 && rodadaJogadorPontos == 0)){
                if(vez==0){
                    tornar();
                    tornarMaquina();
                    verificarRodada();
                    rodada++;
                }else if(vez==1){
                    tornarMaquina();
                    tornar();
                    verificarRodada();
                    rodada++;
                }
           }
            
           verificarMao();
           
      }      
    }    
    
    public void mostrarCartasVira(String numero, String naipe){
        
        ImageIcon cartaMonte = new ImageIcon(getClass().getResource("/imagens/"+numero+"-"+naipe+".png"));
        lbl_monte.setIcon(cartaMonte);
        lbl_monte.setVisible(true);
        
    }
    
    //mostra carta do jogador na tela
    public void mostrarCartasTurnoJogador(String numero, String naipe){
        
        ImageIcon cartaTurno = new ImageIcon(getClass().getResource("/imagens/"+numero+"-"+naipe+".png"));
        lbl_cartaJogadorTurno.setIcon(cartaTurno);
        lbl_cartaJogadorTurno.setVisible(true);
        
    }
    
    //mostra carta da maquina na tela
    public void mostrarCartasTurnoMaquina(String numero, String naipe){
        
         ImageIcon cartaTurno = new ImageIcon(getClass().getResource("/imagens/"+numero+"-"+naipe+".png"));
        lbl_cartaMaquinaTurno.setIcon(cartaTurno);
        lbl_cartaMaquinaTurno.setVisible(true); 
    }
    
    public void verificarRodada(){
        
              if(maquinaTurno.getValor() > novo.getTurno().getValor()){
                  rodadaMaquinaPontos++;
                  //JOptionPane.showMessageDialog(null,maquinaTurno.getValor()+" ou "+novo.getTurno().getValor());
                  JOptionPane.showMessageDialog(null, "Maquina Ganhou!");
                  lbl_pontosMaquina.setText(String.valueOf(rodadaMaquinaPontos));
                  vez = 1;
              }
              else if(maquinaTurno.getValor() < novo.getTurno().getValor()){
                  rodadaJogadorPontos++;
                  //JOptionPane.showMessageDialog(null,maquinaTurno.getValor()+" ou "+novo.getTurno().getValor());
                  JOptionPane.showMessageDialog(null, "Jogador Ganhou!");
                  lbl_pontosJogador.setText(String.valueOf(rodadaJogadorPontos));
                  vez = 0;
              }
              else{
                  
                  rodadaJogadorPontos++;
                  rodadaMaquinaPontos++;
                  lbl_pontosJogador.setText(String.valueOf(rodadaJogadorPontos));
                  lbl_pontosMaquina.setText(String.valueOf(rodadaMaquinaPontos));

                  JOptionPane.showMessageDialog(null, "Empate!");
              }
              
          lbl_cartaJogadorTurno.setVisible(false);
          lbl_cartaMaquinaTurno.setVisible(false);
          
        //ImageIcon baralho = new ImageIcon(getClass().getResource("/imagens/back-blue.png"));
        //lbl_monte.setIcon(baralho);
    }   
    
    public void verificarMao(){
        
        if(rodadaJogadorPontos == 2 && rodadaMaquinaPontos == 0){
            JOptionPane.showMessageDialog(null, "Jogador Ganhou a Mão!");
            maoJogadorPontos += 1; 
            lbl_pontosJogadorTotal.setText(String.valueOf(maoJogadorPontos));
        }else if(rodadaMaquinaPontos == 2 && rodadaJogadorPontos == 0){
            JOptionPane.showMessageDialog(null, "Máquina Ganhou a Mão!");
            maoMaquinaPontos += 1; 
            lbl_pontosMaquinaTotal.setText(String.valueOf(maoMaquinaPontos));
        }
        else if(rodadaJogadorPontos > rodadaMaquinaPontos && rodada > 3){
            JOptionPane.showMessageDialog(null, "Jogador Ganhou a Mão!");
            maoJogadorPontos += 1; 
            lbl_pontosJogadorTotal.setText(String.valueOf(maoJogadorPontos));
       }
        else if(rodadaMaquinaPontos > rodadaJogadorPontos && rodada > 3){
            JOptionPane.showMessageDialog(null, "Máquina Ganhou a Mão!");
            maoMaquinaPontos += 1; 
            lbl_pontosMaquinaTotal.setText(String.valueOf(maoMaquinaPontos));            
        }
        
        rodada = 1;
        rodadaJogadorPontos = 0;
        rodadaMaquinaPontos = 0;
        lbl_pontosJogador.setText(String.valueOf(rodadaJogadorPontos));
        lbl_pontosMaquina.setText(String.valueOf(rodadaMaquinaPontos));
    }
    
    public void tornar(){
        
          int posCartaEscolhida; 
          if(rodada==1){
            Object[] options = {novo.cartasJogador.get(0).getNumero()+" "+novo.cartasJogador.get(0).getNaipe(),
                    novo.cartasJogador.get(1).getNumero()+" "+novo.cartasJogador.get(1).getNaipe(),
                    novo.cartasJogador.get(2).getNumero()+" "+novo.cartasJogador.get(2).getNaipe()};
            posCartaEscolhida = JOptionPane.showOptionDialog(null,
                "Escolha uma carta",
                 "Cartas Jogador",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[2]);
           }
           else if(rodada==2){
            Object[] options = {novo.cartasJogador.get(0).getNumero()+" "+novo.cartasJogador.get(0).getNaipe(),
                    novo.cartasJogador.get(1).getNumero()+" "+novo.cartasJogador.get(1).getNaipe()};
            posCartaEscolhida = JOptionPane.showOptionDialog(null,
                "Escolha uma carta",
                 "Cartas Jogador",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[1]);
           }
           else{
            Object[] options = {novo.cartasJogador.get(0).getNumero()+" "+novo.cartasJogador.get(0).getNaipe()};
            posCartaEscolhida = JOptionPane.showOptionDialog(null,
                "Escolha uma carta",
                 "Cartas Jogador",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
           }
           
           novo.setTurno(novo.cartasJogador.get(posCartaEscolhida)); //add carta array turno
           mostrarCartasTurnoJogador(novo.cartasJogador.get(posCartaEscolhida).getNumero(), novo.cartasJogador.get(posCartaEscolhida).getNaipe().toLowerCase());
            
                     
           if(novo.cartasJogador.get(posCartaEscolhida).getValor() == novo.cartasJogadorSemExclusao.get(0).getValor()){
               lbl_carta1.setVisible(false);
           }
           else if(novo.cartasJogador.get(posCartaEscolhida).getValor() == novo.cartasJogadorSemExclusao.get(1).getValor()){;
               lbl_carta2.setVisible(false);                
           }
           else if(novo.cartasJogador.get(posCartaEscolhida).getValor() == novo.cartasJogadorSemExclusao.get(2).getValor()){
               lbl_carta3.setVisible(false);                
           }
            
           novo.removerCartasJogador(posCartaEscolhida);
           
   }
    
    public void tornarMaquina(){
        
            Maquina maquina = new Maquina();
            
            maquinaTurno = maquina.maquinaJogar(vira, novo.getTurno(), novo.cartasMaquina);
            
            mostrarCartasTurnoMaquina(maquinaTurno.getNumero(), maquinaTurno.getNaipe());
            
             int i;
             for(i= 0; i<novo.cartasMaquina.size(); i++){
              
                if(maquinaTurno.getNumero().equalsIgnoreCase(novo.cartasMaquina.get(i).getNumero()) && maquinaTurno.getNaipe().equalsIgnoreCase(novo.cartasMaquina.get(i).getNaipe())){
                  //  novo.addCartasTurno(novo.cartasMaquina.get(i));
                    novo.removerCartasMaquina(i);
                }
            }
            
        //System.out.println("Posicao:"+i);
        switch (--i) {
            case 0:
                lbl_carta4.setVisible(false);
                break;
            case 1:
                lbl_carta5.setVisible(false);
                break;
            case 2:
                lbl_carta6.setVisible(false);
                break;
            default:
                break;
        }
    
    }
    
}
