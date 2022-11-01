package trabalhopoo01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Data {
    //Caso o aluguel seja possivel, retornara valor 1, caso nao, retornara valor 0.
    public int compararData(){
        Scanner dataTeclado = new Scanner(System.in);
        System.out.print("Insira a data de hoje: ");
        String hoje = dataTeclado.nextLine();
        System.out.print("Insira a data de aluguel: ");
        String inicio = dataTeclado.nextLine();
        System.out.print("Insira a data de devolução: ");
        String fim = dataTeclado.nextLine();
        LocalDate data1 = LocalDate.parse(hoje, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate data2 = LocalDate.parse(inicio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate data3 = LocalDate.parse(fim, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataTesteDias = LocalDate.parse(hoje, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataTesteSemana = LocalDate.parse(hoje, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataTesteMes = LocalDate.parse(hoje, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        dataTesteDias = data1.plusDays(3);
        dataTesteSemana = data2.plusWeeks(1);
        dataTesteMes = data2.plusMonths(1);
        
        boolean verificaDias = dataTesteDias.isAfter(data2);
        boolean verificaSemana = dataTesteSemana.isAfter(data3);
        boolean verificaMes = dataTesteMes.isAfter(data3);
        int resp = 0;
        if(verificaDias == false){
            resp+= 0;
        }else if(verificaDias == true && verificaSemana == true || verificaMes == false){
            resp+= 0;
        }else if(verificaDias == true && verificaSemana == false && verificaMes == true){
            resp+= 1;
        }
        return resp;
}

public void avancarData(String dataSis){
    Scanner avanDate = new Scanner(System.in);
    int quant = 0;
    LocalDate dataSistem = LocalDate.parse(dataSis, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println("Escolha a opção de data que deseja avançar: ");
    System.out.println("Opção 1: Avançar dias");
    System.out.println("Opção 2: Avançar semanas");
    System.out.println("Opção 3: Avançar meses");
    System.out.println("Opção 4: Avançar anos");
    System.out.println("Opção 0: Cancelar");
    //Escolhe a opção para avançar as datas
    int op = avanDate.nextInt();
    switch(op){
        case 1:
            System.out.print("Quantos dias deseja avançar? ");
            quant = avanDate.nextInt();
            dataSistem.plusDays(quant);
            break;
        case 2:
            System.out.print("Quantas semanas deseja avançar? ");
            quant = avanDate.nextInt();
            dataSistem.plusWeeks(quant);
            break;
        case 3:
            System.out.println("Quantos meses deseja avançar? ");
            quant = avanDate.nextInt();
            dataSistem.plusMonths(quant);
            break;
        case 4:
            System.out.println("Quantos anos deseja avançar? ");
            quant = avanDate.nextInt();
            dataSistem.plusYears(quant);
            break;
        case 0:
            System.out.println("Cancelando...");
            break;
        default:
            System.out.println("Opção Inválida!");
            break;
    }
}
}
    
    
 


