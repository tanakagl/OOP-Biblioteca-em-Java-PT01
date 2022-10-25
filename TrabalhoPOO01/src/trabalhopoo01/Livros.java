package trabalhopoo01;

public class Livros {
    private String titulo;
    private String autor;
    private String editora;
    private String categoria;
    private float price;
    private int quant;
    

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

