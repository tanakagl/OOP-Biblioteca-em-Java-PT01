package trabalhopoo01;

//import java.util.ArrayList;
//errimport java.util.Scanner;

public class Usuarios {
   //Declaracao dos atributos
    public String nome;
    public String ender;
    public String cpf;
    public int hist;
    public int compra;
    
    public Usuarios(String nome, String ender, String cpf, int hist){ //Constructor dos Usuarios
        this.nome = nome;
        this.ender = ender;
        this.cpf = cpf;
        this.hist = hist;
    }
    
    void comprar(){
        
    }
    
    
    
    @Override //toString para printar os dados dos usuarios conforme o pedido
    public String toString(){
        return "Nome Completo: " + nome + " Endereço: " + ender + " CPF: " + cpf + " Histórico de Livros: " + hist;
    }

}
