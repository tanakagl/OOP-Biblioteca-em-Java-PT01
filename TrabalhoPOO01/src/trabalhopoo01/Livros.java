package trabalhopoo01;

import java.util.ArrayList;
import java.util.Scanner;

public class Livros {

    ArrayList<String> titulo = new ArrayList<>();
    ArrayList<String> autor = new ArrayList<>();
    ArrayList<String> editora =  new ArrayList<>();
    ArrayList<String> categoria =  new ArrayList<>();
    ArrayList<Float> price = new ArrayList<>();
    ArrayList<Integer> quant = new ArrayList<>();
    
    
        public void inserirDadosLivros(){
              Scanner teclado = new Scanner(System.in);
              System.out.print("Insira o nome do Livro: ");
              titulo.add(teclado.nextLine());
              System.out.println("");
              System.out.print("Insira o nome do Autor: ");
              autor.add(teclado.nextLine());
              System.out.println("");
              System.out.print("Insira o nome da Editora: ");
              editora.add(teclado.nextLine());
              System.out.println("");
              System.out.print("Insira a categoria: ");
              categoria.add(teclado.nextLine());
              System.out.println("");
              System.out.print("Insira o preço: ");
              price.add(teclado.nextFloat());
              System.out.println("");
              System.out.print("Insira a quantidade: ");
              quant.add(teclado.nextInt());
              System.out.println("");
    }
    
    public void buscarLivrosInseridos(){
        Scanner tecladoBusca = new Scanner(System.in);
        System.out.print("Insira a chave do Livro que deseja buscar: ");
        int i = tecladoBusca.nextInt();
        System.out.println("Título: " + titulo.get(i));
        System.out.println("Autor: " + autor.get(i));
        System.out.println("Editora " + editora.get(i));
        System.out.println("Categoria: " + categoria.get(i));
        System.out.println("Preço: " + price.get(i));
        System.out.println("Quantidade: " + quant.get(i));
        }
    

}