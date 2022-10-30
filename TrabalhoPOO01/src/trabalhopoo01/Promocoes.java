
package trabalhopoo01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Promocoes {
  
    
    public int compararDatas(String inicio, String fim){
        int resul = 0;
        LocalDate dataInicial = LocalDate.parse(inicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataFinal = LocalDate.parse(fim, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        dataInicial.plusMonths(3);
        if(dataInicial.isAfter(dataFinal) == false){
            resul = 1;
        }else{
            resul = 0;
        }

        return resul;
    }
    
    
    public int verificarPromo(int quantCompra, int quantAluguel, String tipoUser, int resul){
        int classif = 0; // Nada de promocoes
        if(quantCompra==5){//Gratis 1 livro com compra
         classif = 1;   
        }else if(quantCompra==10 && resul == 1){//Geek 1 mes com compra
         classif = 2;  
        }else if(quantCompra==20 && resul == 1){// Premium 3 meses com compra
         classif = 3;    
        }else if(quantAluguel==10 && resul == 1){//Geek 1 mes com aluguel
         classif = 4;   
        }
        
        return classif;
    }
    
    
    
}
