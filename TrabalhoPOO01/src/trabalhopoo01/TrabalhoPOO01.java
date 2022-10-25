package trabalhopoo01;

import java.util.Scanner;


public class TrabalhoPOO01 {


    public static void main(String[] args) {
     Usuarios user = new Usuarios();
     Livros books = new Livros();
     Scanner teclado = new Scanner(System.in);
     String resp = "";
        System.out.println("Bem Vindo ao sistema da Livraria Martelo de Assis!");
        System.out.println("O que deseja realizar?");
        System.out.println("Opção 1: Cadastrar Novo Usuário");
        System.out.println("Opção 2: Cadastrar Novo Livro");
        System.out.println("Opção 3: Buscar por um Usuário");
        System.out.println("Opção 4: Buscar por um Livro");
        System.out.println("Opção 5: Locar um livro para aluguel");
        System.out.println("Opção 6: Local um livro para leitura local");
        System.out.println("Opção 7: Comprar um livro");
        System.out.println("Opção 8: Informar data de Saraus");
        int op = teclado.nextInt();
        while(true){
                switch(op){
                    case 1:
                        user.inserirDadosUser();
                        break;
                    case 2:
                        books.inserirDadosLivros();
                        break;
                    case 3:
                        user.buscarUsuariosInseridos();
                        break;
                    case 4:
                        books.buscarLivrosInseridos();
                        break;
                    case 5:
                        
                        break;
                    case 6:
                    
                        break;
                    case 7:
                        
                        break;
                    case 8:
                        
                        break;
                    default:
                        System.out.println("Comando Inválido!");
                }
                System.out.println("Deseja escolher uma nova opção? [s/n]");
                resp = teclado.next();
                if(resp.equals("s")){
                    op = teclado.nextInt();
                }else if(resp != "s" || resp != "n" ){
                    System.out.println("Comando Inválido! Digite novamente:");
                    resp = teclado.next();
                }else if (resp.equals("n")){
                   break;
                }
        }
     
     
     }
    }

