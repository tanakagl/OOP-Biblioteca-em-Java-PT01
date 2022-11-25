package trabalhopoo01;

//import java.util.ArrayList;
//import java.util.Scanner;

public class Livros {
     //Declaracao dos atributos
    public String titulo;
    public String autor;
    public String editora;
    public String categoria;
    public double priceVenda;
    public double priceAluguel;
    public int quant;
    public String selo;
    public float venda;
    public String dataLivro;
    public int historico;
    public int exclusiv;
    

    
    public Livros(String titulo, String autor, String editora, String categoria, double priceVenda, double priceAluguel, int quant, String selo, String dataLivro, int exclusiv){ //Constructor Livros
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.priceVenda = priceVenda;
        this.priceAluguel = priceAluguel;
        this.quant =  quant;   
        this.selo = selo;
        this.dataLivro = dataLivro;
        this.exclusiv = exclusiv;
    }

    
    
    @Override //toString para printar os dados dos livros conforme o pedido do usuario
    public String toString(){
        return "Título: " + titulo + " Autor: " + autor + " Editora: " + editora + " Categoria: " + categoria + " Preço de venda: R$" + priceVenda +" Preço de aluguel: R$" + priceAluguel + " Quantidade Disponível: " + quant + " Selo: " + selo + " Data de Cadastro do Livro: " + dataLivro + " Exclusividade código: " + exclusiv;
    }
    
}
