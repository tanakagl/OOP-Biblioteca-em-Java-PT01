package trabalhopoo01;

public class Usuarios {
   //Declaracao dos atributos
    public String nome;
    public String ender;
    public String cpf;
    public int histCompra;
    public int histAluguel;
    public int compra;
    public int dataUser;
    
    public Usuarios(String nome, String ender, String cpf, int histCompra, int histAluguel, int dataUser){ //Constructor dos Usuarios
        this.nome = nome;
        this.ender = ender;
        this.cpf = cpf;
        this.histCompra = histCompra;
        this.histAluguel = histAluguel;
        this.dataUser = dataUser;
    }

    
    
    @Override //toString para printar os dados dos usuarios conforme o pedido
    public String toString(){
        return "Nome Completo: " + nome + " Endereço: " + ender + " CPF: " + cpf + " Histórico de Livros Comprados: " + histCompra + " Histórico de Livros Alugados: " + histAluguel + " Data de inscrição: " + dataUser;
    }

}
