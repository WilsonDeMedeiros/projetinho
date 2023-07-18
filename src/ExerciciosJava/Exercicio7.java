package ExerciciosJava;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        /*
         7 – Fazer algoritmo para tabular uma pesquisa eleitoral para a prefeitura de Goiânia. O 
        algoritmo deverá ler número indeterminado de registros contendo NÚMERO do 
        candidato, SEXO e IDADE do eleitor. Os candidatos concorrentes são os de número 10, 
        20, 30, 40 e 50. O último registro, que não entrará nos cálculos, terá o valor do candidato 
        igual a 0 (ZERO). Após a leitura dos dados, o algoritmo deverá informar:
        a) Quantos eleitores são do sexo masculino;
        b) Quantos eleitores são do sexo feminino;
        c) Idade média dos eleitores masculinos; 
        d) Idade média dos eleitores femininos; 
        e) Quem deverá ganhar a eleição;
        f) Dentre os votantes do vencedor, quantos são homens e quantos são mulheres;
        e,
        g) Idade média dos eleitores do vencedor
         */

         int valorDigitado=0;

         int votosCandidato10=0;
         int votosCandidato10M=0;
         int votosCandidato10F=0;
         int somaDasIdadesCandidato10=0;

         int votosCandidato20=0;
         int votosCandidato20M=0;
         int votosCandidato20F=0;
         int somaDasIdadesCandidato20=0;

         int votosCandidato30=0;
         int votosCandidato30M=0;
         int votosCandidato30F=0;
         int somaDasIdadesCandidato30=0;

         int votosCandidato40=0;
         int votosCandidato40M=0;
         int votosCandidato40F=0;
         int somaDasIdadesCandidato40=0;

         int votosCandidato50=0;
         int votosCandidato50M=0;
         int votosCandidato50F=0;
         int somaDasIdadesCandidato50=0;

         int eleitoresM=0;
         int eleitoresF=0;
         int somaIdadeEleitoresM=0;
         int somaIdadeEleitoresF=0;

         Scanner leitor = new Scanner(System.in);
    

         do {
            System.out.println("Qual o numero do Candidato? ");
            valorDigitado = leitor.nextInt();

            if(valorDigitado==0){
                break;

            }else if(valorDigitado==10){
                votosCandidato10++;
                System.out.println("Qual o sexo do eleitor? (M: digite 1; F: digite 2)");
                valorDigitado = leitor.nextInt();
                    if (valorDigitado ==1){
                        votosCandidato10M++;
                        eleitoresM++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresM +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    } else if (valorDigitado ==2){
                        votosCandidato10F++;
                        eleitoresF++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresF +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    }else {
                        System.out.println("valor invalido");
                        votosCandidato10--;
                    }

            
            }else if(valorDigitado==20){
                votosCandidato20++;
                System.out.println("Qual o sexo do eleitor? (M: digite 1; F: digite 2)");
                valorDigitado = leitor.nextInt();
                    if (valorDigitado ==1){
                        votosCandidato20M++;
                        eleitoresM++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresM +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    } else if (valorDigitado ==2){
                        votosCandidato20F++;
                        eleitoresF++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresF +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    }else {
                        System.out.println("valor invalido");
                        votosCandidato20--;
                    }

            }else if(valorDigitado==30) {
                votosCandidato30++;
                System.out.println("Qual o sexo do eleitor? (M: digite 1; F: digite 2)");
                valorDigitado = leitor.nextInt();
                    if (valorDigitado ==1){
                        votosCandidato30M++;
                        eleitoresM++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresM +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    } else if (valorDigitado ==2){
                        votosCandidato30F++;
                        eleitoresF++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresF +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    }else {
                        System.out.println("valor invalido");
                        votosCandidato30--;
                    }

                }else if(valorDigitado==40) {
                votosCandidato40++;
                System.out.println("Qual o sexo do eleitor? (M: digite 1; F: digite 2)");
                valorDigitado = leitor.nextInt();
                    if (valorDigitado ==1){
                        votosCandidato40M++;
                        eleitoresM++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresM +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    } else if (valorDigitado ==2){
                        votosCandidato40F++;
                        eleitoresF++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresF +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    }else {
                        System.out.println("valor invalido");
                        votosCandidato40--;
                    }

            } else if (valorDigitado==50){
                votosCandidato50++;
                System.out.println("Qual o sexo do eleitor? (M: digite 1; F: digite 2)");
                valorDigitado = leitor.nextInt();
                    if (valorDigitado ==1){
                        votosCandidato50M++;
                        eleitoresM++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresM +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    } else if (valorDigitado ==2){
                        votosCandidato50F++;
                        eleitoresF++;
                        System.out.println("Qual a idade do eleitor?");
                        valorDigitado = leitor.nextInt();
                        somaIdadeEleitoresF +=valorDigitado;
                        somaDasIdadesCandidato10 +=valorDigitado;

                    }else {
                        System.out.println("valor invalido");
                        votosCandidato50--;
                    }
            } else {
                System.out.println("Valor invalido");
            }

            
        } while (valorDigitado !=0);


        //pra não dar bug de dividir 0 por 0 e quebrar o código
        int idadeMediaEleitoresM;
        int idadeMediaELeitoresF;

        if (eleitoresM >0){
            idadeMediaEleitoresM = (somaIdadeEleitoresM/eleitoresM);
        } else {
            idadeMediaEleitoresM = 0;
        }

        if (eleitoresF >0){
            idadeMediaELeitoresF = (somaIdadeEleitoresF/eleitoresF);
        }else {
            idadeMediaELeitoresF =0;
        }

        

        if (votosCandidato10 > votosCandidato20 && votosCandidato10 > votosCandidato30 && votosCandidato10 > votosCandidato40 && votosCandidato10 > votosCandidato50){
            System.out.println("Candidato com mais votos: Candidato 10 com " + votosCandidato10 + "votos");
            System.out.println("Eleitores Homens: " + eleitoresM);
            System.out.println("Eleitores Mulheres: " + eleitoresF);
            System.out.println("Idade media dos eleitores homens: " + idadeMediaEleitoresM);
            System.out.println("Idade media dos eleitores mulheres: " + idadeMediaELeitoresF);
            System.out.println("Eleitores do candidato 10 homens: " + votosCandidato10M);
            System.out.println("Eleitores do candidato 10 mulheres: " + votosCandidato10F);
            System.out.println("Idade media dos eleitores do candidato 10: " + (somaDasIdadesCandidato10/votosCandidato10));

        } else if (votosCandidato20 > votosCandidato30 && votosCandidato20 > votosCandidato40 && votosCandidato20 > votosCandidato50){
            System.out.println("Candidato com mais votos: Candidato 20 com " + votosCandidato20 + "votos");
            System.out.println("Eleitores Homens: " + eleitoresM);
            System.out.println("Eleitores Mulheres: " + eleitoresF);
            System.out.println("Idade media dos eleitores homens: " + idadeMediaEleitoresM);
            System.out.println("Idade media dos eleitores mulheres: " + idadeMediaELeitoresF);
            System.out.println("Eleitores do candidato 20 homens: " + votosCandidato20M);
            System.out.println("Eleitores do candidato 20 mulheres: " + votosCandidato20F);
            System.out.println("Idade media dos eleitores do candidato 20: " + (somaDasIdadesCandidato20/votosCandidato20));

        } else if (votosCandidato30 > votosCandidato40 && votosCandidato30 > votosCandidato50){
            System.out.println("Candidato com mais votos: Candidato 30 com " + votosCandidato30 + "votos");
            System.out.println("Eleitores Homens: " + eleitoresM);
            System.out.println("Eleitores Mulheres: " + eleitoresF);
            System.out.println("Idade media dos eleitores homens: " + idadeMediaEleitoresM);
            System.out.println("Idade media dos eleitores mulheres: " + idadeMediaELeitoresF);
            System.out.println("Eleitores do candidato 30 homens: " + votosCandidato30M);
            System.out.println("Eleitores do candidato 30 mulheres: " + votosCandidato30F);
            System.out.println("Idade media dos eleitores do candidato 30: " + (somaDasIdadesCandidato30/votosCandidato30));

        } else if (votosCandidato40 > votosCandidato50){
            System.out.println("Candidato com mais votos: Candidato 40 com " + votosCandidato40 + "votos");
            System.out.println("Eleitores Homens: " + eleitoresM);
            System.out.println("Eleitores Mulheres: " + eleitoresF);
            System.out.println("Idade media dos eleitores homens: " + idadeMediaEleitoresM);
            System.out.println("Idade media dos eleitores mulheres: " + idadeMediaELeitoresF);
            System.out.println("Eleitores do candidato 40 homens: " + votosCandidato40M);
            System.out.println("Eleitores do candidato 40 mulheres: " + votosCandidato40F);
            System.out.println("Idade media dos eleitores do candidato 40: " + (somaDasIdadesCandidato40/votosCandidato40));

        } else {
            System.out.println("Candidato com mais votos: Candidato 50 com " + votosCandidato50 + "votos");
            System.out.println("Eleitores Homens: " + eleitoresM);
            System.out.println("Eleitores Mulheres: " + eleitoresF);
            System.out.println("Idade media dos eleitores homens: " + idadeMediaEleitoresM);
            System.out.println("Idade media dos eleitores mulheres: " + idadeMediaELeitoresF);
            System.out.println("Eleitores do candidato 50 homens: " + votosCandidato50M);
            System.out.println("Eleitores do candidato 50 mulheres: " + votosCandidato50F);
            System.out.println("Idade media dos eleitores do candidato 50: " + (somaDasIdadesCandidato50/votosCandidato50));
        }

        leitor.close();

         }        
    }
    

