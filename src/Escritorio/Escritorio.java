package Escritorio;

import Escritorio.service.NotasService;
import Escritorio.service.RelatoriosService;

public class Escritorio {
    
    public static void main(String[] args) {

        NotasService notasService = new NotasService();
        RelatoriosService relatoriosService = new RelatoriosService();

        System.out.println("Meu Escritorio");
        
        notasService.create();
        notasService.read();
        
        relatoriosService.create();
        relatoriosService.read();
        
    }
}
