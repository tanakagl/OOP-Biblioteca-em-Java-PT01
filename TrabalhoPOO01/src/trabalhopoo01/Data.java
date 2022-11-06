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
    public float devol(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        Scanner teclado2 = new Scanner(System.in);
        float multa = 0;
        System.out.print("Insira a data de hoje: ");
        String hoje = teclado2.nextLine();
        System.out.print("Insira a data de devolução: ");
        String fim = teclado2.nextLine();
        LocalDate dataHoje = LocalDate.parse(hoje, formatter);
        LocalDate dataDev = LocalDate.parse(fim, formatter);
        if(dataHoje.isAfter(dataDev) == true){
            System.out.println("Quantos dias de atraso?"); 
            int atraso = teclado2.nextInt();
            multa = 5*atraso;
        }else if(dataHoje.isBefore(dataDev) == true){
            System.out.println("Não há multa!");
            multa = 0;
        }else if(dataHoje.isEqual(dataDev) == true){
            System.out.println("Não há multa!");
            multa = 0;
        }
        return multa;
    }

}
    
    
 

