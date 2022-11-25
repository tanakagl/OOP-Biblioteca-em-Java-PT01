package trabalhopoo01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
     String dataSistem = "01/11/2022";
     String primeiraCompra = "";
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDate dataSis = LocalDate.parse(dataSistem, formatter);
     int op;
     int codLivro;
     int codUsuario;
     int contadorPosUser = 0;
     int contadorPosLivro = 0;
     String resp;
     String primeiroAluguel;

     String dataAux;

     Scanner teclado = new Scanner(System.in);
        System.out.println("Bem Vindo ao sistema da Livraria Martelo de Assis!");
        
        do{
        String dataAtt; 
        dataAtt = dataSis.format(formatter);
        System.out.println("");
        System.out.print("Data do sistema: " + dataAtt);
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
        System.out.println("Opção 12: Manipular datas");
        System.out.println("Opção 13: Verificar vencimentos");
        System.out.println("Opção 14: Verificar descontos");
        System.out.println("Opção 15: Verificar fim de promoções de 3 meses");
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
                        int exclusiv;
                        
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
                            System.out.print("Insira [1] para exclusivo compra, [2] para exclusivo leitura/aluguel ou [0] para ambos: ");
                            exclusiv = digitar2.nextInt();
                            
                        double novoPrecoVenda = booksMethods.seloLivroVenda(priceVenda, selo);
                        double novoPrecoAluguel = booksMethods.seloLivroAluguel(priceAluguel, selo);
                        //Chama constructor
                        books.add(new Livros(title, author, publish, category, novoPrecoVenda, novoPrecoAluguel, quant, selo, dataLivro, exclusiv));
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
                        System.out.println("Insira a data de hoje: ");
                        primeiroAluguel = teclado.next();
                        System.out.println("É o primeiro aluguel durante a promoção? [s/n]");
                        String resposta = teclado.next();
                        System.out.print("Digite o id do livro que deseja alugar: ");
                        codLivro = teclado.nextInt();
                        System.out.println(books.get(codLivro));
                        System.out.print("Insira o código do usuário: ");
                        codUsuario = teclado.nextInt();
                        System.out.println(users.get(codUsuario));
                        if(resposta.equalsIgnoreCase("s")){
                            users.get(codUsuario).dataAluguel = primeiroAluguel;
                        }
                        
                        System.out.println("Deseja confirmar o aluguel deste livro? [s/n]");
                        resp = teclado.next();
                        if(resp.equalsIgnoreCase("s") && books.get(codLivro).quant != 0 && books.get(codLivro).exclusiv == 2 || books.get(codLivro).exclusiv == 0){
                          int verifUser = booksMethods.verificaUsersAluguel(users.get(codUsuario).tipoUser, books.get(codLivro).selo);
                          int dataResp = comparar.compararData();
                          if(verifUser == 0){
                            System.out.println("Você não pode alugar este livro.");
                          }else{
                              if(dataResp == 1){
                                System.out.println("Livro alugado com sucesso!");
                                users.get(codUsuario).histAluguel++;
                                users.get(codUsuario).histAluguelPromo++;
                                books.get(codLivro).quant--;
                                books.get(codLivro).historico++;
                                
                                //Adicionando valor no caixa
                                caixa.valoresCompra += books.get(codLivro).priceAluguel;
                                //Verificando possivel desconto caso o livro seja alugado 100x
                                int desc100 = booksMethods.verificaLivro100(books.get(codLivro).historico);
                                if(desc100 == 1){
                                    System.out.println("Livro alugado 100x, valor baixou 40%");
                                   double desconto40 = books.get(codLivro).priceVenda;
                                   desconto40 -= (books.get(codLivro).priceVenda * 0.4);
                                   books.get(codLivro).priceVenda = desconto40;
                                }else if(desc100 != 1 ){
                                //Nada acontece
                                }
                                
                            }else{
                                System.out.println("Data Insirida Inválida");
                                break;
                              }
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
                        if(resp.equalsIgnoreCase("s")){
                            if(books.get(codLivro).quant != 0 && books.get(codLivro).exclusiv == 2 || books.get(codLivro).exclusiv == 0){
                            books.get(codLivro).quant--;
                            //Verificando possivel desconto caso o livro seja alugado 100x
                                int desc100 = booksMethods.verificaLivro100(books.get(codLivro).historico);
                                if(desc100 == 1){
                                    System.out.println("Livro alugado 100x, valor baixou 40%");
                                   double desconto40 = books.get(codLivro).priceVenda;
                                   desconto40 -= (books.get(codLivro).priceVenda * 0.4);
                                   books.get(codLivro).priceVenda = desconto40;
                                }else if(desc100 != 1 ){
                                //Nada acontece
                                }
                            }else{
                                System.out.println("Livro para leitura indisponível");
                                break;
                            }
                        }else{
                            System.out.println("Cancelando leitura...");
                            break;
                        }
                    case 7:
                        double desconto;
                        System.out.println("Insira a data de hoje: ");
                        String dataHoje = teclado.next();
                        System.out.println("Digite o id do livro que deseja comprar: ");
                        codLivro = teclado.nextInt();
                        System.out.println(books.get(codLivro));
                        System.out.println("Insira o código do usuário: ");
                        codUsuario = teclado.nextInt();
                        System.out.println(users.get(codUsuario));
                        System.out.println("É a primeira compra durante a promoção? [s/n]");
                        String respos = teclado.next();
                        //verifica se eh a primeira compra
                        if(respos.equalsIgnoreCase("s")){
                        users.get(codUsuario).dataCompra = dataHoje;
                        }
                        int respTipoUser = booksMethods.verificaUsersCompra(users.get(codUsuario).tipoUser);
                        System.out.print("Deseja confirmar a compra deste livro? [s/n]");
                        resp = teclado.next();
                        if(resp.equalsIgnoreCase("s")){
                            int disponibilidade = books.get(codLivro).quant;
                            if(disponibilidade != 0 && books.get(codLivro).exclusiv == 1 || books.get(codLivro).exclusiv == 0){
                            users.get(codUsuario).histCompra++;
                            books.get(codLivro).quant--;
                            users.get(codUsuario).histCompraPromo++;
                            //Verifica se ha descontos disponiveis
                           
                           LocalDate vencPromo = LocalDate.parse("01/01/2023", formatter);
                        switch(respTipoUser){
                            case 1:
                                System.out.print("Desconto Bookworm: ");
                                if(books.get(codLivro).categoria.equalsIgnoreCase("Drama") && dataSis.isBefore(vencPromo)){
                                    System.out.println("Livro de drama com desconto de mais 10%");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.15f);
                                }else if(books.get(codLivro).categoria.equalsIgnoreCase("Aventura") && dataSis.isBefore(vencPromo)){
                                    System.out.println("Livro de aventura com desconto de mais 5%");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.10f);
                                }else{
                                    System.out.println("5%");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.05f);
                                }
                                break;
                            case 2:
                                System.out.print("Desconto Geek: ");
                                 if(books.get(codLivro).categoria.equalsIgnoreCase("Drama") && dataSis.isBefore(vencPromo)){
                                    System.out.println("Livro de drama com desconto de mais 10%");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.20f);
                                }else if(books.get(codLivro).categoria.equalsIgnoreCase("Aventura") && dataSis.isBefore(vencPromo)){
                                    System.out.println("Livro de aventura com desconto de mais 5%");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.15f);
                                }else{
                                System.out.println("10%");
                                desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.1f);
                                }
                                break;
                            case 3:
                                System.out.print("Desconto Premium: ");
                                 if(books.get(codLivro).categoria.equalsIgnoreCase("Drama") && dataSis.isBefore(vencPromo)){
                                    System.out.println("Livro de drama com desconto de mais 10%");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.15f);
                                }else if(books.get(codLivro).categoria.equalsIgnoreCase("Aventura") && dataSis.isBefore(vencPromo)){
                                    System.out.println("Livro de aventura com desconto de mais 5%");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.10f);
                                }else{
                                    System.out.println("15%");
                                desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.15f);
                                }
                                break;
                                
                            case 0:
                                System.out.print("Descontos apenas por tempo limitado: ");
                                if(books.get(codLivro).categoria.equalsIgnoreCase("Drama") && dataSis.isBefore(vencPromo)){
                                    System.out.println("Livro de drama com desconto de mais 10%");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.10f);
                                }else if(books.get(codLivro).categoria.equalsIgnoreCase("Aventura") && dataSis.isBefore(vencPromo)){
                                    System.out.println("Livro de aventura com desconto de mais 5%");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.05f);
                                    
                                }else if(books.get(codLivro).selo.equalsIgnoreCase("Newly Released")&& dataSis.isBefore(vencPromo)){
                                    System.out.println("Livro Newly Released com 20% a mais de desconto");
                                    desconto = books.get(codLivro).priceVenda - (books.get(codLivro).priceVenda * 0.2f);
                                            
                                }else{
                                    System.out.println("0%");
                                    desconto = books.get(codLivro).priceVenda;
                                }
                                break;
                                
                            default:
                                desconto = desconto = books.get(codLivro).priceVenda;
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
                                                dataAux = dataHoje;
                                                LocalDate auxDate = LocalDate.parse(dataAux, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                                auxDate.plusMonths(1);

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
                                    break;
                        }
                        }else{
                            System.out.println("Erro ao comprar o livro. Indisponível!");
                            break;
                            }
                            
                        }else{
                            break;
                        }
                        break;
                        
                    case 8:
                        System.out.println("Saraus acontecem todos os dias 10!");
                        break;
                        
                    case 9:
                        for(int i=0; i<=books.size(); i++){
                            System.out.println(books.get(i) + "Código do Livro " + i);                                                                           
                        }
                        break;
                    case 10:
                        Scanner devol = new Scanner(System.in);
                        System.out.print("Insira o código do livro que deseja devolver: ");
                        codLivro = devol.nextInt();
                        System.out.print("Insira o código do usuário: ");
                        codUsuario = devol.nextInt();
                        books.get(codLivro).quant--;
                        users.get(codUsuario).histAluguel--;
                        float multa = comparar.devol();
                        System.out.println("Multa de: R$" + multa);
                        caixa.valoresAluguel += multa;
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
                        Scanner avanDate = new Scanner(System.in);
                        String dataSistema = "01/11/2022";
                        int quantDias;
                        System.out.println("Escolha a opção de data que deseja avançar: ");
                        System.out.println("Opção 1: Avançar dias");
                        System.out.println("Opção 2: Avançar semanas");
                        System.out.println("Opção 3: Avançar meses");
                        System.out.println("Opção 4: Avançar anos");
                        System.out.println("Opção 0: Cancelar");
                        
                        
                        
                        //Escolhe a opção para avançar as datas
                        int opc = avanDate.nextInt();
                        switch(opc){
                            case 1:
                                System.out.print("Quantos dias deseja avançar? ");
                                quantDias = avanDate.nextInt();
                                dataSis = dataSis.plusDays(quantDias);
                                break;                                
                            case 2:
                                System.out.print("Quantas semanas deseja avançar? ");
                                quantDias = avanDate.nextInt();
                                dataSis = dataSis.plusWeeks(quantDias);
                                break;
                            case 3:
                                System.out.println("Quantos meses deseja avançar? ");
                                quantDias = avanDate.nextInt();
                                dataSis = dataSis.plusMonths(quantDias);
                                break;
                            case 4:
                                System.out.println("Quantos anos deseja avançar? ");
                                quantDias = avanDate.nextInt();
                                dataSis = dataSis.plusYears(quantDias);
                                break;
                            case 0:
                                System.out.println("Cancelando...");
                                break;
                            default:
                                System.out.println("Opção Inválida!");

                                break;}
                        
                        
                        break;
                    case 13:
                        System.out.println("Iniciando verificação de vencimentos:");
                        LocalDate cadastroUser;
                        String novaData;
                        for(int k = 0; k<=users.size(); k++){
                        cadastroUser = LocalDate.parse(users.get(k).dataCadastro, formatter);
                        if(dataSis.isAfter(cadastroUser.plusMonths(1)) == true){
                         caixa.valoresMensal+=caixa.mensalidade(users.get(k).tipoUser); 
                          System.out.println("Valor vencido adicionado!");
                          cadastroUser = cadastroUser.plusMonths(1);
                          novaData = cadastroUser.format(formatter);
                          System.out.println(novaData);
                          users.get(k).dataCadastro = novaData;
                           break;
                        }else{
                            System.out.println("Não há vencimentos pendentes.");
                             break;
                        }      
                           } 
                           break;
                        
                    case 14:

                        System.out.println("Categorias com desconto: Drama, Aventura");
                        System.out.println("De 01/11/2022 até 01/01/2023");
                        System.out.println("Livros com selo com desconto: Premium");
                        System.out.println("De 01/11/2022 até 01/01/2023");
                        break;
                          
                        
                    case 15:
                        //Resetar a promocao dos 3 meses
                        System.out.println("Iniciando verificação de vencimentos de promoções");
                        LocalDate promoData;
                        LocalDate promoData2;
                        for(int h = 0; h<=users.size(); h++){
                            promoData = LocalDate.parse(users.get(h).dataCompra, formatter);
                            promoData2 = LocalDate.parse(users.get(h).dataAluguel, formatter);
                            if(dataSis.isAfter(promoData.plusMonths(3)) == true || dataSis.isAfter(promoData2.plusMonths(3)) == true){
                                System.out.println("Promoção vencida! Resetando valores...");
                                users.get(h).dataCompra = dataSis.format(formatter);
                                users.get(h).dataAluguel = dataSis.format(formatter);
                                users.get(h).histAluguelPromo = 0;
                                users.get(h).histCompraPromo = 0;
                                System.out.println("Valores Resetados.");
                                break;
                            }else{
                                System.out.println("Promoções ainda válidas!");
                                break;
                            }
                           
                        }
                     
                        break;
                        
                    case 0:
                        System.out.println("Saindo");
                        break;

                    default:
                        System.out.println("Comando Inválido!");
                        break;
                         }
            }while(op!=0);
        }
     
     }