package trabalhopoo01;

import java.util.Scanner;

public class Usuarios {
    private String nome;
    private String ender;
    private String cpf;
    private String hist;
    
    public void inserirDadosUser(){
          double[][] cadastroUsers = new double[30][30];
          for(int i=0; i<1; i++){
              for(int j=i; j<=i; j++){
              Scanner teclado = new Scanner(System.in);
              System.out.print("Insira o nome do Usuario: ");
              this.nome = teclado.next();
              System.out.println("");
              System.out.print("Insira o endereco do Usuario: ");
              this.ender = teclado.next();
              System.out.println("");
              System.out.print("Insira o CPF do Usuario: ");
              this.cpf = teclado.next();
              System.out.println("");
              System.out.print("Insira o historico do Usuario: ");
              this.hist = teclado.next();
              System.out.println("");
          }
    }
    }
    
    public void printarUsuariosInseridos(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEnder());
        System.out.println("CPF: " + getCpf());
        System.out.println("Histórico: " + getHist());
    }

    public String getNome() {
        return nome;
    }

    public String getEnder() {
        return ender;
    }

    public String getCpf() {
        return cpf;
    }

    public String getHist() {
        return hist;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setHist(String hist) {
        this.hist = hist;
    }
    
    
}
