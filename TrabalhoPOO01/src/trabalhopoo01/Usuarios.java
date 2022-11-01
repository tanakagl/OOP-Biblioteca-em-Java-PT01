package trabalhopoo01;

public class Usuarios {
   //Declaracao dos atributos
    public String nome;
    public String ender;
    public String cpf;
    public int histCompra;
    public int histAluguel;
    public int compra;
    public String tipoUser;
    public String dataCompra;
    public String dataAluguel;
    public int histCompraPromo; //atributo q ira zerar depois de 3 meses
    public int histAluguelPromo; //atributo q ira zerar depois de 3 meses
    public int histAux;
    public String dataCadastro;
    
    public Usuarios(String nome, String ender, String cpf, int histCompra, int histAluguel, String tipoUser, String dataCadastro){ //Constructor dos Usuarios
        this.nome = nome;
        this.ender = ender;
        this.cpf = cpf;
        this.histCompra = histCompra;
        this.histAluguel = histAluguel;
        this.tipoUser = tipoUser;
        this.dataCadastro = dataCadastro;
    }

    
    
    @Override //toString para printar os dados dos usuarios conforme o pedido
    public String toString(){
        return "Nome Completo: " + nome + " Endereço: " + ender + " CPF: " + cpf + " Histórico de Livros Comprados: " + histCompra + " Histórico de Livros Alugados: " + histAluguel + " Tipo de usuário: " + tipoUser;
    }

}
