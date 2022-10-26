package trabalhopoo01;

import java.util.ArrayList;
import java.util.Scanner;


public class TrabalhoPOO01 {


    public static void main(String[] args) {
     ArrayList<Livros> books = new ArrayList<Livros>();
     ArrayList<Usuarios> users = new ArrayList<Usuarios>();
     int op;
     int codLivro;
     int codUsuario;
     String resp;
     Scanner teclado = new Scanner(System.in);
     
        System.out.println("Bem Vindo ao sistema da Livraria Martelo de Assis!");
        do{
        System.out.println("O que deseja realizar?");
        System.out.println("Opção 1: Cadastrar Novo Usuário");
        System.out.println("Opção 2: Cadastrar Novo Livro");
        System.out.println("Opção 3: Buscar por um Usuário");
        System.out.println("Opção 4: Buscar por um Livro");
        System.out.println("Opção 5: Locar um livro para aluguel");
        System.out.println("Opção 6: Local um livro para leitura local");
        System.out.println("Opção 7: Comprar um livro");
        System.out.println("Opção 8: Informar data de Saraus");
        System.out.println("Opção 0: Sair do Programa");
            op = teclado.nextInt();
                switch(op){
                    case 1:
                        System.out.println("Insira o nome do usuário: ");
                        String nome = teclado.next();
                        System.out.println("Insira o endereço do usuário: ");
                        String ender = teclado.next();
                        System.out.println("Insira o CPF: ");
                        String cpf = teclado.next();
                        System.out.println("Insira quantos livros foram comprados: ");
                        int hist = teclado.nextInt();
                        
                        users.add(new Usuarios(nome, ender, cpf, hist));
                        
                        break;
                    case 2:
                        System.out.println("Insira o título do Livro: ");
                        String title = teclado.next();
                        System.out.println("Insira o nome do Autor: ");
                        String author = teclado.next();
                        System.out.println("Insira o nome da Editora: ");
                        String publish =  teclado.next();
                        System.out.println("Insira a categoria: ");
                        String category = teclado.next();
                        System.out.println("Insira o preço: ");
                        float price =  teclado.nextFloat();
                        System.out.println("Insira a quantidade: ");
                        int quant = teclado.nextInt();
                        
                        books.add(new Livros(title, author, publish, category, price, quant));
                       
                        break;
                    case 3:
                        System.out.print("Insira qual o código do usuário: ");
                        codUsuario = teclado.nextInt();
                        System.out.println(users.get(codUsuario));
                        System.out.println(" ");
                        break;
                    case 4:
                        System.out.print("Insira qual o código do livro: ");
                        codLivro = teclado.nextInt();
                        System.out.println(books.get(codLivro));
                        System.out.println(" ");
                        break;
                    case 5:
                        
                        break;
                    case 6:
                    
                        break;
                    case 7:
                        
                        break;
                    case 8:
                        
                        break;
                    case 0:
                        System.out.println("Saindo");
                        break;
                        
                    default:
                        System.out.println("Comando Inválido!");
                }
            }while(op!=0);
        }
     
     }