package trabalhopoo01;

import java.util.Scanner;


public class TrabalhoPOO01 {


    public static void main(String[] args) {
     Usuarios user = new Usuarios();
     Livros books = new Livros();
     Scanner teclado = new Scanner(System.in);
     String resp = "";
     
     System.out.print("Deseja cadastrar um novo usuario? [s/n]");
     resp = teclado.next();
     if(resp.equals("s")){
         user.inserirDadosUser();
         System.out.print("Deseja cadastrar um livro? [s/n]");
         resp = teclado.next();
         if(resp.equals("s")){
             System.out.println("");
            books.inserirDadosUser();
            }else if(resp.equals("n")){
             System.out.println("Saindo do programa...");
         }
                user.printarUsuariosInseridos();
                books.printarLivrosInseridos();
     }
     }
     }
    

