package trabalhopoo01;

import java.util.ArrayList;
import java.util.Scanner;

public class TrabalhoPOO01 {


    public static void main(String[] args) {
     ArrayList<String> livros = new ArrayList<>();
     ArrayList<String> usuarios = new ArrayList<>();
     Scanner teclado = new Scanner(System.in);
     System.out.println("Insira o nome dos livros: ");
     for(int i=0; i<=5; i++){//Cadastrar Livros
         System.out.printf("%d- ", i+1);
         livros.add(teclado.next());  
     }
     System.out.println("Livros Cadastrados: ");
     for(int j=0; j<=5; j++){
         System.out.print(livros.get(j)+" ");
     }
    }
}
