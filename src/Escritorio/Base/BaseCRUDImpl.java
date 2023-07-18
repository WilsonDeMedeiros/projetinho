package Escritorio.Base;

public class BaseCRUDImpl implements BaseCRUD {

    public String arquivo;

    public BaseCRUDImpl (String arquivo){
        this.arquivo = arquivo;
    }

    @Override
    public void create() {
        System.out.println("Arquivo criado: " + arquivo + ".txt");
    }

    @Override
    public void read() {
        System.out.printf("\nLeitura concluida %s.txt\n ", arquivo );
    
}

}
