package Basico;

import java.util.*;

public class RegioesRandom {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       
        String integrantes[] = {"Zimzum", "Bovinator", "Earendel", "Lammazzus", "Fan do Hasbulla", "Mix"};
        

        int quantidadeDeJogos = 3;

        for (int q=0; q < quantidadeDeJogos; q++){
            System.out.println("Jogo " + (q+1));
            List<String> lista = Arrays.asList(integrantes);
            Collections.shuffle(lista);
            lista.toArray(integrantes);
    

       
        for (int i=1; i<3; i++){
          
            int rng = (int)(Math.random () *13);
            if (i==1) {
                System.out.println("Grupo " + i + ": " + integrantes[0] +" "+ integrantes[1] + " "+ integrantes[2]);
            } else {
                System.out.println("Grupo " + i + ": " + integrantes[3] +" "+ integrantes[4] + " "+ integrantes[5]);
            }
            

       switch (rng) {
        case 0:
          System.out.printf(" Região: Bandópolis\n Campeões: Corki, Fizz, Gnar, Heimer, Kennen, Kled, Lulu, Poppy, Rumble, Teemo, Tristana, Veigar, Vex, Yuumi e Ziggs\n\n");
          break;
        case 1:
          System.out.printf(" Região: Águas de Sentina\n Campeões: Fizz, Gangplank, Graves, Illaoi, Miss Fortune, Nautilus, Nilah, Pyke, Tahm Kench e Twisted Fate\n\n");
          break;
        case 2:
          System.out.printf(" Região: Demacia\n Campeões: Fiora, Galio, Jarvan, Kayle, Lucian, Lux, Morgana, Poppy, Quinn, Shyvana, Sona, Sylas, Vayne e Xin Zhao\n\n");
          break;
        case 3: 
          System.out.printf(" Região: Piltover\n Campeões: Caitlyn, Camille, Corki, Ezreal, Heimerdinger, Jayce, Orianna, Seraphine e Vi\n\n");
          break;
        case 4:
          System.out.printf(" Região: Ilha das Sombras\n Campeões: Elise, Evelyn, Fiddle, Gwen, Hecarim, Kalista, Karthus, Maokai, Senna, Thresh, Viego e Yorick\n\n");
          break;
        case 5:
          System.out.printf(" Região: Shurima\n Campeões: Akshan, Amumu, Azir, K'sante, Nasus, Rammus, Renekton, Sivir, Skarner, Taliyah, Xerath e Zilean\n\n");
          break;
        case 6:
          System.out.printf(" Região: Targon\n Campeões: Aphelios, Aurelion Sol, Diana, Leona, Pantheon, Soraka, Taric e Zoe\n\n");
          break;
        case 7:
          System.out.printf(" Região: Freljord\n Campeões: Anivia, Ashe, Braum, Gnar, Gragas, Lissandra, Nunu, Olaf, Ornn, Sejuani, Trundle, Tryndamere, Udyr e Volibear\n\n");
          break;
        case 8:
          System.out.printf(" Região: Ionia\n Campeões: Ahri, Akali, Irelia, Ivern, Jhin, Karma, Kayn, Kennen, Lee sin, Lillia, Master Yi, Rakan, Sett, Shen, Syndra, Varus, Wukong, Xayah, Yasuo, Yone e Zed\n\n");
          break;
        case 9:
          System.out.printf(" Região: Ixtal\n Campeões: Malphite, Milio, Neeko, Nidalee, Qiyana, Rengar e Zyra\n\n");
          break;
        case 10:
          System.out.printf(" Região: Noxus\n Campeões: Cassiopeia, Darius, Draven, Katarina, Kled, LeBlanc, Rell, Riven, Samira, Sion, Swain, Talon, Vladimir\n\n");
          break;
        case 11:
          System.out.printf(" Região: Vazio\n Campeões: Belveth, ChoGath, Kaisa, Kassadin, Khazix, KogMaw, Malzahar, Reksai e Velkoz\n\n");
          break;
        case 12:
          System.out.printf(" Região: Zaun\n Campeões: Blitz, Mundo, Ekko, Janna, Jinx, Renata, Singed, Twitch, Urgot, Viktor, Warwick, Zarc, Zeri e Ziggs\n\n");
          break;

    }


       }
    }

        


    }
}



