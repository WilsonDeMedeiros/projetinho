public class testen2 {
     /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    

        int statsP1 = 3; //atributo de combate a ser somado ao resultado dos dados
        int statsP2 = 2; //idem, mas referente ao jogador 2
        
        int dice1 = (int)(Math.random () *6) + 1; //gera um resultado de 1 a 6
        int dice2 = (int)(Math.random () *6) + 1; //idem 
        int diceP1 = dice1 + dice2; //o resultado dos dois dados referentes ao jogador 1
        boolean critP1 = diceP1 >11; //acerto crítico se o resultado nos dados for 12
        
        int resultP1 = diceP1 + statsP1; //resultado do jogador 1. Soma dos 2 dados e seu atributo
        
        int dice3 = (int)(Math.random () *6) +1; 
        int dice4 = (int)(Math.random () *6) +1; 
        int diceP2 = dice3 + dice4; //resultado dos dois dados referentes ao jogador 2
        boolean critP2 = diceP2 >11;



        int resultP2 = diceP2+ statsP2; //resultado do jogador 2. Soma dos 2 dados e seu atributo
        
        int resultadoFinal = resultP1 - resultP2;
        
        /* simula dois jogadores, cada um rolando dois dados de 6 lados e comparando os resultados.
        com -2 ou pior, falha total
        de -1 a +1, sucesso parcial
        +2 ou melhor, sucesso total
        */
        
        String txtFalha = "sua ação falha e você sofre os efeitos da reação inimiga";
        String txtParcial = "sucesso parcial! sua ação é bem sucedida, mas você sofre os efeitos da reação inimiga";
        String txtTotal = "sucesso total! sua ação é bem sucedida e você evita os efeitos da reação inimiga";
        String crítico = "acerto crítico!";
        
        System.out.println ("Rolagem do jogador A: " + dice1 + " + " + dice2 + " + " + statsP1 + " = " + resultP1);
        System.out.println ("Rolagem do jogador B: " + dice3 + " + " + dice4 + " + " + statsP2 + " = " + resultP2);
        
        if (critP1) {
            System.out.println (crítico);
        } else if (critP2) { 
            System.out.println(crítico);
        } else if (resultadoFinal < -1) {
            System.out.println (" Margem: " + resultadoFinal + "! " + txtFalha);
        } else if  (resultadoFinal < 2) {
            System.out.println (" Margem: " + resultadoFinal + "! " + txtParcial);
        } else {
            System.out.println ("Margem: " + resultadoFinal + "! " + txtTotal);
        }
        
         

        }
       
        }
        

