package trabalhopoo01;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {

    ArrayList<String> nome = new ArrayList<>();
    ArrayList<String> ender = new ArrayList<>();
    ArrayList<String> cpf = new ArrayList<>();
    ArrayList<String> hist = new ArrayList<>();
   
    
    public void inserirDadosUser(){
              Scanner tecladoInsert = new Scanner(System.in);
              System.out.print("Insira o nome do Usuario: ");
              nome.add(tecladoInsert.nextLine());
              System.out.println("");
              System.out.print("Insira o endereco do Usuario: ");
              ender.add(tecladoInsert.nextLine());
              System.out.println("");
              System.out.print("Insira o CPF do Usuario: ");
              cpf.add(tecladoInsert.nextLine());
              System.out.println("");
              System.out.print("Insira o historico do Usuario: ");
              hist.add(tecladoInsert.nextLine());
              System.out.println("");
    }
    
    public void buscarUsuariosInseridos(){
        Scanner tecladoBusca = new Scanner(System.in);
        System.out.print("Insira a chave do Usuário que deseja buscar: ");
        int i = tecladoBusca.nextInt();
        System.out.println("Nome: " + nome.get(i));
        System.out.println("Endereço: " + ender.get(i));
        System.out.println("CPF: " + cpf.get(i));
        System.out.println("Histórico: " + hist.get(i));
        }
    
}
