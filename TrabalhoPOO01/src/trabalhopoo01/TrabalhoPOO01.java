package trabalhopoo01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class TrabalhoPOO01 {
    

    public static void main(String[] args) {
     ArrayList<Livros> books = new ArrayList<Livros>();
     ArrayList<Usuarios> users = new ArrayList<Usuarios>();
     ArrayList<Promocoes> promotions = new ArrayList<Promocoes>();
     LivrosMethods booksMethods = new LivrosMethods();
     UserMethods usersMethods = new UserMethods();
     Promocoes promo = new Promocoes();
     Data comparar = new Data();
     Faturamento caixa =  new Faturamento();
     String primeiraCompra = "";
     int op;
     int codLivro;
     int codUsuario;
     int contadorPosUser = 0;
     int contadorPosLivro = 0;
     String resp;
     Scanner teclado = new Scanner(System.in);
        System.out.println("Bem Vindo ao sistema da Livraria Martelo de Assis!");
        do{
        System.out.println("");
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
        System.out.println("Opção 10: Realizar devolução de livro");
        System.out.println("Opção 11: Verificar caixa da Livraria");
        System.out.println("Opção 12: Avançar datas");  
        System.out.println("Opção 0: Sair do Programa");
            op = teclado.nextInt();
                switch(op){
                    case 1:
                        
                       String nome;
                       String ender;
                       String cpf;
                       int histCompra = 0;
                       int histAluguel = 0;
                       String tipoUser;
                       String dataCadastro;
                       
                       
                        Scanner digitar1 = new Scanner(System.in);
                        System.out.print("Insira o nome do usuário: ");
                        nome = digitar1.nextLine();
                        System.out.print("Insira o endereço do usuário: ");
                        ender = digitar1.nextLine();
                        System.out.print("Insira o CPF: ");
                        cpf = digitar1.nextLine();
                        System.out.print("Inserir tipo de usuario: ");
                        tipoUser = digitar1.nextLine();
                        System.out.print("Insira a data de cadastro:");
                        dataCadastro = digitar1.next();
                        //Chama constructor
                        users.add(new Usuarios(nome, ender, cpf, histCompra, histAluguel, tipoUser, dataCadastro));
                        //Caso tiver valor de mensalidade, adiciona ao caixa
                        caixa.valoresMensal += caixa.mensalidade(users.get(contadorPosUser).tipoUser);
                        System.out.println("Código do User: [" + contadorPosUser + "]");
                        contadorPosUser++;
                        
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
                        String dataLivro;
                        
                        Scanner digitar2 = new Scanner(System.in);
                            System.out.print("Insira o título do Livro: ");
                            title = digitar2.nextLine();
                            System.out.print("Insira o nome do Autor: ");
                            author = digitar2.nextLine();
                            System.out.print("Insira o nome da Editora: ");
                            publish =  digitar2.nextLine();
                            System.out.print("Insira a categoria: ");
                            category = digitar2.nextLine();
                            System.out.print("Insira o selo do livro: ");
                            selo = digitar2.nextLine();
                            System.out.print("Insira a data de cadastro do livro: ");
                            dataLivro = digitar2.nextLine();
                            System.out.print("Insira o preço de venda: ");
                            priceVenda =  digitar2.nextFloat();
                            System.out.print("Insira o preço de aluguel: ");
                            priceAluguel =  digitar2.nextFloat();
                            System.out.print("Insira a quantidade: ");
                            quant = digitar2.nextInt();
                            
                        double novoPrecoVenda = booksMethods.seloLivroVenda(priceVenda, selo);
                        double novoPrecoAluguel = booksMethods.seloLivroAluguel(priceAluguel, selo);
                        //Chama constructor
                        books.add(new Livros(title, author, publish, category, novoPrecoVenda, novoPrecoAluguel, quant, selo, dataLivro));
                        System.out.println("Código do Livro: [" + contadorPosLivro + "]");
                        contadorPosLivro++;
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
                        System.out.print("Digite o id do livro que deseja alugar: ");
                        codLivro = teclado.nextInt();
                        System.out.println(books.get(codLivro));
                        System.out.print("Insira o código do usuário: ");
                        codUsuario = teclado.nextInt();
                        System.out.println(users.get(codUsuario));
                        System.out.println("Deseja confirmar o aluguel deste livro? [s/n]");
                        resp = teclado.next();
                        if(resp.equals("s")){
                          int verifUser = booksMethods.verificaUsersAluguel(users.get(codUsuario).tipoUser, books.get(codLivro).selo);
                          int dataResp = comparar.compararData();
                          int disponibilidade = books.get(codLivro).quant;
                          if(verifUser == 0){
                            System.out.println("Você não pode alugar este livro.");
                          }else{
                              if(disponibilidade != 0 && dataResp == 1){
                                System.out.println("Livro alugado com sucesso!");
                                users.get(codUsuario).histAluguel++;
                                books.get(codLivro).quant--;
                                
                                //Adicionando valor no caixa
                                caixa.valoresCompra += books.get(codLivro).priceAluguel;
                            }else{
                                System.out.println("Data Insirida Inválida");
                                break;}
                              break;
                          }
                          
                          
                        }else{
                            System.out.println("Erro ao alugar o livro!");
                            break;
                        }
                        
                        break;
                    case 6:
                        System.out.print("Digite o id do livro para leitura: ");
                        codLivro = teclado.nextInt();
                        System.out.println(books.get(codLivro));
                        System.out.print("Insira o código do usuário: ");
                        codUsuario = teclado.nextInt();
                        
                        System.out.println("Deseja confirmar a leitura local deste livro? [s/n]");
                        resp = teclado.next();
                        if(resp.equals("s")){
                            books.get(codLivro).quant--;
                        }else{
                            break;
                        }
                    case 7:
                        double desconto;
                        System.out.print("Insira a data de hoje: ");
                        String dataHoje = teclado.next();
                        System.out.print("Digite o id do livro que deseja comprar: ");
                        codLivro = teclado.nextInt();
                        System.out.print(books.get(codLivro));
                        System.out.print("Insira o código do usuário: ");
                        codUsuario = teclado.nextInt();
                        System.out.println(users.get(codUsuario));
                        int respTipoUser = booksMethods.verificaUsersCompra(users.get(codUsuario).tipoUser);
                        System.out.print("Deseja confirmar a compra deste livro? [s/n]");
                        resp = teclado.next();
                        if(resp.equals("s")){
                            int disponibilidade = books.get(codLivro).quant;
                            if(disponibilidade != 0){
                            users.get(codUsuario).histCompra++;
                            books.get(codLivro).quant--;
                            users.get(codUsuario).histCompraPromo++;
                            //Verifica se ha descontos disponiveis
                           System.out.print("Desconto de: ");
                        switch(respTipoUser){
                            case 1:
                                System.out.println("5%");
                                desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.05f);
                                break;
                            case 2:
                                System.out.println("10%");
                                desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.1f);
                                break;
                            case 3:
                                System.out.println("15%");
                                desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.15f);
                                break;
                            default:
                                System.out.println("0%");
                                desconto = books.get(codLivro).priceVenda;
                                break;
                        }   
                            //Adicionando valor no caixa
                            caixa.valoresCompra += desconto;
                            System.out.println("Compra confirmada! Agradecemos a preferência!");
                            
                            //Verifica promocao
                                if(users.get(codUsuario).histAux != 0){
                                     int resulComp = promo.compararDatas(primeiraCompra,dataHoje);
                                        int resulPromo = promo.verificarPromo(users.get(codUsuario).histCompraPromo, users.get(codUsuario).histAluguel, users.get(codUsuario).tipoUser, resulComp);
                                        switch(resulPromo){
                                            case 1:
                                                System.out.println("Direito a 1 livro grátis!");
                                                break;
                                            case 2:
                                                System.out.println("Direito a Geek por um mes!");
                                                users.get(codUsuario).tipoUser = "Geek";
                                                break;
                                            case 3:
                                                System.out.println("Direito a Premium por três meses!");
                                                users.get(codUsuario).tipoUser = "Premium";
                                                break;
                                            default:
                                                System.out.println("Não há promoções disponíveis para você no momento.");
                                                break;
                                            }
                                    }else if(users.get(codUsuario).histAux == 0){
                                    System.out.println("Não há promoções disponíveis para você no momento.");
                                    primeiraCompra = dataHoje;
                                    users.get(codUsuario).histAux++;          
                        }
                        }else{
                            System.out.println("Erro ao comprar o livro. Indisponível!");
                            }
                            
                        }else{
                            break;
                        }
                        
                    case 8:
              
                        break;
                    case 9:
                        for(int i=0; i<=books.size(); i++){
                            System.out.println(books.get(i) + "Código do Livro " + i);                                                                           
                        }
                        break;
                    case 10:
                        
                        break;
                    case 11:
                        System.out.printf("Valor total de Aluguéis: %.2f", caixa.valoresAluguel);
                        System.out.println("");
                        System.out.printf("Valor total de Compras: %.2f", caixa.valoresCompra);
                        System.out.println("");
                        System.out.printf("Valor total de Mensalidades: %.2f", caixa.valoresMensal);
                        System.out.println("");
                        System.out.printf("Valor total: " + caixa.totalCaixa());
                        System.out.println("");
                        break;
                    case 12:
                        
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