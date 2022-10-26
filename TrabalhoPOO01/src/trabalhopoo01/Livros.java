package trabalhopoo01;

public class Livros {
    //Declaracao dos atributos
    public String titulo;
    public String autor;
    public String editora;
    public String categoria;
    public float price;
    public int quant;
    
    public Livros(String titulo, String autor, String editora, String categoria, float price, int quant){ //Constructor Livros
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.price = price;
        this.quant =  quant;      
        
    }
    @Override //toString para printar os dados dos livros conforme o pedido do usuario
    public String toString(){
        return "Título: " + titulo + " Autor: " + autor + " Editora: " + editora + " Categoria: " + categoria + " Preço: R$" + price + " Quantidade Disponível: " + quant;
    }

    
    
}