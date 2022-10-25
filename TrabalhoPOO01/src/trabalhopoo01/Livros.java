package trabalhopoo01;

import java.util.Scanner;

public class Livros {
    private String titulo;
    private String autor;
    private String editora;
    private String categoria;
    private float price;
    private int quant;
    
        public void inserirDadosUser(){
          double[][] cadastroLivros = new double[30][30];
          for(int i=0; i<1; i++){
              for(int j=i; j<=i; j++){
              Scanner teclado = new Scanner(System.in);
              System.out.print("Insira o nome do Livro: ");
              this.titulo = teclado.next();
              System.out.println("");
              System.out.print("Insira o Autor: ");
              this.autor = teclado.next();
              System.out.println("");
              System.out.print("Insira a Editora: ");
              this.editora = teclado.next();
              System.out.println("");
              System.out.print("Insira a Categoria: ");
              this.categoria = teclado.next();
              System.out.println("");
              System.out.print("Insira o preço: R$");
              this.price = teclado.nextFloat();
              System.out.println("");
              System.out.print("Insira a quantidade: ");
              this.quant = teclado.nextInt();
              System.out.println("");
          }
    }
    }
    
    public void printarLivrosInseridos(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Editora " + getEditora());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Preço: " + getPrice());
        System.out.println("Quantidade: " + getQuant());
    }
    
    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrice() {
        return price;
    }

    public int getQuant() {
        return quant;
    }
    
}

