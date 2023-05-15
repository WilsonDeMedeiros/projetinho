
public class lutador {
    private String nome;
    public String estiloMarcial;
    public float peso;
    public int numeroDeVitorias;
    public int numeroDeDerrotas;

    public void categoriaDePeso (){
        if (peso <60) {
            System.out.println("Peso pena");
        } else if (peso <80) {
            System.out.println("Peso médio");
        } else {
                System.out.println("Peso pesado");
            }
        }
    public void fichaCompleta () {
        System.out.printf(" Nome : %s\n Estilo marcial: %s\n Peso: %.2f\n Vitórias: %d\n Derrotas: %d\n ", nome, estiloMarcial, peso, numeroDeVitorias, numeroDeDerrotas );
        
    }


    public static void main(String[] args) throws Exception {
        lutador lutador1 = new lutador();
        lutador1.nome = "Joao";
        lutador1.estiloMarcial = "boxe";
        lutador1.peso = 68.0f;
        lutador1.numeroDeVitorias = 3;
        lutador1.numeroDeDerrotas = 1;

        lutador1.fichaCompleta();
        lutador1.categoriaDePeso();


        }

        

         


        
        

    }

