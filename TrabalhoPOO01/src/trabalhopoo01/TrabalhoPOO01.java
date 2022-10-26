package trabalhopoo01;

import java.util.ArrayList;
import java.util.Scanner;


public class TrabalhoPOO01 {
    

    public static void main(String[] args) {
     ArrayList<Livros> books = new ArrayList<Livros>();
     ArrayList<Usuarios> users = new ArrayList<Usuarios>();
     LivrosMethods livrosMethods = new LivrosMethods();
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
        System.out.println("Opção 9: Buscar todos os livros disponíveis");
        System.out.println("Opção 0: Sair do Programa");
            op = teclado.nextInt();
                switch(op){
                    case 1:
                        Scanner digitar1 = new Scanner(System.in);
                        System.out.println("Insira o nome do usuário: ");
                        String nome = digitar1.next();
                        System.out.println("Insira o endereço do usuário: ");
                        String ender = digitar1.next();
                        System.out.println("Insira o CPF: ");
                        String cpf = digitar1.next();
                        System.out.println("Insira quantos livros foram comprados: ");
                        int hist = digitar1.nextInt();
                        
                        users.add(new Usuarios(nome, ender, cpf, hist));
                        
                        break;
                    case 2:
                        String title;
                        String author;
                        String publish;
                        String category;
                        double priceVenda;
                        double priceAluguel;
                        int quant;
                        String selo;
                        
                        Scanner digitar2 = new Scanner(System.in);
                            System.out.println("Insira o título do Livro: ");
                            title = digitar2.nextLine();
                            System.out.println("Insira o nome do Autor: ");
                            author = digitar2.nextLine();
                            System.out.println("Insira o nome da Editora: ");
                            publish =  digitar2.nextLine();
                            System.out.println("Insira a categoria: ");
                            category = digitar2.nextLine();
                            System.out.println("Insira o selo do livro: ");
                            selo = digitar2.nextLine();
                            System.out.println("Insira o preço de venda: ");
                            priceVenda =  digitar2.nextFloat();
                            System.out.println("Insira o preço de aluguel: ");
                            priceAluguel =  digitar2.nextFloat();
                            System.out.println("Insira a quantidade: ");
                            quant = digitar2.nextInt();
                            
                        double novoPrecoVenda = livrosMethods.seloLivroVenda(priceVenda, selo);
                        double novoPrecoAluguel = livrosMethods.seloLivroAluguel(priceAluguel, selo);
                        books.add(new Livros(title, author, publish, category, novoPrecoVenda, novoPrecoAluguel, quant, selo));
                        
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
                    case 9:
                        for(int i=0; i<=books.size(); i++){
                            System.out.println(books.get(i) + "Código do Livro " + i);
                        }
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